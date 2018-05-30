
package com.endesa.xmlns.commonschemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ErrorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Correction" type="{http://xmlns.endesa.com/CommonSchemas}Correction"/&gt;
 *         &lt;element name="ErrorCode" type="{http://xmlns.endesa.com/CommonSchemas}ErrorCode"/&gt;
 *         &lt;element name="ErrorDate" type="{http://xmlns.endesa.com/CommonSchemas}ErrorDate"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://xmlns.endesa.com/CommonSchemas}ErrorMessage"/&gt;
 *         &lt;element ref="{http://xmlns.endesa.com/CommonSchemas}ErrorType"/&gt;
 *         &lt;element name="Module" type="{http://xmlns.endesa.com/CommonSchemas}Module"/&gt;
 *         &lt;element name="Process" type="{http://xmlns.endesa.com/CommonSchemas}Process"/&gt;
 *         &lt;element name="Severity" type="{http://xmlns.endesa.com/CommonSchemas}Severity"/&gt;
 *         &lt;element name="StackTrace" type="{http://xmlns.endesa.com/CommonSchemas}StackTrace"/&gt;
 *         &lt;element name="Task" type="{http://xmlns.endesa.com/CommonSchemas}Task"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", propOrder = {
    "correction",
    "errorCode",
    "errorDate",
    "errorMessage",
    "errorType",
    "module",
    "process",
    "severity",
    "stackTrace",
    "task"
})
public class ErrorType {

    @XmlElement(name = "Correction", required = true)
    protected String correction;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar errorDate;
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;
    @XmlElement(name = "ErrorType", required = true)
    protected String errorType;
    @XmlElement(name = "Module", required = true)
    protected String module;
    @XmlElement(name = "Process", required = true)
    protected String process;
    @XmlElement(name = "Severity", required = true)
    protected String severity;
    @XmlElement(name = "StackTrace", required = true)
    protected String stackTrace;
    @XmlElement(name = "Task", required = true)
    protected String task;

    /**
     * Obtiene el valor de la propiedad correction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrection() {
        return correction;
    }

    /**
     * Define el valor de la propiedad correction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrection(String value) {
        this.correction = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErrorDate() {
        return errorDate;
    }

    /**
     * Define el valor de la propiedad errorDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErrorDate(XMLGregorianCalendar value) {
        this.errorDate = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad errorType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Define el valor de la propiedad errorType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
    }

    /**
     * Obtiene el valor de la propiedad module.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Define el valor de la propiedad module.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * Obtiene el valor de la propiedad process.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcess() {
        return process;
    }

    /**
     * Define el valor de la propiedad process.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcess(String value) {
        this.process = value;
    }

    /**
     * Obtiene el valor de la propiedad severity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Define el valor de la propiedad severity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Obtiene el valor de la propiedad stackTrace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Define el valor de la propiedad stackTrace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

    /**
     * Obtiene el valor de la propiedad task.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * Define el valor de la propiedad task.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

}
