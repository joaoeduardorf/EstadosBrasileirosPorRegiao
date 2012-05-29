/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;

/**
 * Enumerador com todos estados do Brasil
 * 
 * @author João Eduardo Rosa da Fonseca
 */
public enum Estados {

    /**
     * Nome: Acre, Sigla: AC
     */
    ACRE("Acre", "AC", Regioes.NORTE),
    /**
     * Nome: Alagoas, Sigla: AL
     */
    ALAGOAS("Alagoas", "AL", Regioes.NORDESTE),
    /**
     * Nome: Amapá, Sigla: AP
     */
    AMAPA("Amapá", "AP", Regioes.NORTE),
    /**
     * Nome: Amazonas, Sigla: AM
     */
    AMAZONAS("Amazonas", "AM", Regioes.NORTE),
    /**
     * Nome: Bahia, Sigla: BA
     */
    BAHIA("Bahia", "BA", Regioes.NORDESTE),
    /**
     * Nome: Ceará, Sigla: CE
     */
    CEARA("Ceará", "CE", Regioes.NORDESTE),
    /**
     * Nome: Distrito Federal, Sigla: DF
     */
    DISTRITOFEDERAL("Distrito Federal", "DF", Regioes.CENTROOESTE),
    /**
     * Nome: Espírito Santo, Sigla: ES
     */
    ESPIRITOSANTO("Espírito Santo", "ES", Regioes.SUDESTE),
    /**
     * Nome: Goiás, Sigla: GO
     */
    GOIAS("Goiás", "GO", Regioes.CENTROOESTE),
    /**
     * Nome: Maranhão, Sigla: MA
     */
    MARANHAO("Maranhão", "MA", Regioes.NORDESTE),
    /**
     * Nome: Mato Grosso, Sigla: MT
     */
    MATOGROSSO("Mato Grosso", "MT", Regioes.CENTROOESTE),
    /**
     * Nome: Mato Grosso do Sul, Sigla: MS
     */
    MATOGROSSODOSUL("Mato Grosso do Sul", "MS", Regioes.CENTROOESTE),
    /**
     * Nome: Minas Gerais, Sigla: MG
     */
    MINASGERAIS("Minas Gerais", "MG", Regioes.SUDESTE),
    /**
     * Nome: Pará, Sigla: PA
     */
    PARA("Pará", "PA", Regioes.NORTE),
    /**
     * Nome: Paraíba, Sigla: PB
     */
    PARAIBA("Paraíba", "PB", Regioes.NORDESTE),
    /**
     * Nome: Paraná, Sigla: PR
     */
    PARANA("Paraná", "PR", Regioes.SUL),
    /**
     * Nome: Pernambuco, Sigla: PE
     */
    PERNAMBUCO("Pernambuco", "PE", Regioes.NORDESTE),
    /**
     * Nome: Piauí, Sigla: PI
     */
    PIAUI("Piauí", "PI", Regioes.NORDESTE),
    /**
     * Nome: Rio de Janeiro, Sigla: RJ
     */
    RIODEJANEIRO("Rio de Janeiro", "RJ", Regioes.SUDESTE),
    /**
     * Nome: Rio Grande do Norte, Sigla: RN
     */
    RIOGRANDEDONORTE("Rio Grande do Norte", "RN", Regioes.NORDESTE),
    /**
     * Nome: Rio Grande do Sul, Sigla: RS
     */
    RIOGRANDEDOSUL("Rio Grande do Sul", "RS", Regioes.SUL),
    /**
     * Nome Rondônia, Silga: RO
     */
    RONDONIA("Rondônia", "RO", Regioes.NORTE),
    /**
     * Nome: Roraima, Sigla: RO
     */
    RORAIMA("Roraima", "RR", Regioes.NORTE),
    /**
     * Nome: Santa Catarina, Sigla: SC
     */
    SANTACATARINA("Santa Catarina", "SC", Regioes.SUL),
    /**
     * Nome: São Paulo, Sigla: SP
     */
    SAOPAULO("São Paulo", "SP", Regioes.SUDESTE),
    /**
     * Nome: Sergipe, Sigla: SE
     */
    SERGIPE("Sergipe", "SE", Regioes.NORDESTE),
    /**
     * Nome: Tocantins, Sigla: TO
     */
    TOCANTINS("Tocantins", "TO", Regioes.NORTE);
    private String nome;
    private String sigla;
    private Regioes regiao;
    
    /**
     * Construtor que recebe nome sigla
     *
     * @param nome
     * @param sigla
     */
    private Estados(String nome, String sigla, Regioes regiao) {
        this.nome = nome;
        this.sigla = sigla;       
        this.regiao = regiao;
    }

    /**
     * Retorna nome
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna sigla
     *
     * @return sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * Retorna região
     * @return regiao
     */
    public Regioes getRegiao() {
        return regiao;
    }
}
