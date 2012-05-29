/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import enumeradores.Estados;
import enumeradores.Regioes;
import java.util.List;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author joaoeduardorf
 */
public class EstadosPorRegiaoTest {
    
    @Test
    public void TesteDeEstadosDaRegiaoCentroOeste(){
        List<Estados> lista = new EstadosPorRegiao().Lista(Regioes.CENTROOESTE);
        
        Assert.assertEquals("É esperado '4' estados no centro-oeste", 4, lista.size());
        Assert.assertEquals("É Esperado 'Distrito Federal' como estado", Estados.DISTRITOFEDERAL,lista.get(0));
        Assert.assertEquals("É Esperado 'Goiás' como estado", Estados.GOIAS,lista.get(1));
        Assert.assertEquals("É Esperado 'Mato Grosso' como estado", Estados.MATOGROSSO,lista.get(2));
        Assert.assertEquals("É Esperado 'Mato Grosso do Sul' como estado", Estados.MATOGROSSODOSUL,lista.get(3));
    }
    
    @Test
    public void TesteDeEstadosDaRegiaoNordeste(){
        List<Estados> lista = new EstadosPorRegiao().Lista(Regioes.NORDESTE);
        
        Assert.assertEquals("É esperado '9' estados no nordeste", 9, lista.size());
        
        Assert.assertEquals("É Esperado 'Alagoas' como estado", Estados.ALAGOAS,lista.get(0));
        Assert.assertEquals("É Esperado 'Bahia' como estado", Estados.BAHIA,lista.get(1));
        Assert.assertEquals("É Esperado 'Ceará' como estado", Estados.CEARA,lista.get(2));
        Assert.assertEquals("É Esperado 'Maranhão' como estado", Estados.MARANHAO,lista.get(3));
        Assert.assertEquals("É Esperado 'Paraíba' como estado", Estados.PARAIBA,lista.get(4));
        Assert.assertEquals("É Esperado 'Pernambuco' como estado", Estados.PERNAMBUCO,lista.get(5));
        Assert.assertEquals("É Esperado 'Piauí' como estado", Estados.PIAUI,lista.get(6));
        Assert.assertEquals("É Esperado 'Rio Grande do Norte' como estado", Estados.RIOGRANDEDONORTE, lista.get(7));
        Assert.assertEquals("É Esperado 'Sergipe' como estado", Estados.SERGIPE, lista.get(8));
    } 
    
    @Test
    public void TesteDeEstadosDaRegiaoNorte(){
        List<Estados> lista = new EstadosPorRegiao().Lista(Regioes.NORTE);
        
        Assert.assertEquals("É esperado '7' estados no norte", 7, lista.size());
        Assert.assertEquals("É Esperado 'Acre' como estado", Estados.ACRE,lista.get(0));
        Assert.assertEquals("É Esperado 'Amapá' como estado", Estados.AMAPA,lista.get(1));
        Assert.assertEquals("É Esperado 'Amazonas' como estado", Estados.AMAZONAS,lista.get(2));
        Assert.assertEquals("É Esperado 'Pará' como estado", Estados.PARA,lista.get(3));
        Assert.assertEquals("É Esperado 'Rondônia' como estado", Estados.RONDONIA,lista.get(4));
        Assert.assertEquals("É Esperado 'Roraima' como estado", Estados.RORAIMA,lista.get(5));
        Assert.assertEquals("É Esperado 'Tocantins' como estado", Estados.TOCANTINS,lista.get(6));
    }
    
    @Test
    public void TesteDeEstadosDaRegiaoSudeste(){
        List<Estados> lista = new EstadosPorRegiao().Lista(Regioes.SUDESTE);
        
        Assert.assertEquals("É esperado '4' estados no sudeste", 4, lista.size());
        Assert.assertEquals("É Esperado 'Espirito Santo' como estado", Estados.ESPIRITOSANTO,lista.get(0));
        Assert.assertEquals("É Esperado 'Minas Gerais' como estado", Estados.MINASGERAIS,lista.get(1));
        Assert.assertEquals("É Esperado 'Rio de Janeiro' como estado", Estados.RIODEJANEIRO,lista.get(2));
        Assert.assertEquals("É Esperado 'São Paulo' como estado", Estados.SAOPAULO,lista.get(3));
    }
    
    @Test
    public void TesteDeEstadosDaRegiaoSul(){
        List<Estados> lista = new EstadosPorRegiao().Lista(Regioes.SUL);
        
        Assert.assertEquals("É esperado '3' estados no sul", 3, lista.size());
        Assert.assertEquals("É Esperado 'Paraná' como estado", Estados.PARANA,lista.get(0));
        Assert.assertEquals("É Esperado 'Rio Grande do Sul' como estado", Estados.RIOGRANDEDOSUL,lista.get(1));
        Assert.assertEquals("É Esperado 'Santa Catarina' como estado", Estados.SANTACATARINA,lista.get(2));
    }
}
