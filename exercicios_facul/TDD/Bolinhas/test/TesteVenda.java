import bolinhas.VendasEfetuadas;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class TesteVenda {
    
    VendasEfetuadas v = new VendasEfetuadas();
    
    @Test
    public void TesteVenda() {
        v.lerVendas();
        assertEquals(72.5, v.total(), 0.0);
    }
    
}