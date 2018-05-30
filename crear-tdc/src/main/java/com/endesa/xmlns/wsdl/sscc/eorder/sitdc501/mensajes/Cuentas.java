
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cuentas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cuentas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CODIGO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="RUTA_DE_LECTURA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="TEXTO_DIRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="LATITUD_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="LONGITUD_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO_CONTACTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLAVE_TARIFA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="RESTRICCION_DE_CONVENIOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfMedidor" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfTransformador" minOccurs="0"/&gt;
 *         &lt;element name="POTENCIA_REQUERIDA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CEDULA_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="EMAIL_CONTACTO_CON_EL_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DOCUMENTO_IDENTIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cuentas", propOrder = {

})
public class Cuentas {

    @XmlElement(name = "CODIGO_CLIENTE")
    protected String codigocliente;
    @XmlElement(name = "NOMBRE_CLIENTE")
    protected String nombrecliente;
    @XmlElement(name = "TIPO_CLIENTE")
    protected String tipocliente;
    @XmlElement(name = "RUTA_DE_LECTURA")
    protected String rutadelectura;
    @XmlElement(name = "TEXTO_DIRECCION")
    protected String textodireccion;
    @XmlElement(name = "LATITUD_CLIENTE")
    protected BigDecimal latitudcliente;
    @XmlElement(name = "LONGITUD_CLIENTE")
    protected BigDecimal longitudcliente;
    @XmlElement(name = "TELEFONO_CONTACTO")
    protected String telefonocontacto;
    @XmlElement(name = "CLAVE_TARIFA")
    protected String clavetarifa;
    @XmlElement(name = "RESTRICCION_DE_CONVENIOS")
    protected String restricciondeconvenios;
    @XmlElement(name = "MEDIDOR")
    protected ArrayOfMedidor medidor;
    @XmlElement(name = "TRANSFORMADOR")
    protected ArrayOfTransformador transformador;
    @XmlElement(name = "POTENCIA_REQUERIDA")
    protected String potenciarequerida;
    @XmlElement(name = "CEDULA_CLIENTE")
    protected String cedulacliente;
    @XmlElement(name = "EMAIL_CONTACTO_CON_EL_CLIENTE")
    protected String emailcontactoconelcliente;
    @XmlElement(name = "TIPO_DOCUMENTO_IDENTIDAD")
    protected String tipodocumentoidentidad;

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
     * Obtiene el valor de la propiedad nombrecliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRECLIENTE() {
        return nombrecliente;
    }

    /**
     * Define el valor de la propiedad nombrecliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRECLIENTE(String value) {
        this.nombrecliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCLIENTE() {
        return tipocliente;
    }

    /**
     * Define el valor de la propiedad tipocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCLIENTE(String value) {
        this.tipocliente = value;
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
     * Obtiene el valor de la propiedad restricciondeconvenios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESTRICCIONDECONVENIOS() {
        return restricciondeconvenios;
    }

    /**
     * Define el valor de la propiedad restricciondeconvenios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESTRICCIONDECONVENIOS(String value) {
        this.restricciondeconvenios = value;
    }

    /**
     * Obtiene el valor de la propiedad medidor.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMedidor }
     *     
     */
    public ArrayOfMedidor getMEDIDOR() {
        return medidor;
    }

    /**
     * Define el valor de la propiedad medidor.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMedidor }
     *     
     */
    public void setMEDIDOR(ArrayOfMedidor value) {
        this.medidor = value;
    }

    /**
     * Obtiene el valor de la propiedad transformador.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public ArrayOfTransformador getTRANSFORMADOR() {
        return transformador;
    }

    /**
     * Define el valor de la propiedad transformador.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public void setTRANSFORMADOR(ArrayOfTransformador value) {
        this.transformador = value;
    }

    /**
     * Obtiene el valor de la propiedad potenciarequerida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENCIAREQUERIDA() {
        return potenciarequerida;
    }

    /**
     * Define el valor de la propiedad potenciarequerida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENCIAREQUERIDA(String value) {
        this.potenciarequerida = value;
    }

    /**
     * Obtiene el valor de la propiedad cedulacliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEDULACLIENTE() {
        return cedulacliente;
    }

    /**
     * Define el valor de la propiedad cedulacliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEDULACLIENTE(String value) {
        this.cedulacliente = value;
    }

    /**
     * Obtiene el valor de la propiedad emailcontactoconelcliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAILCONTACTOCONELCLIENTE() {
        return emailcontactoconelcliente;
    }

    /**
     * Define el valor de la propiedad emailcontactoconelcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAILCONTACTOCONELCLIENTE(String value) {
        this.emailcontactoconelcliente = value;
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

}
