package edesur.eorder.ws;

import edesur.eorder.ws.anulacion.schemas.ResultadoAnulacion;
import edesur.eorder.ws.common.schemas.Response;
import edesur.eorder.ws.resultados.schemas.ResultadoEjecucion;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName = "eOrderService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EorderService {
    public Response resultadoEjecucionTdC(@WebParam(name = "resultadoEjecucionTdC") ResultadoEjecucion resultado);

    public Response resultadoAnulacionTdC(@WebParam(name = "resultadoAnulacionTdC") ResultadoAnulacion resultado);
}
