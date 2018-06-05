package edesur.eorder.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOAHeaderResponseType", propOrder = {
    "soaId"
})
public class HeaderResponse {

    @XmlElement(name = "SOAId")
    protected String soaId;

    public String getSoaId() {
        return soaId;
    }

    public void setSoaId(String soaId) {
        this.soaId = soaId;
    }
}
