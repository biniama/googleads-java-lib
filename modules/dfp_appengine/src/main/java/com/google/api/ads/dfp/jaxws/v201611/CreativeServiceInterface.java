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


package com.google.api.ads.dfp.jaxws.v201611;

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
 *       Provides methods for adding, updating and retrieving {@link Creative}
 *       objects.
 *       
 *       <p>For a creative to run, it must be associated with a {@link LineItem}
 *       managed by the {@link LineItemCreativeAssociationService}.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CreativeServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreativeServiceInterface {


    /**
     * 
     *         Creates new {@link Creative} objects.
     *         
     *         @param creatives the creatives to create
     *         @return the created creatives with their IDs filled in
     *       
     * 
     * @param creatives
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201611.Creative>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "createCreatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.CreativeServiceInterfacecreateCreatives")
    @ResponseWrapper(localName = "createCreativesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.CreativeServiceInterfacecreateCreativesResponse")
    public List<Creative> createCreatives(
        @WebParam(name = "creatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        List<Creative> creatives)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CreativePage} of {@link Creative} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Creative#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Creative#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code advertiserId}</td>
     *         <td>{@link Creative#advertiserId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code width}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code height}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Creative#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of creatives
     *         @return the creatives that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201611.CreativePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "getCreativesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.CreativeServiceInterfacegetCreativesByStatement")
    @ResponseWrapper(localName = "getCreativesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.CreativeServiceInterfacegetCreativesByStatementResponse")
    public CreativePage getCreativesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Creative} objects.
     *         
     *         @param creatives the creatives to update
     *         @return the updated creatives
     *       
     * 
     * @param creatives
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201611.Creative>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "updateCreatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.CreativeServiceInterfaceupdateCreatives")
    @ResponseWrapper(localName = "updateCreativesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.CreativeServiceInterfaceupdateCreativesResponse")
    public List<Creative> updateCreatives(
        @WebParam(name = "creatives", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        List<Creative> creatives)
        throws ApiException_Exception
    ;

}
