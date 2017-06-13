// Copyright 2016 Google Inc. All Rights Reserved.
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

package adwords.axis.v201609.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201609.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupPage;
import com.google.api.ads.adwords.axis.v201609.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.Paging;
import com.google.api.ads.adwords.axis.v201609.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.text.NumberFormat;

import static com.google.api.ads.adwords.lib.selectorfields.v201609.cm.AdGroupField.Id;
import static com.google.api.ads.adwords.lib.selectorfields.v201609.cm.AdGroupField.Name;

/**
 * This example gets count of all ad groups in an account.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCountOfAdGroupsInAccount {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
      // Get the AdGroupService.
      AdGroupServiceInterface adGroupService =
              adWordsServices.get(session, AdGroupServiceInterface.class);

      // Create selector.
      SelectorBuilder builder = new SelectorBuilder();
      Selector selector = builder
              .fields(Id)
              .contains(Name, "8013263")
              .build();

      // Set selector paging
      Paging paging = new Paging();
      paging.setNumberResults(0);
      selector.setPaging(paging);

      AdGroupPage page = adGroupService.get(selector);

      System.out.println("Count of AdGroups = " + NumberFormat.getInstance().format(page.getTotalNumEntries()));
  }
}
