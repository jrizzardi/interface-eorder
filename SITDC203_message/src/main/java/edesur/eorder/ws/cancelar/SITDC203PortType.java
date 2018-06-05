package edesur.eorder.ws.cancelar;

import edesur.eorder.ws.common.Fault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/SITDC203_PortType", name = "SITDC203_PortType")
@XmlSeeAlso({edesur.eorder.ws.common.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SITDC203PortType {
    @WebMethod(operationName = "AnulacionSuspensionCierreTdC_Operation", action = "AnulacionSuspensionCierreTdC_Operation")
    @WebResult(name = "AnulacionSuspensionCierreTdC_Response", targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes", partName = "response")
    public Response AnulacionSuspensionCierreTdC_Operation(
            @WebParam(
                    partName = "request",
                    name = "AnulacionSuspensionCierreTdC_Request",
                    targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes"
            ) Request request
    ) throws Fault;
}
