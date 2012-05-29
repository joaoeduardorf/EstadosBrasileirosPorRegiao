/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * Teste dos enumeradores de região
 *
 * @author João Eduardo Rosa da Fonseca
 */
public class RegioesTest {

    @Test
    public void TesteDeRegiaoCentroOeste() {
        Assert.assertEquals("É esperado 'Centro-Oeste' como região", "Centro-Oeste", Regioes.CENTROOESTE.getNome());
    }

    @Test
    public void TesteDeRegiaoNordeste() {
        Assert.assertEquals("É esperado 'Nordeste' como região", "Nordeste", Regioes.NORDESTE.getNome());
    }

    @Test
    public void TesteDeRegiaoNorte() {
        Assert.assertEquals("É esperado 'Norte' como região", "Norte", Regioes.NORTE.getNome());
    }

    @Test
    public void TesteDeRegiaoSudeste() {
        Assert.assertEquals("É esperado 'Sudeste' como região", "Sudeste", Regioes.SUDESTE.getNome());
    }

    @Test
    public void TesteDeRegiaoSul() {
        Assert.assertEquals("É esperado 'Sul' como região", "Sul", Regioes.SUL.getNome());
    }
}
