package edesur.eorder.test.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(
        targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/SITDC501_PortType",
        name = "SITDC501_PortType"
)
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreaTdCEndpoint {
    @WebMethod(operationName = "CreacionTdC_Operation", action = "CreacionTdC_Operation")
    @WebResult(
            name = "CreacionTdC_Response",
            targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes",
            partName = "response")
    public CreacionTdCResponseType creacionTdCOperation(
            @WebParam(
                    partName = "request",
                    name = "CreacionTdC_Request",
                    targetNamespace = "http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes"
            )
            CreacionTdCRequestType request ) throws CreacionTdCFault;

}
