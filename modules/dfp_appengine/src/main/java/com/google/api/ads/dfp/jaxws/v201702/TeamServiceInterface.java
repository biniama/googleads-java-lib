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


package com.google.api.ads.dfp.jaxws.v201702;

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
 *       Provides methods for creating, updating, and retrieving {@link Team} objects.
 *       <p>
 *       Teams are used to group users in order to define access to entities such as
 *       companies, inventory and orders.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TeamServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TeamServiceInterface {


    /**
     * 
     *         Creates new {@link Team} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link Team#name}</li>
     *         </ul>
     *         
     *         @param teams the teams to create
     *         @return the created teams with their IDs filled in
     *       
     * 
     * @param teams
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201702.Team>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
    @RequestWrapper(localName = "createTeams", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.TeamServiceInterfacecreateTeams")
    @ResponseWrapper(localName = "createTeamsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.TeamServiceInterfacecreateTeamsResponse")
    public List<Team> createTeams(
        @WebParam(name = "teams", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
        List<Team> teams)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@code TeamPage} of {@code Team} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Team#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Team#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link Team#description}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of teams.
     *         @return the teams that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201702.TeamPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
    @RequestWrapper(localName = "getTeamsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.TeamServiceInterfacegetTeamsByStatement")
    @ResponseWrapper(localName = "getTeamsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.TeamServiceInterfacegetTeamsByStatementResponse")
    public TeamPage getTeamsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Team} objects.
     *         
     *         @param teams the teams to update
     *         @return the updated teams
     *       
     * 
     * @param teams
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201702.Team>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
    @RequestWrapper(localName = "updateTeams", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.TeamServiceInterfaceupdateTeams")
    @ResponseWrapper(localName = "updateTeamsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.TeamServiceInterfaceupdateTeamsResponse")
    public List<Team> updateTeams(
        @WebParam(name = "teams", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
        List<Team> teams)
        throws ApiException_Exception
    ;

}
