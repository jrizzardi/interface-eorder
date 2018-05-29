
package edesur.eorder.ws;

import com.endesa.xmlns.commonschemas.SOAHeaderType;
import com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes.RequestType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreacionTdC_RequestType", propOrder = {
/*    "soaHeader", */
    "request"
})
public class CreacionTdCRequestType {

    @XmlElement(name = "Request", required = true)
    protected RequestType request;

    public RequestType getRequest() {
        return request;
    }

    public void setRequest(RequestType value) {
        this.request = value;
    }

}
