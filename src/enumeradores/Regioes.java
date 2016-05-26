/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumerador de regiões do Brasil
 *
 * @author João Eduardo Rosa da Fonseca
 */
public enum Regioes implements IEstadosPorRegiaoStrategy {

    /**
     * Região Centro-Oeste
     */
    CENTROOESTE("Centro-Oeste") {
        @Override
        public List<Estados> getEstados() {
            return estadosPorRegiao(CENTROOESTE);
        }

    },
    /**
     * Região Nordeste
     */
    NORDESTE("Nordeste") {
        @Override
        public List<Estados> getEstados() {
            return estadosPorRegiao(NORDESTE);
        }
    },
    /*
     * Região Norte
     */
    NORTE("Norte") {
        @Override
        public List<Estados> getEstados() {
            return estadosPorRegiao(NORTE);
        }
    },
    /**
     * Região Sudeste
     */
    SUDESTE("Sudeste") {
        @Override
        public List<Estados> getEstados() {
            return estadosPorRegiao(SUDESTE);
        }
    },
    /**
     * Região Sul
     */
    SUL("Sul") {
        @Override
        public List<Estados> getEstados() {
            return estadosPorRegiao(SUL);
        }
    };
    /**
     * Variável nome
     */
    private final String nome;

    /**
     * Construtor de região
     *
     * @param nome
     */
    private Regioes(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna nome
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    protected List<Estados> estadosPorRegiao(Regioes regiao) {
        List<Estados> lista = new ArrayList<>();

        for (Estados value : Estados.values()) {
            if (value.getRegiao().equals(regiao)) {
                lista.add(value);
            }
        }
        return lista;
    }
}
