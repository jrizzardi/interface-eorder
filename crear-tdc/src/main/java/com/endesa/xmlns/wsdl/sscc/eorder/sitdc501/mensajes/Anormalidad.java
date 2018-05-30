
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Anormalidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Anormalidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODIGO_ANORMALIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_TAREA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_REAL_DEL_TRABAJO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TIENE_COBRO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MEDIDOR_ASOCIADO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anormalidad", propOrder = {
    "codigoanormalidad",
    "codigotarea",
    "valorrealdeltrabajo",
    "tienecobro",
    "medidorasociado"
})
public class Anormalidad {

    @XmlElement(name = "CODIGO_ANORMALIDAD")
    protected String codigoanormalidad;
    @XmlElement(name = "CODIGO_TAREA")
    protected String codigotarea;
    @XmlElement(name = "VALOR_REAL_DEL_TRABAJO")
    protected Double valorrealdeltrabajo;
    @XmlElement(name = "TIENE_COBRO")
    protected String tienecobro;
    @XmlElement(name = "MEDIDOR_ASOCIADO")
    protected String medidorasociado;

    /**
     * Obtiene el valor de la propiedad codigoanormalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOANORMALIDAD() {
        return codigoanormalidad;
    }

    /**
     * Define el valor de la propiedad codigoanormalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOANORMALIDAD(String value) {
        this.codigoanormalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codigotarea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOTAREA() {
        return codigotarea;
    }

    /**
     * Define el valor de la propiedad codigotarea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOTAREA(String value) {
        this.codigotarea = value;
    }

    /**
     * Obtiene el valor de la propiedad valorrealdeltrabajo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORREALDELTRABAJO() {
        return valorrealdeltrabajo;
    }

    /**
     * Define el valor de la propiedad valorrealdeltrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORREALDELTRABAJO(Double value) {
        this.valorrealdeltrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad tienecobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIENECOBRO() {
        return tienecobro;
    }

    /**
     * Define el valor de la propiedad tienecobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIENECOBRO(String value) {
        this.tienecobro = value;
    }

    /**
     * Obtiene el valor de la propiedad medidorasociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIDORASOCIADO() {
        return medidorasociado;
    }

    /**
     * Define el valor de la propiedad medidorasociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIDORASOCIADO(String value) {
        this.medidorasociado = value;
    }

}
