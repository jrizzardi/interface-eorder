
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Consumo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Consumo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ANOMALIA_DE_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_CONSUMO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_HORARIO_CONSUMO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_CONSUMO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consumo", propOrder = {

})
public class Consumo {

    @XmlElement(name = "ANOMALIA_DE_LECTURA")
    protected String anomaliadelectura;
    @XmlElement(name = "TIPO_CONSUMO")
    protected String tipoconsumo;
    @XmlElement(name = "TIPO_HORARIO_CONSUMO")
    protected String tipohorarioconsumo;
    @XmlElement(name = "VALOR_CONSUMO")
    protected Double valorconsumo;

    /**
     * Obtiene el valor de la propiedad anomaliadelectura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOMALIADELECTURA() {
        return anomaliadelectura;
    }

    /**
     * Define el valor de la propiedad anomaliadelectura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOMALIADELECTURA(String value) {
        this.anomaliadelectura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoconsumo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCONSUMO() {
        return tipoconsumo;
    }

    /**
     * Define el valor de la propiedad tipoconsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCONSUMO(String value) {
        this.tipoconsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipohorarioconsumo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOHORARIOCONSUMO() {
        return tipohorarioconsumo;
    }

    /**
     * Define el valor de la propiedad tipohorarioconsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOHORARIOCONSUMO(String value) {
        this.tipohorarioconsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorconsumo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORCONSUMO() {
        return valorconsumo;
    }

    /**
     * Define el valor de la propiedad valorconsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORCONSUMO(Double value) {
        this.valorconsumo = value;
    }

}
