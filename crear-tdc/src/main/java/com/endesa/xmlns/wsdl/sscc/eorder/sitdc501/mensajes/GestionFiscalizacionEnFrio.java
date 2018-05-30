
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GestionFiscalizacionEnFrio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GestionFiscalizacionEnFrio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="BUZON_O_ROL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CANAL_DE_ENTRADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CANTIDAD_DE_MEDIDORES" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CLAVE_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_DEL_TIPO_TDC_HOMOLOGADO_A_FISCALIZAR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_DISTRIBUIDORA_TDC_A_FISCALIZAR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_EXTERNO_DEL_TDC_A_FISCALIZAR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_SISTEMA_EXTERNO_DE_ORIGEN_TDC_A_FISCALIZAR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LECTURA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MOTIVO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="MOTIVO_EMPRESA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="PROCESO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_ACTIVIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_ATENCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
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
@XmlType(name = "GestionFiscalizacionEnFrio", propOrder = {

})
public class GestionFiscalizacionEnFrio {

    @XmlElement(name = "BUZON_O_ROL")
    protected String buzonorol;
    @XmlElement(name = "CANAL_DE_ENTRADA")
    protected String canaldeentrada;
    @XmlElement(name = "CANTIDAD_DE_MEDIDORES")
    protected Long cantidaddemedidores;
    @XmlElement(name = "CLAVE_LECTURA")
    protected String clavelectura;
    @XmlElement(name = "CODIGO_DEL_TIPO_TDC_HOMOLOGADO_A_FISCALIZAR")
    protected String codigodeltipotdchomologadoafiscalizar;
    @XmlElement(name = "CODIGO_DISTRIBUIDORA_TDC_A_FISCALIZAR")
    protected String codigodistribuidoratdcafiscalizar;
    @XmlElement(name = "CODIGO_EXTERNO_DEL_TDC_A_FISCALIZAR")
    protected Long codigoexternodeltdcafiscalizar;
    @XmlElement(name = "CODIGO_SISTEMA_EXTERNO_DE_ORIGEN_TDC_A_FISCALIZAR")
    protected String codigosistemaexternodeorigentdcafiscalizar;
    @XmlElement(name = "LECTURA")
    protected Double lectura;
    @XmlElement(name = "MOTIVO_CLIENTE")
    protected String motivocliente;
    @XmlElement(name = "MOTIVO_EMPRESA")
    protected String motivoempresa;
    @XmlElement(name = "PROCESO")
    protected String proceso;
    @XmlElement(name = "TIPO_DE_ACTIVIDAD")
    protected String tipodeactividad;
    @XmlElement(name = "TIPO_DE_ATENCION")
    protected String tipodeatencion;
    @XmlElement(name = "XML_EXTENSION_PARAMS")
    protected String xmlextensionparams;

    /**
     * Obtiene el valor de la propiedad buzonorol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUZONOROL() {
        return buzonorol;
    }

    /**
     * Define el valor de la propiedad buzonorol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUZONOROL(String value) {
        this.buzonorol = value;
    }

    /**
     * Obtiene el valor de la propiedad canaldeentrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALDEENTRADA() {
        return canaldeentrada;
    }

    /**
     * Define el valor de la propiedad canaldeentrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALDEENTRADA(String value) {
        this.canaldeentrada = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidaddemedidores.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCANTIDADDEMEDIDORES() {
        return cantidaddemedidores;
    }

    /**
     * Define el valor de la propiedad cantidaddemedidores.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCANTIDADDEMEDIDORES(Long value) {
        this.cantidaddemedidores = value;
    }

    /**
     * Obtiene el valor de la propiedad clavelectura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVELECTURA() {
        return clavelectura;
    }

    /**
     * Define el valor de la propiedad clavelectura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVELECTURA(String value) {
        this.clavelectura = value;
    }

    /**
     * Obtiene el valor de la propiedad codigodeltipotdchomologadoafiscalizar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODELTIPOTDCHOMOLOGADOAFISCALIZAR() {
        return codigodeltipotdchomologadoafiscalizar;
    }

    /**
     * Define el valor de la propiedad codigodeltipotdchomologadoafiscalizar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODELTIPOTDCHOMOLOGADOAFISCALIZAR(String value) {
        this.codigodeltipotdchomologadoafiscalizar = value;
    }

    /**
     * Obtiene el valor de la propiedad codigodistribuidoratdcafiscalizar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODISTRIBUIDORATDCAFISCALIZAR() {
        return codigodistribuidoratdcafiscalizar;
    }

    /**
     * Define el valor de la propiedad codigodistribuidoratdcafiscalizar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODISTRIBUIDORATDCAFISCALIZAR(String value) {
        this.codigodistribuidoratdcafiscalizar = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoexternodeltdcafiscalizar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCODIGOEXTERNODELTDCAFISCALIZAR() {
        return codigoexternodeltdcafiscalizar;
    }

    /**
     * Define el valor de la propiedad codigoexternodeltdcafiscalizar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCODIGOEXTERNODELTDCAFISCALIZAR(Long value) {
        this.codigoexternodeltdcafiscalizar = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosistemaexternodeorigentdcafiscalizar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOSISTEMAEXTERNODEORIGENTDCAFISCALIZAR() {
        return codigosistemaexternodeorigentdcafiscalizar;
    }

    /**
     * Define el valor de la propiedad codigosistemaexternodeorigentdcafiscalizar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOSISTEMAEXTERNODEORIGENTDCAFISCALIZAR(String value) {
        this.codigosistemaexternodeorigentdcafiscalizar = value;
    }

    /**
     * Obtiene el valor de la propiedad lectura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLECTURA() {
        return lectura;
    }

    /**
     * Define el valor de la propiedad lectura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLECTURA(Double value) {
        this.lectura = value;
    }

    /**
     * Obtiene el valor de la propiedad motivocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVOCLIENTE() {
        return motivocliente;
    }

    /**
     * Define el valor de la propiedad motivocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVOCLIENTE(String value) {
        this.motivocliente = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoempresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVOEMPRESA() {
        return motivoempresa;
    }

    /**
     * Define el valor de la propiedad motivoempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVOEMPRESA(String value) {
        this.motivoempresa = value;
    }

    /**
     * Obtiene el valor de la propiedad proceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESO() {
        return proceso;
    }

    /**
     * Define el valor de la propiedad proceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESO(String value) {
        this.proceso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeactividad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEACTIVIDAD() {
        return tipodeactividad;
    }

    /**
     * Define el valor de la propiedad tipodeactividad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEACTIVIDAD(String value) {
        this.tipodeactividad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeatencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEATENCION() {
        return tipodeatencion;
    }

    /**
     * Define el valor de la propiedad tipodeatencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEATENCION(String value) {
        this.tipodeatencion = value;
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
