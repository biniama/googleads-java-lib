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


package com.google.api.ads.dfp.jaxws.v201602;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for managing {@link BaseRate} objects.
 *       <p>
 *       To use this service, you need to have the new sales management solution
 *       enabled on your network. If you do not see a "Sales" tab in
 *       <a href="https://www.google.com/dfp">DoubleClick for Publishers (DFP)</a>,
 *       you will not be able to use this service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BaseRateServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BaseRateServiceInterface {


    /**
     * 
     *         Creates a list of new {@link BaseRate} objects.
     *         
     *         @param baseRates the base rates to be created
     *         @return the base rates with their IDs filled in
     *       
     * 
     * @param baseRates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201602.BaseRate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
    @RequestWrapper(localName = "createBaseRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.BaseRateServiceInterfacecreateBaseRates")
    @ResponseWrapper(localName = "createBaseRatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.BaseRateServiceInterfacecreateBaseRatesResponse")
    public List<BaseRate> createBaseRates(
        @WebParam(name = "baseRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        List<BaseRate> baseRates)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link BaseRatePage} of {@link BaseRate} objects that satisfy the given
     *         {@link Statement#query}.
     *         
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>{@link BaseRate#rateCardId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link BaseRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productTemplateId}</td>
     *         <td>{@link ProductTemplateBaseRate#id}<br><b>Note:</b>&nbsp;Cannot be
     *         combined with {@code productId}.
     *         </tr>
     *         <td>{@code productId}</td>
     *         <td>{@link ProductBaseRate#id}<br><b>Note:</b>&nbsp;Cannot be combined with
     *         {@code productTemplateId}.
     *         </tr>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of base rates.
     *         @return the page of base rates that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201602.BaseRatePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
    @RequestWrapper(localName = "getBaseRatesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.BaseRateServiceInterfacegetBaseRatesByStatement")
    @ResponseWrapper(localName = "getBaseRatesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.BaseRateServiceInterfacegetBaseRatesByStatementResponse")
    public BaseRatePage getBaseRatesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link BaseRate} objects that satisfy the given
     *         {@link Statement#query}.
     *         
     *         @param baseRateAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of base rates.
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param baseRateAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201602.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
    @RequestWrapper(localName = "performBaseRateAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.BaseRateServiceInterfaceperformBaseRateAction")
    @ResponseWrapper(localName = "performBaseRateActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.BaseRateServiceInterfaceperformBaseRateActionResponse")
    public UpdateResult performBaseRateAction(
        @WebParam(name = "baseRateAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        BaseRateAction baseRateAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link BaseRate} objects.
     *         
     *         @param baseRates the base rates to be updated
     *         @return the updated base rates
     *       
     * 
     * @param baseRates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201602.BaseRate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
    @RequestWrapper(localName = "updateBaseRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.BaseRateServiceInterfaceupdateBaseRates")
    @ResponseWrapper(localName = "updateBaseRatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.BaseRateServiceInterfaceupdateBaseRatesResponse")
    public List<BaseRate> updateBaseRates(
        @WebParam(name = "baseRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        List<BaseRate> baseRates)
        throws ApiException_Exception
    ;

}
