
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para GestionDesarolloCommercialVentasPorSolicitudCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GestionDesarolloCommercialVentasPorSolicitudCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CANTIDAD_DE_PRODUCTOS_A_INSTALAR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CARGA_INSTALADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLIENTE_EN_CALIDAD_DE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_DE_LA_SOLICITUD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FORMA_DE_PAGO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_Y_APELLIDO_CLIENTE_2" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DOCUMENTO_IDENTIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_ORDEN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_VENTA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PRESUPUESTO_O_COTIZACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCTO_VENTAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="PUNTO_DE_VENTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="RADICADO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="REPARACION_DE_ELECTRODOMESTICOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfReparacionDeElectrodomesticos" minOccurs="0"/&gt;
 *         &lt;element name="SUB_ZONA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO_CELULAR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DOCUMENTO_IDENTIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_SOLICITUD_VENTAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_VIVIENDA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="XML_EXTENSION_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionDesarolloCommercialVentasPorSolicitudCliente", propOrder = {

})
public class GestionDesarolloCommercialVentasPorSolicitudCliente {

    @XmlElement(name = "CANTIDAD_DE_PRODUCTOS_A_INSTALAR")
    protected Long cantidaddeproductosainstalar;
    @XmlElement(name = "CARGA_INSTALADA")
    protected String cargainstalada;
    @XmlElement(name = "CD")
    protected String cd;
    @XmlElement(name = "CLIENTE_EN_CALIDAD_DE")
    protected String clienteencalidadde;
    @XmlElement(name = "FECHA_DE_LA_SOLICITUD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechadelasolicitud;
    @XmlElement(name = "FORMA_DE_PAGO")
    protected String formadepago;
    @XmlElement(name = "NOMBRE_Y_APELLIDO_CLIENTE_2")
    protected String nombreyapellidocliente2;
    @XmlElement(name = "NUMERO_DOCUMENTO_IDENTIDAD")
    protected String numerodocumentoidentidad;
    @XmlElement(name = "NUMERO_ORDEN")
    protected Long numeroorden;
    @XmlElement(name = "NUMERO_VENTA")
    protected Long numeroventa;
    @XmlElement(name = "PRESUPUESTO_O_COTIZACION")
    protected String presupuestoocotizacion;
    @XmlElement(name = "PRODUCTO_VENTAS")
    protected String productoventas;
    @XmlElement(name = "PUNTO_DE_VENTA")
    protected String puntodeventa;
    @XmlElement(name = "RADICADO")
    protected String radicado;
    @XmlElement(name = "REPARACION_DE_ELECTRODOMESTICOS")
    protected ArrayOfReparacionDeElectrodomesticos reparaciondeelectrodomesticos;
    @XmlElement(name = "SUB_ZONA")
    protected String subzona;
    @XmlElement(name = "TELEFONO_CELULAR")
    protected String telefonocelular;
    @XmlElement(name = "TIPO_DOCUMENTO_IDENTIDAD")
    protected String tipodocumentoidentidad;
    @XmlElement(name = "TIPO_SOLICITUD_VENTAS")
    protected String tiposolicitudventas;
    @XmlElement(name = "TIPO_VIVIENDA")
    protected String tipovivienda;
    @XmlElement(name = "TR")
    protected String tr;
    @XmlElement(name = "XML_EXTENSION_PARAMS")
    protected String xmlextensionparams;

    /**
     * Obtiene el valor de la propiedad cantidaddeproductosainstalar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCANTIDADDEPRODUCTOSAINSTALAR() {
        return cantidaddeproductosainstalar;
    }

    /**
     * Define el valor de la propiedad cantidaddeproductosainstalar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCANTIDADDEPRODUCTOSAINSTALAR(Long value) {
        this.cantidaddeproductosainstalar = value;
    }

    /**
     * Obtiene el valor de la propiedad cargainstalada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARGAINSTALADA() {
        return cargainstalada;
    }

    /**
     * Define el valor de la propiedad cargainstalada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARGAINSTALADA(String value) {
        this.cargainstalada = value;
    }

    /**
     * Obtiene el valor de la propiedad cd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCD() {
        return cd;
    }

    /**
     * Define el valor de la propiedad cd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCD(String value) {
        this.cd = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteencalidadde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIENTEENCALIDADDE() {
        return clienteencalidadde;
    }

    /**
     * Define el valor de la propiedad clienteencalidadde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIENTEENCALIDADDE(String value) {
        this.clienteencalidadde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadelasolicitud.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADELASOLICITUD() {
        return fechadelasolicitud;
    }

    /**
     * Define el valor de la propiedad fechadelasolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADELASOLICITUD(XMLGregorianCalendar value) {
        this.fechadelasolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad formadepago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMADEPAGO() {
        return formadepago;
    }

    /**
     * Define el valor de la propiedad formadepago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMADEPAGO(String value) {
        this.formadepago = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreyapellidocliente2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBREYAPELLIDOCLIENTE2() {
        return nombreyapellidocliente2;
    }

    /**
     * Define el valor de la propiedad nombreyapellidocliente2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBREYAPELLIDOCLIENTE2(String value) {
        this.nombreyapellidocliente2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodocumentoidentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODOCUMENTOIDENTIDAD() {
        return numerodocumentoidentidad;
    }

    /**
     * Define el valor de la propiedad numerodocumentoidentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODOCUMENTOIDENTIDAD(String value) {
        this.numerodocumentoidentidad = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroorden.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNUMEROORDEN() {
        return numeroorden;
    }

    /**
     * Define el valor de la propiedad numeroorden.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNUMEROORDEN(Long value) {
        this.numeroorden = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroventa.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNUMEROVENTA() {
        return numeroventa;
    }

    /**
     * Define el valor de la propiedad numeroventa.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNUMEROVENTA(Long value) {
        this.numeroventa = value;
    }

    /**
     * Obtiene el valor de la propiedad presupuestoocotizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESUPUESTOOCOTIZACION() {
        return presupuestoocotizacion;
    }

    /**
     * Define el valor de la propiedad presupuestoocotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESUPUESTOOCOTIZACION(String value) {
        this.presupuestoocotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad productoventas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTOVENTAS() {
        return productoventas;
    }

    /**
     * Define el valor de la propiedad productoventas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTOVENTAS(String value) {
        this.productoventas = value;
    }

    /**
     * Obtiene el valor de la propiedad puntodeventa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUNTODEVENTA() {
        return puntodeventa;
    }

    /**
     * Define el valor de la propiedad puntodeventa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUNTODEVENTA(String value) {
        this.puntodeventa = value;
    }

    /**
     * Obtiene el valor de la propiedad radicado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRADICADO() {
        return radicado;
    }

    /**
     * Define el valor de la propiedad radicado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRADICADO(String value) {
        this.radicado = value;
    }

    /**
     * Obtiene el valor de la propiedad reparaciondeelectrodomesticos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReparacionDeElectrodomesticos }
     *     
     */
    public ArrayOfReparacionDeElectrodomesticos getREPARACIONDEELECTRODOMESTICOS() {
        return reparaciondeelectrodomesticos;
    }

    /**
     * Define el valor de la propiedad reparaciondeelectrodomesticos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReparacionDeElectrodomesticos }
     *     
     */
    public void setREPARACIONDEELECTRODOMESTICOS(ArrayOfReparacionDeElectrodomesticos value) {
        this.reparaciondeelectrodomesticos = value;
    }

    /**
     * Obtiene el valor de la propiedad subzona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBZONA() {
        return subzona;
    }

    /**
     * Define el valor de la propiedad subzona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBZONA(String value) {
        this.subzona = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonocelular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONOCELULAR() {
        return telefonocelular;
    }

    /**
     * Define el valor de la propiedad telefonocelular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONOCELULAR(String value) {
        this.telefonocelular = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodocumentoidentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODOCUMENTOIDENTIDAD() {
        return tipodocumentoidentidad;
    }

    /**
     * Define el valor de la propiedad tipodocumentoidentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODOCUMENTOIDENTIDAD(String value) {
        this.tipodocumentoidentidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tiposolicitudventas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOSOLICITUDVENTAS() {
        return tiposolicitudventas;
    }

    /**
     * Define el valor de la propiedad tiposolicitudventas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOSOLICITUDVENTAS(String value) {
        this.tiposolicitudventas = value;
    }

    /**
     * Obtiene el valor de la propiedad tipovivienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOVIVIENDA() {
        return tipovivienda;
    }

    /**
     * Define el valor de la propiedad tipovivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOVIVIENDA(String value) {
        this.tipovivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad tr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTR() {
        return tr;
    }

    /**
     * Define el valor de la propiedad tr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTR(String value) {
        this.tr = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlextensionparams.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLEXTENSIONPARAMS() {
        return xmlextensionparams;
    }

    /**
     * Define el valor de la propiedad xmlextensionparams.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLEXTENSIONPARAMS(String value) {
        this.xmlextensionparams = value;
    }

}
