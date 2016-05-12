
package com.google.api.ads.dfp.jaxws.v201511;

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
@WebServiceClient(name = "ReconciliationOrderReportService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201511/ReconciliationOrderReportService?wsdl")
public class ReconciliationOrderReportService
    extends Service
{

    private final static URL RECONCILIATIONORDERREPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECONCILIATIONORDERREPORTSERVICE_EXCEPTION;
    private final static QName RECONCILIATIONORDERREPORTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201511", "ReconciliationOrderReportService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201511/ReconciliationOrderReportService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECONCILIATIONORDERREPORTSERVICE_WSDL_LOCATION = url;
        RECONCILIATIONORDERREPORTSERVICE_EXCEPTION = e;
    }

    public ReconciliationOrderReportService() {
        super(__getWsdlLocation(), RECONCILIATIONORDERREPORTSERVICE_QNAME);
    }

    public ReconciliationOrderReportService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ReconciliationOrderReportServiceInterface
     */
    @WebEndpoint(name = "ReconciliationOrderReportServiceInterfacePort")
    public ReconciliationOrderReportServiceInterface getReconciliationOrderReportServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201511", "ReconciliationOrderReportServiceInterfacePort"), ReconciliationOrderReportServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReconciliationOrderReportServiceInterface
     */
    @WebEndpoint(name = "ReconciliationOrderReportServiceInterfacePort")
    public ReconciliationOrderReportServiceInterface getReconciliationOrderReportServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201511", "ReconciliationOrderReportServiceInterfacePort"), ReconciliationOrderReportServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECONCILIATIONORDERREPORTSERVICE_EXCEPTION!= null) {
            throw RECONCILIATIONORDERREPORTSERVICE_EXCEPTION;
        }
        return RECONCILIATIONORDERREPORTSERVICE_WSDL_LOCATION;
    }

}
