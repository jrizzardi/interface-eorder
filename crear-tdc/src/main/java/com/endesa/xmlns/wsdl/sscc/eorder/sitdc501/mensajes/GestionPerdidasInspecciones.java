
package com.endesa.xmlns.wsdl.sscc.eorder.sitdc501.mensajes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para GestionPerdidasInspecciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GestionPerdidasInspecciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ACTIVIDAD_COMERCIAL" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ALIMENTADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="AREA_EMISORA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAJA_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CANTIDAD_DE_SERVICIOS_ELECTRICOS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CANTIDAD_DE_SUMINISTROS_POR_SED" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_CONTRATADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DEL_TRANSFORMADOR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DEL_TRANSFORMADOR_DE_POTENCIA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_DE_PROTECCION_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CAPACIDAD_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CENTRO_DE_DISTRIBUCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CICLO_DEL_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="CIRCUITO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CLASSE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CONCENTRADOR_PRIMARIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CONCENTRADOR_SECONDARIO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="CONDUCTOR_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="DATA_TOI1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DATA_TOI2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DATA_TOI3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FRANJA_TIPO_DE_SELECAO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="IRREGULARIDAD" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOf_alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LATITUD_DEL_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="LISTA_TAREAS_A_REALIZAR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOf_alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LLAVE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="LONGITUD_DEL_TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}numerico_10_8" minOccurs="0"/&gt;
 *         &lt;element name="MEDIDA_TECNICA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NIVEL_DE_TENSION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_CIRCUITO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_300" minOccurs="0"/&gt;
 *         &lt;element name="NOMBRE_SED" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_CAIXA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DE_DISPLAY" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_DE_LA_ORDEN_DE_MACRO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_PROCESO_MASIVO" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NUMERO_TAMPA_CAIXA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="ORIGEN_DE_CONTRASTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="ORIGEN_DE_LA_INSPECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PORCENTAJE_DE_CONSUMO_COMERCIAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PORCENTAJE_DE_CONSUMO_INDUSTRIAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PORCENTAJE_DE_CONSUMO_OFICIAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PORCENTAJE_DE_CONSUMO_RESIDENCIAL" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PORCENTAJE_DE_CONSUMO_TRAFO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="POSICION_MEDIDOR_PS1" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="POTENCIA_CONTRATADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="POTENCIA_CONTRATADA_FUERA_PUNTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="POTENCIA_CONTRATADA_HORA_PUNTA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCTO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PROGRAMADO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="PROMEDIO_DE_CONSUMO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PUNTO_FISICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="SET" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_150" minOccurs="0"/&gt;
 *         &lt;element name="SUMINISTROS_INSPECCIONES" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}SuministroInspecciones" minOccurs="0"/&gt;
 *         &lt;element name="TAREA_A_REALIZAR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_ACOMETIDA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_AGRUPAMIENTO_DE_PROPIEDAD_INSPECCIONADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_BARRIO_DE_PROPIEDAD_INSPECCIONADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_CLIENTE_SERVICIO_REFERENCIA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CAJA_MEDICION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CAJA_TOMA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_EJECUCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_INSPECCION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_MEDICION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_SELECAO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_255" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DO_SERVICO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_FAMILIA_DE_PROPIEDAD_INSPECCIONADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_MEDIDA_CONEXION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_PROTECCION_DEL_EMPALME" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_RESIDENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_VIVIENDA_DE_PROPIEDAD_INSPECCIONADA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TOI1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TOI2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TOI3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMADOR" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMADORS_CORRIENTE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfTransformador" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFORMADORS_TENSION" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfTransformador" minOccurs="0"/&gt;
 *         &lt;element name="UBICACION_DE_LA_MEDIDA" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="UBICACION_SED" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="VINCULOS" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}ArrayOfVinculo" minOccurs="0"/&gt;
 *         &lt;element name="VOLTAJE" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *         &lt;element name="XML_EXTENSION_PARAMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIPO_DE_USO" type="{http://xmlns.endesa.com/wsdl/SSCC/eOrder/SITDC501/Mensajes}alfanumerico_50" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionPerdidasInspecciones", propOrder = {

})
public class GestionPerdidasInspecciones {

    @XmlElement(name = "ACTIVIDAD_COMERCIAL")
    protected String actividadcomercial;
    @XmlElement(name = "ALIMENTADOR")
    protected String alimentador;
    @XmlElement(name = "AREA_EMISORA")
    protected String areaemisora;
    @XmlElement(name = "CAJA_EMPALME")
    protected String cajaempalme;
    @XmlElement(name = "CANTIDAD_DE_SERVICIOS_ELECTRICOS")
    protected Long cantidaddeservicioselectricos;
    @XmlElement(name = "CANTIDAD_DE_SUMINISTROS_POR_SED")
    protected Long cantidaddesuministrosporsed;
    @XmlElement(name = "CAPACIDAD_CONTRATADA")
    protected String capacidadcontratada;
    @XmlElement(name = "CAPACIDAD_DEL_TRANSFORMADOR")
    protected Double capacidaddeltransformador;
    @XmlElement(name = "CAPACIDAD_DEL_TRANSFORMADOR_DE_POTENCIA")
    protected Double capacidaddeltransformadordepotencia;
    @XmlElement(name = "CAPACIDAD_DE_PROTECCION_DEL_EMPALME")
    protected String capacidaddeprotecciondelempalme;
    @XmlElement(name = "CAPACIDAD_EMPALME")
    protected String capacidadempalme;
    @XmlElement(name = "CENTRO_DE_DISTRIBUCION")
    protected String centrodedistribucion;
    @XmlElement(name = "CICLO_DEL_TRANSFORMADOR")
    protected String ciclodeltransformador;
    @XmlElement(name = "CIRCUITO")
    protected String circuito;
    @XmlElement(name = "CLASSE")
    protected String classe;
    @XmlElement(name = "CONCENTRADOR_PRIMARIO")
    protected String concentradorprimario;
    @XmlElement(name = "CONCENTRADOR_SECONDARIO")
    protected String concentradorsecondario;
    @XmlElement(name = "CONDUCTOR_EMPALME")
    protected String conductorempalme;
    @XmlElement(name = "DATA_TOI1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datatoi1;
    @XmlElement(name = "DATA_TOI2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datatoi2;
    @XmlElement(name = "DATA_TOI3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datatoi3;
    @XmlElement(name = "FRANJA_TIPO_DE_SELECAO")
    protected String franjatipodeselecao;
    @XmlElement(name = "IRREGULARIDAD")
    protected ArrayOfAlfanumerico50 irregularidad;
    @XmlElement(name = "LATITUD_DEL_TRANSFORMADOR")
    protected BigDecimal latituddeltransformador;
    @XmlElement(name = "LISTA_TAREAS_A_REALIZAR")
    protected ArrayOfAlfanumerico50 listatareasarealizar;
    @XmlElement(name = "LLAVE")
    protected String llave;
    @XmlElement(name = "LONGITUD_DEL_TRANSFORMADOR")
    protected BigDecimal longituddeltransformador;
    @XmlElement(name = "MEDIDA_TECNICA")
    protected String medidatecnica;
    @XmlElement(name = "NIVEL_DE_TENSION")
    protected String niveldetension;
    @XmlElement(name = "NOMBRE_CIRCUITO")
    protected String nombrecircuito;
    @XmlElement(name = "NOMBRE_SED")
    protected String nombresed;
    @XmlElement(name = "NUMERO_CAIXA")
    protected String numerocaixa;
    @XmlElement(name = "NUMERO_DE_DISPLAY")
    protected String numerodedisplay;
    @XmlElement(name = "NUMERO_DE_LA_ORDEN_DE_MACRO")
    protected Long numerodelaordendemacro;
    @XmlElement(name = "NUMERO_PROCESO_MASIVO")
    protected Long numeroprocesomasivo;
    @XmlElement(name = "NUMERO_TAMPA_CAIXA")
    protected String numerotampacaixa;
    @XmlElement(name = "ORIGEN_DE_CONTRASTE")
    protected String origendecontraste;
    @XmlElement(name = "ORIGEN_DE_LA_INSPECCION")
    protected String origendelainspeccion;
    @XmlElement(name = "PORCENTAJE_DE_CONSUMO_COMERCIAL")
    protected Double porcentajedeconsumocomercial;
    @XmlElement(name = "PORCENTAJE_DE_CONSUMO_INDUSTRIAL")
    protected Double porcentajedeconsumoindustrial;
    @XmlElement(name = "PORCENTAJE_DE_CONSUMO_OFICIAL")
    protected Double porcentajedeconsumooficial;
    @XmlElement(name = "PORCENTAJE_DE_CONSUMO_RESIDENCIAL")
    protected Double porcentajedeconsumoresidencial;
    @XmlElement(name = "PORCENTAJE_DE_CONSUMO_TRAFO")
    protected Double porcentajedeconsumotrafo;
    @XmlElement(name = "POSICION_MEDIDOR_PS1")
    protected String posicionmedidorps1;
    @XmlElement(name = "POTENCIA_CONTRATADA")
    protected String potenciacontratada;
    @XmlElement(name = "POTENCIA_CONTRATADA_FUERA_PUNTA")
    protected String potenciacontratadafuerapunta;
    @XmlElement(name = "POTENCIA_CONTRATADA_HORA_PUNTA")
    protected String potenciacontratadahorapunta;
    @XmlElement(name = "PRODUCTO")
    protected String producto;
    @XmlElement(name = "PROGRAMADO")
    protected String programado;
    @XmlElement(name = "PROMEDIO_DE_CONSUMO")
    protected Double promediodeconsumo;
    @XmlElement(name = "PUNTO_FISICO")
    protected String puntofisico;
    @XmlElement(name = "SET")
    protected String set;
    @XmlElement(name = "SUMINISTROS_INSPECCIONES")
    protected SuministroInspecciones suministrosinspecciones;
    @XmlElement(name = "TAREA_A_REALIZAR")
    protected String tareaarealizar;
    @XmlElement(name = "TIPO_ACOMETIDA")
    protected String tipoacometida;
    @XmlElement(name = "TIPO_AGRUPAMIENTO_DE_PROPIEDAD_INSPECCIONADA")
    protected String tipoagrupamientodepropiedadinspeccionada;
    @XmlElement(name = "TIPO_BARRIO_DE_PROPIEDAD_INSPECCIONADA")
    protected String tipobarriodepropiedadinspeccionada;
    @XmlElement(name = "TIPO_CLIENTE_SERVICIO_REFERENCIA")
    protected String tipoclienteservicioreferencia;
    @XmlElement(name = "TIPO_DE_CAJA_MEDICION")
    protected String tipodecajamedicion;
    @XmlElement(name = "TIPO_DE_CAJA_TOMA")
    protected String tipodecajatoma;
    @XmlElement(name = "TIPO_DE_CONEXION")
    protected String tipodeconexion;
    @XmlElement(name = "TIPO_DE_EJECUCION")
    protected String tipodeejecucion;
    @XmlElement(name = "TIPO_DE_EMPALME")
    protected String tipodeempalme;
    @XmlElement(name = "TIPO_DE_INSPECCION")
    protected String tipodeinspeccion;
    @XmlElement(name = "TIPO_DE_MEDICION")
    protected String tipodemedicion;
    @XmlElement(name = "TIPO_DE_SELECAO")
    protected String tipodeselecao;
    @XmlElement(name = "TIPO_DO_SERVICO")
    protected String tipodoservico;
    @XmlElement(name = "TIPO_FAMILIA_DE_PROPIEDAD_INSPECCIONADA")
    protected String tipofamiliadepropiedadinspeccionada;
    @XmlElement(name = "TIPO_MEDIDA_CONEXION")
    protected String tipomedidaconexion;
    @XmlElement(name = "TIPO_PROTECCION_DEL_EMPALME")
    protected String tipoprotecciondelempalme;
    @XmlElement(name = "TIPO_RESIDENTE")
    protected String tiporesidente;
    @XmlElement(name = "TIPO_VIVIENDA_DE_PROPIEDAD_INSPECCIONADA")
    protected String tipoviviendadepropiedadinspeccionada;
    @XmlElement(name = "TOI1")
    protected Long toi1;
    @XmlElement(name = "TOI2")
    protected Long toi2;
    @XmlElement(name = "TOI3")
    protected Long toi3;
    @XmlElement(name = "TRANSFORMADOR")
    protected String transformador;
    @XmlElement(name = "TRANSFORMADORS_CORRIENTE")
    protected ArrayOfTransformador transformadorscorriente;
    @XmlElement(name = "TRANSFORMADORS_TENSION")
    protected ArrayOfTransformador transformadorstension;
    @XmlElement(name = "UBICACION_DE_LA_MEDIDA")
    protected String ubicaciondelamedida;
    @XmlElement(name = "UBICACION_SED")
    protected String ubicacionsed;
    @XmlElement(name = "VINCULOS")
    protected ArrayOfVinculo vinculos;
    @XmlElement(name = "VOLTAJE")
    protected String voltaje;
    @XmlElement(name = "XML_EXTENSION_PARAMS")
    protected String xmlextensionparams;
    @XmlElement(name = "TIPO_DE_USO")
    protected String tipodeuso;

    /**
     * Obtiene el valor de la propiedad actividadcomercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVIDADCOMERCIAL() {
        return actividadcomercial;
    }

    /**
     * Define el valor de la propiedad actividadcomercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVIDADCOMERCIAL(String value) {
        this.actividadcomercial = value;
    }

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
     * Obtiene el valor de la propiedad areaemisora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREAEMISORA() {
        return areaemisora;
    }

    /**
     * Define el valor de la propiedad areaemisora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREAEMISORA(String value) {
        this.areaemisora = value;
    }

    /**
     * Obtiene el valor de la propiedad cajaempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAJAEMPALME() {
        return cajaempalme;
    }

    /**
     * Define el valor de la propiedad cajaempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAJAEMPALME(String value) {
        this.cajaempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidaddeservicioselectricos.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCANTIDADDESERVICIOSELECTRICOS() {
        return cantidaddeservicioselectricos;
    }

    /**
     * Define el valor de la propiedad cantidaddeservicioselectricos.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCANTIDADDESERVICIOSELECTRICOS(Long value) {
        this.cantidaddeservicioselectricos = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidaddesuministrosporsed.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCANTIDADDESUMINISTROSPORSED() {
        return cantidaddesuministrosporsed;
    }

    /**
     * Define el valor de la propiedad cantidaddesuministrosporsed.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCANTIDADDESUMINISTROSPORSED(Long value) {
        this.cantidaddesuministrosporsed = value;
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
     * Obtiene el valor de la propiedad capacidaddeltransformadordepotencia.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCAPACIDADDELTRANSFORMADORDEPOTENCIA() {
        return capacidaddeltransformadordepotencia;
    }

    /**
     * Define el valor de la propiedad capacidaddeltransformadordepotencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCAPACIDADDELTRANSFORMADORDEPOTENCIA(Double value) {
        this.capacidaddeltransformadordepotencia = value;
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
     * Obtiene el valor de la propiedad capacidadempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPACIDADEMPALME() {
        return capacidadempalme;
    }

    /**
     * Define el valor de la propiedad capacidadempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPACIDADEMPALME(String value) {
        this.capacidadempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad centrodedistribucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTRODEDISTRIBUCION() {
        return centrodedistribucion;
    }

    /**
     * Define el valor de la propiedad centrodedistribucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTRODEDISTRIBUCION(String value) {
        this.centrodedistribucion = value;
    }

    /**
     * Obtiene el valor de la propiedad ciclodeltransformador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCICLODELTRANSFORMADOR() {
        return ciclodeltransformador;
    }

    /**
     * Define el valor de la propiedad ciclodeltransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCICLODELTRANSFORMADOR(String value) {
        this.ciclodeltransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad circuito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIRCUITO() {
        return circuito;
    }

    /**
     * Define el valor de la propiedad circuito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIRCUITO(String value) {
        this.circuito = value;
    }

    /**
     * Obtiene el valor de la propiedad classe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSE() {
        return classe;
    }

    /**
     * Define el valor de la propiedad classe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSE(String value) {
        this.classe = value;
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
     * Obtiene el valor de la propiedad conductorempalme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDUCTOREMPALME() {
        return conductorempalme;
    }

    /**
     * Define el valor de la propiedad conductorempalme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDUCTOREMPALME(String value) {
        this.conductorempalme = value;
    }

    /**
     * Obtiene el valor de la propiedad datatoi1.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATATOI1() {
        return datatoi1;
    }

    /**
     * Define el valor de la propiedad datatoi1.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATATOI1(XMLGregorianCalendar value) {
        this.datatoi1 = value;
    }

    /**
     * Obtiene el valor de la propiedad datatoi2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATATOI2() {
        return datatoi2;
    }

    /**
     * Define el valor de la propiedad datatoi2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATATOI2(XMLGregorianCalendar value) {
        this.datatoi2 = value;
    }

    /**
     * Obtiene el valor de la propiedad datatoi3.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATATOI3() {
        return datatoi3;
    }

    /**
     * Define el valor de la propiedad datatoi3.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATATOI3(XMLGregorianCalendar value) {
        this.datatoi3 = value;
    }

    /**
     * Obtiene el valor de la propiedad franjatipodeselecao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRANJATIPODESELECAO() {
        return franjatipodeselecao;
    }

    /**
     * Define el valor de la propiedad franjatipodeselecao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRANJATIPODESELECAO(String value) {
        this.franjatipodeselecao = value;
    }

    /**
     * Obtiene el valor de la propiedad irregularidad.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlfanumerico50 }
     *     
     */
    public ArrayOfAlfanumerico50 getIRREGULARIDAD() {
        return irregularidad;
    }

    /**
     * Define el valor de la propiedad irregularidad.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlfanumerico50 }
     *     
     */
    public void setIRREGULARIDAD(ArrayOfAlfanumerico50 value) {
        this.irregularidad = value;
    }

    /**
     * Obtiene el valor de la propiedad latituddeltransformador.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATITUDDELTRANSFORMADOR() {
        return latituddeltransformador;
    }

    /**
     * Define el valor de la propiedad latituddeltransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATITUDDELTRANSFORMADOR(BigDecimal value) {
        this.latituddeltransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad listatareasarealizar.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAlfanumerico50 }
     *     
     */
    public ArrayOfAlfanumerico50 getLISTATAREASAREALIZAR() {
        return listatareasarealizar;
    }

    /**
     * Define el valor de la propiedad listatareasarealizar.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlfanumerico50 }
     *     
     */
    public void setLISTATAREASAREALIZAR(ArrayOfAlfanumerico50 value) {
        this.listatareasarealizar = value;
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
     * Obtiene el valor de la propiedad longituddeltransformador.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLONGITUDDELTRANSFORMADOR() {
        return longituddeltransformador;
    }

    /**
     * Define el valor de la propiedad longituddeltransformador.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLONGITUDDELTRANSFORMADOR(BigDecimal value) {
        this.longituddeltransformador = value;
    }

    /**
     * Obtiene el valor de la propiedad medidatecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIDATECNICA() {
        return medidatecnica;
    }

    /**
     * Define el valor de la propiedad medidatecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIDATECNICA(String value) {
        this.medidatecnica = value;
    }

    /**
     * Obtiene el valor de la propiedad niveldetension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIVELDETENSION() {
        return niveldetension;
    }

    /**
     * Define el valor de la propiedad niveldetension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIVELDETENSION(String value) {
        this.niveldetension = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrecircuito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRECIRCUITO() {
        return nombrecircuito;
    }

    /**
     * Define el valor de la propiedad nombrecircuito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRECIRCUITO(String value) {
        this.nombrecircuito = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRESED() {
        return nombresed;
    }

    /**
     * Define el valor de la propiedad nombresed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRESED(String value) {
        this.nombresed = value;
    }

    /**
     * Obtiene el valor de la propiedad numerocaixa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROCAIXA() {
        return numerocaixa;
    }

    /**
     * Define el valor de la propiedad numerocaixa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROCAIXA(String value) {
        this.numerocaixa = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodedisplay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEDISPLAY() {
        return numerodedisplay;
    }

    /**
     * Define el valor de la propiedad numerodedisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEDISPLAY(String value) {
        this.numerodedisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad numerodelaordendemacro.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNUMERODELAORDENDEMACRO() {
        return numerodelaordendemacro;
    }

    /**
     * Define el valor de la propiedad numerodelaordendemacro.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNUMERODELAORDENDEMACRO(Long value) {
        this.numerodelaordendemacro = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroprocesomasivo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNUMEROPROCESOMASIVO() {
        return numeroprocesomasivo;
    }

    /**
     * Define el valor de la propiedad numeroprocesomasivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNUMEROPROCESOMASIVO(Long value) {
        this.numeroprocesomasivo = value;
    }

    /**
     * Obtiene el valor de la propiedad numerotampacaixa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROTAMPACAIXA() {
        return numerotampacaixa;
    }

    /**
     * Define el valor de la propiedad numerotampacaixa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROTAMPACAIXA(String value) {
        this.numerotampacaixa = value;
    }

    /**
     * Obtiene el valor de la propiedad origendecontraste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGENDECONTRASTE() {
        return origendecontraste;
    }

    /**
     * Define el valor de la propiedad origendecontraste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGENDECONTRASTE(String value) {
        this.origendecontraste = value;
    }

    /**
     * Obtiene el valor de la propiedad origendelainspeccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGENDELAINSPECCION() {
        return origendelainspeccion;
    }

    /**
     * Define el valor de la propiedad origendelainspeccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGENDELAINSPECCION(String value) {
        this.origendelainspeccion = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajedeconsumocomercial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPORCENTAJEDECONSUMOCOMERCIAL() {
        return porcentajedeconsumocomercial;
    }

    /**
     * Define el valor de la propiedad porcentajedeconsumocomercial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPORCENTAJEDECONSUMOCOMERCIAL(Double value) {
        this.porcentajedeconsumocomercial = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajedeconsumoindustrial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPORCENTAJEDECONSUMOINDUSTRIAL() {
        return porcentajedeconsumoindustrial;
    }

    /**
     * Define el valor de la propiedad porcentajedeconsumoindustrial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPORCENTAJEDECONSUMOINDUSTRIAL(Double value) {
        this.porcentajedeconsumoindustrial = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajedeconsumooficial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPORCENTAJEDECONSUMOOFICIAL() {
        return porcentajedeconsumooficial;
    }

    /**
     * Define el valor de la propiedad porcentajedeconsumooficial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPORCENTAJEDECONSUMOOFICIAL(Double value) {
        this.porcentajedeconsumooficial = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajedeconsumoresidencial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPORCENTAJEDECONSUMORESIDENCIAL() {
        return porcentajedeconsumoresidencial;
    }

    /**
     * Define el valor de la propiedad porcentajedeconsumoresidencial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPORCENTAJEDECONSUMORESIDENCIAL(Double value) {
        this.porcentajedeconsumoresidencial = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajedeconsumotrafo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPORCENTAJEDECONSUMOTRAFO() {
        return porcentajedeconsumotrafo;
    }

    /**
     * Define el valor de la propiedad porcentajedeconsumotrafo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPORCENTAJEDECONSUMOTRAFO(Double value) {
        this.porcentajedeconsumotrafo = value;
    }

    /**
     * Obtiene el valor de la propiedad posicionmedidorps1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSICIONMEDIDORPS1() {
        return posicionmedidorps1;
    }

    /**
     * Define el valor de la propiedad posicionmedidorps1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSICIONMEDIDORPS1(String value) {
        this.posicionmedidorps1 = value;
    }

    /**
     * Obtiene el valor de la propiedad potenciacontratada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENCIACONTRATADA() {
        return potenciacontratada;
    }

    /**
     * Define el valor de la propiedad potenciacontratada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENCIACONTRATADA(String value) {
        this.potenciacontratada = value;
    }

    /**
     * Obtiene el valor de la propiedad potenciacontratadafuerapunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENCIACONTRATADAFUERAPUNTA() {
        return potenciacontratadafuerapunta;
    }

    /**
     * Define el valor de la propiedad potenciacontratadafuerapunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENCIACONTRATADAFUERAPUNTA(String value) {
        this.potenciacontratadafuerapunta = value;
    }

    /**
     * Obtiene el valor de la propiedad potenciacontratadahorapunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTENCIACONTRATADAHORAPUNTA() {
        return potenciacontratadahorapunta;
    }

    /**
     * Define el valor de la propiedad potenciacontratadahorapunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTENCIACONTRATADAHORAPUNTA(String value) {
        this.potenciacontratadahorapunta = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTO() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTO(String value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad programado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGRAMADO() {
        return programado;
    }

    /**
     * Define el valor de la propiedad programado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGRAMADO(String value) {
        this.programado = value;
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
     * Obtiene el valor de la propiedad puntofisico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUNTOFISICO() {
        return puntofisico;
    }

    /**
     * Define el valor de la propiedad puntofisico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUNTOFISICO(String value) {
        this.puntofisico = value;
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
     * Obtiene el valor de la propiedad suministrosinspecciones.
     * 
     * @return
     *     possible object is
     *     {@link SuministroInspecciones }
     *     
     */
    public SuministroInspecciones getSUMINISTROSINSPECCIONES() {
        return suministrosinspecciones;
    }

    /**
     * Define el valor de la propiedad suministrosinspecciones.
     * 
     * @param value
     *     allowed object is
     *     {@link SuministroInspecciones }
     *     
     */
    public void setSUMINISTROSINSPECCIONES(SuministroInspecciones value) {
        this.suministrosinspecciones = value;
    }

    /**
     * Obtiene el valor de la propiedad tareaarealizar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAREAAREALIZAR() {
        return tareaarealizar;
    }

    /**
     * Define el valor de la propiedad tareaarealizar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAREAAREALIZAR(String value) {
        this.tareaarealizar = value;
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
     * Obtiene el valor de la propiedad tipoagrupamientodepropiedadinspeccionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOAGRUPAMIENTODEPROPIEDADINSPECCIONADA() {
        return tipoagrupamientodepropiedadinspeccionada;
    }

    /**
     * Define el valor de la propiedad tipoagrupamientodepropiedadinspeccionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOAGRUPAMIENTODEPROPIEDADINSPECCIONADA(String value) {
        this.tipoagrupamientodepropiedadinspeccionada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipobarriodepropiedadinspeccionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOBARRIODEPROPIEDADINSPECCIONADA() {
        return tipobarriodepropiedadinspeccionada;
    }

    /**
     * Define el valor de la propiedad tipobarriodepropiedadinspeccionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOBARRIODEPROPIEDADINSPECCIONADA(String value) {
        this.tipobarriodepropiedadinspeccionada = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoclienteservicioreferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOCLIENTESERVICIOREFERENCIA() {
        return tipoclienteservicioreferencia;
    }

    /**
     * Define el valor de la propiedad tipoclienteservicioreferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOCLIENTESERVICIOREFERENCIA(String value) {
        this.tipoclienteservicioreferencia = value;
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
     * Obtiene el valor de la propiedad tipodeejecucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEEJECUCION() {
        return tipodeejecucion;
    }

    /**
     * Define el valor de la propiedad tipodeejecucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEEJECUCION(String value) {
        this.tipodeejecucion = value;
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
     * Obtiene el valor de la propiedad tipodeinspeccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEINSPECCION() {
        return tipodeinspeccion;
    }

    /**
     * Define el valor de la propiedad tipodeinspeccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEINSPECCION(String value) {
        this.tipodeinspeccion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodemedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEMEDICION() {
        return tipodemedicion;
    }

    /**
     * Define el valor de la propiedad tipodemedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEMEDICION(String value) {
        this.tipodemedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodeselecao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODESELECAO() {
        return tipodeselecao;
    }

    /**
     * Define el valor de la propiedad tipodeselecao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODESELECAO(String value) {
        this.tipodeselecao = value;
    }

    /**
     * Obtiene el valor de la propiedad tipodoservico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODOSERVICO() {
        return tipodoservico;
    }

    /**
     * Define el valor de la propiedad tipodoservico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODOSERVICO(String value) {
        this.tipodoservico = value;
    }

    /**
     * Obtiene el valor de la propiedad tipofamiliadepropiedadinspeccionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOFAMILIADEPROPIEDADINSPECCIONADA() {
        return tipofamiliadepropiedadinspeccionada;
    }

    /**
     * Define el valor de la propiedad tipofamiliadepropiedadinspeccionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOFAMILIADEPROPIEDADINSPECCIONADA(String value) {
        this.tipofamiliadepropiedadinspeccionada = value;
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
     * Obtiene el valor de la propiedad tiporesidente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPORESIDENTE() {
        return tiporesidente;
    }

    /**
     * Define el valor de la propiedad tiporesidente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPORESIDENTE(String value) {
        this.tiporesidente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoviviendadepropiedadinspeccionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOVIVIENDADEPROPIEDADINSPECCIONADA() {
        return tipoviviendadepropiedadinspeccionada;
    }

    /**
     * Define el valor de la propiedad tipoviviendadepropiedadinspeccionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOVIVIENDADEPROPIEDADINSPECCIONADA(String value) {
        this.tipoviviendadepropiedadinspeccionada = value;
    }

    /**
     * Obtiene el valor de la propiedad toi1.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTOI1() {
        return toi1;
    }

    /**
     * Define el valor de la propiedad toi1.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTOI1(Long value) {
        this.toi1 = value;
    }

    /**
     * Obtiene el valor de la propiedad toi2.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTOI2() {
        return toi2;
    }

    /**
     * Define el valor de la propiedad toi2.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTOI2(Long value) {
        this.toi2 = value;
    }

    /**
     * Obtiene el valor de la propiedad toi3.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTOI3() {
        return toi3;
    }

    /**
     * Define el valor de la propiedad toi3.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTOI3(Long value) {
        this.toi3 = value;
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
     * Obtiene el valor de la propiedad transformadorscorriente.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public ArrayOfTransformador getTRANSFORMADORSCORRIENTE() {
        return transformadorscorriente;
    }

    /**
     * Define el valor de la propiedad transformadorscorriente.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public void setTRANSFORMADORSCORRIENTE(ArrayOfTransformador value) {
        this.transformadorscorriente = value;
    }

    /**
     * Obtiene el valor de la propiedad transformadorstension.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public ArrayOfTransformador getTRANSFORMADORSTENSION() {
        return transformadorstension;
    }

    /**
     * Define el valor de la propiedad transformadorstension.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformador }
     *     
     */
    public void setTRANSFORMADORSTENSION(ArrayOfTransformador value) {
        this.transformadorstension = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicaciondelamedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBICACIONDELAMEDIDA() {
        return ubicaciondelamedida;
    }

    /**
     * Define el valor de la propiedad ubicaciondelamedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBICACIONDELAMEDIDA(String value) {
        this.ubicaciondelamedida = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacionsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBICACIONSED() {
        return ubicacionsed;
    }

    /**
     * Define el valor de la propiedad ubicacionsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBICACIONSED(String value) {
        this.ubicacionsed = value;
    }

    /**
     * Obtiene el valor de la propiedad vinculos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVinculo }
     *     
     */
    public ArrayOfVinculo getVINCULOS() {
        return vinculos;
    }

    /**
     * Define el valor de la propiedad vinculos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVinculo }
     *     
     */
    public void setVINCULOS(ArrayOfVinculo value) {
        this.vinculos = value;
    }

    /**
     * Obtiene el valor de la propiedad voltaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLTAJE() {
        return voltaje;
    }

    /**
     * Define el valor de la propiedad voltaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLTAJE(String value) {
        this.voltaje = value;
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
     * Obtiene el valor de la propiedad tipodeuso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODEUSO() {
        return tipodeuso;
    }

    /**
     * Define el valor de la propiedad tipodeuso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODEUSO(String value) {
        this.tipodeuso = value;
    }

}
