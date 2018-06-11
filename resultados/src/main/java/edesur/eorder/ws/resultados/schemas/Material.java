package edesur.eorder.ws.resultados.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Material {
    @XmlElement(required = true)
    private String categoria;

    @XmlElement(required = true)
    private String codigo;

    @XmlElement(required = true)
    private String seriado;

    @XmlElement(required = true)
    private String consumidoRetirado;

    @XmlElement(required = true)
    private BigDecimal cantidad;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSeriado() {
        return seriado;
    }

    public void setSeriado(String seriado) {
        this.seriado = seriado;
    }

    public String getConsumidoRetirado() {
        return consumidoRetirado;
    }

    public void setConsumidoRetirado(String consumidoRetirado) {
        this.consumidoRetirado = consumidoRetirado;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
}
