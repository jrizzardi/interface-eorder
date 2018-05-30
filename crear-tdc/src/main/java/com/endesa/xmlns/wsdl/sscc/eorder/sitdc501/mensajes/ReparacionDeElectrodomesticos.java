
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReparacionDeElectrodomesticos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReparacionDeElectrodomesticos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ELECTRODOMESTICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MARCA_ELECTRODOMESTICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="OBSERVACIONES_REPARACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReparacionDeElectrodomesticos", propOrder = {

})
public class ReparacionDeElectrodomesticos {

    @XmlElement(name = "ELECTRODOMESTICO")
    protected String electrodomestico;
    @XmlElement(name = "MARCA_ELECTRODOMESTICO")
    protected String marcaelectrodomestico;
    @XmlElement(name = "OBSERVACIONES_REPARACION")
    protected String observacionesreparacion;

    /**
     * Obtiene el valor de la propiedad electrodomestico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getELECTRODOMESTICO() {
        return electrodomestico;
    }

    /**
     * Define el valor de la propiedad electrodomestico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setELECTRODOMESTICO(String value) {
        this.electrodomestico = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaelectrodomestico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARCAELECTRODOMESTICO() {
        return marcaelectrodomestico;
    }

    /**
     * Define el valor de la propiedad marcaelectrodomestico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARCAELECTRODOMESTICO(String value) {
        this.marcaelectrodomestico = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesreparacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSERVACIONESREPARACION() {
        return observacionesreparacion;
    }

    /**
     * Define el valor de la propiedad observacionesreparacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSERVACIONESREPARACION(String value) {
        this.observacionesreparacion = value;
    }

}
