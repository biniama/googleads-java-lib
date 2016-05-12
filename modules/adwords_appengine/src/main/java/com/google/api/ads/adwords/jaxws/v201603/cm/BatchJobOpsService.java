
package com.google.api.ads.adwords.jaxws.v201603.cm;

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
@WebServiceClient(name = "BatchJobOpsService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201603", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201603/BatchJobOpsService?wsdl")
public class BatchJobOpsService
    extends Service
{

    private final static URL BATCHJOBOPSSERVICE_WSDL_LOCATION;
    private final static WebServiceException BATCHJOBOPSSERVICE_EXCEPTION;
    private final static QName BATCHJOBOPSSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201603", "BatchJobOpsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201603/BatchJobOpsService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BATCHJOBOPSSERVICE_WSDL_LOCATION = url;
        BATCHJOBOPSSERVICE_EXCEPTION = e;
    }

    public BatchJobOpsService() {
        super(__getWsdlLocation(), BATCHJOBOPSSERVICE_QNAME);
    }

    public BatchJobOpsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns BatchJobOpsServiceInterface
     */
    @WebEndpoint(name = "BatchJobOpsServiceInterfacePort")
    public BatchJobOpsServiceInterface getBatchJobOpsServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201603", "BatchJobOpsServiceInterfacePort"), BatchJobOpsServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BatchJobOpsServiceInterface
     */
    @WebEndpoint(name = "BatchJobOpsServiceInterfacePort")
    public BatchJobOpsServiceInterface getBatchJobOpsServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201603", "BatchJobOpsServiceInterfacePort"), BatchJobOpsServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BATCHJOBOPSSERVICE_EXCEPTION!= null) {
            throw BATCHJOBOPSSERVICE_EXCEPTION;
        }
        return BATCHJOBOPSSERVICE_WSDL_LOCATION;
    }

}
