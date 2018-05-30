package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.sitdc501_porttype;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-05-30T12:12:07.458-03:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/SITDC501_PortType", name = "SITDC501_PortType")
@XmlSeeAlso({com.endesa.xmlns.commonschemas.ObjectFactory.class, com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SITDC501PortType {

    @WebMethod(operationName = "CreacionTdC_Operation", action = "CreacionTdC_Operation")
    @WebResult(name = "CreacionTdC_Response", targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes", partName = "response")
    public com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes.CreacionTdCResponseType creacionTdCOperation(
            @WebParam(partName = "request", name = "CreacionTdC_Request", targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes")
                    com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes.CreacionTdCRequestType request
    ) throws CreacionTdCFault;
}
