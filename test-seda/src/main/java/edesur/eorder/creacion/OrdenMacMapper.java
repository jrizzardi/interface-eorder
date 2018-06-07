package edesur.eorder.creacion;


import edesur.eorder.ws.creartdc.Body;
import edesur.eorder.ws.creartdc.DatosClave;
import edesur.eorder.ws.creartdc.Request;
import edesur.eorder.ws.creartdc.Suministro;

import java.util.Map;

public class OrdenMacMapper {
    public Request mapRow(Map<String, Object> data) {
        DatosClave datosClave = new DatosClave();
        Suministro suministro = new Suministro();

        datosClave.setCodigoExternoTDC(getString(data, "nro_servicio"));
        datosClave.setTipoTDC("Corte");

        suministro.setNOMBRE_Y_APELLIDO_CLIENTE(getString(data, "nombre"));
        suministro.setTEXTO_DIRECCION(getString(data, "direccion"));

        Body body = new Body();
        body.setDatosClave(datosClave);
        body.setSuministro(suministro);

        Request request = new Request();
        request.setBody(body);

        return request;
    }


    private String getString(Map<String, Object> data, String key) {
        Object o = data.get(key);
        return (o == null ? null : o.toString());
    }

}
