
package com.google.api.ads.adwords.jaxws.v201603.cm;

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
 *       TrialService manages the life cycle of campaign trials. It is used to create new trials from
 *       drafts, modify trial properties, promote changes in a trial back to its base campaign, and to
 *       archive a trial.
 *       
 *       <p>A trial is an experiment, running two variants (trial arms) - the base campaign and the trial
 *       - at the same time, directing a fixed share of traffic to each trial arm. A trial is created from
 *       a draft of the base campaign and will be a snapshot of changes in the draft at the time of
 *       creation.
 *       
 *       <p>Changes to entities of the base campaign after creating the trial will be applied to the trial
 *       asynchronously, unless the changed fields were overridden in the draft. Changes to the draft have
 *       no effect on a trial once it has been created.
 *       
 *       <h3>Constraints</h3>
 *       
 *       <ul>
 *       <li>A campaign cannot have running/scheduled "AdWords Campaign Experiments" (ACE) and
 *       running/scheduled trials at the same time. Trial creation will fail, if the base campaign
 *       has a running/scheduled ACE experiment.</li>
 *       <li>Trial names must be unique across all of the customer's non-deleted trial and campaign
 *       names.</li>
 *       <li>When creating a trial, [startDate, endDate] cannot be in the past or overlap with any other
 *       running/scheduled trial, must be within the base campaign's [startDate, endDate] and
 *       endDate must be later than startDate.</li>
 *       <li>A future startDate/endDate can be updated to a different future startDate/endDate as long
 *       as the constraints on [startDate, endDate] are not violated.</li>
 *       <li>There is at most one trial running and at most one trial scheduled for the future at a
 *       time, per base campaign.</li>
 *       <li>The base campaign's budget cannot be shared with any other campaign. Trial creation will
 *       fail if the base campaign's budget is shared with another campaign.</li>
 *       </ul>
 *       
 *       <h3>Life cycle</h3>
 *       
 *       A trial's {@link com.google.ads.api.services.campaignmgmt.trial.Trial#getStatus() status}
 *       reflects the state of the trial within its life cycle. Some status transitions are performed
 *       explicitly by sending a {@link com.google.ads.api.services.common.operation.Operator#SET}
 *       operation, while other status transitions occur asynchronously without a client operation.
 *       
 *       <p>When a trial is first {@link com.google.ads.api.services.common.operation.Operator#ADD}ed, its
 *       status is {@link com.google.ads.api.common.sharedenums.TrialStatus#CREATING}. The trial will be
 *       created asynchronously, and once it is fully created, its status will change to {@link
 *       com.google.ads.api.common.sharedenums.TrialStatus#ACTIVE}.
 *       
 *       <p>If the asynchronous creation of the trial fails, its status will change to {@link
 *       com.google.ads.api.common.sharedenums.TrialStatus#CREATION_FAILED}.
 *       
 *       <p>To promote changes in an {@link com.google.ads.api.common.sharedenums.TrialStatus#ACTIVE
 *       ACTIVE} trial back to the base campaign, set the trial status to {@link
 *       com.google.ads.api.common.sharedenums.TrialStatus#PROMOTING PROMOTING}. The promotion itself will
 *       occur asynchronously. If it fails with recoverable errors, the status will change to {@link
 *       com.google.ads.api.common.sharedenums.TrialStatus#PROMOTE_ERROR PROMOTE_ERROR}. In this case, no
 *       change has been promoted to the base campaign and clients can set the status to {@link
 *       com.google.ads.api.common.sharedenums.TrialStatus#PROMOTING PROMOTING} to try again. If the
 *       promotion operation fails after some of the base campaign has already been updated, the status
 *       will change to {@link com.google.ads.api.common.sharedenums.TrialStatus#PROMOTE_FAILED
 *       PROMOTE_FAILED}.
 *       
 *       <p>Any trial that is not currently running or is {@link
 *       com.google.ads.api.common.sharedenums.TrialStatus#CREATING CREATING} or {@link
 *       com.google.ads.api.common.sharedenums.TrialStatus#PROMOTING PROMOTING} can be archived by setting
 *       the status to the value of the same name.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TrialServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TrialServiceInterface {


    /**
     * 
     *         Loads a TrialPage containing a list of {@link Trial} objects matching the selector.
     *         
     *         @param selector defines which subset of all available trials to return, the sort order, and
     *         which fields to include
     *         
     *         @return Returns a page of matching trial objects.
     *         @throws com.google.ads.api.services.common.error.ApiException if errors occurred while
     *         retrieving the results.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201603.cm.TrialPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603", className = "com.google.api.ads.adwords.jaxws.v201603.cm.TrialServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603", className = "com.google.api.ads.adwords.jaxws.v201603.cm.TrialServiceInterfacegetResponse")
    public TrialPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates new trials, updates properties and controls the life cycle of existing trials.
     *         See {@link TrialService} for details on the trial life cycle.
     *         
     *         @return Returns the list of updated Trials, in the same order as the {@code operations} list.
     *         @throws com.google.ads.api.services.common.error.ApiException if errors occurred while
     *         processing the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201603.cm.TrialReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603", className = "com.google.api.ads.adwords.jaxws.v201603.cm.TrialServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603", className = "com.google.api.ads.adwords.jaxws.v201603.cm.TrialServiceInterfacemutateResponse")
    public TrialReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603")
        List<TrialOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Loads a TrialPage containing a list of {@link Trial} objects matching the query.
     *         
     *         @param query defines which subset of all available trials to return, the sort order, and
     *         which fields to include
     *         
     *         @return Returns a page of matching trial objects.
     *         @throws com.google.ads.api.services.common.error.ApiException if errors occurred while
     *         retrieving the results.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201603.cm.TrialPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603", className = "com.google.api.ads.adwords.jaxws.v201603.cm.TrialServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603", className = "com.google.api.ads.adwords.jaxws.v201603.cm.TrialServiceInterfacequeryResponse")
    public TrialPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603")
        String query)
        throws ApiException_Exception
    ;

}
