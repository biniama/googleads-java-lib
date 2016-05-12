
package com.google.api.ads.dfp.jaxws.v201602;

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
@WebServiceClient(name = "UserTeamAssociationService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201602", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201602/UserTeamAssociationService?wsdl")
public class UserTeamAssociationService
    extends Service
{

    private final static URL USERTEAMASSOCIATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERTEAMASSOCIATIONSERVICE_EXCEPTION;
    private final static QName USERTEAMASSOCIATIONSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201602", "UserTeamAssociationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201602/UserTeamAssociationService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERTEAMASSOCIATIONSERVICE_WSDL_LOCATION = url;
        USERTEAMASSOCIATIONSERVICE_EXCEPTION = e;
    }

    public UserTeamAssociationService() {
        super(__getWsdlLocation(), USERTEAMASSOCIATIONSERVICE_QNAME);
    }

    public UserTeamAssociationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns UserTeamAssociationServiceInterface
     */
    @WebEndpoint(name = "UserTeamAssociationServiceInterfacePort")
    public UserTeamAssociationServiceInterface getUserTeamAssociationServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201602", "UserTeamAssociationServiceInterfacePort"), UserTeamAssociationServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserTeamAssociationServiceInterface
     */
    @WebEndpoint(name = "UserTeamAssociationServiceInterfacePort")
    public UserTeamAssociationServiceInterface getUserTeamAssociationServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201602", "UserTeamAssociationServiceInterfacePort"), UserTeamAssociationServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERTEAMASSOCIATIONSERVICE_EXCEPTION!= null) {
            throw USERTEAMASSOCIATIONSERVICE_EXCEPTION;
        }
        return USERTEAMASSOCIATIONSERVICE_WSDL_LOCATION;
    }

}
