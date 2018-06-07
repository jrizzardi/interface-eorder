
package edesur.eorder.ws.creartdc;

import edesur.eorder.Config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosClave", propOrder = {
})
public class DatosClave {
    @XmlElement(name = "CODIGO_DISTRIBUIDORA", required = true)
    private final String codigoDistribuidora = Config.CodigoDistribuidora;

    @XmlElement(name = "CODIGO_EXTERNO_DEL_TDC", required = true)
    private String codigoExternoTDC;

    @XmlElement(name = "CODIGO_PROCESO", required = true)
    private String codigoProceso;

    @XmlElement(name = "CODIGO_SISTEMA_EXTERNO_DE_ORIGEN", required = true)
    private final String codigoSistemaOrigen = Config.CodigoSistemaOrigen;

    @XmlElement(name = "CODIGO_SUBPROCESO", required = true)
    private String codigoSubproceso;

    @XmlElement(name = "CODIGO_TIPO_DE_TDC", required = true)
    private String tipoTDC;

    @XmlElement(name = "LLAVE_SECRETA", required = true)
    private String llaveSecreta;


    public String getCodigoDistribuidora() {
        return codigoDistribuidora;
    }

    public String getCodigoExternoTDC() {
        return codigoExternoTDC;
    }

    public void setCodigoExternoTDC(String value) {
        this.codigoExternoTDC = value;
    }

    public String getCodigoProceso() {
        return codigoProceso;
    }

    public void setCodigoProceso(String value) {
        this.codigoProceso = value;
    }

    public String getCodigoSistemaOrigen() {
        return codigoSistemaOrigen;
    }

    public String getCodigoSubproceso() {
        return codigoSubproceso;
    }

    public void setCodigoSubproceso(String value) {
        this.codigoSubproceso = value;
    }

    public String getTipoTDC() {
        return tipoTDC;
    }

    public void setTipoTDC(String value) {
        this.tipoTDC = value;
    }

    public String getLlaveSecreta() {
        return llaveSecreta;
    }

    public void setLlaveSecreta(String value) {
        this.llaveSecreta = value;
    }
}
