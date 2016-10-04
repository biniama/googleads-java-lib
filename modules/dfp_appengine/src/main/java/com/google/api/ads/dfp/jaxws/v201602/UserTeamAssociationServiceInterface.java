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
 *       Provides methods for creating, updating, and retrieving
 *       {@link UserTeamAssociation} objects.
 *       <p>
 *       UserTeamAssociation objects are used to add users to teams in order to define
 *       access to entities such as companies, inventory and orders and to override
 *       the team's access type to orders for a user.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "UserTeamAssociationServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserTeamAssociationServiceInterface {


    /**
     * 
     *         Creates new {@link UserTeamAssociation} objects.
     *         
     *         @param userTeamAssociations the user team associations to create
     *         @return the created user team associations with their IDs filled in
     *       
     * 
     * @param userTeamAssociations
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociation>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
    @RequestWrapper(localName = "createUserTeamAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationServiceInterfacecreateUserTeamAssociations")
    @ResponseWrapper(localName = "createUserTeamAssociationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationServiceInterfacecreateUserTeamAssociationsResponse")
    public List<UserTeamAssociation> createUserTeamAssociations(
        @WebParam(name = "userTeamAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        List<UserTeamAssociation> userTeamAssociations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link UserTeamAssociationPage} of {@link UserTeamAssociation}
     *         objects that satisfy the given {@link Statement#query}. The following
     *         fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code userId}</td>
     *         <td>{@link UserTeamAssociation#userId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code teamId}</td>
     *         <td>{@link UserTeamAssociation#teamId}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of user team associations
     *         @return the user team associations that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
    @RequestWrapper(localName = "getUserTeamAssociationsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationServiceInterfacegetUserTeamAssociationsByStatement")
    @ResponseWrapper(localName = "getUserTeamAssociationsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationServiceInterfacegetUserTeamAssociationsByStatementResponse")
    public UserTeamAssociationPage getUserTeamAssociationsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link UserTeamAssociation} objects that match the
     *         given {@link Statement#query}.
     *         
     *         @param userTeamAssociationAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of user team associations
     *         @return the result of the action performed
     *       
     * 
     * @param userTeamAssociationAction
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201602.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
    @RequestWrapper(localName = "performUserTeamAssociationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationServiceInterfaceperformUserTeamAssociationAction")
    @ResponseWrapper(localName = "performUserTeamAssociationActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationServiceInterfaceperformUserTeamAssociationActionResponse")
    public UpdateResult performUserTeamAssociationAction(
        @WebParam(name = "userTeamAssociationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        UserTeamAssociationAction userTeamAssociationAction,
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link UserTeamAssociation} objects.
     *         
     *         @param userTeamAssociations the user team associations to update
     *         @return the updated user team associations
     *       
     * 
     * @param userTeamAssociations
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociation>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
    @RequestWrapper(localName = "updateUserTeamAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationServiceInterfaceupdateUserTeamAssociations")
    @ResponseWrapper(localName = "updateUserTeamAssociationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", className = "com.google.api.ads.dfp.jaxws.v201602.UserTeamAssociationServiceInterfaceupdateUserTeamAssociationsResponse")
    public List<UserTeamAssociation> updateUserTeamAssociations(
        @WebParam(name = "userTeamAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602")
        List<UserTeamAssociation> userTeamAssociations)
        throws ApiException_Exception
    ;

}
