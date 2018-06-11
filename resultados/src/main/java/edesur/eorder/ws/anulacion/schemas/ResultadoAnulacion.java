package edesur.eorder.ws.anulacion.schemas;

import edesur.eorder.ws.resultados.schemas.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ResultadoAnulacion {
    @XmlElement(required = true)
    private String codigoExternoTdC;

    @XmlElement(required = true)
    private String motivo;

    @XmlElement(required = true)
    private String resultado;
}
