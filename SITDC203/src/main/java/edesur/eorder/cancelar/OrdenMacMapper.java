package edesur.eorder.cancelar;


import edesur.eorder.ws.cancelar.Body;
import edesur.eorder.ws.cancelar.ObjectFactory;
import edesur.eorder.ws.cancelar.Request;
import edesur.eorder.ws.common.Header;

import java.util.Map;

public class OrdenMacMapper {
    public Request mapRow(Map<String, Object> data) {
        //ObjectFactory objectFactory = new ObjectFactory();

        Body body =
                //objectFactory.createBody();
                new Body();
        body.setCodigoExternoTDC("1");
        body.setTipoTDC("?");
        body.setLlaveSecreta("?");
        body.setTipoOperacion(1);

        Header header =
                //objectFactory.createHeader();
                new Header();

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
