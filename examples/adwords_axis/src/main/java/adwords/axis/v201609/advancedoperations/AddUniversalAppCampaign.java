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

package adwords.axis.v201609.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201609.cm.AdvertisingChannelSubType;
import com.google.api.ads.adwords.axis.v201609.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201609.cm.ApiException;
import com.google.api.ads.adwords.axis.v201609.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201609.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201609.cm.Budget;
import com.google.api.ads.adwords.axis.v201609.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201609.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201609.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.Campaign;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201609.cm.Criterion;
import com.google.api.ads.adwords.axis.v201609.cm.GeoTargetTypeSetting;
import com.google.api.ads.adwords.axis.v201609.cm.GeoTargetTypeSettingNegativeGeoTargetType;
import com.google.api.ads.adwords.axis.v201609.cm.GeoTargetTypeSettingPositiveGeoTargetType;
import com.google.api.ads.adwords.axis.v201609.cm.Language;
import com.google.api.ads.adwords.axis.v201609.cm.Location;
import com.google.api.ads.adwords.axis.v201609.cm.Money;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.axis.v201609.cm.Setting;
import com.google.api.ads.adwords.axis.v201609.cm.TargetCpaBiddingScheme;
import com.google.api.ads.adwords.axis.v201609.cm.UniversalAppBiddingStrategyGoalType;
import com.google.api.ads.adwords.axis.v201609.cm.UniversalAppCampaignSetting;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;
import java.rmi.RemoteException;
import java.util.List;
import org.joda.time.DateTime;

/**
 * This example adds a universal app campaign. To get campaigns, run GetCampaigns.java. To upload
 * image assets for this campaign, run UploadImage.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddUniversalAppCampaign {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session)
      throws Exception {

    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create the campaign.
    Campaign campaign = new Campaign();
    campaign.setName("Interplanetary Cruise App #" + System.currentTimeMillis());
    campaign.setStatus(CampaignStatus.PAUSED);

    // Set the advertising channel and subchannel types for universal app campaigns.
    campaign.setAdvertisingChannelType(AdvertisingChannelType.MULTI_CHANNEL);
    campaign.setAdvertisingChannelSubType(AdvertisingChannelSubType.UNIVERSAL_APP_CAMPAIGN);

    // Set the campaign's bidding strategy. universal app campaigns
    // only support TARGET_CPA bidding strategy.
    BiddingStrategyConfiguration biddingConfig = new BiddingStrategyConfiguration();
    biddingConfig.setBiddingStrategyType(BiddingStrategyType.TARGET_CPA);

    // Set the target CPA to $1 / app install.
    TargetCpaBiddingScheme biddingScheme = new TargetCpaBiddingScheme();
    biddingScheme.setTargetCpa(new Money());
    biddingScheme.getTargetCpa().setMicroAmount(1000000L);

    biddingConfig.setBiddingScheme(biddingScheme);
    campaign.setBiddingStrategyConfiguration(biddingConfig);

    // Set the campaign's budget.
    campaign.setBudget(new Budget());
    campaign.getBudget().setBudgetId(createBudget(adWordsServices, session));

    // Optional: Set the start date.
    campaign.setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"));

    // Optional: Set the end date.
    campaign.setEndDate(new DateTime().plusYears(1).toString("yyyyMMdd"));

    // Set the campaign's assets and ad text ideas. These values will be used to
    // generate ads.
    UniversalAppCampaignSetting universalAppSetting = new UniversalAppCampaignSetting();
    universalAppSetting.setAppId("com.interplanetarycruise.booking");
    universalAppSetting.setDescription1("Best Space Cruise Line");
    universalAppSetting.setDescription2("Visit all the planets");
    universalAppSetting.setDescription3("Trips 7 days a week");
    universalAppSetting.setDescription4("Buy your tickets now!");

    // Optional: You can set up to 10 image assets for your campaign.
    // See UploadImage.java for an example on how to upload images.
    //
    // universalAppSetting.setImageMediaIds(new long[] { INSERT_IMAGE_MEDIA_ID_HERE });

    // Optimize this campaign for getting new users for your app.
    universalAppSetting.setUniversalAppBiddingStrategyGoalType(
        UniversalAppBiddingStrategyGoalType.OPTIMIZE_FOR_INSTALL_CONVERSION_VOLUME);

    // If you select the OPTIMIZE_FOR_IN_APP_CONVERSION_VOLUME goal type, then also specify
    // your in-app conversion types so AdWords can focus your campaign on people who are
    // most likely to complete the corresponding in-app actions.
    // Conversion type IDs can be retrieved using ConversionTrackerService.get.
    //
    // campaign.selectiveOptimization = new SelectiveOptimization();
    // campaign.selectiveOptimization.conversionTypeIds =
    //    new long[] { INSERT_CONVERSION_TYPE_ID_1_HERE, INSERT_CONVERSION_TYPE_ID_2_HERE };

    // Optional: Set the campaign settings for Advanced location options.
    GeoTargetTypeSetting geoSetting = new GeoTargetTypeSetting();
    geoSetting.setPositiveGeoTargetType(
        GeoTargetTypeSettingPositiveGeoTargetType.LOCATION_OF_PRESENCE);
    geoSetting.setNegativeGeoTargetType(GeoTargetTypeSettingNegativeGeoTargetType.DONT_CARE);

    campaign.setSettings(new Setting[] {universalAppSetting, geoSetting});

    // Create the operation.
    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.ADD);

    CampaignOperation[] operations = new CampaignOperation[] {operation};

    // Add the campaign.
    CampaignReturnValue result = campaignService.mutate(operations);

    // Display the results.
    for (Campaign newCampaign : result.getValue()) {
      System.out.printf(
          "Universal app campaign with name '%s' and ID %d was added.%n",
          newCampaign.getName(), newCampaign.getId());

      // Optional: Set the campaign's location and language targeting. No other targeting
      // criteria can be used for universal app campaigns.
      setCampaignTargetingCriteria(newCampaign, adWordsServices, session);
    }
  }

  /**
   * Creates the budget for the campaign.
   *
   * @return the new budget.
   */
  private static Long createBudget(AdWordsServices adWordsServices, AdWordsSession session)
      throws RemoteException, ApiException {
    // Get the BudgetService.
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // Create the campaign budget.
    Budget budget = new Budget();
    budget.setName("Interplanetary Cruise App Budget #" + System.currentTimeMillis());
    Money budgetAmount = new Money();
    budgetAmount.setMicroAmount(50000000L);
    budget.setAmount(budgetAmount);
    budget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);

    // Universal app campaigns don't support shared budgets.
    budget.setIsExplicitlyShared(false);
    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperand(budget);
    budgetOperation.setOperator(Operator.ADD);

    // Add the budget
    Budget addedBudget = budgetService.mutate(new BudgetOperation[] {budgetOperation}).getValue(0);
    System.out.printf(
        "Budget with name '%s' and ID %d was created.%n",
        addedBudget.getName(), addedBudget.getBudgetId());
    return addedBudget.getBudgetId();
  }

  /** Sets the campaign's targeting criteria. */
  private static void setCampaignTargetingCriteria(
      Campaign campaign, AdWordsServices adWordsServices, AdWordsSession session)
      throws ApiException, RemoteException {
    // Get the CampaignCriterionService.
    CampaignCriterionServiceInterface campaignCriterionService =
        adWordsServices.get(session, CampaignCriterionServiceInterface.class);

    // Create locations. The IDs can be found in the documentation or
    // retrieved with the LocationCriterionService.
    Location california = new Location();
    california.setId(21137L);

    Location mexico = new Location();
    mexico.setId(2484L);

    // Create languages. The IDs can be found in the documentation or
    // retrieved with the ConstantDataService.
    Language english = new Language();
    english.setId(1000L);

    Language spanish = new Language();
    spanish.setId(1003L);

    List<Criterion> criteria = Lists.<Criterion>newArrayList(california, mexico, english, spanish);

    // Create operations to add each of the criteria above.
    List<CampaignCriterionOperation> operations = Lists.<CampaignCriterionOperation>newArrayList();
    for (Criterion criterion : criteria) {
      CampaignCriterionOperation operation = new CampaignCriterionOperation();

      CampaignCriterion campaignCriterion = new CampaignCriterion();
      campaignCriterion.setCampaignId(campaign.getId());
      campaignCriterion.setCriterion(criterion);
      operation.setOperand(campaignCriterion);

      operation.setOperator(Operator.ADD);

      operations.add(operation);
    }

    // Set the campaign targets.
    CampaignCriterionReturnValue returnValue =
        campaignCriterionService.mutate(
            operations.toArray(new CampaignCriterionOperation[operations.size()]));

    if (returnValue != null && returnValue.getValue() != null) {
      // Display added campaign targets.
      for (CampaignCriterion campaignCriterion : returnValue.getValue()) {
        System.out.printf(
            "Campaign criteria of type '%s' and ID %d was added.%n",
            campaignCriterion.getCriterion().getCriterionType(),
            campaignCriterion.getCriterion().getId());
      }
    }
  }
}
