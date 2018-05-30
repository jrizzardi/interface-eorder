
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Suministro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Suministro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="AGRUPACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="ANTIGUEDAD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CLAVE_TARIFA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_POSTAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_TIPO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CARDINAL_CRUCE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CARDINAL_VIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CLASE_DE_VIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_LETRA_CRUCE_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_LETRA_VIA_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_MODALIDAD_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_NOMBRE_VIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_TIPO_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DEUDA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="GIRO_DE_NEGOCIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ID_COD_BARRIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ID_COD_MUNICIPIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="INDICADOR_D_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LATITUD_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="LOCALIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LOCALIZACION_TERRENO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="LONGITUD_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="LOTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="MANZANA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_Y_APELLIDO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_CRUCE_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_PLACA_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_VIA_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NUM_MODALIDAD_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="NUM_TIPO_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="NUM_UNIDAD_PREDIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="PISO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PROVINCIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="RUTA_DE_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="SUBCLASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SUCURSAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TARIFA_EXISTENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO_CONTACTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TEXTO_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_AGRUPACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_VIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="UPZ" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_SOLICITANTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_200" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO_SOLICITANTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_15" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suministro", propOrder = {

})
public class Suministro {

    @XmlElement(name = "AGRUPACION")
    protected String agrupacion;
    @XmlElement(name = "ANTIGUEDAD")
    protected Long antiguedad;
    @XmlElement(name = "CLAVE_TARIFA")
    protected String clavetarifa;
    @XmlElement(name = "CODIGO_CLIENTE")
    protected String codigocliente;
    @XmlElement(name = "CODIGO_POSTAL")
    protected String codigopostal;
    @XmlElement(name = "CODIGO_TIPO_CLIENTE")
    protected String codigotipocliente;
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
    @XmlElement(name = "DEUDA")
    protected Double deuda;
    @XmlElement(name = "GIRO_DE_NEGOCIO")
    protected String girodenegocio;
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
    @XmlElement(name = "LOTE")
    protected String lote;
    @XmlElement(name = "MANZANA")
    protected String manzana;
    @XmlElement(name = "NOMBRE_Y_APELLIDO_CLIENTE")
    protected String nombreyapellidocliente;
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
    @XmlElement(name = "PISO")
    protected String piso;
    @XmlElement(name = "PROVINCIA")
    protected String provincia;
    @XmlElement(name = "RUTA_DE_LECTURA")
    protected String rutadelectura;
    @XmlElement(name = "SUBCLASE")
    protected String subclase;
    @XmlElement(name = "SUCURSAL")
    protected String sucursal;
    @XmlElement(name = "TARIFA_EXISTENTE")
    protected String tarifaexistente;
    @XmlElement(name = "TELEFONO_CONTACTO")
    protected String telefonocontacto;
    @XmlElement(name = "TEXTO_DIRECCION")
    protected String textodireccion;
    @XmlElement(name = "TIPO_AGRUPACION")
    protected String tipoagrupacion;
    @XmlElement(name = "TIPO_VIA")
    protected String tipovia;
    @XmlElement(name = "UPZ")
    protected String upz;
    @XmlElement(name = "ESTADO_CONEXION")
    protected String estadoconexion;
    @XmlElement(name = "NOMBRE_SOLICITANTE")
    protected String nombresolicitante;
    @XmlElement(name = "TELEFONO_SOLICITANTE")
    protected String telefonosolicitante;

    /**
     * Obtiene el valor de la propiedad agrupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRUPACION() {
        return agrupacion;
    }

    /**
     * Define el valor de la propiedad agrupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRUPACION(String value) {
        this.agrupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad antiguedad.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getANTIGUEDAD() {
        return antiguedad;
    }

    /**
     * Define el valor de la propiedad antiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setANTIGUEDAD(Long value) {
        this.antiguedad = value;
    }

    /**
     * Obtiene el valor de la propiedad clavetarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVETARIFA() {
        return clavetarifa;
    }

    /**
     * Define el valor de la propiedad clavetarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVETARIFA(String value) {
        this.clavetarifa = value;
    }

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
     * Obtiene el valor de la propiedad codigopostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOPOSTAL() {
        return codigopostal;
    }

    /**
     * Define el valor de la propiedad codigopostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOPOSTAL(String value) {
        this.codigopostal = value;
    }

    /**
     * Obtiene el valor de la propiedad codigotipocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTIPOCLIENTE() {
        return codigotipocliente;
    }

    /**
     * Define el valor de la propiedad codigotipocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTIPOCLIENTE(String value) {
        this.codigotipocliente = value;
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
     * Obtiene el valor de la propiedad deuda.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDEUDA() {
        return deuda;
    }

    /**
     * Define el valor de la propiedad deuda.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDEUDA(Double value) {
        this.deuda = value;
    }

    /**
     * Obtiene el valor de la propiedad girodenegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIRODENEGOCIO() {
        return girodenegocio;
    }

    /**
     * Define el valor de la propiedad girodenegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIRODENEGOCIO(String value) {
        this.girodenegocio = value;
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
     * Obtiene el valor de la propiedad lote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOTE() {
        return lote;
    }

    /**
     * Define el valor de la propiedad lote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOTE(String value) {
        this.lote = value;
    }

    /**
     * Obtiene el valor de la propiedad manzana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANZANA() {
        return manzana;
    }

    /**
     * Define el valor de la propiedad manzana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANZANA(String value) {
        this.manzana = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreyapellidocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREYAPELLIDOCLIENTE() {
        return nombreyapellidocliente;
    }

    /**
     * Define el valor de la propiedad nombreyapellidocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREYAPELLIDOCLIENTE(String value) {
        this.nombreyapellidocliente = value;
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
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPISO() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPISO(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad rutadelectura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUTADELECTURA() {
        return rutadelectura;
    }

    /**
     * Define el valor de la propiedad rutadelectura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUTADELECTURA(String value) {
        this.rutadelectura = value;
    }

    /**
     * Obtiene el valor de la propiedad subclase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBCLASE() {
        return subclase;
    }

    /**
     * Define el valor de la propiedad subclase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBCLASE(String value) {
        this.subclase = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUCURSAL() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUCURSAL(String value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifaexistente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARIFAEXISTENTE() {
        return tarifaexistente;
    }

    /**
     * Define el valor de la propiedad tarifaexistente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARIFAEXISTENTE(String value) {
        this.tarifaexistente = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonocontacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONOCONTACTO() {
        return telefonocontacto;
    }

    /**
     * Define el valor de la propiedad telefonocontacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONOCONTACTO(String value) {
        this.telefonocontacto = value;
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
     * Obtiene el valor de la propiedad tipoagrupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOAGRUPACION() {
        return tipoagrupacion;
    }

    /**
     * Define el valor de la propiedad tipoagrupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOAGRUPACION(String value) {
        this.tipoagrupacion = value;
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

    /**
     * Obtiene el valor de la propiedad estadoconexion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADOCONEXION() {
        return estadoconexion;
    }

    /**
     * Define el valor de la propiedad estadoconexion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADOCONEXION(String value) {
        this.estadoconexion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRESOLICITANTE() {
        return nombresolicitante;
    }

    /**
     * Define el valor de la propiedad nombresolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRESOLICITANTE(String value) {
        this.nombresolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonosolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONOSOLICITANTE() {
        return telefonosolicitante;
    }

    /**
     * Define el valor de la propiedad telefonosolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONOSOLICITANTE(String value) {
        this.telefonosolicitante = value;
    }

}
