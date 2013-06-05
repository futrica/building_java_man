import org.junit.Test;
import static org.junit.Assert.*;
import ir.Ir;

/**
 *
 * @author root
 */
public class TesteIr {
    
    @Test
    public void TesteIr() {
      Ir imp = new Ir();
      assertEquals(imp.faixaImposto(2000), 1800 , 2);
      
    }
}