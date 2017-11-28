// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201705.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201705.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201705.cm.*;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.AdGroupAdField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets non-removed expanded text ads in an ad group. To add
 * expanded text ads, run AddExpandedTextAds.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetResponsiveAds {

  private static final int PAGE_SIZE = 100;

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    Long adGroupId = Long.parseLong("45164082604");

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    int offset = 0;
    boolean morePages = true;

    // Create selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector =
        builder
            .fields(
                AdGroupAdField.Id)
            .orderAscBy(AdGroupAdField.Id)
            .offset(offset)
            .limit(PAGE_SIZE)
            .equals(AdGroupAdField.AdGroupId, adGroupId.toString())
            .in(AdGroupAdField.Status, "ENABLED", "PAUSED")
            .equals("AdType", "RESPONSIVE_DISPLAY_AD")
            .build();

    while (morePages) {
      // Get all ads.
      AdGroupAdPage page = adGroupAdService.get(selector);

      // Display ads.
      if (page.getEntries() != null && page.getEntries().length > 0) {
        for (AdGroupAd adGroupAd : page.getEntries()) {
          ResponsiveDisplayAd responsiveDisplayAd = (ResponsiveDisplayAd) adGroupAd.getAd();
          System.out.printf(
                  "Responsive Display Ad with ID %d, status '%s', short headline '%s', long headline '%s', Marketing Image Id '%s' and Logo Image Id '%s' was found.%n",
                  adGroupAd.getAd().getId(),
                  adGroupAd.getStatus(),
                  responsiveDisplayAd.getShortHeadline(),
                  responsiveDisplayAd.getLongHeadline(),
                  responsiveDisplayAd.getMarketingImage().getMediaId(),
                  responsiveDisplayAd.getLogoImage().getMediaId());
        }
      } else {
        System.out.println("No responsive display ads were found.");
      }

      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
      morePages = offset < page.getTotalNumEntries();
    }
  }
}
