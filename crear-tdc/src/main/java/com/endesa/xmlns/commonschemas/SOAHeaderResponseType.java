
package com.endesa.xmlns.commonschemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SOAHeaderResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SOAHeaderResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOAId" type="{http://xmlns.endesa.com/CommonSchemas}SOAId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOAHeaderResponseType", propOrder = {
    "soaId"
})
public class SOAHeaderResponseType {

    @XmlElement(name = "SOAId")
    protected String soaId;

    /**
     * Obtiene el valor de la propiedad soaId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAId() {
        return soaId;
    }

    /**
     * Define el valor de la propiedad soaId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAId(String value) {
        this.soaId = value;
    }

}
