
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATOS_CLAVE_PROCESOS_TDC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}DatosClaveProcesosTDC"/&gt;
 *         &lt;element name="DATOS_COMUNES_PROCESOS_TDC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}DatosComunesProcesosTDC"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="GESTION_DESAROLLO_COMMERCIAL_URGENCIAS_INTERNAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionDesarolloCommercialUrgenciasInternas" minOccurs="0"/&gt;
 *           &lt;element name="GESTION_DESAROLLO_COMMERCIAL_VENTAS_POR_SOLICITUD_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionDesarolloCommercialVentasPorSolicitudCliente" minOccurs="0"/&gt;
 *           &lt;element name="GESTION_FISCALIZACION_EN_FRIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionFiscalizacionEnFrio" minOccurs="0"/&gt;
 *           &lt;element name="GESTION_IMPAGOS_COBRANZA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionImpagosCobranza" minOccurs="0"/&gt;
 *           &lt;element name="GESTION_IMPAGOS_SCR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionImpagosSCR" minOccurs="0"/&gt;
 *           &lt;element name="GESTION_NUEVAS_CONEXIONES" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionNuevasConexiones" minOccurs="0"/&gt;
 *           &lt;element name="GESTION_PERDIDAS_INSPECCIONES" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionPerdidasInspecciones" minOccurs="0"/&gt;
 *           &lt;element name="GESTION_PERDIDAS_NORMALIZACIONES" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionPerdidasNormalizaciones" minOccurs="0"/&gt;
 *           &lt;element name="GESTION_PERDIDAS_SMARTMETER" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}GestionPerdidasSmartMeter" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "datosclaveprocesostdc",
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
public class RequestType {

    @XmlElement(name = "DATOS_CLAVE_PROCESOS_TDC", required = true)
    protected DatosClaveProcesosTDC datosclaveprocesostdc;
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

    /**
     * Obtiene el valor de la propiedad datosclaveprocesostdc.
     * 
     * @return
     *     possible object is
     *     {@link DatosClaveProcesosTDC }
     *     
     */
    public DatosClaveProcesosTDC getDATOSCLAVEPROCESOSTDC() {
        return datosclaveprocesostdc;
    }

    /**
     * Define el valor de la propiedad datosclaveprocesostdc.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosClaveProcesosTDC }
     *     
     */
    public void setDATOSCLAVEPROCESOSTDC(DatosClaveProcesosTDC value) {
        this.datosclaveprocesostdc = value;
    }

    /**
     * Obtiene el valor de la propiedad datoscomunesprocesostdc.
     * 
     * @return
     *     possible object is
     *     {@link DatosComunesProcesosTDC }
     *     
     */
    public DatosComunesProcesosTDC getDATOSCOMUNESPROCESOSTDC() {
        return datoscomunesprocesostdc;
    }

    /**
     * Define el valor de la propiedad datoscomunesprocesostdc.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosComunesProcesosTDC }
     *     
     */
    public void setDATOSCOMUNESPROCESOSTDC(DatosComunesProcesosTDC value) {
        this.datoscomunesprocesostdc = value;
    }

    /**
     * Obtiene el valor de la propiedad gestiondesarollocommercialurgenciasinternas.
     * 
     * @return
     *     possible object is
     *     {@link GestionDesarolloCommercialUrgenciasInternas }
     *     
     */
    public GestionDesarolloCommercialUrgenciasInternas getGESTIONDESAROLLOCOMMERCIALURGENCIASINTERNAS() {
        return gestiondesarollocommercialurgenciasinternas;
    }

    /**
     * Define el valor de la propiedad gestiondesarollocommercialurgenciasinternas.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionDesarolloCommercialUrgenciasInternas }
     *     
     */
    public void setGESTIONDESAROLLOCOMMERCIALURGENCIASINTERNAS(GestionDesarolloCommercialUrgenciasInternas value) {
        this.gestiondesarollocommercialurgenciasinternas = value;
    }

    /**
     * Obtiene el valor de la propiedad gestiondesarollocommercialventasporsolicitudcliente.
     * 
     * @return
     *     possible object is
     *     {@link GestionDesarolloCommercialVentasPorSolicitudCliente }
     *     
     */
    public GestionDesarolloCommercialVentasPorSolicitudCliente getGESTIONDESAROLLOCOMMERCIALVENTASPORSOLICITUDCLIENTE() {
        return gestiondesarollocommercialventasporsolicitudcliente;
    }

    /**
     * Define el valor de la propiedad gestiondesarollocommercialventasporsolicitudcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionDesarolloCommercialVentasPorSolicitudCliente }
     *     
     */
    public void setGESTIONDESAROLLOCOMMERCIALVENTASPORSOLICITUDCLIENTE(GestionDesarolloCommercialVentasPorSolicitudCliente value) {
        this.gestiondesarollocommercialventasporsolicitudcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad gestionfiscalizacionenfrio.
     * 
     * @return
     *     possible object is
     *     {@link GestionFiscalizacionEnFrio }
     *     
     */
    public GestionFiscalizacionEnFrio getGESTIONFISCALIZACIONENFRIO() {
        return gestionfiscalizacionenfrio;
    }

    /**
     * Define el valor de la propiedad gestionfiscalizacionenfrio.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionFiscalizacionEnFrio }
     *     
     */
    public void setGESTIONFISCALIZACIONENFRIO(GestionFiscalizacionEnFrio value) {
        this.gestionfiscalizacionenfrio = value;
    }

    /**
     * Obtiene el valor de la propiedad gestionimpagoscobranza.
     * 
     * @return
     *     possible object is
     *     {@link GestionImpagosCobranza }
     *     
     */
    public GestionImpagosCobranza getGESTIONIMPAGOSCOBRANZA() {
        return gestionimpagoscobranza;
    }

    /**
     * Define el valor de la propiedad gestionimpagoscobranza.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionImpagosCobranza }
     *     
     */
    public void setGESTIONIMPAGOSCOBRANZA(GestionImpagosCobranza value) {
        this.gestionimpagoscobranza = value;
    }

    /**
     * Obtiene el valor de la propiedad gestionimpagosscr.
     * 
     * @return
     *     possible object is
     *     {@link GestionImpagosSCR }
     *     
     */
    public GestionImpagosSCR getGESTIONIMPAGOSSCR() {
        return gestionimpagosscr;
    }

    /**
     * Define el valor de la propiedad gestionimpagosscr.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionImpagosSCR }
     *     
     */
    public void setGESTIONIMPAGOSSCR(GestionImpagosSCR value) {
        this.gestionimpagosscr = value;
    }

    /**
     * Obtiene el valor de la propiedad gestionnuevasconexiones.
     * 
     * @return
     *     possible object is
     *     {@link GestionNuevasConexiones }
     *     
     */
    public GestionNuevasConexiones getGESTIONNUEVASCONEXIONES() {
        return gestionnuevasconexiones;
    }

    /**
     * Define el valor de la propiedad gestionnuevasconexiones.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionNuevasConexiones }
     *     
     */
    public void setGESTIONNUEVASCONEXIONES(GestionNuevasConexiones value) {
        this.gestionnuevasconexiones = value;
    }

    /**
     * Obtiene el valor de la propiedad gestionperdidasinspecciones.
     * 
     * @return
     *     possible object is
     *     {@link GestionPerdidasInspecciones }
     *     
     */
    public GestionPerdidasInspecciones getGESTIONPERDIDASINSPECCIONES() {
        return gestionperdidasinspecciones;
    }

    /**
     * Define el valor de la propiedad gestionperdidasinspecciones.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionPerdidasInspecciones }
     *     
     */
    public void setGESTIONPERDIDASINSPECCIONES(GestionPerdidasInspecciones value) {
        this.gestionperdidasinspecciones = value;
    }

    /**
     * Obtiene el valor de la propiedad gestionperdidasnormalizaciones.
     * 
     * @return
     *     possible object is
     *     {@link GestionPerdidasNormalizaciones }
     *     
     */
    public GestionPerdidasNormalizaciones getGESTIONPERDIDASNORMALIZACIONES() {
        return gestionperdidasnormalizaciones;
    }

    /**
     * Define el valor de la propiedad gestionperdidasnormalizaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionPerdidasNormalizaciones }
     *     
     */
    public void setGESTIONPERDIDASNORMALIZACIONES(GestionPerdidasNormalizaciones value) {
        this.gestionperdidasnormalizaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad gestionperdidassmartmeter.
     * 
     * @return
     *     possible object is
     *     {@link GestionPerdidasSmartMeter }
     *     
     */
    public GestionPerdidasSmartMeter getGESTIONPERDIDASSMARTMETER() {
        return gestionperdidassmartmeter;
    }

    /**
     * Define el valor de la propiedad gestionperdidassmartmeter.
     * 
     * @param value
     *     allowed object is
     *     {@link GestionPerdidasSmartMeter }
     *     
     */
    public void setGESTIONPERDIDASSMARTMETER(GestionPerdidasSmartMeter value) {
        this.gestionperdidassmartmeter = value;
    }

}
