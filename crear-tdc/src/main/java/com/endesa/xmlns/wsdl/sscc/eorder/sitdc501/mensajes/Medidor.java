
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Medidor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Medidor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="AMPERAJE_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ANO_FABRICACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CATEGORIA_MARCA_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLASE_DEL_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLASE_FACTOR_DE_FACTURACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DIGITOS_DECIMALES" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FACTOR_DE_FACTURACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_INSTALACION_MEDIDOR" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LECTURAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfLectura" minOccurs="0"/&gt;
 *         &lt;element name="MARCA_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MODELO_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DE_FABRICA_DEL_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DE_VUELTAS" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DIGITOS_MEDIDOR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ORIGEN_DE_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PROPIEDAD_DEL_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_MEDIDA_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_REGISTRADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_TECNOLOGIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="UBICACION_DEL_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="UNIDAD_MEDIDA_KC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_TENSION_NOMINAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CARACTERISTICA_MEDIDOR_PRINCIPAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medidor", propOrder = {

})
public class Medidor {

    @XmlElement(name = "AMPERAJE_MEDIDOR")
    protected String amperajemedidor;
    @XmlElement(name = "ANO_FABRICACION")
    protected String anofabricacion;
    @XmlElement(name = "CAPACIDAD_MEDIDOR")
    protected String capacidadmedidor;
    @XmlElement(name = "CATEGORIA_MARCA_MEDIDOR")
    protected String categoriamarcamedidor;
    @XmlElement(name = "CLASE_DEL_MEDIDOR")
    protected String clasedelmedidor;
    @XmlElement(name = "CLASE_FACTOR_DE_FACTURACION")
    protected String clasefactordefacturacion;
    @XmlElement(name = "DIGITOS_DECIMALES")
    protected Long digitosdecimales;
    @XmlElement(name = "FACTOR_DE_FACTURACION")
    protected String factordefacturacion;
    @XmlElement(name = "FECHA_INSTALACION_MEDIDOR")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechainstalacionmedidor;
    @XmlElement(name = "LECTURAS")
    protected ArrayOfLectura lecturas;
    @XmlElement(name = "MARCA_MEDIDOR")
    protected String marcamedidor;
    @XmlElement(name = "MODELO_MEDIDOR")
    protected String modelomedidor;
    @XmlElement(name = "NUMERO_DE_FABRICA_DEL_MEDIDOR")
    protected String numerodefabricadelmedidor;
    @XmlElement(name = "NUMERO_DE_VUELTAS")
    protected Double numerodevueltas;
    @XmlElement(name = "NUMERO_DIGITOS_MEDIDOR")
    protected Long numerodigitosmedidor;
    @XmlElement(name = "NUMERO_MEDIDOR")
    protected String numeromedidor;
    @XmlElement(name = "ORIGEN_DE_MEDIDOR")
    protected String origendemedidor;
    @XmlElement(name = "PROPIEDAD_DEL_MEDIDOR")
    protected String propiedaddelmedidor;
    @XmlElement(name = "TIPO_MEDIDA_CONEXION")
    protected String tipomedidaconexion;
    @XmlElement(name = "TIPO_MEDIDOR")
    protected String tipomedidor;
    @XmlElement(name = "TIPO_REGISTRADOR")
    protected String tiporegistrador;
    @XmlElement(name = "TIPO_TECNOLOGIA")
    protected String tipotecnologia;
    @XmlElement(name = "UBICACION_DEL_MEDIDOR")
    protected String ubicaciondelmedidor;
    @XmlElement(name = "UNIDAD_MEDIDA_KC")
    protected String unidadmedidakc;
    @XmlElement(name = "VALOR_TENSION_NOMINAL")
    protected String valortensionnominal;
    @XmlElement(name = "CARACTERISTICA_MEDIDOR_PRINCIPAL")
    protected String caracteristicamedidorprincipal;

    /**
     * Obtiene el valor de la propiedad amperajemedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMPERAJEMEDIDOR() {
        return amperajemedidor;
    }

    /**
     * Define el valor de la propiedad amperajemedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMPERAJEMEDIDOR(String value) {
        this.amperajemedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad anofabricacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOFABRICACION() {
        return anofabricacion;
    }

    /**
     * Define el valor de la propiedad anofabricacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOFABRICACION(String value) {
        this.anofabricacion = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidadmedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACIDADMEDIDOR() {
        return capacidadmedidor;
    }

    /**
     * Define el valor de la propiedad capacidadmedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACIDADMEDIDOR(String value) {
        this.capacidadmedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriamarcamedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORIAMARCAMEDIDOR() {
        return categoriamarcamedidor;
    }

    /**
     * Define el valor de la propiedad categoriamarcamedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORIAMARCAMEDIDOR(String value) {
        this.categoriamarcamedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad clasedelmedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASEDELMEDIDOR() {
        return clasedelmedidor;
    }

    /**
     * Define el valor de la propiedad clasedelmedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASEDELMEDIDOR(String value) {
        this.clasedelmedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad clasefactordefacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASEFACTORDEFACTURACION() {
        return clasefactordefacturacion;
    }

    /**
     * Define el valor de la propiedad clasefactordefacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASEFACTORDEFACTURACION(String value) {
        this.clasefactordefacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad digitosdecimales.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDIGITOSDECIMALES() {
        return digitosdecimales;
    }

    /**
     * Define el valor de la propiedad digitosdecimales.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDIGITOSDECIMALES(Long value) {
        this.digitosdecimales = value;
    }

    /**
     * Obtiene el valor de la propiedad factordefacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACTORDEFACTURACION() {
        return factordefacturacion;
    }

    /**
     * Define el valor de la propiedad factordefacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACTORDEFACTURACION(String value) {
        this.factordefacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechainstalacionmedidor.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAINSTALACIONMEDIDOR() {
        return fechainstalacionmedidor;
    }

    /**
     * Define el valor de la propiedad fechainstalacionmedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAINSTALACIONMEDIDOR(XMLGregorianCalendar value) {
        this.fechainstalacionmedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad lecturas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLectura }
     *     
     */
    public ArrayOfLectura getLECTURAS() {
        return lecturas;
    }

    /**
     * Define el valor de la propiedad lecturas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLectura }
     *     
     */
    public void setLECTURAS(ArrayOfLectura value) {
        this.lecturas = value;
    }

    /**
     * Obtiene el valor de la propiedad marcamedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARCAMEDIDOR() {
        return marcamedidor;
    }

    /**
     * Define el valor de la propiedad marcamedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARCAMEDIDOR(String value) {
        this.marcamedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad modelomedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODELOMEDIDOR() {
        return modelomedidor;
    }

    /**
     * Define el valor de la propiedad modelomedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODELOMEDIDOR(String value) {
        this.modelomedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodefabricadelmedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEFABRICADELMEDIDOR() {
        return numerodefabricadelmedidor;
    }

    /**
     * Define el valor de la propiedad numerodefabricadelmedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEFABRICADELMEDIDOR(String value) {
        this.numerodefabricadelmedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodevueltas.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNUMERODEVUELTAS() {
        return numerodevueltas;
    }

    /**
     * Define el valor de la propiedad numerodevueltas.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNUMERODEVUELTAS(Double value) {
        this.numerodevueltas = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodigitosmedidor.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNUMERODIGITOSMEDIDOR() {
        return numerodigitosmedidor;
    }

    /**
     * Define el valor de la propiedad numerodigitosmedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNUMERODIGITOSMEDIDOR(Long value) {
        this.numerodigitosmedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad numeromedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROMEDIDOR() {
        return numeromedidor;
    }

    /**
     * Define el valor de la propiedad numeromedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROMEDIDOR(String value) {
        this.numeromedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad origendemedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGENDEMEDIDOR() {
        return origendemedidor;
    }

    /**
     * Define el valor de la propiedad origendemedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGENDEMEDIDOR(String value) {
        this.origendemedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad propiedaddelmedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPIEDADDELMEDIDOR() {
        return propiedaddelmedidor;
    }

    /**
     * Define el valor de la propiedad propiedaddelmedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPIEDADDELMEDIDOR(String value) {
        this.propiedaddelmedidor = value;
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
     * Obtiene el valor de la propiedad tipomedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMEDIDOR() {
        return tipomedidor;
    }

    /**
     * Define el valor de la propiedad tipomedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMEDIDOR(String value) {
        this.tipomedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad tiporegistrador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOREGISTRADOR() {
        return tiporegistrador;
    }

    /**
     * Define el valor de la propiedad tiporegistrador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOREGISTRADOR(String value) {
        this.tiporegistrador = value;
    }

    /**
     * Obtiene el valor de la propiedad tipotecnologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOTECNOLOGIA() {
        return tipotecnologia;
    }

    /**
     * Define el valor de la propiedad tipotecnologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOTECNOLOGIA(String value) {
        this.tipotecnologia = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicaciondelmedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBICACIONDELMEDIDOR() {
        return ubicaciondelmedidor;
    }

    /**
     * Define el valor de la propiedad ubicaciondelmedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBICACIONDELMEDIDOR(String value) {
        this.ubicaciondelmedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadmedidakc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIDADMEDIDAKC() {
        return unidadmedidakc;
    }

    /**
     * Define el valor de la propiedad unidadmedidakc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIDADMEDIDAKC(String value) {
        this.unidadmedidakc = value;
    }

    /**
     * Obtiene el valor de la propiedad valortensionnominal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORTENSIONNOMINAL() {
        return valortensionnominal;
    }

    /**
     * Define el valor de la propiedad valortensionnominal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORTENSIONNOMINAL(String value) {
        this.valortensionnominal = value;
    }

    /**
     * Obtiene el valor de la propiedad caracteristicamedidorprincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARACTERISTICAMEDIDORPRINCIPAL() {
        return caracteristicamedidorprincipal;
    }

    /**
     * Define el valor de la propiedad caracteristicamedidorprincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARACTERISTICAMEDIDORPRINCIPAL(String value) {
        this.caracteristicamedidorprincipal = value;
    }

}
