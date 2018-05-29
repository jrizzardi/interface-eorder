package edesur.eorder.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCDERROR", propOrder = {
    "codigoError",
    "mensajeError",
    "tipoError",
    "fechaHora",
    "programa",
    "funcion",
    "traza"
})
public class MCDERROR {
    @XmlElement(name = "CodigoError", required = true)
    protected String codigoError;

    @XmlElement(name = "MensajeError", required = true)
    protected String mensajeError;

    @XmlElement(name = "TipoError", required = true)
    protected String tipoError;

    @XmlElement(name = "FechaHora", required = true)
    protected String fechaHora;

    @XmlElement(name = "Programa", required = true)
    protected String programa;

    @XmlElement(name = "Funcion", required = true)
    protected String funcion;

    @XmlElement(name = "Traza")
    protected String traza;


    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String value) {
        this.mensajeError = value;
    }

    public String getTipoError() {
        return tipoError;
    }

    public void setTipoError(String value) {
        this.tipoError = value;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String value) {
        this.fechaHora = value;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String value) {
        this.programa = value;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String value) {
        this.funcion = value;
    }

    public String getTraza() {
        return traza;
    }

    public void setTraza(String value) {
        this.traza = value;
    }
}
