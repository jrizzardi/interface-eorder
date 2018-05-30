
package com.endesa.xmlns.commonschemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SOAHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SOAHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOAId" type="{http://xmlns.endesa.com/CommonSchemas}SOAId" minOccurs="0"/&gt;
 *         &lt;element name="SourceApplication" type="{http://xmlns.endesa.com/CommonSchemas}SourceApplication"/&gt;
 *         &lt;element name="ServiceName" type="{http://xmlns.endesa.com/CommonSchemas}ServiceName"/&gt;
 *         &lt;element name="ExternalId" type="{http://xmlns.endesa.com/CommonSchemas}ExternalId"/&gt;
 *         &lt;element name="IP" type="{http://xmlns.endesa.com/CommonSchemas}IP"/&gt;
 *         &lt;element name="Client" type="{http://xmlns.endesa.com/CommonSchemas}Client"/&gt;
 *         &lt;element name="User" type="{http://xmlns.endesa.com/CommonSchemas}User" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://xmlns.endesa.com/CommonSchemas}Language"/&gt;
 *         &lt;element name="Version" type="{http://xmlns.endesa.com/CommonSchemas}Version"/&gt;
 *         &lt;element name="ArchitectureVersion" type="{http://xmlns.endesa.com/CommonSchemas}ArchitectureVersion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOAHeaderType", propOrder = {
    "soaId",
    "sourceApplication",
    "serviceName",
    "externalId",
    "ip",
    "client",
    "user",
    "language",
    "version",
    "architectureVersion"
})
public class SOAHeaderType {

    @XmlElement(name = "SOAId")
    protected String soaId;
    @XmlElement(name = "SourceApplication", required = true)
    protected String sourceApplication;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "ExternalId", required = true)
    protected String externalId;
    @XmlElement(name = "IP", required = true)
    protected String ip;
    @XmlElement(name = "Client", required = true)
    protected String client;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "ArchitectureVersion")
    protected String architectureVersion;

    /**
     * Obtiene el valor de la propiedad soaId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAId() {
        return soaId;
    }

    /**
     * Define el valor de la propiedad soaId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAId(String value) {
        this.soaId = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceApplication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceApplication() {
        return sourceApplication;
    }

    /**
     * Define el valor de la propiedad sourceApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceApplication(String value) {
        this.sourceApplication = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Define el valor de la propiedad serviceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Obtiene el valor de la propiedad externalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Define el valor de la propiedad externalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Obtiene el valor de la propiedad ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

    /**
     * Obtiene el valor de la propiedad client.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Define el valor de la propiedad client.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad architectureVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitectureVersion() {
        return architectureVersion;
    }

    /**
     * Define el valor de la propiedad architectureVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitectureVersion(String value) {
        this.architectureVersion = value;
    }

}
