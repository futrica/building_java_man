import caesar.Caesar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class TesteCaesar {
    
    @Test
    public void TesteCaesar() {
       Caesar cae = new Caesar();
       assertEquals(cae.misturar("adriano", 3), "dguldqr" );  
       assertEquals(cae.misturar("joao", 3), "mrdr" );
    }
}