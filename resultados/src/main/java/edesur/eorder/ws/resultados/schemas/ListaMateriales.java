package edesur.eorder.ws.resultados.schemas;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class ListaMateriales {
    private List<Material> lista = new ArrayList<Material>();

    @XmlElement(name="material")
    public List<Material> getEntries() {
        return lista;
    }
}
