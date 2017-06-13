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
import com.google.api.ads.adwords.axis.v201609.cm.*;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Arrays;
import java.util.List;

/**
 * This example deletes an ad group by setting the status to 'REMOVED'. To get
 * ad groups, run GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class RemoveListOfAdGroups {

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

      List<Long> ids = Arrays.asList(38343699080L,
              36237031872L,
              35541887243L,
              35528848013L,
              35344556389L,
              35541912123L,
              35528947653L,
              32676705541L,
              39539534527L,
              37492491042L,
              37600399604L,
              36259253219L,
              35528848053L,
              32677428701L,
              41449985452L,
              36259254419L,
              34287180445L,
              36259103899L,
              39539539087L,
              37600398884L,
              34716243806L,
              36782987235L,
              36237327592L,
              35109168959L,
              36236703592L,
              38688303267L,
              38618973031L,
              33496638422L,
              36965379518L,
              36259256059L,
              35344733029L,
              34287666405L,
              37492499242L,
              37600399364L,
              35344732309L,
              34826503614L,
              37492119562L,
              33496652302L,
              34826670934L,
              44311630948L,
              37600360764L,
              37491229122L,
              36237031632L,
              35944082356L,
              38618734711L,
              35394381306L,
              35344353749L,
              35944149836L,
              38750481834L,
              36237328072L,
              42752428064L,
              35108833639L,
              38688274987L,
              35344752429L,
              38750481594L,
              39860008790L,
              35394543786L,
              34576188863L,
              36965379798L,
              36237327752L,
              35528898133L,
              38344911960L,
              36555965220L,
              34826504134L,
              35944083316L,
              35394049186L,
              34716222166L,
              41576634451L,
              35394051746L,
              36782986795L,
              38618741911L,
              36784074395L,
              35944135876L,
              35944433996L,
              33496637942L,
              38618730951L,
              38344912440L,
              38618946431L,
              35109187199L,
              35529343893L,
              36782987475L,
              44311631468L,
              39642749921L,
              38619616711L,
              36237242312L,
              31324797330L,
              32676837301L,
              36782986555L,
              33496667662L,
              34287094965L,
              37491156442L,
              37491155202L,
              38526821169L,
              39860147030L,
              37490979282L,
              35408674705L,
              34287093965L,
              38618740071L,
              39642748961L,
              38750483914L);

      for (Long id : ids) {

          // Create ad group with REMOVED status.
          AdGroup adGroup = new AdGroup();
          adGroup.setId(id);
          adGroup.setStatus(AdGroupStatus.REMOVED);

          // Create operations.
          AdGroupOperation operation = new AdGroupOperation();
          operation.setOperand(adGroup);
          operation.setOperator(Operator.SET);

          AdGroupOperation[] operations = new AdGroupOperation[] {operation};

          // Remove ad group.
          AdGroupReturnValue result = adGroupService.mutate(operations);

          // Display ad groups.
          for (AdGroup adGroupResult : result.getValue()) {
              System.out.printf("Ad group with name '%s' and ID %d was removed.%n",
                      adGroupResult.getName(), adGroupResult.getId());
          }
      }

  }
}
