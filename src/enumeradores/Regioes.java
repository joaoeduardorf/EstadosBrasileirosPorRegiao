/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;

/**
 * Enumerador de regiões do Brasil
 *
 * @author João Eduardo Rosa da Fonseca
 */
public enum Regioes {

    /**
     * Região Centro-Oeste
     */
    CENTROOESTE("Centro-Oeste"),
    /**
     * Região Nordeste
     */
    NORDESTE("Nordeste"),
    /*
     * Região Norte
     */
    NORTE("Norte"),
    /**
     * Região Sudeste
     */
    SUDESTE("Sudeste"),
    /**
     * Região Sul
     */
    SUL("Sul");
    /**
     * Variável nome
     */
    private String nome;

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
}
