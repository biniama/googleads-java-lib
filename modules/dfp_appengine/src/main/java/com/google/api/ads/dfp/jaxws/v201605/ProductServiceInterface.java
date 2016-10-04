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


package com.google.api.ads.dfp.jaxws.v201605;

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
 *       Provides methods for updating and retrieving {@link Product} objects.
 *       <p>
 *       A {@code Product} represents a line item proposal. Products are generated from
 *       {@link ProductTemplate product templates} on a periodic basis using the product template's
 *       attributes. Products are typically used by inventory managers to restrict what salespeople
 *       can sell.
 *       
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
@WebService(name = "ProductServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductServiceInterface {


    /**
     * 
     *         Gets a {@link ProductPage} of {@link Product} objects that satisfy the criteria specified by
     *         given {@link Statement#query}.
     *         <p>
     *         When using sales management, the following fields are supported for filtering and/or sorting.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         <th scope="col">Filterable</th>
     *         <th scope="col">Sortable</th>
     *         </tr>
     *         <tr>
     *         <td>{@code rateCardId}</td>
     *         <td>Rate card ID which the product is associated with</td>
     *         <td>Yes</td>
     *         <td>No</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Product#status}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemType}</td>
     *         <td>{@link Product#lineItemType}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productType}</td>
     *         <td>{@link Product#productType}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateType}</td>
     *         <td>{@link Product#rateType}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productTemplateId}</td>
     *         <td>{@link Product#productTemplateId}</td>
     *         <td>Yes</td>
     *         <td>No</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Product#name}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Product#description}</td>
     *         <td>Yes</td>
     *         <td>No</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Product#id}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Product#lastModifiedDateTime}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         </table>
     *         
     *         When using programmatic guaranteed and not sales management,
     *         the following fields are supported for filtering and/or sorting.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         <th scope="col">Filterable</th>
     *         <th scope="col">Sortable</th>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Product#status}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateType}</td>
     *         <td>{@link Product#rateType}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Product#name}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Product#id}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Product#lastModifiedDateTime}</td>
     *         <td>Yes</td>
     *         <td>Yes</td>
     *         </tr>
     *         </table>
     *         
     *         @param statement a Publisher Query Language statement which specifies the filtering
     *         criteria over products
     *         @return the products that match the given statement
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201605.ProductPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "getProductsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProductServiceInterfacegetProductsByStatement")
    @ResponseWrapper(localName = "getProductsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProductServiceInterfacegetProductsByStatementResponse")
    public ProductPage getProductsByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs action on {@link Product} objects that satisfy the given {@link Statement}.
     *         
     *         @param productAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter a set of products.
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param productAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201605.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "performProductAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProductServiceInterfaceperformProductAction")
    @ResponseWrapper(localName = "performProductActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProductServiceInterfaceperformProductActionResponse")
    public UpdateResult performProductAction(
        @WebParam(name = "productAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        ProductAction productAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Product} objects.
     *         Note non-updatable fields will not be backfilled.
     *         
     *         @param products the products to update
     *         @return the updated products
     *       
     * 
     * @param products
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201605.Product>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "updateProducts", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProductServiceInterfaceupdateProducts")
    @ResponseWrapper(localName = "updateProductsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.ProductServiceInterfaceupdateProductsResponse")
    public List<Product> updateProducts(
        @WebParam(name = "products", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        List<Product> products)
        throws ApiException_Exception
    ;

}
