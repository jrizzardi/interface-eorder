package edesur.eorder.ws.cancelar;

import edesur.eorder.Config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", propOrder = {
})
public class BodyRequest {
    @XmlElement(name = "CODIGO_DISTRIBUIDORA", required = true)
    private final String codigoDistribuidora = Config.CodigoDistribuidora;

    @XmlElement(name = "CODIGO_EXTERNO_DEL_TDC", required = true)
    private String codigoExternoTDC;

    @XmlElement(name = "CODIGO_SISTEMA_EXTERNO_DE_ORIGEN", required = true)
    private final String codigoSistemaOrigen = Config.CodigoSistemaOrigen;

    @XmlElement(name = "CODIGO_TIPO_DE_TDC", required = true)
    private String tipoTDC;

    @XmlElement(name = "LLAVE_SECRETA", required = true)
    private String llaveSecreta;

    @XmlElement(name = "TIPO_DE_OPERACION")
    protected long tipoOperacion;

    public String getCodigoDistribuidora() {
        return codigoDistribuidora;
    }

    public String getCodigoExternoTDC() {
        return codigoExternoTDC;
    }

    public void setCodigoExternoTDC(String codigoExternoTDC) {
        this.codigoExternoTDC = codigoExternoTDC;
    }

    public String getCodigoSistemaOrigen() {
        return codigoSistemaOrigen;
    }

    public String getTipoTDC() {
        return tipoTDC;
    }

    public void setTipoTDC(String tipoTDC) {
        this.tipoTDC = tipoTDC;
    }

    public String getLlaveSecreta() {
        return llaveSecreta;
    }

    public void setLlaveSecreta(String llaveSecreta) {
        this.llaveSecreta = llaveSecreta;
    }

    public long getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(long tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
}
