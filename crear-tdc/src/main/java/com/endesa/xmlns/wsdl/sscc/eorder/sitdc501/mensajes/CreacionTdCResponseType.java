
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.endesa.xmlns.commonschemas.SOAHeaderResponseType;


/**
 * <p>Clase Java para CreacionTdC_ResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreacionTdC_ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOAHeaderResponse" type="{http://xmlns.endesa.com/CommonSchemas}SOAHeaderResponseType"/&gt;
 *         &lt;element name="Response" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreacionTdC_ResponseType", propOrder = {
    "soaHeaderResponse",
    "response"
})
public class CreacionTdCResponseType {

    @XmlElement(name = "SOAHeaderResponse", required = true)
    protected SOAHeaderResponseType soaHeaderResponse;
    @XmlElement(name = "Response", required = true)
    protected ResponseType response;

    /**
     * Obtiene el valor de la propiedad soaHeaderResponse.
     * 
     * @return
     *     possible object is
     *     {@link SOAHeaderResponseType }
     *     
     */
    public SOAHeaderResponseType getSOAHeaderResponse() {
        return soaHeaderResponse;
    }

    /**
     * Define el valor de la propiedad soaHeaderResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SOAHeaderResponseType }
     *     
     */
    public void setSOAHeaderResponse(SOAHeaderResponseType value) {
        this.soaHeaderResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

}
