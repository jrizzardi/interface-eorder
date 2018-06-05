
package edesur.eorder.ws.cancelar;

import edesur.eorder.ws.common.HeaderRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnulacionSuspensionCierreTdC_Request", propOrder = {
    "header",
    "body"
})
public class Request {

    @XmlElement(name = "SOAHeader", required = true)
    protected HeaderRequest header;

    @XmlElement(name = "Request", required = true)
    protected BodyRequest body;


    public HeaderRequest getHeader() {
        return header;
    }

    public void setHeader(HeaderRequest value) {
        this.header = value;
    }

    public BodyRequest getBody() {
        return body;
    }

    public void setBody(BodyRequest value) {
        this.body = value;
    }
}
