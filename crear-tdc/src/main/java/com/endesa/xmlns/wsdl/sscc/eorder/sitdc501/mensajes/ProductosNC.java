
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProductosNC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductosNC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODIGO_PRODUCTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_PRODUCTO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CANTIDAD_PRODUCTO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_PRODUCTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductosNC", propOrder = {
    "codigoproducto",
    "valorproducto",
    "cantidadproducto",
    "tipoproducto"
})
public class ProductosNC {

    @XmlElement(name = "CODIGO_PRODUCTO")
    protected String codigoproducto;
    @XmlElement(name = "VALOR_PRODUCTO")
    protected Double valorproducto;
    @XmlElement(name = "CANTIDAD_PRODUCTO")
    protected Long cantidadproducto;
    @XmlElement(name = "TIPO_PRODUCTO")
    protected String tipoproducto;

    /**
     * Obtiene el valor de la propiedad codigoproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOPRODUCTO() {
        return codigoproducto;
    }

    /**
     * Define el valor de la propiedad codigoproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOPRODUCTO(String value) {
        this.codigoproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad valorproducto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORPRODUCTO() {
        return valorproducto;
    }

    /**
     * Define el valor de la propiedad valorproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORPRODUCTO(Double value) {
        this.valorproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadproducto.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCANTIDADPRODUCTO() {
        return cantidadproducto;
    }

    /**
     * Define el valor de la propiedad cantidadproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCANTIDADPRODUCTO(Long value) {
        this.cantidadproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPRODUCTO() {
        return tipoproducto;
    }

    /**
     * Define el valor de la propiedad tipoproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPRODUCTO(String value) {
        this.tipoproducto = value;
    }

}
