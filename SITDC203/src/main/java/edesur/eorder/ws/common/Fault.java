package edesur.eorder.ws.common;

import javax.xml.ws.WebFault;

@WebFault(name = "MCD_Error", targetNamespace = "http://xmlns.endesa.com/CommonSchemas")
public class Fault extends Exception {
    private MCDERROR mcdError;

    public Fault() {
        super();
    }

    public Fault(String message) {
        super(message);
    }

    public Fault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Fault(String message, MCDERROR mcdError) {
        super(message);
        this.mcdError = mcdError;
    }

    public Fault(String message, MCDERROR mcdError, java.lang.Throwable cause) {
        super(message, cause);
        this.mcdError = mcdError;
    }

    public MCDERROR getFaultInfo() {
        return this.mcdError;
    }
}
