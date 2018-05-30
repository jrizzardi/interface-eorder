
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cotizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cotizacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CANTIDAD_MANO_DE_OBRA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CANTIDAD_MATERIAL" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_ELEMENTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_SUBELEMENTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_ELEMENTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_SUBELEMENTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_IVA_MANO_DE_OBRA_NO_BAREMADO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_IVA_MATERIAL_NO_BAREMADO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_UNITARIO_MANO_DE_OBRA_NO_BAREMADO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_UNITARIO_MATERIAL_NO_BAREMADO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cotizacion", propOrder = {

})
public class Cotizacion {

    @XmlElement(name = "CANTIDAD_MANO_DE_OBRA")
    protected Double cantidadmanodeobra;
    @XmlElement(name = "CANTIDAD_MATERIAL")
    protected Long cantidadmaterial;
    @XmlElement(name = "CODIGO_ELEMENTO")
    protected String codigoelemento;
    @XmlElement(name = "CODIGO_SUBELEMENTO")
    protected String codigosubelemento;
    @XmlElement(name = "NOMBRE_ELEMENTO")
    protected String nombreelemento;
    @XmlElement(name = "NOMBRE_SUBELEMENTO")
    protected String nombresubelemento;
    @XmlElement(name = "VALOR_IVA_MANO_DE_OBRA_NO_BAREMADO")
    protected Double valorivamanodeobranobaremado;
    @XmlElement(name = "VALOR_IVA_MATERIAL_NO_BAREMADO")
    protected Double valorivamaterialnobaremado;
    @XmlElement(name = "VALOR_UNITARIO_MANO_DE_OBRA_NO_BAREMADO")
    protected Double valorunitariomanodeobranobaremado;
    @XmlElement(name = "VALOR_UNITARIO_MATERIAL_NO_BAREMADO")
    protected Double valorunitariomaterialnobaremado;

    /**
     * Obtiene el valor de la propiedad cantidadmanodeobra.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCANTIDADMANODEOBRA() {
        return cantidadmanodeobra;
    }

    /**
     * Define el valor de la propiedad cantidadmanodeobra.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCANTIDADMANODEOBRA(Double value) {
        this.cantidadmanodeobra = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadmaterial.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCANTIDADMATERIAL() {
        return cantidadmaterial;
    }

    /**
     * Define el valor de la propiedad cantidadmaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCANTIDADMATERIAL(Long value) {
        this.cantidadmaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoelemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOELEMENTO() {
        return codigoelemento;
    }

    /**
     * Define el valor de la propiedad codigoelemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOELEMENTO(String value) {
        this.codigoelemento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosubelemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOSUBELEMENTO() {
        return codigosubelemento;
    }

    /**
     * Define el valor de la propiedad codigosubelemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOSUBELEMENTO(String value) {
        this.codigosubelemento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreelemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREELEMENTO() {
        return nombreelemento;
    }

    /**
     * Define el valor de la propiedad nombreelemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREELEMENTO(String value) {
        this.nombreelemento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresubelemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRESUBELEMENTO() {
        return nombresubelemento;
    }

    /**
     * Define el valor de la propiedad nombresubelemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRESUBELEMENTO(String value) {
        this.nombresubelemento = value;
    }

    /**
     * Obtiene el valor de la propiedad valorivamanodeobranobaremado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORIVAMANODEOBRANOBAREMADO() {
        return valorivamanodeobranobaremado;
    }

    /**
     * Define el valor de la propiedad valorivamanodeobranobaremado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORIVAMANODEOBRANOBAREMADO(Double value) {
        this.valorivamanodeobranobaremado = value;
    }

    /**
     * Obtiene el valor de la propiedad valorivamaterialnobaremado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORIVAMATERIALNOBAREMADO() {
        return valorivamaterialnobaremado;
    }

    /**
     * Define el valor de la propiedad valorivamaterialnobaremado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORIVAMATERIALNOBAREMADO(Double value) {
        this.valorivamaterialnobaremado = value;
    }

    /**
     * Obtiene el valor de la propiedad valorunitariomanodeobranobaremado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORUNITARIOMANODEOBRANOBAREMADO() {
        return valorunitariomanodeobranobaremado;
    }

    /**
     * Define el valor de la propiedad valorunitariomanodeobranobaremado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORUNITARIOMANODEOBRANOBAREMADO(Double value) {
        this.valorunitariomanodeobranobaremado = value;
    }

    /**
     * Obtiene el valor de la propiedad valorunitariomaterialnobaremado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORUNITARIOMATERIALNOBAREMADO() {
        return valorunitariomaterialnobaremado;
    }

    /**
     * Define el valor de la propiedad valorunitariomaterialnobaremado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORUNITARIOMATERIALNOBAREMADO(Double value) {
        this.valorunitariomaterialnobaremado = value;
    }

}
