/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suite;

import enumeradores.EstadosTest;
import enumeradores.RegioesTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import util.EstadosPorRegiaoTest;

/**
 *
 * @author joaoeduardorf
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    RegioesTest.class,
    EstadosTest.class,
    EstadosPorRegiaoTest.class    
})
public class SuiteDeTeste {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
