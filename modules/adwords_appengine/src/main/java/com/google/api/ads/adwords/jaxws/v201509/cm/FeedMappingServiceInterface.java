
package com.google.api.ads.adwords.jaxws.v201509.cm;

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
 *       Service for getting and mutating FeedMappings.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "FeedMappingServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FeedMappingServiceInterface {


    /**
     * 
     *         Returns a list of FeedMappings that meet the selector criteria.
     *         
     *         @param selector Determines which FeedMappings to return. If empty all
     *         FeedMappings are returned.
     *         @return The list of FeedMappings.
     *         @throws ApiException indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509", className = "com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509", className = "com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingServiceInterfacegetResponse")
    public FeedMappingPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Add and remove FeedMappings.
     *         The following {@link Operator}s are supported: ADD, REMOVE.
     *         
     *         @param operations The operations to apply.
     *         @return The resulting FeedMappings.
     *         @throws ApiException indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509", className = "com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509", className = "com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingServiceInterfacemutateResponse")
    public FeedMappingReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509")
        List<FeedMappingOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of FeedMappings that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @returns The list of FeedMappings
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509", className = "com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509", className = "com.google.api.ads.adwords.jaxws.v201509.cm.FeedMappingServiceInterfacequeryResponse")
    public FeedMappingPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201509")
        String query)
        throws ApiException_Exception
    ;

}
