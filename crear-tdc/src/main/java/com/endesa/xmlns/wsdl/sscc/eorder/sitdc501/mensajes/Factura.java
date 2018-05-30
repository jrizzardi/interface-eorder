
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MES_ANO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_FACTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="INDICATIVO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_DE_LA_FACTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Factura", propOrder = {
    "mesano",
    "tipodefactura",
    "indicativo",
    "valordelafactura"
})
public class Factura {

    @XmlElement(name = "MES_ANO")
    protected String mesano;
    @XmlElement(name = "TIPO_DE_FACTURA")
    protected String tipodefactura;
    @XmlElement(name = "INDICATIVO")
    protected String indicativo;
    @XmlElement(name = "VALOR_DE_LA_FACTURA")
    protected String valordelafactura;

    /**
     * Obtiene el valor de la propiedad mesano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESANO() {
        return mesano;
    }

    /**
     * Define el valor de la propiedad mesano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESANO(String value) {
        this.mesano = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodefactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEFACTURA() {
        return tipodefactura;
    }

    /**
     * Define el valor de la propiedad tipodefactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEFACTURA(String value) {
        this.tipodefactura = value;
    }

    /**
     * Obtiene el valor de la propiedad indicativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICATIVO() {
        return indicativo;
    }

    /**
     * Define el valor de la propiedad indicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICATIVO(String value) {
        this.indicativo = value;
    }

    /**
     * Obtiene el valor de la propiedad valordelafactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORDELAFACTURA() {
        return valordelafactura;
    }

    /**
     * Define el valor de la propiedad valordelafactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORDELAFACTURA(String value) {
        this.valordelafactura = value;
    }

}
