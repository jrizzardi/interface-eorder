@XmlSchema(
        elementFormDefault=XmlNsForm.QUALIFIED,
        namespace="http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes",
        xmlns={
                @XmlNs(prefix = "soapenv", namespaceURI = "http://schemas.xmlsoap.org/soap/envelope/"),
                @XmlNs(prefix="men", namespaceURI="http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC203/Mensajes")
        }
)
package edesur.eorder.ws.cancelar;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;