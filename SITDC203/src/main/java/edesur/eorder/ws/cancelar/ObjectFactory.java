
package edesur.eorder.ws.cancelar;

import edesur.eorder.ws.common.Header;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _AnulacionSuspensionCierreTdCRequest_QNAME = new QName("http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes", "AnulacionSuspensionCierreTdC_Request");
    private final static QName _AnulacionSuspensionCierreTdCResponse_QNAME = new QName("http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes", "AnulacionSuspensionCierreTdC_Response");


    public ObjectFactory() {
    }


    public Request createRequest() { return new Request(); }

    public Header createHeader() { return new Header(); }

    public Body createBody() { return new Body(); }


    @XmlElementDecl(namespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes", name = "AnulacionSuspensionCierreTdC_Request")
    public JAXBElement<Request> createCreacionTdCRequest(Request value) {
        return new JAXBElement<Request>(_AnulacionSuspensionCierreTdCRequest_QNAME, Request.class, value);
    }

    @XmlElementDecl(namespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes", name = "AnulacionSuspensionCierreTdC_Response")
    public JAXBElement<Response> createAnulacionSuspensionCierreTdCResponse(Response value) {
        return new JAXBElement<Response>(_AnulacionSuspensionCierreTdCResponse_QNAME, Response.class, value);
    }
}
