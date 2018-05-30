
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Vinculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Vinculo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CODIGO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CARDINAL_CRUCE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CARDINAL_VIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CLASE_DE_VIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_LETRA_CRUCE_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_LETRA_VIA_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_MODALIDAD_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_NOMBRE_VIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_TIPO_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTRATO_SOCIO_ECONOMICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ID_COD_BARRIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ID_COD_MUNICIPIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="INDICADOR_D_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LATITUD_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="LOCALIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LOCALIZACION_TERRENO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="LONGITUD_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}Medidor" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_CRUCE_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_PLACA_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_VIA_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NUM_MODALIDAD_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="NUM_TIPO_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="NUM_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="SECTOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TEXTO_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_VIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="UPZ" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vinculo", propOrder = {

})
public class Vinculo {

    @XmlElement(name = "CODIGO_CLIENTE")
    protected String codigocliente;
    @XmlElement(name = "COD_CARDINAL_CRUCE")
    protected String codcardinalcruce;
    @XmlElement(name = "COD_CARDINAL_VIA")
    protected String codcardinalvia;
    @XmlElement(name = "COD_CLASE_DE_VIA")
    protected String codclasedevia;
    @XmlElement(name = "COD_LETRA_CRUCE_DIRECCION")
    protected String codletracrucedireccion;
    @XmlElement(name = "COD_LETRA_VIA_DIRECCION")
    protected String codletraviadireccion;
    @XmlElement(name = "COD_MODALIDAD_UNIDAD_PREDIAL")
    protected String codmodalidadunidadpredial;
    @XmlElement(name = "COD_NOMBRE_VIA")
    protected String codnombrevia;
    @XmlElement(name = "COD_TIPO_UNIDAD_PREDIAL")
    protected String codtipounidadpredial;
    @XmlElement(name = "COD_UNIDAD_PREDIAL")
    protected String codunidadpredial;
    @XmlElement(name = "ESTRATO_SOCIO_ECONOMICO")
    protected String estratosocioeconomico;
    @XmlElement(name = "FASE")
    protected String fase;
    @XmlElement(name = "ID_COD_BARRIO")
    protected String idcodbarrio;
    @XmlElement(name = "ID_COD_MUNICIPIO")
    protected String idcodmunicipio;
    @XmlElement(name = "INDICADOR_D_DIRECCION")
    protected String indicadorddireccion;
    @XmlElement(name = "LATITUD_CLIENTE")
    protected BigDecimal latitudcliente;
    @XmlElement(name = "LOCALIDAD")
    protected String localidad;
    @XmlElement(name = "LOCALIZACION_TERRENO")
    protected String localizacionterreno;
    @XmlElement(name = "LONGITUD_CLIENTE")
    protected BigDecimal longitudcliente;
    @XmlElement(name = "MEDIDOR")
    protected Medidor medidor;
    @XmlElement(name = "NUMERO_CRUCE_DIRECCION")
    protected String numerocrucedireccion;
    @XmlElement(name = "NUMERO_PLACA_DIRECCION")
    protected String numeroplacadireccion;
    @XmlElement(name = "NUMERO_VIA_DIRECCION")
    protected String numeroviadireccion;
    @XmlElement(name = "NUM_MODALIDAD_UNIDAD_PREDIAL")
    protected String nummodalidadunidadpredial;
    @XmlElement(name = "NUM_TIPO_UNIDAD_PREDIAL")
    protected String numtipounidadpredial;
    @XmlElement(name = "NUM_UNIDAD_PREDIAL")
    protected String numunidadpredial;
    @XmlElement(name = "SECTOR")
    protected String sector;
    @XmlElement(name = "TEXTO_DIRECCION")
    protected String textodireccion;
    @XmlElement(name = "TIPO_VIA")
    protected String tipovia;
    @XmlElement(name = "UPZ")
    protected String upz;

    /**
     * Obtiene el valor de la propiedad codigocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOCLIENTE() {
        return codigocliente;
    }

    /**
     * Define el valor de la propiedad codigocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOCLIENTE(String value) {
        this.codigocliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codcardinalcruce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCARDINALCRUCE() {
        return codcardinalcruce;
    }

    /**
     * Define el valor de la propiedad codcardinalcruce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCARDINALCRUCE(String value) {
        this.codcardinalcruce = value;
    }

    /**
     * Obtiene el valor de la propiedad codcardinalvia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCARDINALVIA() {
        return codcardinalvia;
    }

    /**
     * Define el valor de la propiedad codcardinalvia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCARDINALVIA(String value) {
        this.codcardinalvia = value;
    }

    /**
     * Obtiene el valor de la propiedad codclasedevia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODCLASEDEVIA() {
        return codclasedevia;
    }

    /**
     * Define el valor de la propiedad codclasedevia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODCLASEDEVIA(String value) {
        this.codclasedevia = value;
    }

    /**
     * Obtiene el valor de la propiedad codletracrucedireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODLETRACRUCEDIRECCION() {
        return codletracrucedireccion;
    }

    /**
     * Define el valor de la propiedad codletracrucedireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODLETRACRUCEDIRECCION(String value) {
        this.codletracrucedireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codletraviadireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODLETRAVIADIRECCION() {
        return codletraviadireccion;
    }

    /**
     * Define el valor de la propiedad codletraviadireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODLETRAVIADIRECCION(String value) {
        this.codletraviadireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codmodalidadunidadpredial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODMODALIDADUNIDADPREDIAL() {
        return codmodalidadunidadpredial;
    }

    /**
     * Define el valor de la propiedad codmodalidadunidadpredial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODMODALIDADUNIDADPREDIAL(String value) {
        this.codmodalidadunidadpredial = value;
    }

    /**
     * Obtiene el valor de la propiedad codnombrevia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODNOMBREVIA() {
        return codnombrevia;
    }

    /**
     * Define el valor de la propiedad codnombrevia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODNOMBREVIA(String value) {
        this.codnombrevia = value;
    }

    /**
     * Obtiene el valor de la propiedad codtipounidadpredial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODTIPOUNIDADPREDIAL() {
        return codtipounidadpredial;
    }

    /**
     * Define el valor de la propiedad codtipounidadpredial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODTIPOUNIDADPREDIAL(String value) {
        this.codtipounidadpredial = value;
    }

    /**
     * Obtiene el valor de la propiedad codunidadpredial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODUNIDADPREDIAL() {
        return codunidadpredial;
    }

    /**
     * Define el valor de la propiedad codunidadpredial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODUNIDADPREDIAL(String value) {
        this.codunidadpredial = value;
    }

    /**
     * Obtiene el valor de la propiedad estratosocioeconomico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTRATOSOCIOECONOMICO() {
        return estratosocioeconomico;
    }

    /**
     * Define el valor de la propiedad estratosocioeconomico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTRATOSOCIOECONOMICO(String value) {
        this.estratosocioeconomico = value;
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
     * Obtiene el valor de la propiedad idcodbarrio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCODBARRIO() {
        return idcodbarrio;
    }

    /**
     * Define el valor de la propiedad idcodbarrio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCODBARRIO(String value) {
        this.idcodbarrio = value;
    }

    /**
     * Obtiene el valor de la propiedad idcodmunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCODMUNICIPIO() {
        return idcodmunicipio;
    }

    /**
     * Define el valor de la propiedad idcodmunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCODMUNICIPIO(String value) {
        this.idcodmunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorddireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADORDDIRECCION() {
        return indicadorddireccion;
    }

    /**
     * Define el valor de la propiedad indicadorddireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADORDDIRECCION(String value) {
        this.indicadorddireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudcliente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATITUDCLIENTE() {
        return latitudcliente;
    }

    /**
     * Define el valor de la propiedad latitudcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATITUDCLIENTE(BigDecimal value) {
        this.latitudcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIDAD() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIDAD(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad localizacionterreno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIZACIONTERRENO() {
        return localizacionterreno;
    }

    /**
     * Define el valor de la propiedad localizacionterreno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIZACIONTERRENO(String value) {
        this.localizacionterreno = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudcliente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLONGITUDCLIENTE() {
        return longitudcliente;
    }

    /**
     * Define el valor de la propiedad longitudcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLONGITUDCLIENTE(BigDecimal value) {
        this.longitudcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad medidor.
     * 
     * @return
     *     possible object is
     *     {@link Medidor }
     *     
     */
    public Medidor getMEDIDOR() {
        return medidor;
    }

    /**
     * Define el valor de la propiedad medidor.
     * 
     * @param value
     *     allowed object is
     *     {@link Medidor }
     *     
     */
    public void setMEDIDOR(Medidor value) {
        this.medidor = value;
    }

    /**
     * Obtiene el valor de la propiedad numerocrucedireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCRUCEDIRECCION() {
        return numerocrucedireccion;
    }

    /**
     * Define el valor de la propiedad numerocrucedireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCRUCEDIRECCION(String value) {
        this.numerocrucedireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroplacadireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPLACADIRECCION() {
        return numeroplacadireccion;
    }

    /**
     * Define el valor de la propiedad numeroplacadireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPLACADIRECCION(String value) {
        this.numeroplacadireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroviadireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROVIADIRECCION() {
        return numeroviadireccion;
    }

    /**
     * Define el valor de la propiedad numeroviadireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROVIADIRECCION(String value) {
        this.numeroviadireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nummodalidadunidadpredial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMMODALIDADUNIDADPREDIAL() {
        return nummodalidadunidadpredial;
    }

    /**
     * Define el valor de la propiedad nummodalidadunidadpredial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMMODALIDADUNIDADPREDIAL(String value) {
        this.nummodalidadunidadpredial = value;
    }

    /**
     * Obtiene el valor de la propiedad numtipounidadpredial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMTIPOUNIDADPREDIAL() {
        return numtipounidadpredial;
    }

    /**
     * Define el valor de la propiedad numtipounidadpredial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMTIPOUNIDADPREDIAL(String value) {
        this.numtipounidadpredial = value;
    }

    /**
     * Obtiene el valor de la propiedad numunidadpredial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMUNIDADPREDIAL() {
        return numunidadpredial;
    }

    /**
     * Define el valor de la propiedad numunidadpredial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMUNIDADPREDIAL(String value) {
        this.numunidadpredial = value;
    }

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECTOR() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECTOR(String value) {
        this.sector = value;
    }

    /**
     * Obtiene el valor de la propiedad textodireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTODIRECCION() {
        return textodireccion;
    }

    /**
     * Define el valor de la propiedad textodireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTODIRECCION(String value) {
        this.textodireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipovia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOVIA() {
        return tipovia;
    }

    /**
     * Define el valor de la propiedad tipovia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOVIA(String value) {
        this.tipovia = value;
    }

    /**
     * Obtiene el valor de la propiedad upz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPZ() {
        return upz;
    }

    /**
     * Define el valor de la propiedad upz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPZ(String value) {
        this.upz = value;
    }

}
