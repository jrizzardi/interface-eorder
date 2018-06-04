package edesur.eorder.ws.cancelar;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

@WebServiceClient(
        name = "SITDC203_PortType",
        wsdlLocation = "wsdl/SITDC203.wsdl",
        targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/SITDC203_PortType"

)
public class SITDC203PortType_Service extends Service {

    public final static URL WSDL_LOCATION = null;

    public final static QName SERVICE = new QName("http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/SITDC203_PortType", "SITDC203_PortType");
    public final static QName SITDC203PortType = new QName("http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/SITDC203_PortType", "SITDC203_PortType");

    static {
        /*
        URL url = null;
        try {
            url = new URL("file:/C:/Proyectos/eOrder/interface-eorder/SITDC203/src/main/resources/wsdl/SITDC203.wsdl");
        }
        catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SITDC203PortType_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Proyectos/eOrder/interface-eorder/SITDC203/src/main/resources/wsdl/SITDC203.wsdl");
        }
        WSDL_LOCATION = url;
        */
    }

    public SITDC203PortType_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SITDC203PortType_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SITDC203PortType_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SITDC203PortType_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SITDC203PortType_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SITDC203PortType_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    


    @WebEndpoint(name = "SITDC203_PortType")
    public SITDC203PortType getSITDC203PortType() {
        return super.getPort(SITDC203PortType, SITDC203PortType.class);
    }
    @WebEndpoint(name = "SITDC203_PortType")
    public SITDC203PortType getSITDC203PortType(WebServiceFeature... features) {
        return super.getPort(SITDC203PortType, SITDC203PortType.class, features);
    }

}
