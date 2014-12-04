// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.common.lib.auth.AuthorizationHeaderProvider;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponseInterceptor;
import com.google.api.client.http.HttpTransport;
import com.google.common.annotations.VisibleForTesting;

import java.io.IOException;

/**
 * Helper class that generates a configured HttpURLConnection for report downloads.
 *
 * @author Kevin Winter
 */
public class ReportRequestFactoryHelper {

  /** The URI of the download server. */
  public static final String DOWNLOAD_SERVER_URI = "/api/adwords/reportdownload";
  
  private final AdWordsSession session;
  private final UserAgentCombiner userAgentCombiner;
  private final AuthorizationHeaderProvider authorizationHeaderProvider;
  private final HttpTransport httpTransport;
  private int reportDownloadTimeout;
  private final HttpResponseInterceptor responseInterceptor;

  /**
   * Constructor that gets an Internals instance from AdWordsInternals.
   *
   * @param session to use when making requests.
   */
  ReportRequestFactoryHelper(AdWordsSession session) {
    this(session, AdWordsInternals.getInstance());
  }

  /**
   * Constructor that uses internal utilities from the provided Internals object.
   *
   * @param session to use when making requests.
   */
  @VisibleForTesting
  ReportRequestFactoryHelper(AdWordsSession session, final AdWordsInternals internals) {
    this(session,
        internals.getAuthorizationHeaderProvider(),
        internals.getUserAgentCombiner(),
        internals.getHttpTransport(),
        internals.getAdWordsLibConfiguration().getReportDownloadTimeout(),
        new ReportResponseInterceptor(
            internals.getAdWordsServiceLoggers().getReportServiceLogger()));
  }

  /**
   * Constructor that takes all dependencies.
   *
   * @param session Used to pull authentication data.
   * @param authorizationHeaderProvider Used to population the authentication data into a header.
   * @param userAgentCombiner Used to populate the User-Agent header.
   * @param reportDownloadTimeout Used for both connect and read timeouts.
   * @param responseInterceptor Response interceptor to use for requests generated by this factory
   *        helper.
   */
  @VisibleForTesting
  ReportRequestFactoryHelper(AdWordsSession session,
      AuthorizationHeaderProvider authorizationHeaderProvider, UserAgentCombiner userAgentCombiner,
      HttpTransport httpTransport, int reportDownloadTimeout,
      HttpResponseInterceptor responseInterceptor) {
    this.session = session;
    this.authorizationHeaderProvider = authorizationHeaderProvider;
    this.userAgentCombiner = userAgentCombiner;
    this.httpTransport = httpTransport;
    this.reportDownloadTimeout = reportDownloadTimeout;
    this.responseInterceptor = responseInterceptor;
  }

  /**
   * Gets the report HTTP URL connection given report URL and proper information needed to
   * authenticate the request.
   *
   * @param reportUrl the URL of the report response or download
   * @return the report HTTP URL connection
   * @throws AuthenticationException If OAuth authorization fails.
   */
  @VisibleForTesting
  HttpRequestFactory getHttpRequestFactory(final String reportUrl, String version)
      throws AuthenticationException {
    final HttpHeaders httpHeaders = createHeaders(reportUrl, version);
    return httpTransport.createRequestFactory(new HttpRequestInitializer() {
      public void initialize(HttpRequest request) throws IOException {
        request.setHeaders(httpHeaders);
        request.setConnectTimeout(reportDownloadTimeout);
        request.setReadTimeout(reportDownloadTimeout);
        request.setThrowExceptionOnExecuteError(false);
        request.setLoggingEnabled(true);
        request.setResponseInterceptor(responseInterceptor);
      }
    });
  }

  /**
   * Creates the http headers object for this request, populated from data in
   * the session.
   * @throws AuthenticationException If OAuth authorization fails.
   */
  private HttpHeaders createHeaders(String reportUrl, String version)
      throws AuthenticationException {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.setAuthorization(
        authorizationHeaderProvider.getAuthorizationHeader(session, reportUrl));
    httpHeaders.setUserAgent(userAgentCombiner.getUserAgent(session.getUserAgent()));
    httpHeaders.set("developerToken", session.getDeveloperToken());
    httpHeaders.set("clientCustomerId", session.getClientCustomerId());
    ReportingConfiguration reportingConfiguration = session.getReportingConfiguration();
    if (reportingConfiguration != null) {
      reportingConfiguration.validate(version);
      if (reportingConfiguration.isSkipReportHeader() != null) {
        httpHeaders.set("skipReportHeader",
            Boolean.toString(reportingConfiguration.isSkipReportHeader()));
      }
      if (reportingConfiguration.isSkipReportSummary() != null) {
        httpHeaders.set("skipReportSummary",
            Boolean.toString(reportingConfiguration.isSkipReportSummary()));
      }
    }
    return httpHeaders;
  }

  /**
   * Returns the reportDownloadTimeout in milliseconds
   */
  public int getReportDownloadTimeout() {
    return reportDownloadTimeout;
  }

  /**
   * Sets the reportDownloadTimeout (milliseconds).
   */
  public void setReportDownloadTimeout(int reportDownloadTimeout) {
    this.reportDownloadTimeout = reportDownloadTimeout;
  }
}
