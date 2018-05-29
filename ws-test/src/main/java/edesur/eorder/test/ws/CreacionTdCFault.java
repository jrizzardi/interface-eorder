package edesur.eorder.test.ws;

import javax.xml.ws.WebFault;

@WebFault(name = "MCD_Error", targetNamespace = "http://xmlns.endesa.com/CommonSchemas")
public class CreacionTdCFault extends Exception {
}
