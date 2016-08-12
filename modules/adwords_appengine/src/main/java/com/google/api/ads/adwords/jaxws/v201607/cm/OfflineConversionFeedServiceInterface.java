
package com.google.api.ads.adwords.jaxws.v201607.cm;

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
 *       Service that handles the reporting of offline conversion data from external third parties.
 *       
 *       <p>For more information, see our
 *       <a href="https://developers.google.com/adwords/api/docs/guides/conversion-tracking">conversion
 *       tracking guide</a>.</p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "OfflineConversionFeedServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OfflineConversionFeedServiceInterface {


    /**
     * 
     *         Reports an offline conversion for each entry in {@code operations}.
     *         <p>
     *         This bulk operation does not have any transactional guarantees. Some operations can succeed
     *         while others fail.
     *         
     *         @param operations A list of offline conversion feed operations.
     *         @return The list of offline conversion feed results (in the same order as the operations).
     *         @throws {@link ApiException} if problems occurred while applying offline conversions.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.cm.OfflineConversionFeedReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.OfflineConversionFeedServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.cm.OfflineConversionFeedServiceInterfacemutateResponse")
    public OfflineConversionFeedReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607")
        List<OfflineConversionFeedOperation> operations)
        throws ApiException_Exception
    ;

}
