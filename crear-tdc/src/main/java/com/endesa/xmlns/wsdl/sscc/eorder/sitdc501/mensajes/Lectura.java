
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Lectura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Lectura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ANOMALIA_DE_FACTURACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ANOMALIA_DE_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_EVENTOS_LECTURA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_HORARIO_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_CONSUMO_FACTURADO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_CONSUMO_LEIDO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_LECTURA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CLAVE_DE_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CPDANTERIOR_DUDOSO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PORCE_BAJA_DUDOSO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PORCE_ALZA_DUDOSO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PISO_DUDOSO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CONSTANTE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ENTEROS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DECIMALES" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lectura", propOrder = {

})
public class Lectura {

    @XmlElement(name = "ANOMALIA_DE_FACTURACION")
    protected String anomaliadefacturacion;
    @XmlElement(name = "ANOMALIA_DE_LECTURA")
    protected String anomaliadelectura;
    @XmlElement(name = "FECHA_EVENTOS_LECTURA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaeventoslectura;
    @XmlElement(name = "TIPO_HORARIO_LECTURA")
    protected String tipohorariolectura;
    @XmlElement(name = "TIPO_LECTURA")
    protected String tipolectura;
    @XmlElement(name = "VALOR_CONSUMO_FACTURADO")
    protected Double valorconsumofacturado;
    @XmlElement(name = "VALOR_CONSUMO_LEIDO")
    protected Double valorconsumoleido;
    @XmlElement(name = "VALOR_LECTURA")
    protected Double valorlectura;
    @XmlElement(name = "CLAVE_DE_LECTURA")
    protected String clavedelectura;
    @XmlElement(name = "CPDANTERIOR_DUDOSO")
    protected Double cpdanteriordudoso;
    @XmlElement(name = "PORCE_BAJA_DUDOSO")
    protected Double porcebajadudoso;
    @XmlElement(name = "PORCE_ALZA_DUDOSO")
    protected Double porcealzadudoso;
    @XmlElement(name = "PISO_DUDOSO")
    protected Double pisodudoso;
    @XmlElement(name = "CONSTANTE")
    protected Long constante;
    @XmlElement(name = "ENTEROS")
    protected Long enteros;
    @XmlElement(name = "DECIMALES")
    protected Long decimales;

    /**
     * Obtiene el valor de la propiedad anomaliadefacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOMALIADEFACTURACION() {
        return anomaliadefacturacion;
    }

    /**
     * Define el valor de la propiedad anomaliadefacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOMALIADEFACTURACION(String value) {
        this.anomaliadefacturacion = value;
    }

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
     * Obtiene el valor de la propiedad fechaeventoslectura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAEVENTOSLECTURA() {
        return fechaeventoslectura;
    }

    /**
     * Define el valor de la propiedad fechaeventoslectura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAEVENTOSLECTURA(XMLGregorianCalendar value) {
        this.fechaeventoslectura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipohorariolectura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOHORARIOLECTURA() {
        return tipohorariolectura;
    }

    /**
     * Define el valor de la propiedad tipohorariolectura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOHORARIOLECTURA(String value) {
        this.tipohorariolectura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipolectura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOLECTURA() {
        return tipolectura;
    }

    /**
     * Define el valor de la propiedad tipolectura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOLECTURA(String value) {
        this.tipolectura = value;
    }

    /**
     * Obtiene el valor de la propiedad valorconsumofacturado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORCONSUMOFACTURADO() {
        return valorconsumofacturado;
    }

    /**
     * Define el valor de la propiedad valorconsumofacturado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORCONSUMOFACTURADO(Double value) {
        this.valorconsumofacturado = value;
    }

    /**
     * Obtiene el valor de la propiedad valorconsumoleido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORCONSUMOLEIDO() {
        return valorconsumoleido;
    }

    /**
     * Define el valor de la propiedad valorconsumoleido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORCONSUMOLEIDO(Double value) {
        this.valorconsumoleido = value;
    }

    /**
     * Obtiene el valor de la propiedad valorlectura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORLECTURA() {
        return valorlectura;
    }

    /**
     * Define el valor de la propiedad valorlectura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORLECTURA(Double value) {
        this.valorlectura = value;
    }

    /**
     * Obtiene el valor de la propiedad clavedelectura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVEDELECTURA() {
        return clavedelectura;
    }

    /**
     * Define el valor de la propiedad clavedelectura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVEDELECTURA(String value) {
        this.clavedelectura = value;
    }

    /**
     * Obtiene el valor de la propiedad cpdanteriordudoso.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPDANTERIORDUDOSO() {
        return cpdanteriordudoso;
    }

    /**
     * Define el valor de la propiedad cpdanteriordudoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPDANTERIORDUDOSO(Double value) {
        this.cpdanteriordudoso = value;
    }

    /**
     * Obtiene el valor de la propiedad porcebajadudoso.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPORCEBAJADUDOSO() {
        return porcebajadudoso;
    }

    /**
     * Define el valor de la propiedad porcebajadudoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPORCEBAJADUDOSO(Double value) {
        this.porcebajadudoso = value;
    }

    /**
     * Obtiene el valor de la propiedad porcealzadudoso.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPORCEALZADUDOSO() {
        return porcealzadudoso;
    }

    /**
     * Define el valor de la propiedad porcealzadudoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPORCEALZADUDOSO(Double value) {
        this.porcealzadudoso = value;
    }

    /**
     * Obtiene el valor de la propiedad pisodudoso.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPISODUDOSO() {
        return pisodudoso;
    }

    /**
     * Define el valor de la propiedad pisodudoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPISODUDOSO(Double value) {
        this.pisodudoso = value;
    }

    /**
     * Obtiene el valor de la propiedad constante.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCONSTANTE() {
        return constante;
    }

    /**
     * Define el valor de la propiedad constante.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCONSTANTE(Long value) {
        this.constante = value;
    }

    /**
     * Obtiene el valor de la propiedad enteros.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getENTEROS() {
        return enteros;
    }

    /**
     * Define el valor de la propiedad enteros.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setENTEROS(Long value) {
        this.enteros = value;
    }

    /**
     * Obtiene el valor de la propiedad decimales.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDECIMALES() {
        return decimales;
    }

    /**
     * Define el valor de la propiedad decimales.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDECIMALES(Long value) {
        this.decimales = value;
    }

}
