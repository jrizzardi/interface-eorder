package edesur.eorder.ws.resultados;

import edesur.eorder.ws.common.schemas.Response;
import edesur.eorder.ws.resultados.schemas.Resultado;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ResultadosService {
    public Response recibirResultadoTdC(@WebParam(name = "resultadoTdC") Resultado resultado);
}
