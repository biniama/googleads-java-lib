// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.jaxws.utils.v201603.batchjob;

import com.google.api.ads.adwords.jaxws.v201603.cm.ApiError;
import com.google.api.ads.adwords.jaxws.v201603.cm.Operand;
import com.google.api.ads.adwords.jaxws.v201603.cm.Operation;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadStatus;
import com.google.api.ads.adwords.lib.utils.BatchJobUploader;
import com.google.api.ads.common.lib.utils.AdsUtilityInvocationHandler;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.reflect.Reflection;

import java.lang.reflect.InvocationHandler;

/**
 * Implementation of {@link BatchJobHelperInterface} for JAX-WS v201603.
 */
public class BatchJobHelper
    implements BatchJobHelperInterface<
        Operation, Operand, ApiError, MutateResult, BatchJobMutateResponse> {

  private BatchJobHelperInterface<
          Operation, Operand, ApiError, MutateResult, BatchJobMutateResponse>
      impl;

  @SuppressWarnings("unchecked")
  public BatchJobHelper(AdWordsSession session) {
    InvocationHandler invocationHandler =
        new AdsUtilityInvocationHandler(
            new BatchJobHelperImpl(session),
            AdWordsInternals.getInstance().getAdsUtilityRegistry());
    this.impl = Reflection.newProxy(BatchJobHelperInterface.class, invocationHandler);
  }

  /**
   * Constructor for testing to allow mocking of the underlying uploader.
   */
  @SuppressWarnings("unchecked")
  @VisibleForTesting
  BatchJobHelper(
      BatchJobUploader<Operand, ApiError, MutateResult, BatchJobMutateResponse> uploader) {
    InvocationHandler invocationHandler =
        new AdsUtilityInvocationHandler(
            new BatchJobHelperImpl(uploader),
            AdWordsInternals.getInstance().getAdsUtilityRegistry());
    this.impl = Reflection.newProxy(BatchJobHelperInterface.class, invocationHandler);
  }

  @Override
  public BatchJobUploadResponse uploadBatchJobOperations(
      Iterable<Operation> operations, String uploadUrl) throws BatchJobException {
    return impl.uploadBatchJobOperations(operations, uploadUrl);
  }

  @Override
  public BatchJobUploadResponse uploadIncrementalBatchJobOperations(
      Iterable<? extends Operation> operations,
      boolean isLastRequest,
      BatchJobUploadStatus batchJobUploadStatus)
      throws BatchJobException {
    return impl.uploadIncrementalBatchJobOperations(
        operations, isLastRequest, batchJobUploadStatus);
  }

  @Override
  public BatchJobMutateResponse downloadBatchJobMutateResponse(String downloadUrl)
      throws BatchJobException {
    return impl.downloadBatchJobMutateResponse(downloadUrl);
  }
}
