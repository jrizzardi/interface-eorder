
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosClaveProcesosTDC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosClaveProcesosTDC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CODIGO_DISTRIBUIDORA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50"/&gt;
 *         &lt;element name="CODIGO_EXTERNO_DEL_TDC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50"/&gt;
 *         &lt;element name="CODIGO_PROCESO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50"/&gt;
 *         &lt;element name="CODIGO_SISTEMA_EXTERNO_DE_ORIGEN" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50"/&gt;
 *         &lt;element name="CODIGO_SUBPROCESO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50"/&gt;
 *         &lt;element name="CODIGO_TIPO_DE_TDC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50"/&gt;
 *         &lt;element name="LLAVE_SECRETA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosClaveProcesosTDC", propOrder = {

})
public class DatosClaveProcesosTDC {

    @XmlElement(name = "CODIGO_DISTRIBUIDORA", required = true)
    protected String codigodistribuidora;
    @XmlElement(name = "CODIGO_EXTERNO_DEL_TDC", required = true)
    protected String codigoexternodeltdc;
    @XmlElement(name = "CODIGO_PROCESO", required = true)
    protected String codigoproceso;
    @XmlElement(name = "CODIGO_SISTEMA_EXTERNO_DE_ORIGEN", required = true)
    protected String codigosistemaexternodeorigen;
    @XmlElement(name = "CODIGO_SUBPROCESO", required = true)
    protected String codigosubproceso;
    @XmlElement(name = "CODIGO_TIPO_DE_TDC", required = true)
    protected String codigotipodetdc;
    @XmlElement(name = "LLAVE_SECRETA", required = true)
    protected String llavesecreta;

    /**
     * Obtiene el valor de la propiedad codigodistribuidora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODISTRIBUIDORA() {
        return codigodistribuidora;
    }

    /**
     * Define el valor de la propiedad codigodistribuidora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODISTRIBUIDORA(String value) {
        this.codigodistribuidora = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoexternodeltdc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOEXTERNODELTDC() {
        return codigoexternodeltdc;
    }

    /**
     * Define el valor de la propiedad codigoexternodeltdc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOEXTERNODELTDC(String value) {
        this.codigoexternodeltdc = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoproceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOPROCESO() {
        return codigoproceso;
    }

    /**
     * Define el valor de la propiedad codigoproceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOPROCESO(String value) {
        this.codigoproceso = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosistemaexternodeorigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOSISTEMAEXTERNODEORIGEN() {
        return codigosistemaexternodeorigen;
    }

    /**
     * Define el valor de la propiedad codigosistemaexternodeorigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOSISTEMAEXTERNODEORIGEN(String value) {
        this.codigosistemaexternodeorigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosubproceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOSUBPROCESO() {
        return codigosubproceso;
    }

    /**
     * Define el valor de la propiedad codigosubproceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOSUBPROCESO(String value) {
        this.codigosubproceso = value;
    }

    /**
     * Obtiene el valor de la propiedad codigotipodetdc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTIPODETDC() {
        return codigotipodetdc;
    }

    /**
     * Define el valor de la propiedad codigotipodetdc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTIPODETDC(String value) {
        this.codigotipodetdc = value;
    }

    /**
     * Obtiene el valor de la propiedad llavesecreta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLLAVESECRETA() {
        return llavesecreta;
    }

    /**
     * Define el valor de la propiedad llavesecreta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLLAVESECRETA(String value) {
        this.llavesecreta = value;
    }

}
