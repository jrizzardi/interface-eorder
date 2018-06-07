
package edesur.eorder.ws.creartdc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Clase Java para Suministro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Suministro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODIGO_CLIENTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_Y_APELLIDO_CLIENTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_TIPO_CLIENTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="RUTA_DE_LECTURA" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO_CONTACTO" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TARIFA_EXISTENTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLAVE_TARIFA" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DEUDA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ANTIGUEDAD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="GIRO_DE_NEGOCIO" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LATITUD_CLIENTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="LONGITUD_CLIENTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_VIA" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_VIA_DIRECCION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_PLACA_DIRECCION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_UNIDAD_PREDIAL" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUM_UNIDAD_PREDIAL" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="COD_MODALIDAD_UNIDAD_PREDIAL" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUM_MODALIDAD_UNIDAD_PREDIAL" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="LOCALIZACION_TERRENO" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="ID_COD_MUNICIPIO" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_AGRUPACION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="AGRUPACION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="MANZANA" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="LOTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="PROVINCIA" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_POSTAL" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="INDICADOR_D_DIRECCION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TEXTO_DIRECCION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="COD_NOMBRE_VIA" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CLASE_DE_VIA" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_LETRA_VIA_DIRECCION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CARDINAL_VIA" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_CRUCE_DIRECCION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="COD_LETRA_CRUCE_DIRECCION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_CARDINAL_CRUCE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COD_TIPO_UNIDAD_PREDIAL" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUM_TIPO_UNIDAD_PREDIAL" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="ID_COD_BARRIO" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PISO" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SUCURSAL" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LOCALIDAD" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="UPZ" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SUBCLASE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ESTADO_CONEXION" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_SOLICITANTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_200" minOccurs="0"/&gt;
 *         &lt;element name="TELEFONO_SOLICITANTE" type="{http://xmlns.enel.com/edesur/presentation/requesttdc/abstractwsdl/xsd/P001CSchema}alfanumerico_15" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suministro", propOrder = {
    "codigo_CLIENTE",
    "nombre_Y_APELLIDO_CLIENTE",
    "codigo_TIPO_CLIENTE",
    "ruta_DE_LECTURA",
    "telefono_CONTACTO",
    "tarifa_EXISTENTE",
    "clave_TARIFA",
    "deuda",
    "antiguedad",
    "giro_DE_NEGOCIO",
    "latitud_CLIENTE",
    "longitud_CLIENTE",
    "tipo_VIA",
    "numero_VIA_DIRECCION",
    "numero_PLACA_DIRECCION",
    "cod_UNIDAD_PREDIAL",
    "num_UNIDAD_PREDIAL",
    "cod_MODALIDAD_UNIDAD_PREDIAL",
    "num_MODALIDAD_UNIDAD_PREDIAL",
    "localizacion_TERRENO",
    "id_COD_MUNICIPIO",
    "tipo_AGRUPACION",
    "agrupacion",
    "manzana",
    "lote",
    "provincia",
    "codigo_POSTAL",
    "indicador_D_DIRECCION",
    "texto_DIRECCION",
    "cod_NOMBRE_VIA",
    "cod_CLASE_DE_VIA",
    "cod_LETRA_VIA_DIRECCION",
    "cod_CARDINAL_VIA",
    "numero_CRUCE_DIRECCION",
    "cod_LETRA_CRUCE_DIRECCION",
    "cod_CARDINAL_CRUCE",
    "cod_TIPO_UNIDAD_PREDIAL",
    "num_TIPO_UNIDAD_PREDIAL",
    "id_COD_BARRIO",
    "piso",
    "sucursal",
    "localidad",
    "upz",
    "subclase",
    "estado_CONEXION",
    "nombre_SOLICITANTE",
    "telefono_SOLICITANTE"
})
public class Suministro {

    @XmlElement(name = "CODIGO_CLIENTE")
    protected String codigo_CLIENTE;
    @XmlElement(name = "NOMBRE_Y_APELLIDO_CLIENTE")
    protected String nombre_Y_APELLIDO_CLIENTE;
    @XmlElement(name = "CODIGO_TIPO_CLIENTE")
    protected String codigo_TIPO_CLIENTE;
    @XmlElement(name = "RUTA_DE_LECTURA")
    protected String ruta_DE_LECTURA;
    @XmlElement(name = "TELEFONO_CONTACTO")
    protected String telefono_CONTACTO;
    @XmlElement(name = "TARIFA_EXISTENTE")
    protected String tarifa_EXISTENTE;
    @XmlElement(name = "CLAVE_TARIFA")
    protected String clave_TARIFA;
    @XmlElement(name = "DEUDA")
    protected Double deuda;
    @XmlElement(name = "ANTIGUEDAD")
    protected Long antiguedad;
    @XmlElement(name = "GIRO_DE_NEGOCIO")
    protected String giro_DE_NEGOCIO;
    @XmlElement(name = "LATITUD_CLIENTE")
    protected BigDecimal latitud_CLIENTE;
    @XmlElement(name = "LONGITUD_CLIENTE")
    protected BigDecimal longitud_CLIENTE;
    @XmlElement(name = "TIPO_VIA")
    protected String tipo_VIA;
    @XmlElement(name = "NUMERO_VIA_DIRECCION")
    protected String numero_VIA_DIRECCION;
    @XmlElement(name = "NUMERO_PLACA_DIRECCION")
    protected String numero_PLACA_DIRECCION;
    @XmlElement(name = "COD_UNIDAD_PREDIAL")
    protected String cod_UNIDAD_PREDIAL;
    @XmlElement(name = "NUM_UNIDAD_PREDIAL")
    protected String num_UNIDAD_PREDIAL;
    @XmlElement(name = "COD_MODALIDAD_UNIDAD_PREDIAL")
    protected String cod_MODALIDAD_UNIDAD_PREDIAL;
    @XmlElement(name = "NUM_MODALIDAD_UNIDAD_PREDIAL")
    protected String num_MODALIDAD_UNIDAD_PREDIAL;
    @XmlElement(name = "LOCALIZACION_TERRENO")
    protected String localizacion_TERRENO;
    @XmlElement(name = "ID_COD_MUNICIPIO")
    protected String id_COD_MUNICIPIO;
    @XmlElement(name = "TIPO_AGRUPACION")
    protected String tipo_AGRUPACION;
    @XmlElement(name = "AGRUPACION")
    protected String agrupacion;
    @XmlElement(name = "MANZANA")
    protected String manzana;
    @XmlElement(name = "LOTE")
    protected String lote;
    @XmlElement(name = "PROVINCIA")
    protected String provincia;
    @XmlElement(name = "CODIGO_POSTAL")
    protected String codigo_POSTAL;
    @XmlElement(name = "INDICADOR_D_DIRECCION")
    protected String indicador_D_DIRECCION;
    @XmlElement(name = "TEXTO_DIRECCION")
    protected String texto_DIRECCION;
    @XmlElement(name = "COD_NOMBRE_VIA")
    protected String cod_NOMBRE_VIA;
    @XmlElement(name = "COD_CLASE_DE_VIA")
    protected String cod_CLASE_DE_VIA;
    @XmlElement(name = "COD_LETRA_VIA_DIRECCION")
    protected String cod_LETRA_VIA_DIRECCION;
    @XmlElement(name = "COD_CARDINAL_VIA")
    protected String cod_CARDINAL_VIA;
    @XmlElement(name = "NUMERO_CRUCE_DIRECCION")
    protected String numero_CRUCE_DIRECCION;
    @XmlElement(name = "COD_LETRA_CRUCE_DIRECCION")
    protected String cod_LETRA_CRUCE_DIRECCION;
    @XmlElement(name = "COD_CARDINAL_CRUCE")
    protected String cod_CARDINAL_CRUCE;
    @XmlElement(name = "COD_TIPO_UNIDAD_PREDIAL")
    protected String cod_TIPO_UNIDAD_PREDIAL;
    @XmlElement(name = "NUM_TIPO_UNIDAD_PREDIAL")
    protected String num_TIPO_UNIDAD_PREDIAL;
    @XmlElement(name = "ID_COD_BARRIO")
    protected String id_COD_BARRIO;
    @XmlElement(name = "PISO")
    protected String piso;
    @XmlElement(name = "SUCURSAL")
    protected String sucursal;
    @XmlElement(name = "LOCALIDAD")
    protected String localidad;
    @XmlElement(name = "UPZ")
    protected String upz;
    @XmlElement(name = "SUBCLASE")
    protected String subclase;
    @XmlElement(name = "ESTADO_CONEXION")
    protected String estado_CONEXION;
    @XmlElement(name = "NOMBRE_SOLICITANTE")
    protected String nombre_SOLICITANTE;
    @XmlElement(name = "TELEFONO_SOLICITANTE")
    protected String telefono_SOLICITANTE;

    /**
     * Obtiene el valor de la propiedad codigo_CLIENTE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGO_CLIENTE() {
        return codigo_CLIENTE;
    }

    /**
     * Define el valor de la propiedad codigo_CLIENTE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGO_CLIENTE(String value) {
        this.codigo_CLIENTE = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre_Y_APELLIDO_CLIENTE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE_Y_APELLIDO_CLIENTE() {
        return nombre_Y_APELLIDO_CLIENTE;
    }

    /**
     * Define el valor de la propiedad nombre_Y_APELLIDO_CLIENTE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE_Y_APELLIDO_CLIENTE(String value) {
        this.nombre_Y_APELLIDO_CLIENTE = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo_TIPO_CLIENTE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGO_TIPO_CLIENTE() {
        return codigo_TIPO_CLIENTE;
    }

    /**
     * Define el valor de la propiedad codigo_TIPO_CLIENTE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGO_TIPO_CLIENTE(String value) {
        this.codigo_TIPO_CLIENTE = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta_DE_LECTURA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUTA_DE_LECTURA() {
        return ruta_DE_LECTURA;
    }

    /**
     * Define el valor de la propiedad ruta_DE_LECTURA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUTA_DE_LECTURA(String value) {
        this.ruta_DE_LECTURA = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono_CONTACTO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONO_CONTACTO() {
        return telefono_CONTACTO;
    }

    /**
     * Define el valor de la propiedad telefono_CONTACTO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONO_CONTACTO(String value) {
        this.telefono_CONTACTO = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifa_EXISTENTE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARIFA_EXISTENTE() {
        return tarifa_EXISTENTE;
    }

    /**
     * Define el valor de la propiedad tarifa_EXISTENTE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARIFA_EXISTENTE(String value) {
        this.tarifa_EXISTENTE = value;
    }

    /**
     * Obtiene el valor de la propiedad clave_TARIFA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAVE_TARIFA() {
        return clave_TARIFA;
    }

    /**
     * Define el valor de la propiedad clave_TARIFA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAVE_TARIFA(String value) {
        this.clave_TARIFA = value;
    }

    /**
     * Obtiene el valor de la propiedad deuda.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDEUDA() {
        return deuda;
    }

    /**
     * Define el valor de la propiedad deuda.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDEUDA(Double value) {
        this.deuda = value;
    }

    /**
     * Obtiene el valor de la propiedad antiguedad.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getANTIGUEDAD() {
        return antiguedad;
    }

    /**
     * Define el valor de la propiedad antiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setANTIGUEDAD(Long value) {
        this.antiguedad = value;
    }

    /**
     * Obtiene el valor de la propiedad giro_DE_NEGOCIO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIRO_DE_NEGOCIO() {
        return giro_DE_NEGOCIO;
    }

    /**
     * Define el valor de la propiedad giro_DE_NEGOCIO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIRO_DE_NEGOCIO(String value) {
        this.giro_DE_NEGOCIO = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud_CLIENTE.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATITUD_CLIENTE() {
        return latitud_CLIENTE;
    }

    /**
     * Define el valor de la propiedad latitud_CLIENTE.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATITUD_CLIENTE(BigDecimal value) {
        this.latitud_CLIENTE = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud_CLIENTE.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLONGITUD_CLIENTE() {
        return longitud_CLIENTE;
    }

    /**
     * Define el valor de la propiedad longitud_CLIENTE.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLONGITUD_CLIENTE(BigDecimal value) {
        this.longitud_CLIENTE = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo_VIA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO_VIA() {
        return tipo_VIA;
    }

    /**
     * Define el valor de la propiedad tipo_VIA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPO_VIA(String value) {
        this.tipo_VIA = value;
    }

    /**
     * Obtiene el valor de la propiedad numero_VIA_DIRECCION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERO_VIA_DIRECCION() {
        return numero_VIA_DIRECCION;
    }

    /**
     * Define el valor de la propiedad numero_VIA_DIRECCION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERO_VIA_DIRECCION(String value) {
        this.numero_VIA_DIRECCION = value;
    }

    /**
     * Obtiene el valor de la propiedad numero_PLACA_DIRECCION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERO_PLACA_DIRECCION() {
        return numero_PLACA_DIRECCION;
    }

    /**
     * Define el valor de la propiedad numero_PLACA_DIRECCION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERO_PLACA_DIRECCION(String value) {
        this.numero_PLACA_DIRECCION = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_UNIDAD_PREDIAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_UNIDAD_PREDIAL() {
        return cod_UNIDAD_PREDIAL;
    }

    /**
     * Define el valor de la propiedad cod_UNIDAD_PREDIAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_UNIDAD_PREDIAL(String value) {
        this.cod_UNIDAD_PREDIAL = value;
    }

    /**
     * Obtiene el valor de la propiedad num_UNIDAD_PREDIAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM_UNIDAD_PREDIAL() {
        return num_UNIDAD_PREDIAL;
    }

    /**
     * Define el valor de la propiedad num_UNIDAD_PREDIAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM_UNIDAD_PREDIAL(String value) {
        this.num_UNIDAD_PREDIAL = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_MODALIDAD_UNIDAD_PREDIAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_MODALIDAD_UNIDAD_PREDIAL() {
        return cod_MODALIDAD_UNIDAD_PREDIAL;
    }

    /**
     * Define el valor de la propiedad cod_MODALIDAD_UNIDAD_PREDIAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_MODALIDAD_UNIDAD_PREDIAL(String value) {
        this.cod_MODALIDAD_UNIDAD_PREDIAL = value;
    }

    /**
     * Obtiene el valor de la propiedad num_MODALIDAD_UNIDAD_PREDIAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM_MODALIDAD_UNIDAD_PREDIAL() {
        return num_MODALIDAD_UNIDAD_PREDIAL;
    }

    /**
     * Define el valor de la propiedad num_MODALIDAD_UNIDAD_PREDIAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM_MODALIDAD_UNIDAD_PREDIAL(String value) {
        this.num_MODALIDAD_UNIDAD_PREDIAL = value;
    }

    /**
     * Obtiene el valor de la propiedad localizacion_TERRENO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIZACION_TERRENO() {
        return localizacion_TERRENO;
    }

    /**
     * Define el valor de la propiedad localizacion_TERRENO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIZACION_TERRENO(String value) {
        this.localizacion_TERRENO = value;
    }

    /**
     * Obtiene el valor de la propiedad id_COD_MUNICIPIO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID_COD_MUNICIPIO() {
        return id_COD_MUNICIPIO;
    }

    /**
     * Define el valor de la propiedad id_COD_MUNICIPIO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID_COD_MUNICIPIO(String value) {
        this.id_COD_MUNICIPIO = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo_AGRUPACION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO_AGRUPACION() {
        return tipo_AGRUPACION;
    }

    /**
     * Define el valor de la propiedad tipo_AGRUPACION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPO_AGRUPACION(String value) {
        this.tipo_AGRUPACION = value;
    }

    /**
     * Obtiene el valor de la propiedad agrupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGRUPACION() {
        return agrupacion;
    }

    /**
     * Define el valor de la propiedad agrupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGRUPACION(String value) {
        this.agrupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad manzana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANZANA() {
        return manzana;
    }

    /**
     * Define el valor de la propiedad manzana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANZANA(String value) {
        this.manzana = value;
    }

    /**
     * Obtiene el valor de la propiedad lote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOTE() {
        return lote;
    }

    /**
     * Define el valor de la propiedad lote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOTE(String value) {
        this.lote = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo_POSTAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGO_POSTAL() {
        return codigo_POSTAL;
    }

    /**
     * Define el valor de la propiedad codigo_POSTAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGO_POSTAL(String value) {
        this.codigo_POSTAL = value;
    }

    /**
     * Obtiene el valor de la propiedad indicador_D_DIRECCION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDICADOR_D_DIRECCION() {
        return indicador_D_DIRECCION;
    }

    /**
     * Define el valor de la propiedad indicador_D_DIRECCION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDICADOR_D_DIRECCION(String value) {
        this.indicador_D_DIRECCION = value;
    }

    /**
     * Obtiene el valor de la propiedad texto_DIRECCION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTO_DIRECCION() {
        return texto_DIRECCION;
    }

    /**
     * Define el valor de la propiedad texto_DIRECCION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTO_DIRECCION(String value) {
        this.texto_DIRECCION = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_NOMBRE_VIA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_NOMBRE_VIA() {
        return cod_NOMBRE_VIA;
    }

    /**
     * Define el valor de la propiedad cod_NOMBRE_VIA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_NOMBRE_VIA(String value) {
        this.cod_NOMBRE_VIA = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_CLASE_DE_VIA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_CLASE_DE_VIA() {
        return cod_CLASE_DE_VIA;
    }

    /**
     * Define el valor de la propiedad cod_CLASE_DE_VIA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_CLASE_DE_VIA(String value) {
        this.cod_CLASE_DE_VIA = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_LETRA_VIA_DIRECCION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_LETRA_VIA_DIRECCION() {
        return cod_LETRA_VIA_DIRECCION;
    }

    /**
     * Define el valor de la propiedad cod_LETRA_VIA_DIRECCION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_LETRA_VIA_DIRECCION(String value) {
        this.cod_LETRA_VIA_DIRECCION = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_CARDINAL_VIA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_CARDINAL_VIA() {
        return cod_CARDINAL_VIA;
    }

    /**
     * Define el valor de la propiedad cod_CARDINAL_VIA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_CARDINAL_VIA(String value) {
        this.cod_CARDINAL_VIA = value;
    }

    /**
     * Obtiene el valor de la propiedad numero_CRUCE_DIRECCION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERO_CRUCE_DIRECCION() {
        return numero_CRUCE_DIRECCION;
    }

    /**
     * Define el valor de la propiedad numero_CRUCE_DIRECCION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERO_CRUCE_DIRECCION(String value) {
        this.numero_CRUCE_DIRECCION = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_LETRA_CRUCE_DIRECCION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_LETRA_CRUCE_DIRECCION() {
        return cod_LETRA_CRUCE_DIRECCION;
    }

    /**
     * Define el valor de la propiedad cod_LETRA_CRUCE_DIRECCION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_LETRA_CRUCE_DIRECCION(String value) {
        this.cod_LETRA_CRUCE_DIRECCION = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_CARDINAL_CRUCE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_CARDINAL_CRUCE() {
        return cod_CARDINAL_CRUCE;
    }

    /**
     * Define el valor de la propiedad cod_CARDINAL_CRUCE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_CARDINAL_CRUCE(String value) {
        this.cod_CARDINAL_CRUCE = value;
    }

    /**
     * Obtiene el valor de la propiedad cod_TIPO_UNIDAD_PREDIAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOD_TIPO_UNIDAD_PREDIAL() {
        return cod_TIPO_UNIDAD_PREDIAL;
    }

    /**
     * Define el valor de la propiedad cod_TIPO_UNIDAD_PREDIAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOD_TIPO_UNIDAD_PREDIAL(String value) {
        this.cod_TIPO_UNIDAD_PREDIAL = value;
    }

    /**
     * Obtiene el valor de la propiedad num_TIPO_UNIDAD_PREDIAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM_TIPO_UNIDAD_PREDIAL() {
        return num_TIPO_UNIDAD_PREDIAL;
    }

    /**
     * Define el valor de la propiedad num_TIPO_UNIDAD_PREDIAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM_TIPO_UNIDAD_PREDIAL(String value) {
        this.num_TIPO_UNIDAD_PREDIAL = value;
    }

    /**
     * Obtiene el valor de la propiedad id_COD_BARRIO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID_COD_BARRIO() {
        return id_COD_BARRIO;
    }

    /**
     * Define el valor de la propiedad id_COD_BARRIO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID_COD_BARRIO(String value) {
        this.id_COD_BARRIO = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPISO() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPISO(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUCURSAL() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUCURSAL(String value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALIDAD() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALIDAD(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad upz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPZ() {
        return upz;
    }

    /**
     * Define el valor de la propiedad upz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPZ(String value) {
        this.upz = value;
    }

    /**
     * Obtiene el valor de la propiedad subclase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBCLASE() {
        return subclase;
    }

    /**
     * Define el valor de la propiedad subclase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBCLASE(String value) {
        this.subclase = value;
    }

    /**
     * Obtiene el valor de la propiedad estado_CONEXION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADO_CONEXION() {
        return estado_CONEXION;
    }

    /**
     * Define el valor de la propiedad estado_CONEXION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADO_CONEXION(String value) {
        this.estado_CONEXION = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre_SOLICITANTE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE_SOLICITANTE() {
        return nombre_SOLICITANTE;
    }

    /**
     * Define el valor de la propiedad nombre_SOLICITANTE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE_SOLICITANTE(String value) {
        this.nombre_SOLICITANTE = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono_SOLICITANTE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEFONO_SOLICITANTE() {
        return telefono_SOLICITANTE;
    }

    /**
     * Define el valor de la propiedad telefono_SOLICITANTE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEFONO_SOLICITANTE(String value) {
        this.telefono_SOLICITANTE = value;
    }

}
