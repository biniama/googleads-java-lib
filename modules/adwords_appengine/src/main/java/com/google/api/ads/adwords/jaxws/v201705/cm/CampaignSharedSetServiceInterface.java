// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201705.cm;

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
 *       This service is used for managing associations between {@code SharedSet} entities
 *       and {@code Campaign} entities.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CampaignSharedSetServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignSharedSetServiceInterface {


    /**
     * 
     *         Returns a list of CampaignSharedSets based on the given selector.
     *         @param selector the selector specifying the query
     *         @return a list of CampaignSharedSet entities that meet the criterion specified
     *         by the selector
     *         @throws ApiException
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705", className = "com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705", className = "com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetServiceInterfacegetResponse")
    public CampaignSharedSetPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations.
     *         @param operations the operations to apply
     *         @return the modified list of CampaignSharedSet associations
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705", className = "com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705", className = "com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetServiceInterfacemutateResponse")
    public CampaignSharedSetReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705")
        List<CampaignSharedSetOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of CampaignSharedSets that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @returns A list of CampaignSharedSets
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705", className = "com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705", className = "com.google.api.ads.adwords.jaxws.v201705.cm.CampaignSharedSetServiceInterfacequeryResponse")
    public CampaignSharedSetPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705")
        String query)
        throws ApiException_Exception
    ;

}
