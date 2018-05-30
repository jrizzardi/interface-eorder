
package com.endesa.xmlns.commonschemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SOAParametersType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SOAParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOAHeader" type="{http://xmlns.endesa.com/CommonSchemas}SOAHeaderType"/&gt;
 *         &lt;element name="SOAFunctionalInfo" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOAParametersType", propOrder = {
    "soaHeader",
    "soaFunctionalInfo"
})
public class SOAParametersType {

    @XmlElement(name = "SOAHeader", required = true)
    protected SOAHeaderType soaHeader;
    @XmlElement(name = "SOAFunctionalInfo")
    protected Object soaFunctionalInfo;

    /**
     * Obtiene el valor de la propiedad soaHeader.
     * 
     * @return
     *     possible object is
     *     {@link SOAHeaderType }
     *     
     */
    public SOAHeaderType getSOAHeader() {
        return soaHeader;
    }

    /**
     * Define el valor de la propiedad soaHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link SOAHeaderType }
     *     
     */
    public void setSOAHeader(SOAHeaderType value) {
        this.soaHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad soaFunctionalInfo.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSOAFunctionalInfo() {
        return soaFunctionalInfo;
    }

    /**
     * Define el valor de la propiedad soaFunctionalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSOAFunctionalInfo(Object value) {
        this.soaFunctionalInfo = value;
    }

}
