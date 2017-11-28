package adwords.axis.v201705.biniam;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201705.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupCriterionPage;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.Paging;
import com.google.api.ads.adwords.axis.v201705.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.AdGroupCriterionField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.client.auth.oauth2.Credential;

import java.text.NumberFormat;

/**
 * This example gets the count of all ad group criteria/keywords in an account.
 * <p/>
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * @modified by Biniam Asnake.
 */
public class GetCountOfKeywordsInAccount {

    public static void main(String[] args) throws Exception {

        long started = System.currentTimeMillis();

        // Generate a refreshable OAuth2 credential.
        Credential oAuth2Credential = new OfflineCredentials.Builder()
                .forApi(OfflineCredentials.Api.ADWORDS)
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
        // Get the AdGroupCriterionService.
        AdGroupCriterionServiceInterface adGroupCriterionService =
                adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

        // Create selector.
        SelectorBuilder builder = new SelectorBuilder();
        Selector selector = builder
                .fields(AdGroupCriterionField.Id)
                .in(AdGroupCriterionField.CriteriaType, "KEYWORD")
                .in(AdGroupCriterionField.Status, "ENABLED")
                .build();

        // Set selector paging
        Paging paging = new Paging();
        paging.setNumberResults(0);
        selector.setPaging(paging);

        // Get all ad group criteria.
        AdGroupCriterionPage page = adGroupCriterionService.get(selector);

        System.out.println("Count of Keywords = " + NumberFormat.getInstance().format(page.getTotalNumEntries()));
    }
}