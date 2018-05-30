
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CODIGO_DEL_RESULTADO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_INTERNO_DEL_TDC" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPCION_DEL_RESULTADO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {

})
public class ResponseType {

    @XmlElement(name = "CODIGO_DEL_RESULTADO")
    protected String codigodelresultado;
    @XmlElement(name = "CODIGO_INTERNO_DEL_TDC")
    protected Long codigointernodeltdc;
    @XmlElement(name = "DESCRIPCION_DEL_RESULTADO")
    protected String descripciondelresultado;

    /**
     * Obtiene el valor de la propiedad codigodelresultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODELRESULTADO() {
        return codigodelresultado;
    }

    /**
     * Define el valor de la propiedad codigodelresultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODELRESULTADO(String value) {
        this.codigodelresultado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigointernodeltdc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCODIGOINTERNODELTDC() {
        return codigointernodeltdc;
    }

    /**
     * Define el valor de la propiedad codigointernodeltdc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCODIGOINTERNODELTDC(Long value) {
        this.codigointernodeltdc = value;
    }

    /**
     * Obtiene el valor de la propiedad descripciondelresultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCIONDELRESULTADO() {
        return descripciondelresultado;
    }

    /**
     * Define el valor de la propiedad descripciondelresultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCIONDELRESULTADO(String value) {
        this.descripciondelresultado = value;
    }

}
