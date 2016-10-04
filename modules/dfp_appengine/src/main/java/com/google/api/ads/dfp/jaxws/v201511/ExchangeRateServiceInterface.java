// Copyright 2015 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201511;

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
 *       Provides methods for adding, updating and retrieving {@link ExchangeRate} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ExchangeRateServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExchangeRateServiceInterface {


    /**
     * 
     *         Creates new {@link ExchangeRate} objects.
     *         
     *         For each exchange rate, the following fields are required:
     *         <ul>
     *         <li>{@link ExchangeRate#currencyCode}</li>
     *         <li>{@link ExchangeRate#exchangeRate} when {@link ExchangeRate#refreshRate} is
     *         {@link ExchangeRateRefreshRate#FIXED}</li>
     *         </ul>
     *         
     *         @param exchangeRates the exchange rates to create
     *         @return the created exchange rates with their exchange rate values filled in
     *       
     * 
     * @param exchangeRates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201511.ExchangeRate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "createExchangeRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ExchangeRateServiceInterfacecreateExchangeRates")
    @ResponseWrapper(localName = "createExchangeRatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ExchangeRateServiceInterfacecreateExchangeRatesResponse")
    public List<ExchangeRate> createExchangeRates(
        @WebParam(name = "exchangeRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        List<ExchangeRate> exchangeRates)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ExchangeRatePage} of {@link ExchangeRate} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ExchangeRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code currencyCode}</td>
     *         <td>{@link ExchangeRate#currencyCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code refreshRate}</td>
     *         <td>{@link ExchangeRate#refreshRate}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code direction}</td>
     *         <td>{@link ExchangeRate#direction}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code exchangeRate}</td>
     *         <td>{@link ExchangeRate#exchangeRate}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of exchange rates
     *         @return the exchange rates that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201511.ExchangeRatePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "getExchangeRatesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ExchangeRateServiceInterfacegetExchangeRatesByStatement")
    @ResponseWrapper(localName = "getExchangeRatesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ExchangeRateServiceInterfacegetExchangeRatesByStatementResponse")
    public ExchangeRatePage getExchangeRatesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs an action on {@link ExchangeRate} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ExchangeRate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code currencyCode}</td>
     *         <td>{@link ExchangeRate#currencyCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code refreshRate}</td>
     *         <td>{@link ExchangeRate#refreshRate}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code direction}</td>
     *         <td>{@link ExchangeRate#direction}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code exchangeRate}</td>
     *         <td>{@link ExchangeRate#exchangeRate}</td>
     *         </tr>
     *         </table>
     *         
     *         @param exchangeRateAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of exchange rates
     *         @return the result of the action performed
     *       
     * 
     * @param exchangeRateAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201511.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "performExchangeRateAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ExchangeRateServiceInterfaceperformExchangeRateAction")
    @ResponseWrapper(localName = "performExchangeRateActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ExchangeRateServiceInterfaceperformExchangeRateActionResponse")
    public UpdateResult performExchangeRateAction(
        @WebParam(name = "exchangeRateAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        ExchangeRateAction exchangeRateAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ExchangeRate} objects.
     *         
     *         @param exchangeRates the exchange rates to update
     *         @return the updated exchange rates
     *       
     * 
     * @param exchangeRates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201511.ExchangeRate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "updateExchangeRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ExchangeRateServiceInterfaceupdateExchangeRates")
    @ResponseWrapper(localName = "updateExchangeRatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ExchangeRateServiceInterfaceupdateExchangeRatesResponse")
    public List<ExchangeRate> updateExchangeRates(
        @WebParam(name = "exchangeRates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        List<ExchangeRate> exchangeRates)
        throws ApiException_Exception
    ;

}
