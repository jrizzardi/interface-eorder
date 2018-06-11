package edesur.eorder.ws.resultados.schemas;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class ListaPrecintos {
    private List<Precinto> lista = new ArrayList<Precinto>();

    @XmlElement(name="precintos")
    public List<Precinto> getEntries() {
        return lista;
    }
}
