
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SuministroInspecciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SuministroInspecciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CODIGO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPCION_IRREGULARIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTRATO_SOCIO_ECONOMICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_DE_IRREGULARIDAD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuministroInspecciones", propOrder = {

})
public class SuministroInspecciones {

    @XmlElement(name = "CODIGO_CLIENTE")
    protected String codigocliente;
    @XmlElement(name = "CUENTA")
    protected Long cuenta;
    @XmlElement(name = "DESCRIPCION_IRREGULARIDAD")
    protected String descripcionirregularidad;
    @XmlElement(name = "ESTADO_CLIENTE")
    protected String estadocliente;
    @XmlElement(name = "ESTADO_CONEXION")
    protected String estadoconexion;
    @XmlElement(name = "ESTRATO_SOCIO_ECONOMICO")
    protected String estratosocioeconomico;
    @XmlElement(name = "FASE")
    protected String fase;
    @XmlElement(name = "FECHA_DE_IRREGULARIDAD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechadeirregularidad;

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
     * Obtiene el valor de la propiedad descripcionirregularidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCIONIRREGULARIDAD() {
        return descripcionirregularidad;
    }

    /**
     * Define el valor de la propiedad descripcionirregularidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCIONIRREGULARIDAD(String value) {
        this.descripcionirregularidad = value;
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
     * Obtiene el valor de la propiedad fechadeirregularidad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADEIRREGULARIDAD() {
        return fechadeirregularidad;
    }

    /**
     * Define el valor de la propiedad fechadeirregularidad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADEIRREGULARIDAD(XMLGregorianCalendar value) {
        this.fechadeirregularidad = value;
    }

}
