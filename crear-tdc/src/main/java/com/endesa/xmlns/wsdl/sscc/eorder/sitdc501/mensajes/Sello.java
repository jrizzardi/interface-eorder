
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Sello complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Sello"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="COLOR_DEL_SELLO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO_DEL_SELLO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="PADRAO_FABRICANTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SELLOS_EN_SISTEMA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_SELLO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="UBICACION_DEL_SELLO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sello", propOrder = {

})
public class Sello {

    @XmlElement(name = "COLOR_DEL_SELLO")
    protected String colordelsello;
    @XmlElement(name = "ESTADO_DEL_SELLO")
    protected String estadodelsello;
    @XmlElement(name = "PADRAO_FABRICANTE")
    protected String padraofabricante;
    @XmlElement(name = "SELLOS_EN_SISTEMA")
    protected String sellosensistema;
    @XmlElement(name = "TIPO_DE_SELLO")
    protected String tipodesello;
    @XmlElement(name = "UBICACION_DEL_SELLO")
    protected String ubicaciondelsello;

    /**
     * Obtiene el valor de la propiedad colordelsello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLORDELSELLO() {
        return colordelsello;
    }

    /**
     * Define el valor de la propiedad colordelsello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLORDELSELLO(String value) {
        this.colordelsello = value;
    }

    /**
     * Obtiene el valor de la propiedad estadodelsello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADODELSELLO() {
        return estadodelsello;
    }

    /**
     * Define el valor de la propiedad estadodelsello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADODELSELLO(String value) {
        this.estadodelsello = value;
    }

    /**
     * Obtiene el valor de la propiedad padraofabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPADRAOFABRICANTE() {
        return padraofabricante;
    }

    /**
     * Define el valor de la propiedad padraofabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPADRAOFABRICANTE(String value) {
        this.padraofabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad sellosensistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELLOSENSISTEMA() {
        return sellosensistema;
    }

    /**
     * Define el valor de la propiedad sellosensistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELLOSENSISTEMA(String value) {
        this.sellosensistema = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodesello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODESELLO() {
        return tipodesello;
    }

    /**
     * Define el valor de la propiedad tipodesello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODESELLO(String value) {
        this.tipodesello = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicaciondelsello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBICACIONDELSELLO() {
        return ubicaciondelsello;
    }

    /**
     * Define el valor de la propiedad ubicaciondelsello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBICACIONDELSELLO(String value) {
        this.ubicaciondelsello = value;
    }

}
