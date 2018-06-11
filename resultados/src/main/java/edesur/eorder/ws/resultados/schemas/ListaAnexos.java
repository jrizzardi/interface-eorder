package edesur.eorder.ws.resultados.schemas;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class ListaAnexos {
    private List<Anexo> lista = new ArrayList<Anexo>();

    @XmlElement(name="anexo")
    public List<Anexo> getEntries() {
        return lista;
    }
}
