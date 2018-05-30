
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GestionPerdidasNormalizaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GestionPerdidasNormalizaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ALIMENTADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="ANORMALIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="AREA_EMISORA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ARRAY_DE_TAREAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfTareas" minOccurs="0"/&gt;
 *         &lt;element name="CAJA_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CANTIDAD_MEDIDORES" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_CONTRATADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DEL_TRANSFORMADOR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DE_PROTECCION_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CENTRO_DE_COSTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CENTRO_DE_DISTRIBUCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CICLO_NG" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLASSE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CONDUCTOR_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CONTRATISTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CORREO_EMAIL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTRATO_SOCIO_ECONOMICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FONO_PERSONA_COORDINACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LISTADO_NG" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfNg" minOccurs="0"/&gt;
 *         &lt;element name="LISTA_ANORMALIDADES" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfAnormalidades" minOccurs="0"/&gt;
 *         &lt;element name="LLAVE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MEDIDA_TECNICA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NIVEL_DE_TENSION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_PERSONA_COORDINACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NO_DE_ACTA_DE_INTERVENCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_CAIXA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_PROCESO_MASIVO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_TAMPA_CAIXA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="PROCEDENCIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PROPIEDAD_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PUNTO_FISICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="RELACION_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="REQUIERE_RADICADO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SET" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="TAREA_DECISORIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_ACOMETIDA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_ANOMALIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOf_alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CAJA_MEDICION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CAJA_TOMA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_SELECAO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DO_SERVICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_MEDIDA_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_PROTECCION_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_SOLICITUD_NORMALIZACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TOI1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMADORS_CORRIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfTransformador" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMADORS_TENSION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfTransformador" minOccurs="0"/&gt;
 *         &lt;element name="UBICACION_DE_LA_MEDIDA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VOLTAJE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
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
@XmlType(name = "GestionPerdidasNormalizaciones", propOrder = {

})
public class GestionPerdidasNormalizaciones {

    @XmlElement(name = "ALIMENTADOR")
    protected String alimentador;
    @XmlElement(name = "ANORMALIDAD")
    protected String anormalidad;
    @XmlElement(name = "AREA_EMISORA")
    protected String areaemisora;
    @XmlElement(name = "ARRAY_DE_TAREAS")
    protected ArrayOfTareas arraydetareas;
    @XmlElement(name = "CAJA_EMPALME")
    protected String cajaempalme;
    @XmlElement(name = "CANTIDAD_MEDIDORES")
    protected Long cantidadmedidores;
    @XmlElement(name = "CAPACIDAD_CONTRATADA")
    protected String capacidadcontratada;
    @XmlElement(name = "CAPACIDAD_DEL_TRANSFORMADOR")
    protected Double capacidaddeltransformador;
    @XmlElement(name = "CAPACIDAD_DE_PROTECCION_DEL_EMPALME")
    protected String capacidaddeprotecciondelempalme;
    @XmlElement(name = "CAPACIDAD_EMPALME")
    protected String capacidadempalme;
    @XmlElement(name = "CENTRO_DE_COSTO")
    protected String centrodecosto;
    @XmlElement(name = "CENTRO_DE_DISTRIBUCION")
    protected String centrodedistribucion;
    @XmlElement(name = "CICLO_NG")
    protected String ciclong;
    @XmlElement(name = "CLASSE")
    protected String classe;
    @XmlElement(name = "CONDUCTOR_EMPALME")
    protected String conductorempalme;
    @XmlElement(name = "CONTRATISTA")
    protected String contratista;
    @XmlElement(name = "CORREO_EMAIL")
    protected String correoemail;
    @XmlElement(name = "CUENTA")
    protected Long cuenta;
    @XmlElement(name = "ESTADO_CLIENTE")
    protected String estadocliente;
    @XmlElement(name = "ESTADO_CONEXION")
    protected String estadoconexion;
    @XmlElement(name = "ESTRATO_SOCIO_ECONOMICO")
    protected String estratosocioeconomico;
    @XmlElement(name = "FASE")
    protected String fase;
    @XmlElement(name = "FONO_PERSONA_COORDINACION")
    protected String fonopersonacoordinacion;
    @XmlElement(name = "LISTADO_NG")
    protected ArrayOfNg listadong;
    @XmlElement(name = "LISTA_ANORMALIDADES")
    protected ArrayOfAnormalidades listaanormalidades;
    @XmlElement(name = "LLAVE")
    protected String llave;
    @XmlElement(name = "MEDIDA_TECNICA")
    protected String medidatecnica;
    @XmlElement(name = "NIVEL_DE_TENSION")
    protected String niveldetension;
    @XmlElement(name = "NOMBRE_PERSONA_COORDINACION")
    protected String nombrepersonacoordinacion;
    @XmlElement(name = "NO_DE_ACTA_DE_INTERVENCION")
    protected String nodeactadeintervencion;
    @XmlElement(name = "NUMERO_CAIXA")
    protected String numerocaixa;
    @XmlElement(name = "NUMERO_PROCESO_MASIVO")
    protected Long numeroprocesomasivo;
    @XmlElement(name = "NUMERO_TAMPA_CAIXA")
    protected String numerotampacaixa;
    @XmlElement(name = "PROCEDENCIA")
    protected String procedencia;
    @XmlElement(name = "PRODUCTO")
    protected String producto;
    @XmlElement(name = "PROPIEDAD_TRANSFORMADOR")
    protected String propiedadtransformador;
    @XmlElement(name = "PUNTO_FISICO")
    protected String puntofisico;
    @XmlElement(name = "RELACION_TRANSFORMADOR")
    protected String relaciontransformador;
    @XmlElement(name = "REQUIERE_RADICADO")
    protected String requiereradicado;
    @XmlElement(name = "SET")
    protected String set;
    @XmlElement(name = "TAREA_DECISORIA")
    protected String tareadecisoria;
    @XmlElement(name = "TIPO_ACOMETIDA")
    protected String tipoacometida;
    @XmlElement(name = "TIPO_ANOMALIA")
    protected ArrayOfAlfanumerico50 tipoanomalia;
    @XmlElement(name = "TIPO_DE_CAJA_MEDICION")
    protected String tipodecajamedicion;
    @XmlElement(name = "TIPO_DE_CAJA_TOMA")
    protected String tipodecajatoma;
    @XmlElement(name = "TIPO_DE_CONEXION")
    protected String tipodeconexion;
    @XmlElement(name = "TIPO_DE_EMPALME")
    protected String tipodeempalme;
    @XmlElement(name = "TIPO_DE_SELECAO")
    protected String tipodeselecao;
    @XmlElement(name = "TIPO_DO_SERVICO")
    protected String tipodoservico;
    @XmlElement(name = "TIPO_MEDIDA_CONEXION")
    protected String tipomedidaconexion;
    @XmlElement(name = "TIPO_PROTECCION_DEL_EMPALME")
    protected String tipoprotecciondelempalme;
    @XmlElement(name = "TIPO_SOLICITUD_NORMALIZACION")
    protected String tiposolicitudnormalizacion;
    @XmlElement(name = "TOI1")
    protected Long toi1;
    @XmlElement(name = "TRANSFORMADOR")
    protected String transformador;
    @XmlElement(name = "TRANSFORMADORS_CORRIENTE")
    protected ArrayOfTransformador transformadorscorriente;
    @XmlElement(name = "TRANSFORMADORS_TENSION")
    protected ArrayOfTransformador transformadorstension;
    @XmlElement(name = "UBICACION_DE_LA_MEDIDA")
    protected String ubicaciondelamedida;
    @XmlElement(name = "VOLTAJE")
    protected String voltaje;
    @XmlElement(name = "XML_EXTENSION_PARAMS")
    protected String xmlextensionparams;

    /**
     * Obtiene el valor de la propiedad alimentador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALIMENTADOR() {
        return alimentador;
    }

    /**
     * Define el valor de la propiedad alimentador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALIMENTADOR(String value) {
        this.alimentador = value;
    }

    /**
     * Obtiene el valor de la propiedad anormalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANORMALIDAD() {
        return anormalidad;
    }

    /**
     * Define el valor de la propiedad anormalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANORMALIDAD(String value) {
        this.anormalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad areaemisora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREAEMISORA() {
        return areaemisora;
    }

    /**
     * Define el valor de la propiedad areaemisora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREAEMISORA(String value) {
        this.areaemisora = value;
    }

    /**
     * Obtiene el valor de la propiedad arraydetareas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTareas }
     *     
     */
    public ArrayOfTareas getARRAYDETAREAS() {
        return arraydetareas;
    }

    /**
     * Define el valor de la propiedad arraydetareas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTareas }
     *     
     */
    public void setARRAYDETAREAS(ArrayOfTareas value) {
        this.arraydetareas = value;
    }

    /**
     * Obtiene el valor de la propiedad cajaempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAJAEMPALME() {
        return cajaempalme;
    }

    /**
     * Define el valor de la propiedad cajaempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAJAEMPALME(String value) {
        this.cajaempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadmedidores.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCANTIDADMEDIDORES() {
        return cantidadmedidores;
    }

    /**
     * Define el valor de la propiedad cantidadmedidores.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCANTIDADMEDIDORES(Long value) {
        this.cantidadmedidores = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidadcontratada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACIDADCONTRATADA() {
        return capacidadcontratada;
    }

    /**
     * Define el valor de la propiedad capacidadcontratada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACIDADCONTRATADA(String value) {
        this.capacidadcontratada = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidaddeltransformador.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCAPACIDADDELTRANSFORMADOR() {
        return capacidaddeltransformador;
    }

    /**
     * Define el valor de la propiedad capacidaddeltransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCAPACIDADDELTRANSFORMADOR(Double value) {
        this.capacidaddeltransformador = value;
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
     * Obtiene el valor de la propiedad capacidadempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACIDADEMPALME() {
        return capacidadempalme;
    }

    /**
     * Define el valor de la propiedad capacidadempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACIDADEMPALME(String value) {
        this.capacidadempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad centrodecosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTRODECOSTO() {
        return centrodecosto;
    }

    /**
     * Define el valor de la propiedad centrodecosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTRODECOSTO(String value) {
        this.centrodecosto = value;
    }

    /**
     * Obtiene el valor de la propiedad centrodedistribucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTRODEDISTRIBUCION() {
        return centrodedistribucion;
    }

    /**
     * Define el valor de la propiedad centrodedistribucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTRODEDISTRIBUCION(String value) {
        this.centrodedistribucion = value;
    }

    /**
     * Obtiene el valor de la propiedad ciclong.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCICLONG() {
        return ciclong;
    }

    /**
     * Define el valor de la propiedad ciclong.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCICLONG(String value) {
        this.ciclong = value;
    }

    /**
     * Obtiene el valor de la propiedad classe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSE() {
        return classe;
    }

    /**
     * Define el valor de la propiedad classe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSE(String value) {
        this.classe = value;
    }

    /**
     * Obtiene el valor de la propiedad conductorempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDUCTOREMPALME() {
        return conductorempalme;
    }

    /**
     * Define el valor de la propiedad conductorempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDUCTOREMPALME(String value) {
        this.conductorempalme = value;
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
     * Obtiene el valor de la propiedad correoemail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORREOEMAIL() {
        return correoemail;
    }

    /**
     * Define el valor de la propiedad correoemail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORREOEMAIL(String value) {
        this.correoemail = value;
    }

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCUENTA() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCUENTA(Long value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad estadocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADOCLIENTE() {
        return estadocliente;
    }

    /**
     * Define el valor de la propiedad estadocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADOCLIENTE(String value) {
        this.estadocliente = value;
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
     * Obtiene el valor de la propiedad fonopersonacoordinacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFONOPERSONACOORDINACION() {
        return fonopersonacoordinacion;
    }

    /**
     * Define el valor de la propiedad fonopersonacoordinacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFONOPERSONACOORDINACION(String value) {
        this.fonopersonacoordinacion = value;
    }

    /**
     * Obtiene el valor de la propiedad listadong.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNg }
     *     
     */
    public ArrayOfNg getLISTADONG() {
        return listadong;
    }

    /**
     * Define el valor de la propiedad listadong.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNg }
     *     
     */
    public void setLISTADONG(ArrayOfNg value) {
        this.listadong = value;
    }

    /**
     * Obtiene el valor de la propiedad listaanormalidades.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnormalidades }
     *     
     */
    public ArrayOfAnormalidades getLISTAANORMALIDADES() {
        return listaanormalidades;
    }

    /**
     * Define el valor de la propiedad listaanormalidades.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnormalidades }
     *     
     */
    public void setLISTAANORMALIDADES(ArrayOfAnormalidades value) {
        this.listaanormalidades = value;
    }

    /**
     * Obtiene el valor de la propiedad llave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLLAVE() {
        return llave;
    }

    /**
     * Define el valor de la propiedad llave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLLAVE(String value) {
        this.llave = value;
    }

    /**
     * Obtiene el valor de la propiedad medidatecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIDATECNICA() {
        return medidatecnica;
    }

    /**
     * Define el valor de la propiedad medidatecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIDATECNICA(String value) {
        this.medidatecnica = value;
    }

    /**
     * Obtiene el valor de la propiedad niveldetension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIVELDETENSION() {
        return niveldetension;
    }

    /**
     * Define el valor de la propiedad niveldetension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIVELDETENSION(String value) {
        this.niveldetension = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrepersonacoordinacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREPERSONACOORDINACION() {
        return nombrepersonacoordinacion;
    }

    /**
     * Define el valor de la propiedad nombrepersonacoordinacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREPERSONACOORDINACION(String value) {
        this.nombrepersonacoordinacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nodeactadeintervencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNODEACTADEINTERVENCION() {
        return nodeactadeintervencion;
    }

    /**
     * Define el valor de la propiedad nodeactadeintervencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNODEACTADEINTERVENCION(String value) {
        this.nodeactadeintervencion = value;
    }

    /**
     * Obtiene el valor de la propiedad numerocaixa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCAIXA() {
        return numerocaixa;
    }

    /**
     * Define el valor de la propiedad numerocaixa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCAIXA(String value) {
        this.numerocaixa = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroprocesomasivo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNUMEROPROCESOMASIVO() {
        return numeroprocesomasivo;
    }

    /**
     * Define el valor de la propiedad numeroprocesomasivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNUMEROPROCESOMASIVO(Long value) {
        this.numeroprocesomasivo = value;
    }

    /**
     * Obtiene el valor de la propiedad numerotampacaixa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROTAMPACAIXA() {
        return numerotampacaixa;
    }

    /**
     * Define el valor de la propiedad numerotampacaixa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROTAMPACAIXA(String value) {
        this.numerotampacaixa = value;
    }

    /**
     * Obtiene el valor de la propiedad procedencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCEDENCIA() {
        return procedencia;
    }

    /**
     * Define el valor de la propiedad procedencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCEDENCIA(String value) {
        this.procedencia = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTO() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTO(String value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad propiedadtransformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPIEDADTRANSFORMADOR() {
        return propiedadtransformador;
    }

    /**
     * Define el valor de la propiedad propiedadtransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPIEDADTRANSFORMADOR(String value) {
        this.propiedadtransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad puntofisico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUNTOFISICO() {
        return puntofisico;
    }

    /**
     * Define el valor de la propiedad puntofisico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUNTOFISICO(String value) {
        this.puntofisico = value;
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

    /**
     * Obtiene el valor de la propiedad requiereradicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUIERERADICADO() {
        return requiereradicado;
    }

    /**
     * Define el valor de la propiedad requiereradicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUIERERADICADO(String value) {
        this.requiereradicado = value;
    }

    /**
     * Obtiene el valor de la propiedad set.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSET() {
        return set;
    }

    /**
     * Define el valor de la propiedad set.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSET(String value) {
        this.set = value;
    }

    /**
     * Obtiene el valor de la propiedad tareadecisoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAREADECISORIA() {
        return tareadecisoria;
    }

    /**
     * Define el valor de la propiedad tareadecisoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAREADECISORIA(String value) {
        this.tareadecisoria = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoacometida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOACOMETIDA() {
        return tipoacometida;
    }

    /**
     * Define el valor de la propiedad tipoacometida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOACOMETIDA(String value) {
        this.tipoacometida = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoanomalia.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlfanumerico50 }
     *     
     */
    public ArrayOfAlfanumerico50 getTIPOANOMALIA() {
        return tipoanomalia;
    }

    /**
     * Define el valor de la propiedad tipoanomalia.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlfanumerico50 }
     *     
     */
    public void setTIPOANOMALIA(ArrayOfAlfanumerico50 value) {
        this.tipoanomalia = value;
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
     * Obtiene el valor de la propiedad tipodeempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEEMPALME() {
        return tipodeempalme;
    }

    /**
     * Define el valor de la propiedad tipodeempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEEMPALME(String value) {
        this.tipodeempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeselecao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODESELECAO() {
        return tipodeselecao;
    }

    /**
     * Define el valor de la propiedad tipodeselecao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODESELECAO(String value) {
        this.tipodeselecao = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodoservico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODOSERVICO() {
        return tipodoservico;
    }

    /**
     * Define el valor de la propiedad tipodoservico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODOSERVICO(String value) {
        this.tipodoservico = value;
    }

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
     * Obtiene el valor de la propiedad tipoprotecciondelempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPROTECCIONDELEMPALME() {
        return tipoprotecciondelempalme;
    }

    /**
     * Define el valor de la propiedad tipoprotecciondelempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPROTECCIONDELEMPALME(String value) {
        this.tipoprotecciondelempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad tiposolicitudnormalizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOSOLICITUDNORMALIZACION() {
        return tiposolicitudnormalizacion;
    }

    /**
     * Define el valor de la propiedad tiposolicitudnormalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOSOLICITUDNORMALIZACION(String value) {
        this.tiposolicitudnormalizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad toi1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTOI1() {
        return toi1;
    }

    /**
     * Define el valor de la propiedad toi1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTOI1(Long value) {
        this.toi1 = value;
    }

    /**
     * Obtiene el valor de la propiedad transformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFORMADOR() {
        return transformador;
    }

    /**
     * Define el valor de la propiedad transformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFORMADOR(String value) {
        this.transformador = value;
    }

    /**
     * Obtiene el valor de la propiedad transformadorscorriente.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public ArrayOfTransformador getTRANSFORMADORSCORRIENTE() {
        return transformadorscorriente;
    }

    /**
     * Define el valor de la propiedad transformadorscorriente.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public void setTRANSFORMADORSCORRIENTE(ArrayOfTransformador value) {
        this.transformadorscorriente = value;
    }

    /**
     * Obtiene el valor de la propiedad transformadorstension.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public ArrayOfTransformador getTRANSFORMADORSTENSION() {
        return transformadorstension;
    }

    /**
     * Define el valor de la propiedad transformadorstension.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public void setTRANSFORMADORSTENSION(ArrayOfTransformador value) {
        this.transformadorstension = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicaciondelamedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBICACIONDELAMEDIDA() {
        return ubicaciondelamedida;
    }

    /**
     * Define el valor de la propiedad ubicaciondelamedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBICACIONDELAMEDIDA(String value) {
        this.ubicaciondelamedida = value;
    }

    /**
     * Obtiene el valor de la propiedad voltaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLTAJE() {
        return voltaje;
    }

    /**
     * Define el valor de la propiedad voltaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLTAJE(String value) {
        this.voltaje = value;
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
