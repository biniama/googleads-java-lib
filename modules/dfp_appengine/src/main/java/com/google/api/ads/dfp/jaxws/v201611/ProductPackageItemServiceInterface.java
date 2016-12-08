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
 *       Provides methods for creating and retrieving {@link ProductPackageItem} objects.
 *       <p>
 *       A {@link ProductPackageItem} represents a product which will be associated with a
 *       {@link ProductPackage}.
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
@WebService(name = "ProductPackageItemServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductPackageItemServiceInterface {


    /**
     * 
     *         Creates new {@link ProductPackageItem} objects.
     *         
     *         @param productPackageItems the product package items to create
     *         @return the created product package items with their IDs filled in
     *       
     * 
     * @param productPackageItems
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201611.ProductPackageItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "createProductPackageItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemServiceInterfacecreateProductPackageItems")
    @ResponseWrapper(localName = "createProductPackageItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemServiceInterfacecreateProductPackageItemsResponse")
    public List<ProductPackageItem> createProductPackageItems(
        @WebParam(name = "productPackageItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        List<ProductPackageItem> productPackageItems)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ProductPackageItemPage} of {@code ProductPackageItem} objects
     *         that satisfy the filtering criteria specified by given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ProductPackageItem#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productPackageId}</td>
     *         <td>{@link ProductPackageItem#productPackageId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productId}</td>
     *         <td>{@link ProductPackageItem#productId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productTemplateId}</td>
     *         <td>{@link ProductPackageItem#productTemplateId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code mandatory}</td>
     *         <td>{@link ProductPackageItem#mandatory}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code archived}</td>
     *         <td>{@link ProductPackageItem#archived}</td>
     *         </tr>
     *         </table>
     *         
     *         @param statement a Publisher Query Language statement which specifies the
     *         filtering criteria over product packages
     *         @return the product package items that match the given statement
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "getProductPackageItemsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemServiceInterfacegetProductPackageItemsByStatement")
    @ResponseWrapper(localName = "getProductPackageItemsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemServiceInterfacegetProductPackageItemsByStatementResponse")
    public ProductPackageItemPage getProductPackageItemsByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link ProductPackageItem} objects that satisfy the given
     *         {@link Statement#query}.
     *         
     *         @param productPackageItemAction the action to perform
     *         @param statement a Publisher Query Language statement used to filter
     *         a set of product package items
     *         @return the result of the action performed
     *       
     * 
     * @param statement
     * @param productPackageItemAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201611.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "performProductPackageItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemServiceInterfaceperformProductPackageItemAction")
    @ResponseWrapper(localName = "performProductPackageItemActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemServiceInterfaceperformProductPackageItemActionResponse")
    public UpdateResult performProductPackageItemAction(
        @WebParam(name = "productPackageItemAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        ProductPackageItemAction productPackageItemAction,
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ProductPackageItem} objects.
     *         
     *         @param productPackageItems the product package items to update
     *         @return the updated product package items
     *       
     * 
     * @param productPackageItems
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201611.ProductPackageItem>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
    @RequestWrapper(localName = "updateProductPackageItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemServiceInterfaceupdateProductPackageItems")
    @ResponseWrapper(localName = "updateProductPackageItemsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611", className = "com.google.api.ads.dfp.jaxws.v201611.ProductPackageItemServiceInterfaceupdateProductPackageItemsResponse")
    public List<ProductPackageItem> updateProductPackageItems(
        @WebParam(name = "productPackageItems", targetNamespace = "https://www.google.com/apis/ads/publisher/v201611")
        List<ProductPackageItem> productPackageItems)
        throws ApiException_Exception
    ;

}
