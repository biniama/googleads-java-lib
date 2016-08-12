
package com.google.api.ads.adwords.jaxws.v201607.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BatchJobService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201607", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201607/BatchJobService?wsdl")
public class BatchJobService
    extends Service
{

    private final static URL BATCHJOBSERVICE_WSDL_LOCATION;
    private final static WebServiceException BATCHJOBSERVICE_EXCEPTION;
    private final static QName BATCHJOBSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201607", "BatchJobService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201607/BatchJobService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BATCHJOBSERVICE_WSDL_LOCATION = url;
        BATCHJOBSERVICE_EXCEPTION = e;
    }

    public BatchJobService() {
        super(__getWsdlLocation(), BATCHJOBSERVICE_QNAME);
    }

    public BatchJobService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns BatchJobServiceInterface
     */
    @WebEndpoint(name = "BatchJobServiceInterfacePort")
    public BatchJobServiceInterface getBatchJobServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201607", "BatchJobServiceInterfacePort"), BatchJobServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BatchJobServiceInterface
     */
    @WebEndpoint(name = "BatchJobServiceInterfacePort")
    public BatchJobServiceInterface getBatchJobServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201607", "BatchJobServiceInterfacePort"), BatchJobServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BATCHJOBSERVICE_EXCEPTION!= null) {
            throw BATCHJOBSERVICE_EXCEPTION;
        }
        return BATCHJOBSERVICE_WSDL_LOCATION;
    }

}
