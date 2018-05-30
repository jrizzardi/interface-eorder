package edesur.eorder.creacion;


import edesur.eorder.ws.creartdc.Body;
import edesur.eorder.ws.creartdc.DatosClave;
import edesur.eorder.ws.creartdc.Request;

import java.util.Map;

public class OrdenMacMapper {
    public Request mapRow(Map<String, Object> data) {
        DatosClave datosClave = new DatosClave();

        datosClave.setCodigoExternoTDC(getString(data, "nro_servicio"));
        datosClave.setTipoTDC("Corte");

        Body body = new Body();
        body.setDatosClave(datosClave);

        Request request = new Request();
        request.setBody(body);

        return request;
    }


    private String getString(Map<String, Object> data, String key) {
        Object o = data.get(key);
        return (o == null ? null : o.toString());
    }

}
