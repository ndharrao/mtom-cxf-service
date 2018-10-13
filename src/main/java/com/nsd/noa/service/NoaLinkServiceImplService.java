package com.nsd.noa.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-09-18T19:28:08.007-05:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "NoaLinkServiceImplService",
                  wsdlLocation = "file:/C:/Projects/noa-cxf-service/src/main/resources/NoaLinkService.wsdl",
                  targetNamespace = "http://www.nsd.com/noa/schema")
public class NoaLinkServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.nsd.com/noa/schema", "NoaLinkServiceImplService");
    public final static QName NoaLinkServiceImplPort = new QName("http://www.nsd.com/noa/schema", "NoaLinkServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Projects/noa-cxf-service/src/main/resources/NoaLinkService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(NoaLinkServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Projects/noa-cxf-service/src/main/resources/NoaLinkService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public NoaLinkServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public NoaLinkServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NoaLinkServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns NoaLinkService
     */
    @WebEndpoint(name = "NoaLinkServiceImplPort")
    public NoaLinkService getNoaLinkServiceImplPort() {
        return super.getPort(NoaLinkServiceImplPort, NoaLinkService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NoaLinkService
     */
    @WebEndpoint(name = "NoaLinkServiceImplPort")
    public NoaLinkService getNoaLinkServiceImplPort(WebServiceFeature... features) {
        return super.getPort(NoaLinkServiceImplPort, NoaLinkService.class, features);
    }

}
