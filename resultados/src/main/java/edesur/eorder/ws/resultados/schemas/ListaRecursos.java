package edesur.eorder.ws.resultados.schemas;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class ListaRecursos {
    private List<Recurso> lista = new ArrayList<Recurso>();

    @XmlElement(name="recursos")
    public List<Recurso> getEntries() {
        return lista;
    }
}
