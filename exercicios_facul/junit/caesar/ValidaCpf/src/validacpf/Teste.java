package validacpf;
import validacpf.ValidaCpf;

/**
 *
 * @author root
 */
public class Teste {
    
    public static void main(String[] args) {
        ValidaCpf cpf = new ValidaCpf();

        if (cpf.validaCPF("") == true  ){
            System.out.println("deu certo");
        } else {System.out.println("deu errado");}
        }
}
