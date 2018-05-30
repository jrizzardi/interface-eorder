
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para GestionNuevasConexiones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GestionNuevasConexiones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ALIMENTADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="ATENCION_DE_EMERGENCIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAMBIA_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CANTIDAD_SUMINISTRO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_CONTRATADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DEL_TRANSFORMADOR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DE_PROTECCION_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CENTRO_OPERATIVO_ACT" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CLASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_AGRUPAMIENTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_DE_TIPIFICACION_DE_OSINERGMIN" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CODIGO_PUNTO_INSPECCIONADO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="COMPLEJIDAD_DE_LA_TAREA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CONCENTRADOR_PRIMARIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CONCENTRADOR_SECONDARIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CONSTANTE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CORRECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="COTIZACIONS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfCotizacion" minOccurs="0"/&gt;
 *         &lt;element name="CUENTAS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfCuentas" minOccurs="0"/&gt;
 *         &lt;element name="DATO_TECNICO_PRC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DEFICIENCIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DESCRICAO_ETAPA_TIPO_SERVICIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DESCRICAO_RETORNO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPCION_DE_TIPIFICACION_DE_OSINERGMIN" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPCION_TIPO_SERVICIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="DV_RUT" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_1" minOccurs="0"/&gt;
 *         &lt;element name="EMAIL_DE_CONTACTO_CON_EL_CLIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="FAIXA_DE_CARGA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="FECHA_PAGO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FLAG_REFORMA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="GRUPO_PRODUCTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ID_DISPLAY" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LECTURA_DISPLAY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LLAVE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MARCA_DISPLAY" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MEDIDOR_VECINO_DER" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MEDIDOR_VECINO_IZQ" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="METROS_PARA_CALCULO_DURACION" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MODELO_DISPLAY" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MOTIVO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="MOTIVO_DE_VENTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NO_CLIENTE_VECINO_DER" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NO_CLIENTE_VECINO_IZQ" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NRO_DE_DEFICIENCIA_OSINERGMIN" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DISPLAY" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DOCUMENTO_IDENTIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_GRUPO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_ORDEN_DE_SERVICIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOf_alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_SERIE_CS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_SOLICITUD" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="OBRA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="OBSERVACIONCC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfObservacionCC" minOccurs="0"/&gt;
 *         &lt;element name="POSICION_MEDIDOR_CONCENTRADOR_PS1" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="POSICION_MEDIDOR_CONCENTRADOR_PS2" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="POSICION_MEDIDOR_CONCENTRADOR_PS3" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="POTENCIA_REQUERIDA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCTOSNC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfProductosNC" minOccurs="0"/&gt;
 *         &lt;element name="PROMEDIO_DE_CONSUMO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="REP_DE_PAVIMENTOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="RESTRICCION_DE_CONVENIOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SET" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="SHUNT1" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="SHUNT2" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="SHUNT3" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="SUBCLASE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SUBTIPO_DE_ORDEN" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TARIFA_SOLICITADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TASA_DE_INTERES" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TASA_INTERES_CONNEXION" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TEMA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_ACOMETIDA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_ARRANQUE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CAJA_MEDICION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CAJA_TOMA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_INSTALACION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_SERVICIO_TEMPORAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_VERIFICACION_COMERCIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DOCUMENTO_IDENTIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_MEDIDA_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_OBRA_CIVIL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_PROTECCION_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_SOLICITUD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_TENSION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TRABAJO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="USUARIO_CREADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VALADIC" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOf_alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_DEL_KILOWATT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_TOTAL_MANO_DE_OBRA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_TOTAL_MATERIAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_TOTAL_OFERTA_COMERCIALE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VALOR_UF" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VENTA_DE_PADRAO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="XML_EXTENSION_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_RELACION" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_TD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PROPIEDAD_DEL_MEDIDOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_RED_D" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionNuevasConexiones", propOrder = {

})
public class GestionNuevasConexiones {

    @XmlElement(name = "ALIMENTADOR")
    protected String alimentador;
    @XmlElement(name = "ATENCION_DE_EMERGENCIA")
    protected String atenciondeemergencia;
    @XmlElement(name = "CAMBIA_MEDIDOR")
    protected String cambiamedidor;
    @XmlElement(name = "CANTIDAD_SUMINISTRO")
    protected Long cantidadsuministro;
    @XmlElement(name = "CAPACIDAD_CONTRATADA")
    protected String capacidadcontratada;
    @XmlElement(name = "CAPACIDAD_DEL_EMPALME")
    protected String capacidaddelempalme;
    @XmlElement(name = "CAPACIDAD_DEL_TRANSFORMADOR")
    protected Double capacidaddeltransformador;
    @XmlElement(name = "CAPACIDAD_DE_PROTECCION_DEL_EMPALME")
    protected String capacidaddeprotecciondelempalme;
    @XmlElement(name = "CENTRO_OPERATIVO_ACT")
    protected String centrooperativoact;
    @XmlElement(name = "CLASE")
    protected String clase;
    @XmlElement(name = "CODIGO_AGRUPAMIENTO")
    protected String codigoagrupamiento;
    @XmlElement(name = "CODIGO_DE_TIPIFICACION_DE_OSINERGMIN")
    protected String codigodetipificaciondeosinergmin;
    @XmlElement(name = "CODIGO_PUNTO_INSPECCIONADO")
    protected Long codigopuntoinspeccionado;
    @XmlElement(name = "COMPLEJIDAD_DE_LA_TAREA")
    protected String complejidaddelatarea;
    @XmlElement(name = "CONCENTRADOR_PRIMARIO")
    protected String concentradorprimario;
    @XmlElement(name = "CONCENTRADOR_SECONDARIO")
    protected String concentradorsecondario;
    @XmlElement(name = "CONSTANTE")
    protected Double constante;
    @XmlElement(name = "CORRECCION")
    protected String correccion;
    @XmlElement(name = "COTIZACIONS")
    protected ArrayOfCotizacion cotizacions;
    @XmlElement(name = "CUENTAS")
    protected ArrayOfCuentas cuentas;
    @XmlElement(name = "DATO_TECNICO_PRC")
    protected String datotecnicoprc;
    @XmlElement(name = "DEFICIENCIA")
    protected String deficiencia;
    @XmlElement(name = "DESCRICAO_ETAPA_TIPO_SERVICIO")
    protected String descricaoetapatiposervicio;
    @XmlElement(name = "DESCRICAO_RETORNO")
    protected String descricaoretorno;
    @XmlElement(name = "DESCRIPCION_DE_TIPIFICACION_DE_OSINERGMIN")
    protected String descripciondetipificaciondeosinergmin;
    @XmlElement(name = "DESCRIPCION_TIPO_SERVICIO")
    protected String descripciontiposervicio;
    @XmlElement(name = "DV_RUT")
    protected String dvrut;
    @XmlElement(name = "EMAIL_DE_CONTACTO_CON_EL_CLIENTE")
    protected String emaildecontactoconelcliente;
    @XmlElement(name = "FAIXA_DE_CARGA")
    protected String faixadecarga;
    @XmlElement(name = "FASE")
    protected String fase;
    @XmlElement(name = "FECHA_PAGO")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechapago;
    @XmlElement(name = "FLAG_REFORMA")
    protected String flagreforma;
    @XmlElement(name = "GRUPO_PRODUCTO")
    protected String grupoproducto;
    @XmlElement(name = "ID_DISPLAY")
    protected String iddisplay;
    @XmlElement(name = "IVA")
    protected Double iva;
    @XmlElement(name = "LECTURA_DISPLAY")
    protected Double lecturadisplay;
    @XmlElement(name = "LLAVE")
    protected String llave;
    @XmlElement(name = "MARCA_DISPLAY")
    protected String marcadisplay;
    @XmlElement(name = "MEDIDOR_VECINO_DER")
    protected String medidorvecinoder;
    @XmlElement(name = "MEDIDOR_VECINO_IZQ")
    protected String medidorvecinoizq;
    @XmlElement(name = "METROS_PARA_CALCULO_DURACION")
    protected Long metrosparacalculoduracion;
    @XmlElement(name = "MODELO_DISPLAY")
    protected String modelodisplay;
    @XmlElement(name = "MOTIVO")
    protected String motivo;
    @XmlElement(name = "MOTIVO_DE_VENTA")
    protected String motivodeventa;
    @XmlElement(name = "NO_CLIENTE_VECINO_DER")
    protected String noclientevecinoder;
    @XmlElement(name = "NO_CLIENTE_VECINO_IZQ")
    protected String noclientevecinoizq;
    @XmlElement(name = "NRO_DE_DEFICIENCIA_OSINERGMIN")
    protected String nrodedeficienciaosinergmin;
    @XmlElement(name = "NUMERO_DISPLAY")
    protected String numerodisplay;
    @XmlElement(name = "NUMERO_DOCUMENTO_IDENTIDAD")
    protected String numerodocumentoidentidad;
    @XmlElement(name = "NUMERO_GRUPO")
    protected String numerogrupo;
    @XmlElement(name = "NUMERO_ORDEN_DE_SERVICIO")
    protected ArrayOfAlfanumerico50 numeroordendeservicio;
    @XmlElement(name = "NUMERO_SERIE_CS")
    protected String numeroseriecs;
    @XmlElement(name = "NUMERO_SOLICITUD")
    protected Long numerosolicitud;
    @XmlElement(name = "OBRA")
    protected String obra;
    @XmlElement(name = "OBSERVACIONCC")
    protected ArrayOfObservacionCC observacioncc;
    @XmlElement(name = "POSICION_MEDIDOR_CONCENTRADOR_PS1")
    protected String posicionmedidorconcentradorps1;
    @XmlElement(name = "POSICION_MEDIDOR_CONCENTRADOR_PS2")
    protected String posicionmedidorconcentradorps2;
    @XmlElement(name = "POSICION_MEDIDOR_CONCENTRADOR_PS3")
    protected String posicionmedidorconcentradorps3;
    @XmlElement(name = "POTENCIA_REQUERIDA")
    protected String potenciarequerida;
    @XmlElement(name = "PRODUCTOSNC")
    protected ArrayOfProductosNC productosnc;
    @XmlElement(name = "PROMEDIO_DE_CONSUMO")
    protected Double promediodeconsumo;
    @XmlElement(name = "REP_DE_PAVIMENTOS")
    protected String repdepavimentos;
    @XmlElement(name = "RESTRICCION_DE_CONVENIOS")
    protected String restricciondeconvenios;
    @XmlElement(name = "SET")
    protected String set;
    @XmlElement(name = "SHUNT1")
    protected String shunt1;
    @XmlElement(name = "SHUNT2")
    protected String shunt2;
    @XmlElement(name = "SHUNT3")
    protected String shunt3;
    @XmlElement(name = "SUBCLASE")
    protected String subclase;
    @XmlElement(name = "SUBTIPO_DE_ORDEN")
    protected String subtipodeorden;
    @XmlElement(name = "TARIFA_SOLICITADA")
    protected String tarifasolicitada;
    @XmlElement(name = "TASA_DE_INTERES")
    protected Double tasadeinteres;
    @XmlElement(name = "TASA_INTERES_CONNEXION")
    protected Double tasainteresconnexion;
    @XmlElement(name = "TEMA")
    protected String tema;
    @XmlElement(name = "TIPO")
    protected String tipo;
    @XmlElement(name = "TIPO_ACOMETIDA")
    protected String tipoacometida;
    @XmlElement(name = "TIPO_DE_ARRANQUE")
    protected String tipodearranque;
    @XmlElement(name = "TIPO_DE_CAJA_MEDICION")
    protected String tipodecajamedicion;
    @XmlElement(name = "TIPO_DE_CAJA_TOMA")
    protected String tipodecajatoma;
    @XmlElement(name = "TIPO_DE_CONEXION")
    protected String tipodeconexion;
    @XmlElement(name = "TIPO_DE_EMPALME")
    protected String tipodeempalme;
    @XmlElement(name = "TIPO_DE_INSTALACION")
    protected String tipodeinstalacion;
    @XmlElement(name = "TIPO_DE_SERVICIO_TEMPORAL")
    protected String tipodeserviciotemporal;
    @XmlElement(name = "TIPO_DE_VERIFICACION_COMERCIAL")
    protected String tipodeverificacioncomercial;
    @XmlElement(name = "TIPO_DOCUMENTO_IDENTIDAD")
    protected String tipodocumentoidentidad;
    @XmlElement(name = "TIPO_MEDIDA_CONEXION")
    protected String tipomedidaconexion;
    @XmlElement(name = "TIPO_OBRA_CIVIL")
    protected String tipoobracivil;
    @XmlElement(name = "TIPO_PROTECCION_DEL_EMPALME")
    protected String tipoprotecciondelempalme;
    @XmlElement(name = "TIPO_SOLICITUD")
    protected String tiposolicitud;
    @XmlElement(name = "TIPO_TENSION")
    protected String tipotension;
    @XmlElement(name = "TRABAJO")
    protected String trabajo;
    @XmlElement(name = "TRANSFORMADOR")
    protected String transformador;
    @XmlElement(name = "USUARIO_CREADOR")
    protected String usuariocreador;
    @XmlElement(name = "VALADIC")
    protected ArrayOfAlfanumerico150 valadic;
    @XmlElement(name = "VALOR_DEL_KILOWATT")
    protected Double valordelkilowatt;
    @XmlElement(name = "VALOR_TOTAL_MANO_DE_OBRA")
    protected Double valortotalmanodeobra;
    @XmlElement(name = "VALOR_TOTAL_MATERIAL")
    protected Double valortotalmaterial;
    @XmlElement(name = "VALOR_TOTAL_OFERTA_COMERCIALE")
    protected Double valortotalofertacomerciale;
    @XmlElement(name = "VALOR_UF")
    protected String valoruf;
    @XmlElement(name = "VENTA_DE_PADRAO")
    protected String ventadepadrao;
    @XmlElement(name = "XML_EXTENSION_PARAMS")
    protected String xmlextensionparams;
    @XmlElement(name = "ID_RELACION")
    protected Long idrelacion;
    @XmlElement(name = "NOMBRE_TD")
    protected String nombretd;
    @XmlElement(name = "PROPIEDAD_DEL_MEDIDOR")
    protected String propiedaddelmedidor;
    @XmlElement(name = "TIPO_RED_D")
    protected String tiporedd;

    /**
     * Obtiene el valor de la propiedad alimentador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALIMENTADOR() {
        return alimentador;
    }

    /**
     * Define el valor de la propiedad alimentador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALIMENTADOR(String value) {
        this.alimentador = value;
    }

    /**
     * Obtiene el valor de la propiedad atenciondeemergencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATENCIONDEEMERGENCIA() {
        return atenciondeemergencia;
    }

    /**
     * Define el valor de la propiedad atenciondeemergencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATENCIONDEEMERGENCIA(String value) {
        this.atenciondeemergencia = value;
    }

    /**
     * Obtiene el valor de la propiedad cambiamedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMBIAMEDIDOR() {
        return cambiamedidor;
    }

    /**
     * Define el valor de la propiedad cambiamedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMBIAMEDIDOR(String value) {
        this.cambiamedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadsuministro.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCANTIDADSUMINISTRO() {
        return cantidadsuministro;
    }

    /**
     * Define el valor de la propiedad cantidadsuministro.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCANTIDADSUMINISTRO(Long value) {
        this.cantidadsuministro = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidadcontratada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACIDADCONTRATADA() {
        return capacidadcontratada;
    }

    /**
     * Define el valor de la propiedad capacidadcontratada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACIDADCONTRATADA(String value) {
        this.capacidadcontratada = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidaddelempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACIDADDELEMPALME() {
        return capacidaddelempalme;
    }

    /**
     * Define el valor de la propiedad capacidaddelempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACIDADDELEMPALME(String value) {
        this.capacidaddelempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidaddeltransformador.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCAPACIDADDELTRANSFORMADOR() {
        return capacidaddeltransformador;
    }

    /**
     * Define el valor de la propiedad capacidaddeltransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCAPACIDADDELTRANSFORMADOR(Double value) {
        this.capacidaddeltransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidaddeprotecciondelempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACIDADDEPROTECCIONDELEMPALME() {
        return capacidaddeprotecciondelempalme;
    }

    /**
     * Define el valor de la propiedad capacidaddeprotecciondelempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACIDADDEPROTECCIONDELEMPALME(String value) {
        this.capacidaddeprotecciondelempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad centrooperativoact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTROOPERATIVOACT() {
        return centrooperativoact;
    }

    /**
     * Define el valor de la propiedad centrooperativoact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTROOPERATIVOACT(String value) {
        this.centrooperativoact = value;
    }

    /**
     * Obtiene el valor de la propiedad clase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASE() {
        return clase;
    }

    /**
     * Define el valor de la propiedad clase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASE(String value) {
        this.clase = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoagrupamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOAGRUPAMIENTO() {
        return codigoagrupamiento;
    }

    /**
     * Define el valor de la propiedad codigoagrupamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOAGRUPAMIENTO(String value) {
        this.codigoagrupamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigodetipificaciondeosinergmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODETIPIFICACIONDEOSINERGMIN() {
        return codigodetipificaciondeosinergmin;
    }

    /**
     * Define el valor de la propiedad codigodetipificaciondeosinergmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODETIPIFICACIONDEOSINERGMIN(String value) {
        this.codigodetipificaciondeosinergmin = value;
    }

    /**
     * Obtiene el valor de la propiedad codigopuntoinspeccionado.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCODIGOPUNTOINSPECCIONADO() {
        return codigopuntoinspeccionado;
    }

    /**
     * Define el valor de la propiedad codigopuntoinspeccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCODIGOPUNTOINSPECCIONADO(Long value) {
        this.codigopuntoinspeccionado = value;
    }

    /**
     * Obtiene el valor de la propiedad complejidaddelatarea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPLEJIDADDELATAREA() {
        return complejidaddelatarea;
    }

    /**
     * Define el valor de la propiedad complejidaddelatarea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPLEJIDADDELATAREA(String value) {
        this.complejidaddelatarea = value;
    }

    /**
     * Obtiene el valor de la propiedad concentradorprimario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCENTRADORPRIMARIO() {
        return concentradorprimario;
    }

    /**
     * Define el valor de la propiedad concentradorprimario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCENTRADORPRIMARIO(String value) {
        this.concentradorprimario = value;
    }

    /**
     * Obtiene el valor de la propiedad concentradorsecondario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCENTRADORSECONDARIO() {
        return concentradorsecondario;
    }

    /**
     * Define el valor de la propiedad concentradorsecondario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCENTRADORSECONDARIO(String value) {
        this.concentradorsecondario = value;
    }

    /**
     * Obtiene el valor de la propiedad constante.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCONSTANTE() {
        return constante;
    }

    /**
     * Define el valor de la propiedad constante.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCONSTANTE(Double value) {
        this.constante = value;
    }

    /**
     * Obtiene el valor de la propiedad correccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORRECCION() {
        return correccion;
    }

    /**
     * Define el valor de la propiedad correccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORRECCION(String value) {
        this.correccion = value;
    }

    /**
     * Obtiene el valor de la propiedad cotizacions.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCotizacion }
     *     
     */
    public ArrayOfCotizacion getCOTIZACIONS() {
        return cotizacions;
    }

    /**
     * Define el valor de la propiedad cotizacions.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCotizacion }
     *     
     */
    public void setCOTIZACIONS(ArrayOfCotizacion value) {
        this.cotizacions = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentas.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCuentas }
     *     
     */
    public ArrayOfCuentas getCUENTAS() {
        return cuentas;
    }

    /**
     * Define el valor de la propiedad cuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCuentas }
     *     
     */
    public void setCUENTAS(ArrayOfCuentas value) {
        this.cuentas = value;
    }

    /**
     * Obtiene el valor de la propiedad datotecnicoprc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATOTECNICOPRC() {
        return datotecnicoprc;
    }

    /**
     * Define el valor de la propiedad datotecnicoprc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATOTECNICOPRC(String value) {
        this.datotecnicoprc = value;
    }

    /**
     * Obtiene el valor de la propiedad deficiencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFICIENCIA() {
        return deficiencia;
    }

    /**
     * Define el valor de la propiedad deficiencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFICIENCIA(String value) {
        this.deficiencia = value;
    }

    /**
     * Obtiene el valor de la propiedad descricaoetapatiposervicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAOETAPATIPOSERVICIO() {
        return descricaoetapatiposervicio;
    }

    /**
     * Define el valor de la propiedad descricaoetapatiposervicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAOETAPATIPOSERVICIO(String value) {
        this.descricaoetapatiposervicio = value;
    }

    /**
     * Obtiene el valor de la propiedad descricaoretorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAORETORNO() {
        return descricaoretorno;
    }

    /**
     * Define el valor de la propiedad descricaoretorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAORETORNO(String value) {
        this.descricaoretorno = value;
    }

    /**
     * Obtiene el valor de la propiedad descripciondetipificaciondeosinergmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCIONDETIPIFICACIONDEOSINERGMIN() {
        return descripciondetipificaciondeosinergmin;
    }

    /**
     * Define el valor de la propiedad descripciondetipificaciondeosinergmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCIONDETIPIFICACIONDEOSINERGMIN(String value) {
        this.descripciondetipificaciondeosinergmin = value;
    }

    /**
     * Obtiene el valor de la propiedad descripciontiposervicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPCIONTIPOSERVICIO() {
        return descripciontiposervicio;
    }

    /**
     * Define el valor de la propiedad descripciontiposervicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPCIONTIPOSERVICIO(String value) {
        this.descripciontiposervicio = value;
    }

    /**
     * Obtiene el valor de la propiedad dvrut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVRUT() {
        return dvrut;
    }

    /**
     * Define el valor de la propiedad dvrut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVRUT(String value) {
        this.dvrut = value;
    }

    /**
     * Obtiene el valor de la propiedad emaildecontactoconelcliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAILDECONTACTOCONELCLIENTE() {
        return emaildecontactoconelcliente;
    }

    /**
     * Define el valor de la propiedad emaildecontactoconelcliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAILDECONTACTOCONELCLIENTE(String value) {
        this.emaildecontactoconelcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad faixadecarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAIXADECARGA() {
        return faixadecarga;
    }

    /**
     * Define el valor de la propiedad faixadecarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAIXADECARGA(String value) {
        this.faixadecarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASE() {
        return fase;
    }

    /**
     * Define el valor de la propiedad fase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASE(String value) {
        this.fase = value;
    }

    /**
     * Obtiene el valor de la propiedad fechapago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHAPAGO() {
        return fechapago;
    }

    /**
     * Define el valor de la propiedad fechapago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHAPAGO(XMLGregorianCalendar value) {
        this.fechapago = value;
    }

    /**
     * Obtiene el valor de la propiedad flagreforma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGREFORMA() {
        return flagreforma;
    }

    /**
     * Define el valor de la propiedad flagreforma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGREFORMA(String value) {
        this.flagreforma = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUPOPRODUCTO() {
        return grupoproducto;
    }

    /**
     * Define el valor de la propiedad grupoproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUPOPRODUCTO(String value) {
        this.grupoproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad iddisplay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDISPLAY() {
        return iddisplay;
    }

    /**
     * Define el valor de la propiedad iddisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDISPLAY(String value) {
        this.iddisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIVA() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIVA(Double value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad lecturadisplay.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLECTURADISPLAY() {
        return lecturadisplay;
    }

    /**
     * Define el valor de la propiedad lecturadisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLECTURADISPLAY(Double value) {
        this.lecturadisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad llave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLLAVE() {
        return llave;
    }

    /**
     * Define el valor de la propiedad llave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLLAVE(String value) {
        this.llave = value;
    }

    /**
     * Obtiene el valor de la propiedad marcadisplay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARCADISPLAY() {
        return marcadisplay;
    }

    /**
     * Define el valor de la propiedad marcadisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARCADISPLAY(String value) {
        this.marcadisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad medidorvecinoder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIDORVECINODER() {
        return medidorvecinoder;
    }

    /**
     * Define el valor de la propiedad medidorvecinoder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIDORVECINODER(String value) {
        this.medidorvecinoder = value;
    }

    /**
     * Obtiene el valor de la propiedad medidorvecinoizq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIDORVECINOIZQ() {
        return medidorvecinoizq;
    }

    /**
     * Define el valor de la propiedad medidorvecinoizq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIDORVECINOIZQ(String value) {
        this.medidorvecinoizq = value;
    }

    /**
     * Obtiene el valor de la propiedad metrosparacalculoduracion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMETROSPARACALCULODURACION() {
        return metrosparacalculoduracion;
    }

    /**
     * Define el valor de la propiedad metrosparacalculoduracion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMETROSPARACALCULODURACION(Long value) {
        this.metrosparacalculoduracion = value;
    }

    /**
     * Obtiene el valor de la propiedad modelodisplay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODELODISPLAY() {
        return modelodisplay;
    }

    /**
     * Define el valor de la propiedad modelodisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODELODISPLAY(String value) {
        this.modelodisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad motivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVO() {
        return motivo;
    }

    /**
     * Define el valor de la propiedad motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVO(String value) {
        this.motivo = value;
    }

    /**
     * Obtiene el valor de la propiedad motivodeventa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVODEVENTA() {
        return motivodeventa;
    }

    /**
     * Define el valor de la propiedad motivodeventa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVODEVENTA(String value) {
        this.motivodeventa = value;
    }

    /**
     * Obtiene el valor de la propiedad noclientevecinoder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOCLIENTEVECINODER() {
        return noclientevecinoder;
    }

    /**
     * Define el valor de la propiedad noclientevecinoder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOCLIENTEVECINODER(String value) {
        this.noclientevecinoder = value;
    }

    /**
     * Obtiene el valor de la propiedad noclientevecinoizq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOCLIENTEVECINOIZQ() {
        return noclientevecinoizq;
    }

    /**
     * Define el valor de la propiedad noclientevecinoizq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOCLIENTEVECINOIZQ(String value) {
        this.noclientevecinoizq = value;
    }

    /**
     * Obtiene el valor de la propiedad nrodedeficienciaosinergmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRODEDEFICIENCIAOSINERGMIN() {
        return nrodedeficienciaosinergmin;
    }

    /**
     * Define el valor de la propiedad nrodedeficienciaosinergmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRODEDEFICIENCIAOSINERGMIN(String value) {
        this.nrodedeficienciaosinergmin = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodisplay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODISPLAY() {
        return numerodisplay;
    }

    /**
     * Define el valor de la propiedad numerodisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODISPLAY(String value) {
        this.numerodisplay = value;
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
     * Obtiene el valor de la propiedad numerogrupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROGRUPO() {
        return numerogrupo;
    }

    /**
     * Define el valor de la propiedad numerogrupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROGRUPO(String value) {
        this.numerogrupo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroordendeservicio.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlfanumerico50 }
     *     
     */
    public ArrayOfAlfanumerico50 getNUMEROORDENDESERVICIO() {
        return numeroordendeservicio;
    }

    /**
     * Define el valor de la propiedad numeroordendeservicio.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlfanumerico50 }
     *     
     */
    public void setNUMEROORDENDESERVICIO(ArrayOfAlfanumerico50 value) {
        this.numeroordendeservicio = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroseriecs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROSERIECS() {
        return numeroseriecs;
    }

    /**
     * Define el valor de la propiedad numeroseriecs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROSERIECS(String value) {
        this.numeroseriecs = value;
    }

    /**
     * Obtiene el valor de la propiedad numerosolicitud.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNUMEROSOLICITUD() {
        return numerosolicitud;
    }

    /**
     * Define el valor de la propiedad numerosolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNUMEROSOLICITUD(Long value) {
        this.numerosolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad obra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBRA() {
        return obra;
    }

    /**
     * Define el valor de la propiedad obra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBRA(String value) {
        this.obra = value;
    }

    /**
     * Obtiene el valor de la propiedad observacioncc.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObservacionCC }
     *     
     */
    public ArrayOfObservacionCC getOBSERVACIONCC() {
        return observacioncc;
    }

    /**
     * Define el valor de la propiedad observacioncc.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObservacionCC }
     *     
     */
    public void setOBSERVACIONCC(ArrayOfObservacionCC value) {
        this.observacioncc = value;
    }

    /**
     * Obtiene el valor de la propiedad posicionmedidorconcentradorps1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSICIONMEDIDORCONCENTRADORPS1() {
        return posicionmedidorconcentradorps1;
    }

    /**
     * Define el valor de la propiedad posicionmedidorconcentradorps1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSICIONMEDIDORCONCENTRADORPS1(String value) {
        this.posicionmedidorconcentradorps1 = value;
    }

    /**
     * Obtiene el valor de la propiedad posicionmedidorconcentradorps2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSICIONMEDIDORCONCENTRADORPS2() {
        return posicionmedidorconcentradorps2;
    }

    /**
     * Define el valor de la propiedad posicionmedidorconcentradorps2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSICIONMEDIDORCONCENTRADORPS2(String value) {
        this.posicionmedidorconcentradorps2 = value;
    }

    /**
     * Obtiene el valor de la propiedad posicionmedidorconcentradorps3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSICIONMEDIDORCONCENTRADORPS3() {
        return posicionmedidorconcentradorps3;
    }

    /**
     * Define el valor de la propiedad posicionmedidorconcentradorps3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSICIONMEDIDORCONCENTRADORPS3(String value) {
        this.posicionmedidorconcentradorps3 = value;
    }

    /**
     * Obtiene el valor de la propiedad potenciarequerida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENCIAREQUERIDA() {
        return potenciarequerida;
    }

    /**
     * Define el valor de la propiedad potenciarequerida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENCIAREQUERIDA(String value) {
        this.potenciarequerida = value;
    }

    /**
     * Obtiene el valor de la propiedad productosnc.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductosNC }
     *     
     */
    public ArrayOfProductosNC getPRODUCTOSNC() {
        return productosnc;
    }

    /**
     * Define el valor de la propiedad productosnc.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductosNC }
     *     
     */
    public void setPRODUCTOSNC(ArrayOfProductosNC value) {
        this.productosnc = value;
    }

    /**
     * Obtiene el valor de la propiedad promediodeconsumo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPROMEDIODECONSUMO() {
        return promediodeconsumo;
    }

    /**
     * Define el valor de la propiedad promediodeconsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPROMEDIODECONSUMO(Double value) {
        this.promediodeconsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad repdepavimentos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPDEPAVIMENTOS() {
        return repdepavimentos;
    }

    /**
     * Define el valor de la propiedad repdepavimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPDEPAVIMENTOS(String value) {
        this.repdepavimentos = value;
    }

    /**
     * Obtiene el valor de la propiedad restricciondeconvenios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESTRICCIONDECONVENIOS() {
        return restricciondeconvenios;
    }

    /**
     * Define el valor de la propiedad restricciondeconvenios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESTRICCIONDECONVENIOS(String value) {
        this.restricciondeconvenios = value;
    }

    /**
     * Obtiene el valor de la propiedad set.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSET() {
        return set;
    }

    /**
     * Define el valor de la propiedad set.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSET(String value) {
        this.set = value;
    }

    /**
     * Obtiene el valor de la propiedad shunt1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHUNT1() {
        return shunt1;
    }

    /**
     * Define el valor de la propiedad shunt1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHUNT1(String value) {
        this.shunt1 = value;
    }

    /**
     * Obtiene el valor de la propiedad shunt2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHUNT2() {
        return shunt2;
    }

    /**
     * Define el valor de la propiedad shunt2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHUNT2(String value) {
        this.shunt2 = value;
    }

    /**
     * Obtiene el valor de la propiedad shunt3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHUNT3() {
        return shunt3;
    }

    /**
     * Define el valor de la propiedad shunt3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHUNT3(String value) {
        this.shunt3 = value;
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
     * Obtiene el valor de la propiedad subtipodeorden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTIPODEORDEN() {
        return subtipodeorden;
    }

    /**
     * Define el valor de la propiedad subtipodeorden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTIPODEORDEN(String value) {
        this.subtipodeorden = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifasolicitada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARIFASOLICITADA() {
        return tarifasolicitada;
    }

    /**
     * Define el valor de la propiedad tarifasolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARIFASOLICITADA(String value) {
        this.tarifasolicitada = value;
    }

    /**
     * Obtiene el valor de la propiedad tasadeinteres.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTASADEINTERES() {
        return tasadeinteres;
    }

    /**
     * Define el valor de la propiedad tasadeinteres.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTASADEINTERES(Double value) {
        this.tasadeinteres = value;
    }

    /**
     * Obtiene el valor de la propiedad tasainteresconnexion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTASAINTERESCONNEXION() {
        return tasainteresconnexion;
    }

    /**
     * Define el valor de la propiedad tasainteresconnexion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTASAINTERESCONNEXION(Double value) {
        this.tasainteresconnexion = value;
    }

    /**
     * Obtiene el valor de la propiedad tema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMA() {
        return tema;
    }

    /**
     * Define el valor de la propiedad tema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMA(String value) {
        this.tema = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPO() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPO(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoacometida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOACOMETIDA() {
        return tipoacometida;
    }

    /**
     * Define el valor de la propiedad tipoacometida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOACOMETIDA(String value) {
        this.tipoacometida = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodearranque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEARRANQUE() {
        return tipodearranque;
    }

    /**
     * Define el valor de la propiedad tipodearranque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEARRANQUE(String value) {
        this.tipodearranque = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodecajamedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODECAJAMEDICION() {
        return tipodecajamedicion;
    }

    /**
     * Define el valor de la propiedad tipodecajamedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODECAJAMEDICION(String value) {
        this.tipodecajamedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodecajatoma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODECAJATOMA() {
        return tipodecajatoma;
    }

    /**
     * Define el valor de la propiedad tipodecajatoma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODECAJATOMA(String value) {
        this.tipodecajatoma = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeconexion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODECONEXION() {
        return tipodeconexion;
    }

    /**
     * Define el valor de la propiedad tipodeconexion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODECONEXION(String value) {
        this.tipodeconexion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEEMPALME() {
        return tipodeempalme;
    }

    /**
     * Define el valor de la propiedad tipodeempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEEMPALME(String value) {
        this.tipodeempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeinstalacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEINSTALACION() {
        return tipodeinstalacion;
    }

    /**
     * Define el valor de la propiedad tipodeinstalacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEINSTALACION(String value) {
        this.tipodeinstalacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeserviciotemporal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODESERVICIOTEMPORAL() {
        return tipodeserviciotemporal;
    }

    /**
     * Define el valor de la propiedad tipodeserviciotemporal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODESERVICIOTEMPORAL(String value) {
        this.tipodeserviciotemporal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeverificacioncomercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEVERIFICACIONCOMERCIAL() {
        return tipodeverificacioncomercial;
    }

    /**
     * Define el valor de la propiedad tipodeverificacioncomercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEVERIFICACIONCOMERCIAL(String value) {
        this.tipodeverificacioncomercial = value;
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
     * Obtiene el valor de la propiedad tipomedidaconexion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMEDIDACONEXION() {
        return tipomedidaconexion;
    }

    /**
     * Define el valor de la propiedad tipomedidaconexion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMEDIDACONEXION(String value) {
        this.tipomedidaconexion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoobracivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOOBRACIVIL() {
        return tipoobracivil;
    }

    /**
     * Define el valor de la propiedad tipoobracivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOOBRACIVIL(String value) {
        this.tipoobracivil = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoprotecciondelempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPROTECCIONDELEMPALME() {
        return tipoprotecciondelempalme;
    }

    /**
     * Define el valor de la propiedad tipoprotecciondelempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPROTECCIONDELEMPALME(String value) {
        this.tipoprotecciondelempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad tiposolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOSOLICITUD() {
        return tiposolicitud;
    }

    /**
     * Define el valor de la propiedad tiposolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOSOLICITUD(String value) {
        this.tiposolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad tipotension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOTENSION() {
        return tipotension;
    }

    /**
     * Define el valor de la propiedad tipotension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOTENSION(String value) {
        this.tipotension = value;
    }

    /**
     * Obtiene el valor de la propiedad trabajo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRABAJO() {
        return trabajo;
    }

    /**
     * Define el valor de la propiedad trabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRABAJO(String value) {
        this.trabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad transformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFORMADOR() {
        return transformador;
    }

    /**
     * Define el valor de la propiedad transformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFORMADOR(String value) {
        this.transformador = value;
    }

    /**
     * Obtiene el valor de la propiedad usuariocreador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSUARIOCREADOR() {
        return usuariocreador;
    }

    /**
     * Define el valor de la propiedad usuariocreador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSUARIOCREADOR(String value) {
        this.usuariocreador = value;
    }

    /**
     * Obtiene el valor de la propiedad valadic.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlfanumerico150 }
     *     
     */
    public ArrayOfAlfanumerico150 getVALADIC() {
        return valadic;
    }

    /**
     * Define el valor de la propiedad valadic.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlfanumerico150 }
     *     
     */
    public void setVALADIC(ArrayOfAlfanumerico150 value) {
        this.valadic = value;
    }

    /**
     * Obtiene el valor de la propiedad valordelkilowatt.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORDELKILOWATT() {
        return valordelkilowatt;
    }

    /**
     * Define el valor de la propiedad valordelkilowatt.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORDELKILOWATT(Double value) {
        this.valordelkilowatt = value;
    }

    /**
     * Obtiene el valor de la propiedad valortotalmanodeobra.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORTOTALMANODEOBRA() {
        return valortotalmanodeobra;
    }

    /**
     * Define el valor de la propiedad valortotalmanodeobra.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORTOTALMANODEOBRA(Double value) {
        this.valortotalmanodeobra = value;
    }

    /**
     * Obtiene el valor de la propiedad valortotalmaterial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORTOTALMATERIAL() {
        return valortotalmaterial;
    }

    /**
     * Define el valor de la propiedad valortotalmaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORTOTALMATERIAL(Double value) {
        this.valortotalmaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad valortotalofertacomerciale.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVALORTOTALOFERTACOMERCIALE() {
        return valortotalofertacomerciale;
    }

    /**
     * Define el valor de la propiedad valortotalofertacomerciale.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVALORTOTALOFERTACOMERCIALE(Double value) {
        this.valortotalofertacomerciale = value;
    }

    /**
     * Obtiene el valor de la propiedad valoruf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALORUF() {
        return valoruf;
    }

    /**
     * Define el valor de la propiedad valoruf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALORUF(String value) {
        this.valoruf = value;
    }

    /**
     * Obtiene el valor de la propiedad ventadepadrao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENTADEPADRAO() {
        return ventadepadrao;
    }

    /**
     * Define el valor de la propiedad ventadepadrao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENTADEPADRAO(String value) {
        this.ventadepadrao = value;
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

    /**
     * Obtiene el valor de la propiedad idrelacion.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIDRELACION() {
        return idrelacion;
    }

    /**
     * Define el valor de la propiedad idrelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIDRELACION(Long value) {
        this.idrelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombretd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRETD() {
        return nombretd;
    }

    /**
     * Define el valor de la propiedad nombretd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRETD(String value) {
        this.nombretd = value;
    }

    /**
     * Obtiene el valor de la propiedad propiedaddelmedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPIEDADDELMEDIDOR() {
        return propiedaddelmedidor;
    }

    /**
     * Define el valor de la propiedad propiedaddelmedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPIEDADDELMEDIDOR(String value) {
        this.propiedaddelmedidor = value;
    }

    /**
     * Obtiene el valor de la propiedad tiporedd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOREDD() {
        return tiporedd;
    }

    /**
     * Define el valor de la propiedad tiporedd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOREDD(String value) {
        this.tiporedd = value;
    }

}
