
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.endesa.xmlns.commonschemas.SOAHeaderType;


/**
 * <p>Clase Java para CreacionTdC_RequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreacionTdC_RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOAHeader" type="{http://xmlns.endesa.com/CommonSchemas}SOAHeaderType"/&gt;
 *         &lt;element name="Request" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}RequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreacionTdC_RequestType", propOrder = {
    "soaHeader",
    "request"
})
public class CreacionTdCRequestType {

    @XmlElement(name = "SOAHeader", required = true)
    protected SOAHeaderType soaHeader;
    @XmlElement(name = "Request", required = true)
    protected RequestType request;

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
     * Obtiene el valor de la propiedad request.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Define el valor de la propiedad request.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

}
