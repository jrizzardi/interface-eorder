package edesur.eorder.ws.resultados.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Recurso {
    @XmlElement(required = true)
    private String nombre;

    @XmlElement(required = true)
    private String apellido;

    @XmlElement(required = true)
    private String matricula;

    @XmlElement(required = true)
    private String tiempoTrabajo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricúla) {
        this.matricula = matricúla;
    }

    public String getTiempoTrabajo() {
        return tiempoTrabajo;
    }

    public void setTiempoTrabajo(String tiempoTrabajo) {
        this.tiempoTrabajo = tiempoTrabajo;
    }
}
