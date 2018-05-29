
package edesur.eorder.ws.creacion;

import edesur.eorder.ws.common.Header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreacionTdC_RequestType", propOrder = {
    "header",
    "body"
})
public class Request {

    @XmlElement(name = "SOAHeader", required = true)
    protected Header header;

    @XmlElement(name = "Request", required = true)
    protected Body body;


    public Header getHeader() {
        return header;
    }

    public void setHeader(Header value) {
        this.header = value;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body value) {
        this.body = value;
    }
}
