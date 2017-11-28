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

package adwords.axis.v201705.biniam;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201705.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201705.cm.*;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.AdGroupAdField;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.AdGroupCriterionField;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.AdGroupField;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.CampaignField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.rmi.RemoteException;
import java.text.NumberFormat;

/**
 * This class gets count of all campaigns, ad groups, keywords and Ads in an account.
 * <p/>
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCountOfAllInAccount {

    public static void main(String[] args) throws Exception {

        long started = System.currentTimeMillis();

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

        System.out.println("Took: " + ((System.currentTimeMillis() - started) / 1000) + " seconds.");
    }

    public static void runExample(AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
        countCampaigns(adWordsServices, session);
        countAdGroups(adWordsServices, session);
        countKeywords(adWordsServices, session);
        countAds(adWordsServices, session);
        getCampaignsAndCountOfAdgroups(adWordsServices, session);
    }

    private static void countKeywords(AdWordsServices adWordsServices, AdWordsSession session) throws RemoteException {
        // Get the AdGroupCriterionService.
        AdGroupCriterionServiceInterface adGroupCriterionService =
                adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

        // Create selector.
        SelectorBuilder builder = new SelectorBuilder();
        Selector selector = builder
                .fields(AdGroupCriterionField.Id)
                .in(AdGroupCriterionField.CriteriaType, "KEYWORD")
                .build();

        // Set selector paging
        Paging paging = new Paging();
        paging.setNumberResults(0);
        selector.setPaging(paging);

        // Get all ad group criteria.
        AdGroupCriterionPage page = adGroupCriterionService.get(selector);

        System.out.println("Count of Keywords = " + NumberFormat.getInstance().format(page.getTotalNumEntries()));
    }

    private static void countAdGroups(AdWordsServices adWordsServices, AdWordsSession session) throws RemoteException {
        // Get the AdGroupService.
        AdGroupServiceInterface adGroupService =
                adWordsServices.get(session, AdGroupServiceInterface.class);

        // Create selector.
        SelectorBuilder builder = new SelectorBuilder();
        Selector selector = builder
                .fields(AdGroupField.Id)
                .build();

        // Set selector paging
        Paging paging = new Paging();
        paging.setNumberResults(0);
        selector.setPaging(paging);

        AdGroupPage page = adGroupService.get(selector);

        System.out.println("Count of AdGroups = " + NumberFormat.getInstance().format(page.getTotalNumEntries()));
    }

    private static void countAdGroupsByCampaign(AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws RemoteException {
        // Get the AdGroupService.
        AdGroupServiceInterface adGroupService =
                adWordsServices.get(session, AdGroupServiceInterface.class);

        // Create selector.
        SelectorBuilder builder = new SelectorBuilder();
        Selector selector = builder
                .fields(AdGroupField.Id)
                .equals(AdGroupField.CampaignId, campaignId.toString())
                .build();

        // Set selector paging
        Paging paging = new Paging();
        paging.setNumberResults(0);
        selector.setPaging(paging);

        AdGroupPage page = adGroupService.get(selector);

        System.out.println("Count of AdGroups in Campaign ID " + campaignId.toString() + " = " + NumberFormat.getInstance().format(page.getTotalNumEntries()));
    }

    private static void countCampaigns(AdWordsServices adWordsServices, AdWordsSession session) throws RemoteException {
        // Get the CampaignService
        CampaignServiceInterface campaignService =
                adWordsServices.get(session, CampaignServiceInterface.class);

        // Create selector.
        SelectorBuilder builder = new SelectorBuilder();
        Selector selector = builder
                .fields(CampaignField.Id)
                .build();

        // Set selector paging
        Paging paging = new Paging();
        paging.setNumberResults(0);
        selector.setPaging(paging);

        CampaignPage page = campaignService.get(selector);

        System.out.println("Count of Campaigns = " + NumberFormat.getInstance().format(page.getTotalNumEntries()));
    }

    private static void getCampaignsAndCountOfAdgroups(AdWordsServices adWordsServices, AdWordsSession session) throws RemoteException {

        // Get the CampaignService
        CampaignServiceInterface campaignService =
                adWordsServices.get(session, CampaignServiceInterface.class);

        // Create selector.
        SelectorBuilder builder = new SelectorBuilder();
        Selector selector = builder
                .fields(CampaignField.Id)
                .build();

        CampaignPage page = campaignService.get(selector);

        // Display campaigns.
        if (page.getEntries() != null) {
            for (Campaign campaign : page.getEntries()) {
                countAdGroupsByCampaign(adWordsServices, session, campaign.getId());
            }
        }
    }


    private static void countAds(AdWordsServices adWordsServices, AdWordsSession session) throws RemoteException {
        // Get the AdGroupAdService.
        AdGroupAdServiceInterface adGroupAdService =
                adWordsServices.get(session, AdGroupAdServiceInterface.class);

        // Create selector.
        SelectorBuilder builder = new SelectorBuilder();
        Selector selector = builder
                .fields(AdGroupAdField.Id)
                .build();

        // Set selector paging
        Paging paging = new Paging();
        paging.setNumberResults(0);
        selector.setPaging(paging);

        AdGroupAdPage page = adGroupAdService.get(selector);

        System.out.println("Count of Ads = " + NumberFormat.getInstance().format(page.getTotalNumEntries()));
    }
}
