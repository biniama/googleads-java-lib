
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       The TrialAsyncErrorService is retrieving asynchronous errors from creating and promoting trials.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TrialAsyncErrorServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TrialAsyncErrorServiceInterface {


    /**
     * 
     *         Returns a TrialAsyncErrorPage that contains a list of TrialAsyncErrors matching the selector.
     *         
     *         @throws {#link com.google.ads.api.services.common.error.ApiException} if problems occurred
     *         while retrieving the results.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.cm.TrialAsyncErrorPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.TrialAsyncErrorServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.TrialAsyncErrorServiceInterfacegetResponse")
    public TrialAsyncErrorPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a TrialAsyncErrorPage that contains a list of TrialAsyncError matching the query.
     *         
     *         @throws {#link com.google.ads.api.services.common.error.ApiException} if problems occurred
     *         while retrieving the results.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.cm.TrialAsyncErrorPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.TrialAsyncErrorServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.TrialAsyncErrorServiceInterfacequeryResponse")
    public TrialAsyncErrorPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        String query)
        throws ApiException_Exception
    ;

}
