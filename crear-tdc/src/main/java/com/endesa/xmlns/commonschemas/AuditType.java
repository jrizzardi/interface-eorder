
package com.endesa.xmlns.commonschemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para AuditType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuditType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOAId" type="{http://xmlns.endesa.com/CommonSchemas}SOAId"/&gt;
 *         &lt;element name="SourceApplication" type="{http://xmlns.endesa.com/CommonSchemas}SourceApplication"/&gt;
 *         &lt;element name="ServiceName" type="{http://xmlns.endesa.com/CommonSchemas}ServiceName"/&gt;
 *         &lt;element name="ExternalId" type="{http://xmlns.endesa.com/CommonSchemas}ExternalId" minOccurs="0"/&gt;
 *         &lt;element name="IP" type="{http://xmlns.endesa.com/CommonSchemas}IP" minOccurs="0"/&gt;
 *         &lt;element name="Client" type="{http://xmlns.endesa.com/CommonSchemas}Client" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://xmlns.endesa.com/CommonSchemas}User" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://xmlns.endesa.com/CommonSchemas}Language" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://xmlns.endesa.com/CommonSchemas}Version" minOccurs="0"/&gt;
 *         &lt;element name="ArchitectureVersion" type="{http://xmlns.endesa.com/CommonSchemas}ArchitectureVersion" minOccurs="0"/&gt;
 *         &lt;element name="RequestRegisterFlag" type="{http://xmlns.endesa.com/CommonSchemas}RequestRegisterFlag" minOccurs="0"/&gt;
 *         &lt;element name="Layer" type="{http://xmlns.endesa.com/CommonSchemas}Layer"/&gt;
 *         &lt;element name="Status" type="{http://xmlns.endesa.com/CommonSchemas}Status"/&gt;
 *         &lt;element name="TimeStamp" type="{http://xmlns.endesa.com/CommonSchemas}TimeStamp"/&gt;
 *         &lt;element ref="{http://xmlns.endesa.com/CommonSchemas}Message" minOccurs="0"/&gt;
 *         &lt;element name="InFunctional" type="{http://xmlns.endesa.com/CommonSchemas}InFunctional" minOccurs="0"/&gt;
 *         &lt;element name="TimeLayer" type="{http://xmlns.endesa.com/CommonSchemas}TimeLayer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://xmlns.endesa.com/CommonSchemas}Error" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditType", propOrder = {
    "soaId",
    "sourceApplication",
    "serviceName",
    "externalId",
    "ip",
    "client",
    "user",
    "language",
    "version",
    "architectureVersion",
    "requestRegisterFlag",
    "layer",
    "status",
    "timeStamp",
    "message",
    "inFunctional",
    "timeLayer",
    "error"
})
public class AuditType {

    @XmlElement(name = "SOAId", required = true)
    protected String soaId;
    @XmlElement(name = "SourceApplication", required = true)
    protected String sourceApplication;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "ExternalId")
    protected String externalId;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "Client")
    protected String client;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "ArchitectureVersion")
    protected String architectureVersion;
    @XmlElement(name = "RequestRegisterFlag")
    protected Boolean requestRegisterFlag;
    @XmlElement(name = "Layer", required = true)
    protected String layer;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "Message")
    protected Object message;
    @XmlElement(name = "InFunctional")
    protected String inFunctional;
    @XmlElement(name = "TimeLayer")
    protected BigInteger timeLayer;
    @XmlElement(name = "Error")
    protected ErrorType error;

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

    /**
     * Obtiene el valor de la propiedad requestRegisterFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestRegisterFlag() {
        return requestRegisterFlag;
    }

    /**
     * Define el valor de la propiedad requestRegisterFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestRegisterFlag(Boolean value) {
        this.requestRegisterFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad layer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayer() {
        return layer;
    }

    /**
     * Define el valor de la propiedad layer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayer(String value) {
        this.layer = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define el valor de la propiedad timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMessage(Object value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad inFunctional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInFunctional() {
        return inFunctional;
    }

    /**
     * Define el valor de la propiedad inFunctional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInFunctional(String value) {
        this.inFunctional = value;
    }

    /**
     * Obtiene el valor de la propiedad timeLayer.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeLayer() {
        return timeLayer;
    }

    /**
     * Define el valor de la propiedad timeLayer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeLayer(BigInteger value) {
        this.timeLayer = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

}
