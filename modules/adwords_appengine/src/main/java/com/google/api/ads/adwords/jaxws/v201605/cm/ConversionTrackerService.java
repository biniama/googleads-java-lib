
package com.google.api.ads.adwords.jaxws.v201605.cm;

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
@WebServiceClient(name = "ConversionTrackerService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201605/ConversionTrackerService?wsdl")
public class ConversionTrackerService
    extends Service
{

    private final static URL CONVERSIONTRACKERSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONVERSIONTRACKERSERVICE_EXCEPTION;
    private final static QName CONVERSIONTRACKERSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201605", "ConversionTrackerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201605/ConversionTrackerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERSIONTRACKERSERVICE_WSDL_LOCATION = url;
        CONVERSIONTRACKERSERVICE_EXCEPTION = e;
    }

    public ConversionTrackerService() {
        super(__getWsdlLocation(), CONVERSIONTRACKERSERVICE_QNAME);
    }

    public ConversionTrackerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ConversionTrackerServiceInterface
     */
    @WebEndpoint(name = "ConversionTrackerServiceInterfacePort")
    public ConversionTrackerServiceInterface getConversionTrackerServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201605", "ConversionTrackerServiceInterfacePort"), ConversionTrackerServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConversionTrackerServiceInterface
     */
    @WebEndpoint(name = "ConversionTrackerServiceInterfacePort")
    public ConversionTrackerServiceInterface getConversionTrackerServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201605", "ConversionTrackerServiceInterfacePort"), ConversionTrackerServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERSIONTRACKERSERVICE_EXCEPTION!= null) {
            throw CONVERSIONTRACKERSERVICE_EXCEPTION;
        }
        return CONVERSIONTRACKERSERVICE_WSDL_LOCATION;
    }

}
