
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GestionPerdidasSmartMeter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GestionPerdidasSmartMeter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TIPO_MEDIDA_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_TD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_TD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LATITUD_TD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="LONGITUD_TD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="COMUNA_TD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_INSTALACION_TD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_TD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VINCULOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfVinculo" minOccurs="0"/&gt;
 *         &lt;element name="COMPONENTE_CAJA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}componente_caja" minOccurs="0"/&gt;
 *         &lt;element name="COMPONENTE_SIMCARD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}componente_simcard" minOccurs="0"/&gt;
 *         &lt;element name="COMPONENTE_MODEM" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}componente_modem" minOccurs="0"/&gt;
 *         &lt;element name="COMPONENTE_CONCENTRADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}componente_concentrador" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionPerdidasSmartMeter", propOrder = {
    "tipomedidaconexion",
    "fase",
    "numerotd",
    "nombretd",
    "latitudtd",
    "longitudtd",
    "comunatd",
    "tipodeinstalaciontd",
    "capacidadtd",
    "vinculos",
    "componentecaja",
    "componentesimcard",
    "componentemodem",
    "componenteconcentrador"
})
public class GestionPerdidasSmartMeter {

    @XmlElement(name = "TIPO_MEDIDA_CONEXION")
    protected String tipomedidaconexion;
    @XmlElement(name = "FASE")
    protected String fase;
    @XmlElement(name = "NUMERO_TD")
    protected String numerotd;
    @XmlElement(name = "NOMBRE_TD")
    protected String nombretd;
    @XmlElement(name = "LATITUD_TD")
    protected BigDecimal latitudtd;
    @XmlElement(name = "LONGITUD_TD")
    protected BigDecimal longitudtd;
    @XmlElement(name = "COMUNA_TD")
    protected String comunatd;
    @XmlElement(name = "TIPO_DE_INSTALACION_TD")
    protected String tipodeinstalaciontd;
    @XmlElement(name = "CAPACIDAD_TD")
    protected Double capacidadtd;
    @XmlElement(name = "VINCULOS")
    protected ArrayOfVinculo vinculos;
    @XmlElement(name = "COMPONENTE_CAJA")
    protected ComponenteCaja componentecaja;
    @XmlElement(name = "COMPONENTE_SIMCARD")
    protected ComponenteSimcard componentesimcard;
    @XmlElement(name = "COMPONENTE_MODEM")
    protected ComponenteModem componentemodem;
    @XmlElement(name = "COMPONENTE_CONCENTRADOR")
    protected ComponenteConcentrador componenteconcentrador;

    /**
     * Obtiene el valor de la propiedad tipomedidaconexion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMEDIDACONEXION() {
        return tipomedidaconexion;
    }

    /**
     * Define el valor de la propiedad tipomedidaconexion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMEDIDACONEXION(String value) {
        this.tipomedidaconexion = value;
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
     * Obtiene el valor de la propiedad numerotd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROTD() {
        return numerotd;
    }

    /**
     * Define el valor de la propiedad numerotd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROTD(String value) {
        this.numerotd = value;
    }

    /**
     * Obtiene el valor de la propiedad nombretd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRETD() {
        return nombretd;
    }

    /**
     * Define el valor de la propiedad nombretd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRETD(String value) {
        this.nombretd = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudtd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATITUDTD() {
        return latitudtd;
    }

    /**
     * Define el valor de la propiedad latitudtd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATITUDTD(BigDecimal value) {
        this.latitudtd = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudtd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLONGITUDTD() {
        return longitudtd;
    }

    /**
     * Define el valor de la propiedad longitudtd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLONGITUDTD(BigDecimal value) {
        this.longitudtd = value;
    }

    /**
     * Obtiene el valor de la propiedad comunatd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMUNATD() {
        return comunatd;
    }

    /**
     * Define el valor de la propiedad comunatd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMUNATD(String value) {
        this.comunatd = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeinstalaciontd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEINSTALACIONTD() {
        return tipodeinstalaciontd;
    }

    /**
     * Define el valor de la propiedad tipodeinstalaciontd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEINSTALACIONTD(String value) {
        this.tipodeinstalaciontd = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidadtd.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCAPACIDADTD() {
        return capacidadtd;
    }

    /**
     * Define el valor de la propiedad capacidadtd.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCAPACIDADTD(Double value) {
        this.capacidadtd = value;
    }

    /**
     * Obtiene el valor de la propiedad vinculos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVinculo }
     *     
     */
    public ArrayOfVinculo getVINCULOS() {
        return vinculos;
    }

    /**
     * Define el valor de la propiedad vinculos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVinculo }
     *     
     */
    public void setVINCULOS(ArrayOfVinculo value) {
        this.vinculos = value;
    }

    /**
     * Obtiene el valor de la propiedad componentecaja.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteCaja }
     *     
     */
    public ComponenteCaja getCOMPONENTECAJA() {
        return componentecaja;
    }

    /**
     * Define el valor de la propiedad componentecaja.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteCaja }
     *     
     */
    public void setCOMPONENTECAJA(ComponenteCaja value) {
        this.componentecaja = value;
    }

    /**
     * Obtiene el valor de la propiedad componentesimcard.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteSimcard }
     *     
     */
    public ComponenteSimcard getCOMPONENTESIMCARD() {
        return componentesimcard;
    }

    /**
     * Define el valor de la propiedad componentesimcard.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteSimcard }
     *     
     */
    public void setCOMPONENTESIMCARD(ComponenteSimcard value) {
        this.componentesimcard = value;
    }

    /**
     * Obtiene el valor de la propiedad componentemodem.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteModem }
     *     
     */
    public ComponenteModem getCOMPONENTEMODEM() {
        return componentemodem;
    }

    /**
     * Define el valor de la propiedad componentemodem.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteModem }
     *     
     */
    public void setCOMPONENTEMODEM(ComponenteModem value) {
        this.componentemodem = value;
    }

    /**
     * Obtiene el valor de la propiedad componenteconcentrador.
     * 
     * @return
     *     possible object is
     *     {@link ComponenteConcentrador }
     *     
     */
    public ComponenteConcentrador getCOMPONENTECONCENTRADOR() {
        return componenteconcentrador;
    }

    /**
     * Define el valor de la propiedad componenteconcentrador.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponenteConcentrador }
     *     
     */
    public void setCOMPONENTECONCENTRADOR(ComponenteConcentrador value) {
        this.componenteconcentrador = value;
    }

}
