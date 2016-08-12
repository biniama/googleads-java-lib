
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
 *       Provides methods for creating, updating and retrieving {@link AdExclusionRule} objects.
 *       <p>
 *       An {@link AdExclusionRule} provides a way to block specified ads from showing on portions of
 *       your site. Each rule specifies the inventory on which the rule is in effect, and the labels
 *       to block on that inventory.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdExclusionRuleServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdExclusionRuleServiceInterface {


    /**
     * 
     *         Creates new {@link AdExclusionRule} objects.
     *         @param adExclusionRules the ad exclusion rules to create
     *         @return the created rules with their IDs filled in
     *       
     * 
     * @param adExclusionRules
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201605.AdExclusionRule>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "createAdExclusionRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdExclusionRuleServiceInterfacecreateAdExclusionRules")
    @ResponseWrapper(localName = "createAdExclusionRulesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdExclusionRuleServiceInterfacecreateAdExclusionRulesResponse")
    public List<AdExclusionRule> createAdExclusionRules(
        @WebParam(name = "adExclusionRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        List<AdExclusionRule> adExclusionRules)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link AdExclusionRulePage} of {@link AdExclusionRule} objects that satisfy the
     *         given {@link Statement#query}.  The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdExclusionRule#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdExclusionRule#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdExclusionRule#status}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of rules
     *         @return the rules that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201605.AdExclusionRulePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "getAdExclusionRulesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdExclusionRuleServiceInterfacegetAdExclusionRulesByStatement")
    @ResponseWrapper(localName = "getAdExclusionRulesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdExclusionRuleServiceInterfacegetAdExclusionRulesByStatementResponse")
    public AdExclusionRulePage getAdExclusionRulesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs action on {@link AdExclusionRule} objects that satisfy the
     *         given {@link Statement#query}.
     *         
     *         @param adExclusionRuleAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of ad exclusion rules
     *         @return the result of the action performed
     *       
     * 
     * @param adExclusionRuleAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201605.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "performAdExclusionRuleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdExclusionRuleServiceInterfaceperformAdExclusionRuleAction")
    @ResponseWrapper(localName = "performAdExclusionRuleActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdExclusionRuleServiceInterfaceperformAdExclusionRuleActionResponse")
    public UpdateResult performAdExclusionRuleAction(
        @WebParam(name = "adExclusionRuleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        AdExclusionRuleAction adExclusionRuleAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link AdExclusionRule} objects.
     *         
     *         @param adExclusionRules the ad exclusion rules to update
     *         @return the updated rules
     *       
     * 
     * @param adExclusionRules
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201605.AdExclusionRule>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
    @RequestWrapper(localName = "updateAdExclusionRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdExclusionRuleServiceInterfaceupdateAdExclusionRules")
    @ResponseWrapper(localName = "updateAdExclusionRulesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", className = "com.google.api.ads.dfp.jaxws.v201605.AdExclusionRuleServiceInterfaceupdateAdExclusionRulesResponse")
    public List<AdExclusionRule> updateAdExclusionRules(
        @WebParam(name = "adExclusionRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605")
        List<AdExclusionRule> adExclusionRules)
        throws ApiException_Exception
    ;

}
