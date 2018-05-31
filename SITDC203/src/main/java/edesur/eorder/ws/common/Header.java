package edesur.eorder.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header", propOrder = {
    "soaId",
    "sourceApplication",
    "serviceName",
    "externalId",
    "ip",
    "client",
    "user",
    "language",
    "version",
    "architectureVersion"
})
public class Header {

    @XmlElement(name = "SOAId")
    protected String soaId = "?";

    @XmlElement(name = "SourceApplication", required = true)
    protected String sourceApplication = "?";

    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName = "?";

    @XmlElement(name = "ExternalId", required = true)
    protected String externalId = "?";

    @XmlElement(name = "IP", required = true)
    protected String ip = "?";

    @XmlElement(name = "Client", required = true)
    protected String client = "?";

    @XmlElement(name = "User")
    protected String user = "?";

    @XmlElement(name = "Language", required = true)
    protected String language = "?";

    @XmlElement(name = "Version", required = true)
    protected String version = "?";

    @XmlElement(name = "ArchitectureVersion")
    protected String architectureVersion = "?";


    public String getSOAId() {
        return soaId;
    }

    public void setSOAId(String value) {
        this.soaId = value;
    }

    public String getSourceApplication() {
        return sourceApplication;
    }

    public void setSourceApplication(String value) {
        this.sourceApplication = value;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String value) {
        this.externalId = value;
    }

    public String getIP() {
        return ip;
    }

    public void setIP(String value) {
        this.ip = value;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String value) {
        this.client = value;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    public String getArchitectureVersion() {
        return architectureVersion;
    }

    public void setArchitectureVersion(String value) {
        this.architectureVersion = value;
    }
}
