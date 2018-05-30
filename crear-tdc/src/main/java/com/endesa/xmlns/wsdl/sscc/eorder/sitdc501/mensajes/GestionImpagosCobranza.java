
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para GestionImpagosCobranza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GestionImpagosCobranza"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ASIGNACIONES" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DE_PROTECCION_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CARTERA_MOROSA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DIRECCION_OTRAS_VISITAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="ENTREGA_NUMERO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_DE_ASIGNACION" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_DE_RETIRO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_VENCIMIENTO_ULTIMA_FACTURA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GRUPO_DE_LA_CUENTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DE_CUENTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DOCUMENTO_IDENTIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_CARTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_CARTERA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DOCUMENTO_IDENTIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ULTIMA_LECTURA_FACTURADA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="XML_EXTENSION_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionImpagosCobranza", propOrder = {

})
public class GestionImpagosCobranza {

    @XmlElement(name = "ASIGNACIONES")
    protected String asignaciones;
    @XmlElement(name = "CAPACIDAD_DE_PROTECCION_DEL_EMPALME")
    protected String capacidaddeprotecciondelempalme;
    @XmlElement(name = "CARTERA_MOROSA")
    protected String carteramorosa;
    @XmlElement(name = "DIRECCION_OTRAS_VISITAS")
    protected String direccionotrasvisitas;
    @XmlElement(name = "ENTREGA_NUMERO")
    protected String entreganumero;
    @XmlElement(name = "FECHA_DE_ASIGNACION")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechadeasignacion;
    @XmlElement(name = "FECHA_DE_RETIRO")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaderetiro;
    @XmlElement(name = "FECHA_VENCIMIENTO_ULTIMA_FACTURA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechavencimientoultimafactura;
    @XmlElement(name = "GRUPO_DE_LA_CUENTA")
    protected String grupodelacuenta;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "NUMERO_DE_CUENTA")
    protected String numerodecuenta;
    @XmlElement(name = "NUMERO_DOCUMENTO_IDENTIDAD")
    protected String numerodocumentoidentidad;
    @XmlElement(name = "TIPO_CARTA")
    protected String tipocarta;
    @XmlElement(name = "TIPO_CARTERA")
    protected String tipocartera;
    @XmlElement(name = "TIPO_DOCUMENTO_IDENTIDAD")
    protected String tipodocumentoidentidad;
    @XmlElement(name = "ULTIMA_LECTURA_FACTURADA")
    protected Double ultimalecturafacturada;
    @XmlElement(name = "XML_EXTENSION_PARAMS")
    protected String xmlextensionparams;

    /**
     * Obtiene el valor de la propiedad asignaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASIGNACIONES() {
        return asignaciones;
    }

    /**
     * Define el valor de la propiedad asignaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASIGNACIONES(String value) {
        this.asignaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidaddeprotecciondelempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACIDADDEPROTECCIONDELEMPALME() {
        return capacidaddeprotecciondelempalme;
    }

    /**
     * Define el valor de la propiedad capacidaddeprotecciondelempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACIDADDEPROTECCIONDELEMPALME(String value) {
        this.capacidaddeprotecciondelempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad carteramorosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARTERAMOROSA() {
        return carteramorosa;
    }

    /**
     * Define el valor de la propiedad carteramorosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARTERAMOROSA(String value) {
        this.carteramorosa = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionotrasvisitas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECCIONOTRASVISITAS() {
        return direccionotrasvisitas;
    }

    /**
     * Define el valor de la propiedad direccionotrasvisitas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECCIONOTRASVISITAS(String value) {
        this.direccionotrasvisitas = value;
    }

    /**
     * Obtiene el valor de la propiedad entreganumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTREGANUMERO() {
        return entreganumero;
    }

    /**
     * Define el valor de la propiedad entreganumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTREGANUMERO(String value) {
        this.entreganumero = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadeasignacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADEASIGNACION() {
        return fechadeasignacion;
    }

    /**
     * Define el valor de la propiedad fechadeasignacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADEASIGNACION(XMLGregorianCalendar value) {
        this.fechadeasignacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaderetiro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADERETIRO() {
        return fechaderetiro;
    }

    /**
     * Define el valor de la propiedad fechaderetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADERETIRO(XMLGregorianCalendar value) {
        this.fechaderetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad fechavencimientoultimafactura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAVENCIMIENTOULTIMAFACTURA() {
        return fechavencimientoultimafactura;
    }

    /**
     * Define el valor de la propiedad fechavencimientoultimafactura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAVENCIMIENTOULTIMAFACTURA(XMLGregorianCalendar value) {
        this.fechavencimientoultimafactura = value;
    }

    /**
     * Obtiene el valor de la propiedad grupodelacuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUPODELACUENTA() {
        return grupodelacuenta;
    }

    /**
     * Define el valor de la propiedad grupodelacuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUPODELACUENTA(String value) {
        this.grupodelacuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodecuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODECUENTA() {
        return numerodecuenta;
    }

    /**
     * Define el valor de la propiedad numerodecuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODECUENTA(String value) {
        this.numerodecuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodocumentoidentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODOCUMENTOIDENTIDAD() {
        return numerodocumentoidentidad;
    }

    /**
     * Define el valor de la propiedad numerodocumentoidentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODOCUMENTOIDENTIDAD(String value) {
        this.numerodocumentoidentidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipocarta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCARTA() {
        return tipocarta;
    }

    /**
     * Define el valor de la propiedad tipocarta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCARTA(String value) {
        this.tipocarta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipocartera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCARTERA() {
        return tipocartera;
    }

    /**
     * Define el valor de la propiedad tipocartera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCARTERA(String value) {
        this.tipocartera = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodocumentoidentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODOCUMENTOIDENTIDAD() {
        return tipodocumentoidentidad;
    }

    /**
     * Define el valor de la propiedad tipodocumentoidentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODOCUMENTOIDENTIDAD(String value) {
        this.tipodocumentoidentidad = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimalecturafacturada.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getULTIMALECTURAFACTURADA() {
        return ultimalecturafacturada;
    }

    /**
     * Define el valor de la propiedad ultimalecturafacturada.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setULTIMALECTURAFACTURADA(Double value) {
        this.ultimalecturafacturada = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlextensionparams.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLEXTENSIONPARAMS() {
        return xmlextensionparams;
    }

    /**
     * Define el valor de la propiedad xmlextensionparams.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLEXTENSIONPARAMS(String value) {
        this.xmlextensionparams = value;
    }

}
