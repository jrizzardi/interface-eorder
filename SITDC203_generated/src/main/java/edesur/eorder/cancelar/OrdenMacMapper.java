package edesur.eorder.cancelar;


import com.endesa.xmlns.commonschemas.SOAHeaderType;
import com.endesa.xmlns.wsdl.sscc.eorder.sitdc203.mensajes.AnulacionSuspensionCierreTdCRequestType;
import com.endesa.xmlns.wsdl.sscc.eorder.sitdc203.mensajes.RequestType;

import java.util.Map;

public class OrdenMacMapper {
    public AnulacionSuspensionCierreTdCRequestType mapRow(Map<String, Object> data) {

        RequestType body = new RequestType();
        body.setCODIGOEXTERNODELTDC(1);
        body.setCODIGOTIPODETDC("?");
        body.setLLAVESECRETA("?");
        body.setTIPODEOPERACION(1);

        SOAHeaderType header = new SOAHeaderType();

        AnulacionSuspensionCierreTdCRequestType request =
                new AnulacionSuspensionCierreTdCRequestType();
        request.setRequest(body);
        request.setSOAHeader(header);

        return request;
    }


    private String getString(Map<String, Object> data, String key) {
        Object o = data.get(key);
        return (o == null ? null : o.toString());
    }

}
