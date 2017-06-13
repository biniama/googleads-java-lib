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

package adwords.axis.v201705.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201705.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.ApiException;
import com.google.api.ads.adwords.axis.v201705.cm.AttributeFieldMapping;
import com.google.api.ads.adwords.axis.v201705.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201705.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201705.cm.Bids;
import com.google.api.ads.adwords.axis.v201705.cm.Campaign;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201705.cm.DynamicSearchAdsSetting;
import com.google.api.ads.adwords.axis.v201705.cm.Feed;
import com.google.api.ads.adwords.axis.v201705.cm.FeedAttribute;
import com.google.api.ads.adwords.axis.v201705.cm.FeedAttributeType;
import com.google.api.ads.adwords.axis.v201705.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201705.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201705.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201705.cm.FeedItemReturnValue;
import com.google.api.ads.adwords.axis.v201705.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201705.cm.FeedMappingOperation;
import com.google.api.ads.adwords.axis.v201705.cm.FeedMappingServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.FeedOperation;
import com.google.api.ads.adwords.axis.v201705.cm.FeedOrigin;
import com.google.api.ads.adwords.axis.v201705.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.Money;
import com.google.api.ads.adwords.axis.v201705.cm.Operator;
import com.google.api.ads.adwords.axis.v201705.cm.PageFeed;
import com.google.api.ads.adwords.axis.v201705.cm.Selector;
import com.google.api.ads.adwords.axis.v201705.cm.Setting;
import com.google.api.ads.adwords.axis.v201705.cm.Webpage;
import com.google.api.ads.adwords.axis.v201705.cm.WebpageCondition;
import com.google.api.ads.adwords.axis.v201705.cm.WebpageConditionOperand;
import com.google.api.ads.adwords.axis.v201705.cm.WebpageParameter;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.CampaignField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This code example adds a page feed to specify precisely which URLs to use with your Dynamic
 * Search Ads campaign. To create a Dynamic Search Ads campaign, run
 * AddDynamicSearchAdsCampaign.java. To get campaigns, run GetCampaigns.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddDynamicPageFeed {

  // The criterion type to be used for DSA page feeds. DSA page feeds use criterionType field
  // instead of the placeholderType field unlike most other feed types.
  private static final int DSA_PAGE_FEED_CRITERION_TYPE = 61;

  // ID that corresponds to the page URLs.
  private static final int DSA_PAGE_URLS_FIELD_ID = 1;

  // ID that corresponds to the labels.
  private static final int DSA_LABEL_FIELD_ID = 2;

  /** Class to keep track of DSA page feed details. */
  private static class DSAFeedDetails {
    private Long feedId;
    private Long urlAttributeId;
    private Long labelAttributeId;
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential =
        new OfflineCredentials.Builder()
            .forApi(Api.ADWORDS)
            .fromFile()
            .build()
            .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");
    Long adGroupId = Long.valueOf("INSERT_AD_GROUP_ID_HERE");

    runExample(adWordsServices, session, campaignId, adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long campaignId,
      Long adGroupId)
      throws Exception {
    String dsaPageUrlLabel = "discounts";

    // Get the page feed details. This code example creates a new feed, but you can
    // fetch and re-use an existing feed.
    DSAFeedDetails feedDetails = createFeed(adWordsServices, session);
    createFeedMapping(adWordsServices, session, feedDetails);
    createFeedItems(adWordsServices, session, feedDetails, dsaPageUrlLabel);

    // Associate the page feed with the campaign.
    updateCampaignDsaSetting(adWordsServices, session, campaignId, feedDetails);

    // Optional: Target web pages matching the feed's label in the ad group.
    addDsaTargeting(adWordsServices, session, adGroupId, dsaPageUrlLabel);

    System.out.printf("Dynamic page feed setup is complete for campaign ID %s.%n", campaignId);
  }

  /** Creates the feed for DSA page URLs. */
  private static DSAFeedDetails createFeed(
      AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws ApiException, RemoteException {
    // Get the FeedService.
    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);

    // Create attributes.
    FeedAttribute urlAttribute = new FeedAttribute();
    urlAttribute.setType(FeedAttributeType.URL_LIST);
    urlAttribute.setName("Page URL");

    FeedAttribute labelAttribute = new FeedAttribute();
    labelAttribute.setType(FeedAttributeType.STRING_LIST);
    labelAttribute.setName("Label");

    // Create the feed.
    Feed dsaPageFeed = new Feed();
    dsaPageFeed.setName("DSA Feed #" + System.currentTimeMillis());
    dsaPageFeed.setAttributes(new FeedAttribute[] {urlAttribute, labelAttribute});
    dsaPageFeed.setOrigin(FeedOrigin.USER);

    // Create operation.
    FeedOperation operation = new FeedOperation();
    operation.setOperand(dsaPageFeed);
    operation.setOperator(Operator.ADD);

    // Add the feed.
    Feed newFeed = feedService.mutate(new FeedOperation[] {operation}).getValue(0);

    DSAFeedDetails feedDetails = new DSAFeedDetails();
    feedDetails.feedId = newFeed.getId();
    FeedAttribute[] savedAttributes = newFeed.getAttributes();
    feedDetails.urlAttributeId = savedAttributes[0].getId();
    feedDetails.labelAttributeId = savedAttributes[1].getId();
    System.out.printf(
        "Feed with name '%s' and ID %d with urlAttributeId %d"
            + " and labelAttributeId %d was created.%n",
        newFeed.getName(),
        feedDetails.feedId,
        feedDetails.urlAttributeId,
        feedDetails.labelAttributeId);
    return feedDetails;
  }

  /** Creates the feed mapping for the DSA page feeds. */
  private static void createFeedMapping(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, DSAFeedDetails feedDetails)
      throws Exception {
    // Get the FeedMappingService.
    FeedMappingServiceInterface feedMappingService =
        adWordsServices.get(session, FeedMappingServiceInterface.class);

    // Map the FeedAttributeIds to the fieldId constants.
    AttributeFieldMapping urlFieldMapping = new AttributeFieldMapping();
    urlFieldMapping.setFeedAttributeId(feedDetails.urlAttributeId);
    urlFieldMapping.setFieldId(DSA_PAGE_URLS_FIELD_ID);
    AttributeFieldMapping labelFieldMapping = new AttributeFieldMapping();
    labelFieldMapping.setFeedAttributeId(feedDetails.labelAttributeId);
    labelFieldMapping.setFieldId(DSA_LABEL_FIELD_ID);

    // Create the FeedMapping and operation.
    FeedMapping feedMapping = new FeedMapping();
    feedMapping.setCriterionType(DSA_PAGE_FEED_CRITERION_TYPE);
    feedMapping.setFeedId(feedDetails.feedId);
    feedMapping.setAttributeFieldMappings(
        new AttributeFieldMapping[] {urlFieldMapping, labelFieldMapping});
    FeedMappingOperation operation = new FeedMappingOperation();
    operation.setOperand(feedMapping);
    operation.setOperator(Operator.ADD);

    // Add the field mapping.
    FeedMapping newFeedMapping =
        feedMappingService.mutate(new FeedMappingOperation[] {operation}).getValue(0);
    System.out.printf(
        "Feed mapping with ID %d and criterionType %d was saved for feed with ID %d.%n",
        newFeedMapping.getFeedMappingId(),
        newFeedMapping.getCriterionType(),
        newFeedMapping.getFeedId());
  }

  /** Creates the page URLs in the DSA page feed. */
  private static void createFeedItems(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      DSAFeedDetails feedDetails,
      String labelName)
      throws Exception {
    // Get the FeedItemService.
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);

    // Create operations to add FeedItems.
    FeedItemOperation[] operations =
        new FeedItemOperation[] {
          createDsaUrlAddOperation(
              feedDetails, "http://www.example.com/discounts/rental-cars", labelName),
          createDsaUrlAddOperation(
              feedDetails, "http://www.example.com/discounts/hotel-deals", labelName),
          createDsaUrlAddOperation(
              feedDetails, "http://www.example.com/discounts/flight-deals", labelName),
        };

    FeedItemReturnValue result = feedItemService.mutate(operations);
    for (FeedItem item : result.getValue()) {
      System.out.printf("Feed item with feed item ID %d was added.%n", item.getFeedItemId());
    }
  }

  /** Creates a {@link FeedItemOperation} to add the DSA URL. */
  private static FeedItemOperation createDsaUrlAddOperation(
      DSAFeedDetails feedDetails, String url, String labelName) {
    // Create the FeedItemAttributeValues for the URL and label.
    FeedItemAttributeValue urlAttributeValue = new FeedItemAttributeValue();
    urlAttributeValue.setFeedAttributeId(feedDetails.urlAttributeId);

    // Optional: Add the {feeditem} valuetrack parameter to track which page feed items lead
    // to each click.
    url = url + "?id={feeditem}";
    urlAttributeValue.setStringValues(new String[] {url});

    FeedItemAttributeValue labelAttributeValue = new FeedItemAttributeValue();
    labelAttributeValue.setFeedAttributeId(feedDetails.labelAttributeId);
    labelAttributeValue.setStringValues(new String[] {labelName});

    // Create the feed item and operation.
    FeedItem feedItem = new FeedItem();
    feedItem.setFeedId(feedDetails.feedId);

    feedItem.setAttributeValues(
        new FeedItemAttributeValue[] {urlAttributeValue, labelAttributeValue});

    FeedItemOperation operation = new FeedItemOperation();
    operation.setOperand(feedItem);
    operation.setOperator(Operator.ADD);

    return operation;
  }

  /** Updates the campaign DSA setting to add DSA pagefeeds. */
  private static void updateCampaignDsaSetting(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long campaignId,
      DSAFeedDetails feedDetails)
      throws ApiException, RemoteException {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    Selector selector =
        new SelectorBuilder()
            .fields(CampaignField.Id, CampaignField.Settings)
            .equalsId(campaignId)
            .build();

    CampaignPage campaignPage = campaignService.get(selector);
    if (campaignPage.getEntries() == null || campaignPage.getTotalNumEntries() == 0) {
      throw new IllegalArgumentException("No campaign found with ID: " + campaignId);
    }
    Campaign campaign = campaignPage.getEntries(0);

    if (campaign.getSettings() == null) {
      throw new IllegalArgumentException(
          "Campaign with ID " + campaignId + " is not a DSA campaign.");
    }

    DynamicSearchAdsSetting dsaSetting = null;
    for (Setting setting : campaign.getSettings()) {
      if (setting instanceof DynamicSearchAdsSetting) {
        dsaSetting = (DynamicSearchAdsSetting) setting;
        break;
      }
    }

    if (dsaSetting == null) {
      throw new IllegalArgumentException(
          "Campaign with ID " + campaignId + " is not a DSA campaign.");
    }

    // Use a page feed to specify precisely which URLs to use with your
    // Dynamic Search Ads.
    PageFeed pageFeed = new PageFeed();
    pageFeed.setFeedIds(new long[] {feedDetails.feedId});
    dsaSetting.setPageFeed(pageFeed);

    // Optional: Specify whether only the supplied URLs should be used with your
    // Dynamic Search Ads.
    dsaSetting.setUseSuppliedUrlsOnly(true);

    Campaign updatedCampaign = new Campaign();
    updatedCampaign.setId(campaignId);
    updatedCampaign.setSettings(campaign.getSettings());

    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(updatedCampaign);
    operation.setOperator(Operator.SET);

    updatedCampaign = campaignService.mutate(new CampaignOperation[] {operation}).getValue(0);
    System.out.printf(
        "DSA page feed for campaign ID %d was updated with feed ID %d.%n",
        updatedCampaign.getId(), feedDetails.feedId);
  }

  /**
   * Sets custom targeting for the page feed URLs based on a list of labels.
   *
   * @param adWordsServices
   * @param session
   * @param adGroupId
   * @param dsaPageUrlLabel
   */
  private static void addDsaTargeting(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long adGroupId,
      String dsaPageUrlLabel)
      throws ApiException, RemoteException {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // Create a webpage criterion.
    Webpage webpage = new Webpage();

    WebpageParameter parameter = new WebpageParameter();
    parameter.setCriterionName("Test criterion");
    webpage.setParameter(parameter);

    // Add a condition for label=specified_label_name.
    WebpageCondition condition = new WebpageCondition();
    condition.setOperand(WebpageConditionOperand.CUSTOM_LABEL);
    condition.setArgument(dsaPageUrlLabel);
    parameter.setConditions(new WebpageCondition[] {condition});

    BiddableAdGroupCriterion criterion = new BiddableAdGroupCriterion();
    criterion.setAdGroupId(adGroupId);
    criterion.setCriterion(webpage);

    // Set a custom bid for this criterion.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();

    CpcBid cpcBid = new CpcBid();
    Money money = new Money();
    money.setMicroAmount(1_500_000L);
    cpcBid.setBid(money);
    biddingStrategyConfiguration.setBids(new Bids[] {cpcBid});

    criterion.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    AdGroupCriterionOperation operation = new AdGroupCriterionOperation();
    operation.setOperand(criterion);
    operation.setOperator(Operator.ADD);

    BiddableAdGroupCriterion newCriterion =
        (BiddableAdGroupCriterion)
            adGroupCriterionService.mutate(new AdGroupCriterionOperation[] {operation}).getValue(0);
    System.out.printf(
        "Web page criterion with ID %d and status '%s' was created.%n",
        newCriterion.getCriterion().getId(), newCriterion.getUserStatus());
  }
}
