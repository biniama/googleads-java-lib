
package com.google.api.ads.adwords.jaxws.v201607.express;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201607.cm.Selector;


/**
 * 
 *       A service which fetches and manages AdWords Express businesses.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ExpressBusinessServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201607.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.express.ObjectFactory.class
})
public interface ExpressBusinessServiceInterface {


    /**
     * 
     *         Retrieves the Express businesses that meet the criteria set in the given selector.
     *         
     *         @param selector the selector specifying the AdWords Express businesses to return
     *         @return list of AdWords Express businesses identified by the selector
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.express.ExpressBusinessPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.express.ExpressBusinessServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.express.ExpressBusinessServiceInterfacegetResponse")
    public ExpressBusinessPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607")
        Selector selector)
        throws ApiException
    ;

    /**
     * 
     *         Performs the given {@link ExpressBusinessOperation}.
     *         
     *         @param operations list of unique operations; the same AdWords Express business cannot be
     *         specified in more than one operation
     *         @return the updated AdWords Express businesses
     *       
     * 
     * @param operations
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201607.express.ExpressBusiness>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.express.ExpressBusinessServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.express.ExpressBusinessServiceInterfacemutateResponse")
    public List<ExpressBusiness> mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/express/v201607")
        List<ExpressBusinessOperation> operations)
        throws ApiException
    ;

}
