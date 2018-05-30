
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DatosComunesProcesosTDC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosComunesProcesosTDC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ANEXOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfAnexo" minOccurs="0"/&gt;
 *         &lt;element name="CENTRO_OPERATIVO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_CITA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_DEL_AVISO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_ORDEN_PADRE" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CONSUMOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfConsumo" minOccurs="0"/&gt;
 *         &lt;element name="EMPRESA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_DE_VENCIMIENTO_PARA_ANS_CONTRACTISTA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_DE_VENCIMIENTO_PARA_ANS_INTERNO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_DE_VENCIMIENTO_PARA_ANS_LEGAL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_Y_HORA_DE_CREACION_DE_LA_ORDEN" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_Y_HORA_FIN_CITA_CONCERTADA_EN_CAMPO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_Y_HORA_INICIO_CITA_CONCERTADA_EN_CAMPO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MEDIDORS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfMedidor" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_TDC_HOMOLOGADO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_TDC_PRE_HOMOLOGACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_PROTOCOLO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="OBSERVACIONES" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_2000" minOccurs="0"/&gt;
 *         &lt;element name="PARAMETRO_NIVEL_OPERATIVO_3" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="PRIMERA_FECHA_UTIL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SECTOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SELLOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfSello" minOccurs="0"/&gt;
 *         &lt;element name="SUMINSTROS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}Suministro" minOccurs="0"/&gt;
 *         &lt;element name="TIEMPO_DE_REFERENCIA_PARA_ANS_CONTRACTISTA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TIEMPO_DE_REFERENCIA_PARA_ANS_INTERNO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TIEMPO_DE_REFERENCIA_PARA_ANS_LEGAL" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_RED" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_REMESSA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_ANS_CONTRACTISTA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_ANS_INTERNO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_ANS_LEGAL" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_NIVEL_OPERATIVO_3" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ZONA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosComunesProcesosTDC", propOrder = {

})
public class DatosComunesProcesosTDC {

    @XmlElement(name = "ANEXOS")
    protected ArrayOfAnexo anexos;
    @XmlElement(name = "CENTRO_OPERATIVO")
    protected String centrooperativo;
    @XmlElement(name = "CODIGO_CITA")
    protected String codigocita;
    @XmlElement(name = "CODIGO_DEL_AVISO")
    protected Long codigodelaviso;
    @XmlElement(name = "CODIGO_ORDEN_PADRE")
    protected Long codigoordenpadre;
    @XmlElement(name = "CONSUMOS")
    protected ArrayOfConsumo consumos;
    @XmlElement(name = "EMPRESA")
    protected String empresa;
    @XmlElement(name = "FECHA_DE_VENCIMIENTO_PARA_ANS_CONTRACTISTA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechadevencimientoparaanscontractista;
    @XmlElement(name = "FECHA_DE_VENCIMIENTO_PARA_ANS_INTERNO")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechadevencimientoparaansinterno;
    @XmlElement(name = "FECHA_DE_VENCIMIENTO_PARA_ANS_LEGAL")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechadevencimientoparaanslegal;
    @XmlElement(name = "FECHA_Y_HORA_DE_CREACION_DE_LA_ORDEN")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechayhoradecreaciondelaorden;
    @XmlElement(name = "FECHA_Y_HORA_FIN_CITA_CONCERTADA_EN_CAMPO")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechayhorafincitaconcertadaencampo;
    @XmlElement(name = "FECHA_Y_HORA_INICIO_CITA_CONCERTADA_EN_CAMPO")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechayhorainiciocitaconcertadaencampo;
    @XmlElement(name = "MEDIDORS")
    protected ArrayOfMedidor medidors;
    @XmlElement(name = "NOMBRE_TDC_HOMOLOGADO")
    protected String nombretdchomologado;
    @XmlElement(name = "NOMBRE_TDC_PRE_HOMOLOGACION")
    protected String nombretdcprehomologacion;
    @XmlElement(name = "NUMERO_PROTOCOLO")
    protected String numeroprotocolo;
    @XmlElement(name = "OBSERVACIONES")
    protected String observaciones;
    @XmlElement(name = "PARAMETRO_NIVEL_OPERATIVO_3")
    protected String parametroniveloperativo3;
    @XmlElement(name = "PRIMERA_FECHA_UTIL")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar primerafechautil;
    @XmlElement(name = "SECTOR")
    protected String sector;
    @XmlElement(name = "SELLOS")
    protected ArrayOfSello sellos;
    @XmlElement(name = "SUMINSTROS")
    protected Suministro suminstros;
    @XmlElement(name = "TIEMPO_DE_REFERENCIA_PARA_ANS_CONTRACTISTA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tiempodereferenciaparaanscontractista;
    @XmlElement(name = "TIEMPO_DE_REFERENCIA_PARA_ANS_INTERNO")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tiempodereferenciaparaansinterno;
    @XmlElement(name = "TIEMPO_DE_REFERENCIA_PARA_ANS_LEGAL")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tiempodereferenciaparaanslegal;
    @XmlElement(name = "TIPO_DE_RED")
    protected String tipodered;
    @XmlElement(name = "TIPO_REMESSA")
    protected String tiporemessa;
    @XmlElement(name = "VALOR_ANS_CONTRACTISTA")
    protected Long valoranscontractista;
    @XmlElement(name = "VALOR_ANS_INTERNO")
    protected Long valoransinterno;
    @XmlElement(name = "VALOR_ANS_LEGAL")
    protected Long valoranslegal;
    @XmlElement(name = "VALOR_NIVEL_OPERATIVO_3")
    protected String valorniveloperativo3;
    @XmlElement(name = "ZONA")
    protected String zona;

    /**
     * Obtiene el valor de la propiedad anexos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnexo }
     *     
     */
    public ArrayOfAnexo getANEXOS() {
        return anexos;
    }

    /**
     * Define el valor de la propiedad anexos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnexo }
     *     
     */
    public void setANEXOS(ArrayOfAnexo value) {
        this.anexos = value;
    }

    /**
     * Obtiene el valor de la propiedad centrooperativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTROOPERATIVO() {
        return centrooperativo;
    }

    /**
     * Define el valor de la propiedad centrooperativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTROOPERATIVO(String value) {
        this.centrooperativo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigocita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOCITA() {
        return codigocita;
    }

    /**
     * Define el valor de la propiedad codigocita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOCITA(String value) {
        this.codigocita = value;
    }

    /**
     * Obtiene el valor de la propiedad codigodelaviso.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCODIGODELAVISO() {
        return codigodelaviso;
    }

    /**
     * Define el valor de la propiedad codigodelaviso.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCODIGODELAVISO(Long value) {
        this.codigodelaviso = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoordenpadre.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCODIGOORDENPADRE() {
        return codigoordenpadre;
    }

    /**
     * Define el valor de la propiedad codigoordenpadre.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCODIGOORDENPADRE(Long value) {
        this.codigoordenpadre = value;
    }

    /**
     * Obtiene el valor de la propiedad consumos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConsumo }
     *     
     */
    public ArrayOfConsumo getCONSUMOS() {
        return consumos;
    }

    /**
     * Define el valor de la propiedad consumos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConsumo }
     *     
     */
    public void setCONSUMOS(ArrayOfConsumo value) {
        this.consumos = value;
    }

    /**
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPRESA() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPRESA(String value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadevencimientoparaanscontractista.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADEVENCIMIENTOPARAANSCONTRACTISTA() {
        return fechadevencimientoparaanscontractista;
    }

    /**
     * Define el valor de la propiedad fechadevencimientoparaanscontractista.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADEVENCIMIENTOPARAANSCONTRACTISTA(XMLGregorianCalendar value) {
        this.fechadevencimientoparaanscontractista = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadevencimientoparaansinterno.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADEVENCIMIENTOPARAANSINTERNO() {
        return fechadevencimientoparaansinterno;
    }

    /**
     * Define el valor de la propiedad fechadevencimientoparaansinterno.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADEVENCIMIENTOPARAANSINTERNO(XMLGregorianCalendar value) {
        this.fechadevencimientoparaansinterno = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadevencimientoparaanslegal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADEVENCIMIENTOPARAANSLEGAL() {
        return fechadevencimientoparaanslegal;
    }

    /**
     * Define el valor de la propiedad fechadevencimientoparaanslegal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADEVENCIMIENTOPARAANSLEGAL(XMLGregorianCalendar value) {
        this.fechadevencimientoparaanslegal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechayhoradecreaciondelaorden.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAYHORADECREACIONDELAORDEN() {
        return fechayhoradecreaciondelaorden;
    }

    /**
     * Define el valor de la propiedad fechayhoradecreaciondelaorden.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAYHORADECREACIONDELAORDEN(XMLGregorianCalendar value) {
        this.fechayhoradecreaciondelaorden = value;
    }

    /**
     * Obtiene el valor de la propiedad fechayhorafincitaconcertadaencampo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAYHORAFINCITACONCERTADAENCAMPO() {
        return fechayhorafincitaconcertadaencampo;
    }

    /**
     * Define el valor de la propiedad fechayhorafincitaconcertadaencampo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAYHORAFINCITACONCERTADAENCAMPO(XMLGregorianCalendar value) {
        this.fechayhorafincitaconcertadaencampo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechayhorainiciocitaconcertadaencampo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAYHORAINICIOCITACONCERTADAENCAMPO() {
        return fechayhorainiciocitaconcertadaencampo;
    }

    /**
     * Define el valor de la propiedad fechayhorainiciocitaconcertadaencampo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAYHORAINICIOCITACONCERTADAENCAMPO(XMLGregorianCalendar value) {
        this.fechayhorainiciocitaconcertadaencampo = value;
    }

    /**
     * Obtiene el valor de la propiedad medidors.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMedidor }
     *     
     */
    public ArrayOfMedidor getMEDIDORS() {
        return medidors;
    }

    /**
     * Define el valor de la propiedad medidors.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMedidor }
     *     
     */
    public void setMEDIDORS(ArrayOfMedidor value) {
        this.medidors = value;
    }

    /**
     * Obtiene el valor de la propiedad nombretdchomologado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRETDCHOMOLOGADO() {
        return nombretdchomologado;
    }

    /**
     * Define el valor de la propiedad nombretdchomologado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRETDCHOMOLOGADO(String value) {
        this.nombretdchomologado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombretdcprehomologacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRETDCPREHOMOLOGACION() {
        return nombretdcprehomologacion;
    }

    /**
     * Define el valor de la propiedad nombretdcprehomologacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRETDCPREHOMOLOGACION(String value) {
        this.nombretdcprehomologacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroprotocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPROTOCOLO() {
        return numeroprotocolo;
    }

    /**
     * Define el valor de la propiedad numeroprotocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPROTOCOLO(String value) {
        this.numeroprotocolo = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSERVACIONES() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSERVACIONES(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad parametroniveloperativo3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAMETRONIVELOPERATIVO3() {
        return parametroniveloperativo3;
    }

    /**
     * Define el valor de la propiedad parametroniveloperativo3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAMETRONIVELOPERATIVO3(String value) {
        this.parametroniveloperativo3 = value;
    }

    /**
     * Obtiene el valor de la propiedad primerafechautil.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRIMERAFECHAUTIL() {
        return primerafechautil;
    }

    /**
     * Define el valor de la propiedad primerafechautil.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRIMERAFECHAUTIL(XMLGregorianCalendar value) {
        this.primerafechautil = value;
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
     * Obtiene el valor de la propiedad sellos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSello }
     *     
     */
    public ArrayOfSello getSELLOS() {
        return sellos;
    }

    /**
     * Define el valor de la propiedad sellos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSello }
     *     
     */
    public void setSELLOS(ArrayOfSello value) {
        this.sellos = value;
    }

    /**
     * Obtiene el valor de la propiedad suminstros.
     * 
     * @return
     *     possible object is
     *     {@link Suministro }
     *     
     */
    public Suministro getSUMINSTROS() {
        return suminstros;
    }

    /**
     * Define el valor de la propiedad suminstros.
     * 
     * @param value
     *     allowed object is
     *     {@link Suministro }
     *     
     */
    public void setSUMINSTROS(Suministro value) {
        this.suminstros = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempodereferenciaparaanscontractista.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTIEMPODEREFERENCIAPARAANSCONTRACTISTA() {
        return tiempodereferenciaparaanscontractista;
    }

    /**
     * Define el valor de la propiedad tiempodereferenciaparaanscontractista.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTIEMPODEREFERENCIAPARAANSCONTRACTISTA(XMLGregorianCalendar value) {
        this.tiempodereferenciaparaanscontractista = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempodereferenciaparaansinterno.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTIEMPODEREFERENCIAPARAANSINTERNO() {
        return tiempodereferenciaparaansinterno;
    }

    /**
     * Define el valor de la propiedad tiempodereferenciaparaansinterno.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTIEMPODEREFERENCIAPARAANSINTERNO(XMLGregorianCalendar value) {
        this.tiempodereferenciaparaansinterno = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempodereferenciaparaanslegal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTIEMPODEREFERENCIAPARAANSLEGAL() {
        return tiempodereferenciaparaanslegal;
    }

    /**
     * Define el valor de la propiedad tiempodereferenciaparaanslegal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTIEMPODEREFERENCIAPARAANSLEGAL(XMLGregorianCalendar value) {
        this.tiempodereferenciaparaanslegal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODERED() {
        return tipodered;
    }

    /**
     * Define el valor de la propiedad tipodered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODERED(String value) {
        this.tipodered = value;
    }

    /**
     * Obtiene el valor de la propiedad tiporemessa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOREMESSA() {
        return tiporemessa;
    }

    /**
     * Define el valor de la propiedad tiporemessa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOREMESSA(String value) {
        this.tiporemessa = value;
    }

    /**
     * Obtiene el valor de la propiedad valoranscontractista.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVALORANSCONTRACTISTA() {
        return valoranscontractista;
    }

    /**
     * Define el valor de la propiedad valoranscontractista.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVALORANSCONTRACTISTA(Long value) {
        this.valoranscontractista = value;
    }

    /**
     * Obtiene el valor de la propiedad valoransinterno.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVALORANSINTERNO() {
        return valoransinterno;
    }

    /**
     * Define el valor de la propiedad valoransinterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVALORANSINTERNO(Long value) {
        this.valoransinterno = value;
    }

    /**
     * Obtiene el valor de la propiedad valoranslegal.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVALORANSLEGAL() {
        return valoranslegal;
    }

    /**
     * Define el valor de la propiedad valoranslegal.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVALORANSLEGAL(Long value) {
        this.valoranslegal = value;
    }

    /**
     * Obtiene el valor de la propiedad valorniveloperativo3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORNIVELOPERATIVO3() {
        return valorniveloperativo3;
    }

    /**
     * Define el valor de la propiedad valorniveloperativo3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORNIVELOPERATIVO3(String value) {
        this.valorniveloperativo3 = value;
    }

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZONA() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZONA(String value) {
        this.zona = value;
    }

}
