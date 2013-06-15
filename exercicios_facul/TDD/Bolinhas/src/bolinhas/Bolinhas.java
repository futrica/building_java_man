package bolinhas;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Bolinhas { 
    public static void main(String[] args) {
        
        VendasEfetuadas v = new VendasEfetuadas();

        v.lerVendas();
        v.displayVendas();

        System.out.println("total de "  + v.total());
    }
}
/*
Para cada linha deste arquivo deve ser gerado um objeto do tipo Venda, então crie 
* uma classe Venda.java com estes três atributos.
*/
