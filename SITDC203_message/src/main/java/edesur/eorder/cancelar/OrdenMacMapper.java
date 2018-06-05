package edesur.eorder.cancelar;


import edesur.eorder.ws.cancelar.BodyRequest;
import edesur.eorder.ws.cancelar.Request;
import edesur.eorder.ws.common.HeaderRequest;

import java.util.Map;

public class OrdenMacMapper {
    public Request mapRow(Map<String, Object> data) {
        //ObjectFactory objectFactory = new ObjectFactory();

        BodyRequest body =
                //objectFactory.createBody();
                new BodyRequest();
        body.setCodigoExternoTDC("1");
        body.setTipoTDC("?");
        body.setLlaveSecreta("?");
        body.setTipoOperacion(1);

        HeaderRequest header =
                //objectFactory.createHeader();
                new HeaderRequest();

        Request request =
                //objectFactory.createRequest();
                new Request();
        request.setBody(body);
        request.setHeader(header);

        return request;
    }


    private String getString(Map<String, Object> data, String key) {
        Object o = data.get(key);
        return (o == null ? null : o.toString());
    }

}
