package util;


import enumeradores.Estados;
import enumeradores.Regioes;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author João Eduardo Rosa da Fonseca
 */
public class EstadosPorRegiao {

    /**
     * Retorna lista de estados de uma região
     * @param regiao
     * @return lista
     */
    public List<Estados> Lista(Regioes regiao) {
        List<Estados> lista = new ArrayList<Estados>();

        for (int i = 0; i < Estados.values().length; i++) {
            if (Estados.values()[i].getRegiao().equals(regiao)) {
                lista.add(Estados.values()[i]);
            }
        }
        return lista;
    }
}
