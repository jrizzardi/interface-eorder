package edesur.eorder.ws.cancelar;

import edesur.eorder.ws.common.HeaderResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnulacionSuspensionCierreTdC_ResponseType", propOrder = {
        "soaHeaderResponse",
        "response"
})
public class Response {
    @XmlElement(name = "SOAHeaderResponse", required = true)
    protected HeaderResponse soaHeaderResponse;

    @XmlElement(name = "Response", required = true)
    protected BodyResponse response;

    public HeaderResponse getSoaHeaderResponse() {
        return soaHeaderResponse;
    }

    public void setSoaHeaderResponse(HeaderResponse soaHeaderResponse) {
        this.soaHeaderResponse = soaHeaderResponse;
    }

    public BodyResponse getResponse() {
        return response;
    }

    public void setResponse(BodyResponse response) {
        this.response = response;
    }
}
