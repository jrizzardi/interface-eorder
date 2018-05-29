
package edesur.eorder.ws.creacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", propOrder = {
    "datosClave",
    "datoscomunesprocesostdc",
    "gestiondesarollocommercialurgenciasinternas",
    "gestiondesarollocommercialventasporsolicitudcliente",
    "gestionfiscalizacionenfrio",
    "gestionimpagoscobranza",
    "gestionimpagosscr",
    "gestionnuevasconexiones",
    "gestionperdidasinspecciones",
    "gestionperdidasnormalizaciones",
    "gestionperdidassmartmeter"
})
public class Body {

    @XmlElement(name = "DATOS_CLAVE_PROCESOS_TDC", required = true)
    protected DatosClave datosClave;

    /*
    @XmlElement(name = "DATOS_COMUNES_PROCESOS_TDC", required = true)
    protected DatosComunesProcesosTDC datoscomunesprocesostdc;
    @XmlElement(name = "GESTION_DESAROLLO_COMMERCIAL_URGENCIAS_INTERNAS")
    protected GestionDesarolloCommercialUrgenciasInternas gestiondesarollocommercialurgenciasinternas;
    @XmlElement(name = "GESTION_DESAROLLO_COMMERCIAL_VENTAS_POR_SOLICITUD_CLIENTE")
    protected GestionDesarolloCommercialVentasPorSolicitudCliente gestiondesarollocommercialventasporsolicitudcliente;
    @XmlElement(name = "GESTION_FISCALIZACION_EN_FRIO")
    protected GestionFiscalizacionEnFrio gestionfiscalizacionenfrio;
    @XmlElement(name = "GESTION_IMPAGOS_COBRANZA")
    protected GestionImpagosCobranza gestionimpagoscobranza;
    @XmlElement(name = "GESTION_IMPAGOS_SCR")
    protected GestionImpagosSCR gestionimpagosscr;
    @XmlElement(name = "GESTION_NUEVAS_CONEXIONES")
    protected GestionNuevasConexiones gestionnuevasconexiones;
    @XmlElement(name = "GESTION_PERDIDAS_INSPECCIONES")
    protected GestionPerdidasInspecciones gestionperdidasinspecciones;
    @XmlElement(name = "GESTION_PERDIDAS_NORMALIZACIONES")
    protected GestionPerdidasNormalizaciones gestionperdidasnormalizaciones;
    @XmlElement(name = "GESTION_PERDIDAS_SMARTMETER")
    protected GestionPerdidasSmartMeter gestionperdidassmartmeter;
*/


    public DatosClave getDatosClave() {
        return datosClave;
    }

    public void setDatosClave(DatosClave value) {
        this.datosClave = value;
    }


    /*
    public DatosComunesProcesosTDC getDATOSCOMUNESPROCESOSTDC() {
        return datoscomunesprocesostdc;
    }

    public void setDATOSCOMUNESPROCESOSTDC(DatosComunesProcesosTDC value) {
        this.datoscomunesprocesostdc = value;
    }

    public GestionDesarolloCommercialUrgenciasInternas getGESTIONDESAROLLOCOMMERCIALURGENCIASINTERNAS() {
        return gestiondesarollocommercialurgenciasinternas;
    }

    public void setGESTIONDESAROLLOCOMMERCIALURGENCIASINTERNAS(GestionDesarolloCommercialUrgenciasInternas value) {
        this.gestiondesarollocommercialurgenciasinternas = value;
    }

    public GestionDesarolloCommercialVentasPorSolicitudCliente getGESTIONDESAROLLOCOMMERCIALVENTASPORSOLICITUDCLIENTE() {
        return gestiondesarollocommercialventasporsolicitudcliente;
    }

    public void setGESTIONDESAROLLOCOMMERCIALVENTASPORSOLICITUDCLIENTE(GestionDesarolloCommercialVentasPorSolicitudCliente value) {
        this.gestiondesarollocommercialventasporsolicitudcliente = value;
    }

    public GestionFiscalizacionEnFrio getGESTIONFISCALIZACIONENFRIO() {
        return gestionfiscalizacionenfrio;
    }

    public void setGESTIONFISCALIZACIONENFRIO(GestionFiscalizacionEnFrio value) {
        this.gestionfiscalizacionenfrio = value;
    }

    public GestionImpagosCobranza getGESTIONIMPAGOSCOBRANZA() {
        return gestionimpagoscobranza;
    }

    public void setGESTIONIMPAGOSCOBRANZA(GestionImpagosCobranza value) {
        this.gestionimpagoscobranza = value;
    }

    public GestionImpagosSCR getGESTIONIMPAGOSSCR() {
        return gestionimpagosscr;
    }

    public void setGESTIONIMPAGOSSCR(GestionImpagosSCR value) {
        this.gestionimpagosscr = value;
    }

    public GestionNuevasConexiones getGESTIONNUEVASCONEXIONES() {
        return gestionnuevasconexiones;
    }

    public void setGESTIONNUEVASCONEXIONES(GestionNuevasConexiones value) {
        this.gestionnuevasconexiones = value;
    }

    public GestionPerdidasInspecciones getGESTIONPERDIDASINSPECCIONES() {
        return gestionperdidasinspecciones;
    }

    public void setGESTIONPERDIDASINSPECCIONES(GestionPerdidasInspecciones value) {
        this.gestionperdidasinspecciones = value;
    }

    public GestionPerdidasNormalizaciones getGESTIONPERDIDASNORMALIZACIONES() {
        return gestionperdidasnormalizaciones;
    }

    public void setGESTIONPERDIDASNORMALIZACIONES(GestionPerdidasNormalizaciones value) {
        this.gestionperdidasnormalizaciones = value;
    }

    public GestionPerdidasSmartMeter getGESTIONPERDIDASSMARTMETER() {
        return gestionperdidassmartmeter;
    }

    public void setGESTIONPERDIDASSMARTMETER(GestionPerdidasSmartMeter value) {
        this.gestionperdidassmartmeter = value;
    }
    */
}
