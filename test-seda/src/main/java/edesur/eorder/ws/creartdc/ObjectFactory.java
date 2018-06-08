
package edesur.eorder.ws.creartdc;

import edesur.eorder.ws.common.Header;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _CreacionTdCRequest_QNAME = new QName("http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes", "CreacionTdC_Request");
    private final static QName _SOAHeader_QNAME = new QName("http://xmlns.endesa.com/CommonSchemas", "SOAHeader");


    public ObjectFactory() {
    }


    public Request createRequest() { return new Request(); }

    public Header createHeader() { return new Header(); }

    public Body createBody() { return new Body(); }

    public DatosClave createDatosClave() { return new DatosClave(); }

    public Suministro createSuministro() { return new Suministro(); }

    @XmlElementDecl(namespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes", name = "CreacionTdC_Request")
    public JAXBElement<Request> createCreacionTdCRequest(Request value) {
        return new JAXBElement<Request>(_CreacionTdCRequest_QNAME, Request.class, null, value);
    }

    @XmlElementDecl(namespace = "http://xmlns.endesa.com/CommonSchemas", name = "SOAHeader")
    public JAXBElement<Header> createSOAHeader(Header value) {
        return new JAXBElement<Header>(_SOAHeader_QNAME, Header.class, null, value);
    }

}
