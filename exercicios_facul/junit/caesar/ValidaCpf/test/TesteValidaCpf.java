import validacpf.ValidaCpf;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class TesteValidaCpf {
    
    @Test
    public void TesteValidaCpf() {
        ValidaCpf cpf = new ValidaCpf();
        assertTrue(cpf.validaCPF("35094930877") == true);
      }
}