
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para componente_concentrador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="componente_concentrador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MARCA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MODELO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_SERIE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="datos_falla" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayofDatosFalla" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componente_concentrador", propOrder = {
    "marca",
    "modelo",
    "numeroserie",
    "datosFalla"
})
public class ComponenteConcentrador {

    @XmlElement(name = "MARCA")
    protected String marca;
    @XmlElement(name = "MODELO")
    protected String modelo;
    @XmlElement(name = "NUMERO_SERIE")
    protected String numeroserie;
    @XmlElement(name = "datos_falla")
    protected ArrayofDatosFalla datosFalla;

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARCA() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARCA(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODELO() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODELO(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroserie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROSERIE() {
        return numeroserie;
    }

    /**
     * Define el valor de la propiedad numeroserie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROSERIE(String value) {
        this.numeroserie = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFalla.
     * 
     * @return
     *     possible object is
     *     {@link ArrayofDatosFalla }
     *     
     */
    public ArrayofDatosFalla getDatosFalla() {
        return datosFalla;
    }

    /**
     * Define el valor de la propiedad datosFalla.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayofDatosFalla }
     *     
     */
    public void setDatosFalla(ArrayofDatosFalla value) {
        this.datosFalla = value;
    }

}
