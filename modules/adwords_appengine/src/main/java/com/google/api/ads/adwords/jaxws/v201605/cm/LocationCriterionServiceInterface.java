
package com.google.api.ads.adwords.jaxws.v201605.cm;

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
 *       Service that returns {@link LocationCriterion} constants that match a specified name or list of
 *       criterion id(s) as specified in the input selector.<p>
 *       
 *       <p>Please note that filtering by date range is not supported.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LocationCriterionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocationCriterionServiceInterface {


    /**
     * 
     *         Returns a list of {@link LocationCriterion}'s that match the specified selector.
     *         
     *         @param selector filters the LocationCriterion to be returned.
     *         @return A list of location criterion.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201605.cm.LocationCriterion>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.LocationCriterionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.LocationCriterionServiceInterfacegetResponse")
    public List<LocationCriterion> get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of {@link LocationCriterion}s that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @returns The list of location criteria
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201605.cm.LocationCriterion>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.LocationCriterionServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.LocationCriterionServiceInterfacequeryResponse")
    public List<LocationCriterion> query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        String query)
        throws ApiException_Exception
    ;

}
