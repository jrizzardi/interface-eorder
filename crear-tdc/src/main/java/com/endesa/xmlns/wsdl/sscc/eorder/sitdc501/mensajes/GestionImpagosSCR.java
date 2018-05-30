
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para GestionImpagosSCR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GestionImpagosSCR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="BLUETOOTH" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DE_PROTECCION_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLAVE_DE_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLIENTE_VITAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_COLOR_CAJA_TEXTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_DE_BARRAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_PLAN_DE_TERRENO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_ZONA_PELIGROSA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CONTRATISTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DEUDAS_ALTAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DEUDA_CORTE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="EM_TUS_MANOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_GENERACION" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FLAG_TIENE_CONVENIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ID_DISPLAY_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LECTURA_DISPLAY_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LISTADO_FACTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}Arrayoffactura" minOccurs="0"/&gt;
 *         &lt;element name="MARCA_DISPLAY_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MODELO_DISPLAY_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MOTIVO_DEL_CORTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MOTIVO_DE_LA_RECONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DISPLAY_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_TRANSFORMADOR_DISTRIBUCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PROCESO_DE_CORTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PUNTO_DE_CORTE_Y_RECO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="RADIOFRECUENCIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="RANKING" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="REFACTURACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="REPROGRAMADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SECTOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SEGMENTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SUBTIPO_DE_CORTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SUBTIPO_DE_ORDEN" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DEUDA_CORTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CAJA_MEDICION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CAJA_TOMA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CORTE_Y_RECO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_ORDEN" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_RECO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_TENSION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_ZONA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ULTIMA_ACCION_EFECTIVA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_PRODUCTO_EN_TUS_MANOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_RECONEXION" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
@XmlType(name = "GestionImpagosSCR", propOrder = {

})
public class GestionImpagosSCR {

    @XmlElement(name = "BLUETOOTH")
    protected String bluetooth;
    @XmlElement(name = "CAPACIDAD_DE_PROTECCION_DEL_EMPALME")
    protected String capacidaddeprotecciondelempalme;
    @XmlElement(name = "CLAVE_DE_LECTURA")
    protected String clavedelectura;
    @XmlElement(name = "CLIENTE_VITAL")
    protected String clientevital;
    @XmlElement(name = "CODIGO_COLOR_CAJA_TEXTO")
    protected String codigocolorcajatexto;
    @XmlElement(name = "CODIGO_DE_BARRAS")
    protected String codigodebarras;
    @XmlElement(name = "CODIGO_PLAN_DE_TERRENO")
    protected String codigoplandeterreno;
    @XmlElement(name = "CODIGO_ZONA_PELIGROSA")
    protected String codigozonapeligrosa;
    @XmlElement(name = "CONTRATISTA")
    protected String contratista;
    @XmlElement(name = "DEUDAS_ALTAS")
    protected String deudasaltas;
    @XmlElement(name = "DEUDA_CORTE")
    protected Double deudacorte;
    @XmlElement(name = "EM_TUS_MANOS")
    protected String emtusmanos;
    @XmlElement(name = "ESTADO_CONEXION")
    protected String estadoconexion;
    @XmlElement(name = "FASE")
    protected String fase;
    @XmlElement(name = "FECHA_GENERACION")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechageneracion;
    @XmlElement(name = "FLAG_TIENE_CONVENIO")
    protected String flagtieneconvenio;
    @XmlElement(name = "ID_DISPLAY_MEDIDOR")
    protected String iddisplaymedidor;
    @XmlElement(name = "LECTURA_DISPLAY_MEDIDOR")
    protected String lecturadisplaymedidor;
    @XmlElement(name = "LISTADO_FACTURA")
    protected Arrayoffactura listadofactura;
    @XmlElement(name = "MARCA_DISPLAY_MEDIDOR")
    protected String marcadisplaymedidor;
    @XmlElement(name = "MODELO_DISPLAY_MEDIDOR")
    protected String modelodisplaymedidor;
    @XmlElement(name = "MOTIVO_DEL_CORTE")
    protected String motivodelcorte;
    @XmlElement(name = "MOTIVO_DE_LA_RECONEXION")
    protected String motivodelareconexion;
    @XmlElement(name = "NUMERO_DISPLAY_MEDIDOR")
    protected String numerodisplaymedidor;
    @XmlElement(name = "NUMERO_TRANSFORMADOR_DISTRIBUCION")
    protected String numerotransformadordistribucion;
    @XmlElement(name = "PROCESO_DE_CORTE")
    protected String procesodecorte;
    @XmlElement(name = "PUNTO_DE_CORTE_Y_RECO")
    protected String puntodecorteyreco;
    @XmlElement(name = "RADIOFRECUENCIA")
    protected String radiofrecuencia;
    @XmlElement(name = "RANKING")
    protected Long ranking;
    @XmlElement(name = "REFACTURACION")
    protected String refacturacion;
    @XmlElement(name = "REPROGRAMADA")
    protected String reprogramada;
    @XmlElement(name = "SECTOR")
    protected String sector;
    @XmlElement(name = "SEGMENTO")
    protected String segmento;
    @XmlElement(name = "SUBTIPO_DE_CORTE")
    protected String subtipodecorte;
    @XmlElement(name = "SUBTIPO_DE_ORDEN")
    protected String subtipodeorden;
    @XmlElement(name = "TIPO_DEUDA_CORTE")
    protected String tipodeudacorte;
    @XmlElement(name = "TIPO_DE_CAJA_MEDICION")
    protected String tipodecajamedicion;
    @XmlElement(name = "TIPO_DE_CAJA_TOMA")
    protected String tipodecajatoma;
    @XmlElement(name = "TIPO_DE_CONEXION")
    protected String tipodeconexion;
    @XmlElement(name = "TIPO_DE_CORTE_Y_RECO")
    protected String tipodecorteyreco;
    @XmlElement(name = "TIPO_DE_ORDEN")
    protected String tipodeorden;
    @XmlElement(name = "TIPO_DE_RECO")
    protected String tipodereco;
    @XmlElement(name = "TIPO_TENSION")
    protected String tipotension;
    @XmlElement(name = "TIPO_ZONA")
    protected String tipozona;
    @XmlElement(name = "ULTIMA_ACCION_EFECTIVA")
    protected String ultimaaccionefectiva;
    @XmlElement(name = "VALOR_PRODUCTO_EN_TUS_MANOS")
    protected String valorproductoentusmanos;
    @XmlElement(name = "VALOR_RECONEXION")
    protected Double valorreconexion;
    @XmlElement(name = "XML_EXTENSION_PARAMS")
    protected String xmlextensionparams;

    /**
     * Obtiene el valor de la propiedad bluetooth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLUETOOTH() {
        return bluetooth;
    }

    /**
     * Define el valor de la propiedad bluetooth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLUETOOTH(String value) {
        this.bluetooth = value;
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
     * Obtiene el valor de la propiedad clientevital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIENTEVITAL() {
        return clientevital;
    }

    /**
     * Define el valor de la propiedad clientevital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIENTEVITAL(String value) {
        this.clientevital = value;
    }

    /**
     * Obtiene el valor de la propiedad codigocolorcajatexto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOCOLORCAJATEXTO() {
        return codigocolorcajatexto;
    }

    /**
     * Define el valor de la propiedad codigocolorcajatexto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOCOLORCAJATEXTO(String value) {
        this.codigocolorcajatexto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigodebarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODEBARRAS() {
        return codigodebarras;
    }

    /**
     * Define el valor de la propiedad codigodebarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODEBARRAS(String value) {
        this.codigodebarras = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoplandeterreno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOPLANDETERRENO() {
        return codigoplandeterreno;
    }

    /**
     * Define el valor de la propiedad codigoplandeterreno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOPLANDETERRENO(String value) {
        this.codigoplandeterreno = value;
    }

    /**
     * Obtiene el valor de la propiedad codigozonapeligrosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOZONAPELIGROSA() {
        return codigozonapeligrosa;
    }

    /**
     * Define el valor de la propiedad codigozonapeligrosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOZONAPELIGROSA(String value) {
        this.codigozonapeligrosa = value;
    }

    /**
     * Obtiene el valor de la propiedad contratista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRATISTA() {
        return contratista;
    }

    /**
     * Define el valor de la propiedad contratista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRATISTA(String value) {
        this.contratista = value;
    }

    /**
     * Obtiene el valor de la propiedad deudasaltas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEUDASALTAS() {
        return deudasaltas;
    }

    /**
     * Define el valor de la propiedad deudasaltas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEUDASALTAS(String value) {
        this.deudasaltas = value;
    }

    /**
     * Obtiene el valor de la propiedad deudacorte.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDEUDACORTE() {
        return deudacorte;
    }

    /**
     * Define el valor de la propiedad deudacorte.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDEUDACORTE(Double value) {
        this.deudacorte = value;
    }

    /**
     * Obtiene el valor de la propiedad emtusmanos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMTUSMANOS() {
        return emtusmanos;
    }

    /**
     * Define el valor de la propiedad emtusmanos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMTUSMANOS(String value) {
        this.emtusmanos = value;
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
     * Obtiene el valor de la propiedad fechageneracion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAGENERACION() {
        return fechageneracion;
    }

    /**
     * Define el valor de la propiedad fechageneracion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAGENERACION(XMLGregorianCalendar value) {
        this.fechageneracion = value;
    }

    /**
     * Obtiene el valor de la propiedad flagtieneconvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGTIENECONVENIO() {
        return flagtieneconvenio;
    }

    /**
     * Define el valor de la propiedad flagtieneconvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGTIENECONVENIO(String value) {
        this.flagtieneconvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad iddisplaymedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDISPLAYMEDIDOR() {
        return iddisplaymedidor;
    }

    /**
     * Define el valor de la propiedad iddisplaymedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDISPLAYMEDIDOR(String value) {
        this.iddisplaymedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad lecturadisplaymedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLECTURADISPLAYMEDIDOR() {
        return lecturadisplaymedidor;
    }

    /**
     * Define el valor de la propiedad lecturadisplaymedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLECTURADISPLAYMEDIDOR(String value) {
        this.lecturadisplaymedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad listadofactura.
     * 
     * @return
     *     possible object is
     *     {@link Arrayoffactura }
     *     
     */
    public Arrayoffactura getLISTADOFACTURA() {
        return listadofactura;
    }

    /**
     * Define el valor de la propiedad listadofactura.
     * 
     * @param value
     *     allowed object is
     *     {@link Arrayoffactura }
     *     
     */
    public void setLISTADOFACTURA(Arrayoffactura value) {
        this.listadofactura = value;
    }

    /**
     * Obtiene el valor de la propiedad marcadisplaymedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARCADISPLAYMEDIDOR() {
        return marcadisplaymedidor;
    }

    /**
     * Define el valor de la propiedad marcadisplaymedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARCADISPLAYMEDIDOR(String value) {
        this.marcadisplaymedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad modelodisplaymedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODELODISPLAYMEDIDOR() {
        return modelodisplaymedidor;
    }

    /**
     * Define el valor de la propiedad modelodisplaymedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODELODISPLAYMEDIDOR(String value) {
        this.modelodisplaymedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad motivodelcorte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVODELCORTE() {
        return motivodelcorte;
    }

    /**
     * Define el valor de la propiedad motivodelcorte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVODELCORTE(String value) {
        this.motivodelcorte = value;
    }

    /**
     * Obtiene el valor de la propiedad motivodelareconexion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVODELARECONEXION() {
        return motivodelareconexion;
    }

    /**
     * Define el valor de la propiedad motivodelareconexion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVODELARECONEXION(String value) {
        this.motivodelareconexion = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodisplaymedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODISPLAYMEDIDOR() {
        return numerodisplaymedidor;
    }

    /**
     * Define el valor de la propiedad numerodisplaymedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODISPLAYMEDIDOR(String value) {
        this.numerodisplaymedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad numerotransformadordistribucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROTRANSFORMADORDISTRIBUCION() {
        return numerotransformadordistribucion;
    }

    /**
     * Define el valor de la propiedad numerotransformadordistribucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROTRANSFORMADORDISTRIBUCION(String value) {
        this.numerotransformadordistribucion = value;
    }

    /**
     * Obtiene el valor de la propiedad procesodecorte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESODECORTE() {
        return procesodecorte;
    }

    /**
     * Define el valor de la propiedad procesodecorte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESODECORTE(String value) {
        this.procesodecorte = value;
    }

    /**
     * Obtiene el valor de la propiedad puntodecorteyreco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUNTODECORTEYRECO() {
        return puntodecorteyreco;
    }

    /**
     * Define el valor de la propiedad puntodecorteyreco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUNTODECORTEYRECO(String value) {
        this.puntodecorteyreco = value;
    }

    /**
     * Obtiene el valor de la propiedad radiofrecuencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRADIOFRECUENCIA() {
        return radiofrecuencia;
    }

    /**
     * Define el valor de la propiedad radiofrecuencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRADIOFRECUENCIA(String value) {
        this.radiofrecuencia = value;
    }

    /**
     * Obtiene el valor de la propiedad ranking.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRANKING() {
        return ranking;
    }

    /**
     * Define el valor de la propiedad ranking.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRANKING(Long value) {
        this.ranking = value;
    }

    /**
     * Obtiene el valor de la propiedad refacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFACTURACION() {
        return refacturacion;
    }

    /**
     * Define el valor de la propiedad refacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFACTURACION(String value) {
        this.refacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad reprogramada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPROGRAMADA() {
        return reprogramada;
    }

    /**
     * Define el valor de la propiedad reprogramada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPROGRAMADA(String value) {
        this.reprogramada = value;
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
     * Obtiene el valor de la propiedad segmento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTO() {
        return segmento;
    }

    /**
     * Define el valor de la propiedad segmento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTO(String value) {
        this.segmento = value;
    }

    /**
     * Obtiene el valor de la propiedad subtipodecorte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTIPODECORTE() {
        return subtipodecorte;
    }

    /**
     * Define el valor de la propiedad subtipodecorte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTIPODECORTE(String value) {
        this.subtipodecorte = value;
    }

    /**
     * Obtiene el valor de la propiedad subtipodeorden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTIPODEORDEN() {
        return subtipodeorden;
    }

    /**
     * Define el valor de la propiedad subtipodeorden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTIPODEORDEN(String value) {
        this.subtipodeorden = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeudacorte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEUDACORTE() {
        return tipodeudacorte;
    }

    /**
     * Define el valor de la propiedad tipodeudacorte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEUDACORTE(String value) {
        this.tipodeudacorte = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodecajamedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODECAJAMEDICION() {
        return tipodecajamedicion;
    }

    /**
     * Define el valor de la propiedad tipodecajamedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODECAJAMEDICION(String value) {
        this.tipodecajamedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodecajatoma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODECAJATOMA() {
        return tipodecajatoma;
    }

    /**
     * Define el valor de la propiedad tipodecajatoma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODECAJATOMA(String value) {
        this.tipodecajatoma = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeconexion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODECONEXION() {
        return tipodeconexion;
    }

    /**
     * Define el valor de la propiedad tipodeconexion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODECONEXION(String value) {
        this.tipodeconexion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodecorteyreco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODECORTEYRECO() {
        return tipodecorteyreco;
    }

    /**
     * Define el valor de la propiedad tipodecorteyreco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODECORTEYRECO(String value) {
        this.tipodecorteyreco = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeorden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEORDEN() {
        return tipodeorden;
    }

    /**
     * Define el valor de la propiedad tipodeorden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEORDEN(String value) {
        this.tipodeorden = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODERECO() {
        return tipodereco;
    }

    /**
     * Define el valor de la propiedad tipodereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODERECO(String value) {
        this.tipodereco = value;
    }

    /**
     * Obtiene el valor de la propiedad tipotension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOTENSION() {
        return tipotension;
    }

    /**
     * Define el valor de la propiedad tipotension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOTENSION(String value) {
        this.tipotension = value;
    }

    /**
     * Obtiene el valor de la propiedad tipozona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOZONA() {
        return tipozona;
    }

    /**
     * Define el valor de la propiedad tipozona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOZONA(String value) {
        this.tipozona = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimaaccionefectiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTIMAACCIONEFECTIVA() {
        return ultimaaccionefectiva;
    }

    /**
     * Define el valor de la propiedad ultimaaccionefectiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTIMAACCIONEFECTIVA(String value) {
        this.ultimaaccionefectiva = value;
    }

    /**
     * Obtiene el valor de la propiedad valorproductoentusmanos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORPRODUCTOENTUSMANOS() {
        return valorproductoentusmanos;
    }

    /**
     * Define el valor de la propiedad valorproductoentusmanos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORPRODUCTOENTUSMANOS(String value) {
        this.valorproductoentusmanos = value;
    }

    /**
     * Obtiene el valor de la propiedad valorreconexion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORRECONEXION() {
        return valorreconexion;
    }

    /**
     * Define el valor de la propiedad valorreconexion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORRECONEXION(Double value) {
        this.valorreconexion = value;
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
