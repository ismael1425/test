
package junit.test;

import com.test.apirest.entity.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class validacion {
    
    
    public validacion() {
        
        
    }
    public void TestId(){
        Persona persona = new Persona();
        if(persona.getPersonaId()<0){
            fail("El ID debe ser mayor que 0");
        }
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

}
