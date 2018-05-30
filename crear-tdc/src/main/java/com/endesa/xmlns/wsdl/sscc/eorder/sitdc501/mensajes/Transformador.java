
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Transformador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Transformador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CATEGORIA_MARCA_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MARCA_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MODELO_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="RELACION_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transformador", propOrder = {

})
public class Transformador {

    @XmlElement(name = "CATEGORIA_MARCA_TRANSFORMADOR")
    protected String categoriamarcatransformador;
    @XmlElement(name = "FASE")
    protected String fase;
    @XmlElement(name = "MARCA_TRANSFORMADOR")
    protected String marcatransformador;
    @XmlElement(name = "MODELO_TRANSFORMADOR")
    protected String modelotransformador;
    @XmlElement(name = "NUMERO_TRANSFORMADOR")
    protected String numerotransformador;
    @XmlElement(name = "RELACION_TRANSFORMADOR")
    protected String relaciontransformador;

    /**
     * Obtiene el valor de la propiedad categoriamarcatransformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORIAMARCATRANSFORMADOR() {
        return categoriamarcatransformador;
    }

    /**
     * Define el valor de la propiedad categoriamarcatransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORIAMARCATRANSFORMADOR(String value) {
        this.categoriamarcatransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad fase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASE() {
        return fase;
    }

    /**
     * Define el valor de la propiedad fase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASE(String value) {
        this.fase = value;
    }

    /**
     * Obtiene el valor de la propiedad marcatransformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARCATRANSFORMADOR() {
        return marcatransformador;
    }

    /**
     * Define el valor de la propiedad marcatransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARCATRANSFORMADOR(String value) {
        this.marcatransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad modelotransformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODELOTRANSFORMADOR() {
        return modelotransformador;
    }

    /**
     * Define el valor de la propiedad modelotransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODELOTRANSFORMADOR(String value) {
        this.modelotransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad numerotransformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROTRANSFORMADOR() {
        return numerotransformador;
    }

    /**
     * Define el valor de la propiedad numerotransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROTRANSFORMADOR(String value) {
        this.numerotransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad relaciontransformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELACIONTRANSFORMADOR() {
        return relaciontransformador;
    }

    /**
     * Define el valor de la propiedad relaciontransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELACIONTRANSFORMADOR(String value) {
        this.relaciontransformador = value;
    }

}
