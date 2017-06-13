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

package adwords.axis.v201609.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201609.cm.*;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CancelBatchJob {

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

    public static void runExample(AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
        // Get the BatchJobService.
        BatchJobServiceInterface batchJobService = adWordsServices.get(session, BatchJobServiceInterface.class);

        BatchJob batchJob = new BatchJob();
        batchJob.setId(436732863L);
        batchJob.setStatus(BatchJobStatus.CANCELING);

        BatchJobOperation batchJobSetOperation = new BatchJobOperation();
        batchJobSetOperation.setOperand(batchJob);
        batchJobSetOperation.setOperator(Operator.SET);

        try {
            BatchJobReturnValue batchJobReturnValue = batchJobService.mutate(new BatchJobOperation[]{batchJobSetOperation});

            System.out.printf("Requested cancellation of batch job with ID %d.%n and returned status is: %s",
                    batchJob.getId(), batchJobReturnValue.getValue(0).getStatus());
        } catch (ApiException e) {

            System.out.printf("Attempt to cancel batch job with ID %d was rejected because the job already "
                            + "completed or was canceled.", batchJob.getId());
            throw e;
        }
    }
}
