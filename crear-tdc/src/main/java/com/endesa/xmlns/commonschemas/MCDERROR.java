
package com.endesa.xmlns.commonschemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para MCDERROR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MCDERROR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoError" type="{http://xmlns.endesa.com/CommonSchemas}CodigoError"/&gt;
 *         &lt;element name="MensajeError" type="{http://xmlns.endesa.com/CommonSchemas}MensajeError"/&gt;
 *         &lt;element name="TipoError" type="{http://xmlns.endesa.com/CommonSchemas}TipoError"/&gt;
 *         &lt;element name="FechaHora" type="{http://xmlns.endesa.com/CommonSchemas}FechaHora"/&gt;
 *         &lt;element name="Programa" type="{http://xmlns.endesa.com/CommonSchemas}Programa"/&gt;
 *         &lt;element name="Funcion" type="{http://xmlns.endesa.com/CommonSchemas}Funcion"/&gt;
 *         &lt;element name="Traza" type="{http://xmlns.endesa.com/CommonSchemas}Traza" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
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

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * Define el valor de la propiedad mensajeError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeError(String value) {
        this.mensajeError = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoError() {
        return tipoError;
    }

    /**
     * Define el valor de la propiedad tipoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoError(String value) {
        this.tipoError = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHora.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHora() {
        return fechaHora;
    }

    /**
     * Define el valor de la propiedad fechaHora.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHora(XMLGregorianCalendar value) {
        this.fechaHora = value;
    }

    /**
     * Obtiene el valor de la propiedad programa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * Define el valor de la propiedad programa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrograma(String value) {
        this.programa = value;
    }

    /**
     * Obtiene el valor de la propiedad funcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncion() {
        return funcion;
    }

    /**
     * Define el valor de la propiedad funcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncion(String value) {
        this.funcion = value;
    }

    /**
     * Obtiene el valor de la propiedad traza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraza() {
        return traza;
    }

    /**
     * Define el valor de la propiedad traza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraza(String value) {
        this.traza = value;
    }

}
