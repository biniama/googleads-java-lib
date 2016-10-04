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


package com.google.api.ads.adwords.jaxws.v201607.mcm;

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
 *       Service for creating, editing, and deleting labels that can be applied to managed customers.
 *       
 *       <p>Labels created by a manager are not accessible to any customers managed
 *       by this manager.  Only manager customers may create these labels.
 *       
 *       <p>Note that label access works a little differently in the API than it does in the
 *       AdWords UI.  In the UI, a manager will never see a submanager's labels, and will always
 *       be using his own labels regardless of which managed account he is viewing.  In this API,
 *       like other API services, if you specify a submanager as the effective account for the API
 *       request, then the request will operate on the submanager's labels.
 *       
 *       <p>To apply a label to a managed customer, see {@link ManagedCustomerService#mutateLabel}.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AccountLabelServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201607.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.mcm.ObjectFactory.class
})
public interface AccountLabelServiceInterface {


    /**
     * 
     *         Returns a list of labels specified by the selector for the authenticated user.
     *         
     *         @param selector filters the list of labels to return
     *         @return response containing lists of labels that meet all the criteria of the selector
     *         @throws ApiException if a problem occurs fetching the information requested
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.mcm.AccountLabelPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.mcm.AccountLabelServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.mcm.AccountLabelServiceInterfacegetResponse")
    public AccountLabelPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
        Selector selector)
        throws ApiException
    ;

    /**
     * 
     *         Possible actions:
     *         <ul>
     *         <li> Create a new label - create a new {@link Label} and call mutate with ADD operator
     *         <li> Edit the label name - set the appropriate fields in your {@linkplain Label} and call
     *         mutate with the SET operator. Null fields will be interpreted to mean "no change"
     *         <li> Delete the label - call mutate with REMOVE operator
     *         </ul>
     *         
     *         @param operations list of unique operations to be executed in a single transaction, in the
     *         order specified.
     *         @return the mutated labels, in the same order that they were in as the parameter
     *         @throws ApiException if problems occurs while modifying label information
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.mcm.AccountLabelReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.mcm.AccountLabelServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.mcm.AccountLabelServiceInterfacemutateResponse")
    public AccountLabelReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201607")
        List<AccountLabelOperation> operations)
        throws ApiException
    ;

}
