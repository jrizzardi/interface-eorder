
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Anexo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Anexo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="NOMBRE_ANEXO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="OBLIGATORIO_EN_CAMPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RUTA_ANEXO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anexo", propOrder = {

})
public class Anexo {

    @XmlElement(name = "NOMBRE_ANEXO")
    protected String nombreanexo;
    @XmlElement(name = "OBLIGATORIO_EN_CAMPO")
    protected Boolean obligatorioencampo;
    @XmlElement(name = "RUTA_ANEXO")
    protected String rutaanexo;

    /**
     * Obtiene el valor de la propiedad nombreanexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREANEXO() {
        return nombreanexo;
    }

    /**
     * Define el valor de la propiedad nombreanexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREANEXO(String value) {
        this.nombreanexo = value;
    }

    /**
     * Obtiene el valor de la propiedad obligatorioencampo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOBLIGATORIOENCAMPO() {
        return obligatorioencampo;
    }

    /**
     * Define el valor de la propiedad obligatorioencampo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOBLIGATORIOENCAMPO(Boolean value) {
        this.obligatorioencampo = value;
    }

    /**
     * Obtiene el valor de la propiedad rutaanexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUTAANEXO() {
        return rutaanexo;
    }

    /**
     * Define el valor de la propiedad rutaanexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUTAANEXO(String value) {
        this.rutaanexo = value;
    }

}
