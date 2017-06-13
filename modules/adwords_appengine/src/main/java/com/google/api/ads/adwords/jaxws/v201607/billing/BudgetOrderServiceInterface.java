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


package com.google.api.ads.adwords.jaxws.v201607.billing;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201607.cm.Selector;


/**
 * 
 *       Service for managing {@link BudgetOrder}s.
 *       <p class="note"><b>Note:</b> The <code>mutate</code> action in this service is available only
 *       on a whitelist basis.</p>
 *       <p class="warning"><b>Warning:</b> The <code>BudgetOrderService</code>
 *       is limited to one operation per mutate request. Any attempt to make
 *       more than one operation will result in an <code>ApiException</code>.</p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BudgetOrderServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201607.billing.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.ch.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.mcm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.o.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.rm.ObjectFactory.class
})
public interface BudgetOrderServiceInterface {


    /**
     * 
     *         Gets a list of {@link BudgetOrder}s using the generic selector.
     *         
     *         @param serviceSelector specifies which BudgetOrder to return.
     *         @return A {@link BudgetOrderPage} of BudgetOrders of the client customer. All BudgetOrder
     *         fields are returned. Stats are not yet supported.
     *         @throws ApiException
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.billing.BudgetOrderPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.billing.Get")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.billing.GetResponse")
    public BudgetOrderPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607")
        Selector serviceSelector)
        throws ApiException
    ;

    /**
     * 
     *         Returns all the open/active BillingAccounts associated with the current manager.
     *         
     *         @return A list of {@link BillingAccount}s.
     *         @throws ApiException
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201607.billing.BillingAccount>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607")
    @RequestWrapper(localName = "getBillingAccounts", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.billing.GetBillingAccounts")
    @ResponseWrapper(localName = "getBillingAccountsResponse", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.billing.GetBillingAccountsResponse")
    public List<BillingAccount> getBillingAccounts()
        throws ApiException
    ;

    /**
     * 
     *         Adds, updates, or removes budget orders. Supported operations are:
     *         <p><code>ADD</code>: Adds a {@link BudgetOrder} to the billing account
     *         specified by the billing account ID.</p>
     *         <p><code>SET</code>: Sets the start/end date and amount of the
     *         {@link BudgetOrder}.</p>
     *         <p><code>REMOVE</code>: Cancels the {@link BudgetOrder} (status change).</p>
     *         <p class="warning"><b>Warning:</b> The <code>BudgetOrderService</code>
     *         is limited to one operation per mutate request. Any attempt to make more
     *         than one operation will result in an <code>ApiException</code>.</p>
     *         <p class="note"><b>Note:</b> This action is available only on a whitelist basis.</p>
     *         @param operations A list of operations, <b>however currently we only
     *         support one operation per mutate call</b>.
     *         @return BudgetOrders affected by the mutate operation.
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.billing.BudgetOrderReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.billing.Mutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.billing.MutateResponse")
    public BudgetOrderReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/billing/v201607")
        List<BudgetOrderOperation> operations)
        throws ApiException
    ;

}
