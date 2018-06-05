
package edesur.eorder.ws.common;

import edesur.eorder.ws.cancelar.BodyRequest;
import edesur.eorder.ws.cancelar.Request;
import edesur.eorder.ws.cancelar.Response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _MCDError_QNAME = new QName("http://xmlns.endesa.com/CommonSchemas", "MCD_Error");
    private final static QName _SOAHeader_QNAME = new QName("http://xmlns.endesa.com/CommonSchemas", "SOAHeader");
    private final static QName _SOAHeaderResponse_QNAME = new QName("http://xmlns.endesa.com/CommonSchemas", "SOAHeaderResponse");


    public ObjectFactory() {
    }

    public MCDERROR createMCDERROR() { return new MCDERROR(); }

    public HeaderRequest createSOAHeaderType() { return new HeaderRequest(); }

    public HeaderResponse createSOAHeaderResponseType() { return new HeaderResponse(); }

    @XmlElementDecl(namespace = "http://xmlns.endesa.com/CommonSchemas", name = "MCD_Error")
    public JAXBElement<MCDERROR> createMCDError(MCDERROR value) {
        return new JAXBElement<MCDERROR>(_MCDError_QNAME, MCDERROR.class, null, value);
    }

    @XmlElementDecl(namespace = "http://xmlns.endesa.com/CommonSchemas", name = "SOAHeader")
    public JAXBElement<HeaderRequest> createSOAHeader(HeaderRequest value) {
        return new JAXBElement<HeaderRequest>(_SOAHeader_QNAME, HeaderRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://xmlns.endesa.com/CommonSchemas", name = "SOAHeaderResponse")
    public JAXBElement<HeaderResponse> createSOAHeaderResponse(HeaderResponse value) {
        return new JAXBElement<HeaderResponse>(_SOAHeaderResponse_QNAME, HeaderResponse.class, null, value);
    }

}
