
package com.google.api.ads.dfp.jaxws.v201508;

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
@WebServiceClient(name = "ContactService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201508", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201508/ContactService?wsdl")
public class ContactService
    extends Service
{

    private final static URL CONTACTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONTACTSERVICE_EXCEPTION;
    private final static QName CONTACTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201508", "ContactService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201508/ContactService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTACTSERVICE_WSDL_LOCATION = url;
        CONTACTSERVICE_EXCEPTION = e;
    }

    public ContactService() {
        super(__getWsdlLocation(), CONTACTSERVICE_QNAME);
    }

    public ContactService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ContactServiceInterface
     */
    @WebEndpoint(name = "ContactServiceInterfacePort")
    public ContactServiceInterface getContactServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201508", "ContactServiceInterfacePort"), ContactServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContactServiceInterface
     */
    @WebEndpoint(name = "ContactServiceInterfacePort")
    public ContactServiceInterface getContactServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201508", "ContactServiceInterfacePort"), ContactServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTACTSERVICE_EXCEPTION!= null) {
            throw CONTACTSERVICE_EXCEPTION;
        }
        return CONTACTSERVICE_WSDL_LOCATION;
    }

}
