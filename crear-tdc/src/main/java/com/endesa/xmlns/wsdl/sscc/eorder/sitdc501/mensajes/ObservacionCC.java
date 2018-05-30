
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ObservacionCC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObservacionCC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CORRELATIVO_OBSERVACION" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_INGRESO_OBSERVACION" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AUTOR_OBSERVACION_CC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="OBSERVACIONES_CC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservacionCC", propOrder = {
    "correlativoobservacion",
    "fechaingresoobservacion",
    "autorobservacioncc",
    "observacionescc"
})
public class ObservacionCC {

    @XmlElement(name = "CORRELATIVO_OBSERVACION")
    protected Long correlativoobservacion;
    @XmlElement(name = "FECHA_INGRESO_OBSERVACION")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaingresoobservacion;
    @XmlElement(name = "AUTOR_OBSERVACION_CC")
    protected String autorobservacioncc;
    @XmlElement(name = "OBSERVACIONES_CC")
    protected String observacionescc;

    /**
     * Obtiene el valor de la propiedad correlativoobservacion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCORRELATIVOOBSERVACION() {
        return correlativoobservacion;
    }

    /**
     * Define el valor de la propiedad correlativoobservacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCORRELATIVOOBSERVACION(Long value) {
        this.correlativoobservacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaingresoobservacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAINGRESOOBSERVACION() {
        return fechaingresoobservacion;
    }

    /**
     * Define el valor de la propiedad fechaingresoobservacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAINGRESOOBSERVACION(XMLGregorianCalendar value) {
        this.fechaingresoobservacion = value;
    }

    /**
     * Obtiene el valor de la propiedad autorobservacioncc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOROBSERVACIONCC() {
        return autorobservacioncc;
    }

    /**
     * Define el valor de la propiedad autorobservacioncc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOROBSERVACIONCC(String value) {
        this.autorobservacioncc = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionescc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSERVACIONESCC() {
        return observacionescc;
    }

    /**
     * Define el valor de la propiedad observacionescc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSERVACIONESCC(String value) {
        this.observacionescc = value;
    }

}
