import org.junit.Test;
import static org.junit.Assert.*;
import projetovr.CalculoVr;

/**
 *
 * @author root
 */
public class CalculoVrTest {
    CalculoVr calc = new CalculoVr();
    
    @Test
    public void testarValorPagoDeVRPorDia() { 
        assertTrue(calc.valorPago(1) == 23); 
    }
    
    @Test
    public void testarDescontoSalario(){
        assertEquals(calc.descontoSalario(230), 23, 2);
    }
    
    @Test 
    public void testarSalarioAReceber(){
        assertEquals(calc.calculoSalario(100, 20), 80, 2);
    }
}