
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datos_fallaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datos_fallaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FALLA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_FALLA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datos_fallaType", propOrder = {
    "falla",
    "tipofalla"
})
public class DatosFallaType {

    @XmlElement(name = "FALLA")
    protected String falla;
    @XmlElement(name = "TIPO_FALLA")
    protected String tipofalla;

    /**
     * Obtiene el valor de la propiedad falla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFALLA() {
        return falla;
    }

    /**
     * Define el valor de la propiedad falla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFALLA(String value) {
        this.falla = value;
    }

    /**
     * Obtiene el valor de la propiedad tipofalla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOFALLA() {
        return tipofalla;
    }

    /**
     * Define el valor de la propiedad tipofalla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOFALLA(String value) {
        this.tipofalla = value;
    }

}
