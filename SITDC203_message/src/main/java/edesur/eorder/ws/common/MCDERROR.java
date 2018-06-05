package edesur.eorder.ws.common;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

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
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHora;

    @XmlElement(name = "Programa", required = true)
    protected String programa;

    @XmlElement(name = "Funcion", required = true)
    protected String funcion;

    @XmlElement(name = "Traza")
    protected String traza;


    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getTipoError() {
        return tipoError;
    }

    public void setTipoError(String tipoError) {
        this.tipoError = tipoError;
    }

    public XMLGregorianCalendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(XMLGregorianCalendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getTraza() {
        return traza;
    }

    public void setTraza(String traza) {
        this.traza = traza;
    }
}
