package edesur.eorder.ws.resultados.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ResultadoEjecucion {
    @XmlElement(required = true)
    private String codigoExternoTdC;

    @XmlElement(required = true)
    private Date inicio;

    @XmlElement(required = true)
    private Date fin;

    @XmlElement(required = true)
    private String codigoCuadrilla;

    @XmlElement(required = true)
    private String situacionEncontrada;

    @XmlElement(required = true)
    private String accionRealizada;

    private String tipoCorte;

    private String observaciones;

    private String quienAtendio;

    private String documentoQuienAtendio;

    private String relacionQuienAtendio;

    private String anomalias;

    private ListaMateriales materiales;

    private ListaRecursos recursos;

    private ListaAnexos anexos;

    private UbicacionMedidor ubicacionMedidor;

    private DatosMedidor datosMedidor;


    public String getCodigoExternoTdC() {
        return codigoExternoTdC;
    }

    public void setCodigoExternoTdC(String codigoExternoTdC) {
        this.codigoExternoTdC = codigoExternoTdC;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getCodigoCuadrilla() {
        return codigoCuadrilla;
    }

    public void setCodigoCuadrilla(String codigoCuadrilla) {
        this.codigoCuadrilla = codigoCuadrilla;
    }

    public String getSituacionEncontrada() {
        return situacionEncontrada;
    }

    public void setSituacionEncontrada(String situacionEncontrada) {
        this.situacionEncontrada = situacionEncontrada;
    }

    public String getAccionRealizada() {
        return accionRealizada;
    }

    public void setAccionRealizada(String accionRealizada) {
        this.accionRealizada = accionRealizada;
    }

    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getQuienAtendio() {
        return quienAtendio;
    }

    public void setQuienAtendio(String quienAtendio) {
        this.quienAtendio = quienAtendio;
    }

    public String getDocumentoCliente() {
        return documentoQuienAtendio;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoQuienAtendio = documentoCliente;
    }

    public String getRelacion() {
        return relacionQuienAtendio;
    }

    public void setRelacion(String relacion) {
        this.relacionQuienAtendio = relacion;
    }

    public String getAnomalias() {
        return anomalias;
    }

    public void setAnomalias(String anomalias) {
        this.anomalias = anomalias;
    }

    public ListaMateriales getMateriales() {
        return materiales;
    }

    public void setMateriales(ListaMateriales materiales) {
        this.materiales = materiales;
    }

    public ListaRecursos getRecursos() {
        return recursos;
    }

    public void setRecursos(ListaRecursos recursos) {
        this.recursos = recursos;
    }

    public ListaAnexos getAnexos() {
        return anexos;
    }

    public void setAnexos(ListaAnexos anexos) {
        this.anexos = anexos;
    }

    public UbicacionMedidor getUbicacionMedidor() {
        return ubicacionMedidor;
    }

    public void setUbicacionMedidor(UbicacionMedidor ubicacionMedidor) {
        this.ubicacionMedidor = ubicacionMedidor;
    }

    public DatosMedidor getDatosMedidor() {
        return datosMedidor;
    }

    public void setDatosMedidor(DatosMedidor datosMedidor) {
        this.datosMedidor = datosMedidor;
    }
}
