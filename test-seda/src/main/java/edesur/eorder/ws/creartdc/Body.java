package edesur.eorder.ws.creartdc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", propOrder = {
    "datosClave"
})
public class Body {

    @XmlElement(name = "DATOS_CLAVE_PROCESOS_TDC", required = true)
    protected DatosClave datosClave;

    @XmlElement(name = "DATOS_SUMINISTRO", required = true)
    protected Suministro suministro;

    public Body() {
        datosClave = new DatosClave();
    }

    public DatosClave getDatosClave() {
        return datosClave;
    }

    public void setDatosClave(DatosClave value) {
        this.datosClave = value;
    }

    public Suministro getSuministro() {
        return suministro;
    }

    public void setSuministro(Suministro suministro) {
        this.suministro = suministro;
    }
}
