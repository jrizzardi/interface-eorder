package edesur.eorder.ws.cancelar;

import edesur.eorder.ws.common.Fault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
//        wsdlLocation = "wsdl/SITDC203.wsdl",
        targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/SITDC203_PortType"
)
public interface SITDC203PortType {
    @WebMethod(operationName = "AnulacionSuspensionCierreTdC_Operation", action = "AnulacionSuspensionCierreTdC_Operation")
    @WebResult(name = "AnulacionSuspensionCierreTdC_Response", targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes", partName = "response")
    public Response anulacionSuspensionCierreTdCOperation(
            @WebParam(partName = "request", name = "AnulacionSuspensionCierreTdC_Request", targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes")
            Request request
    ) throws Fault;
}
