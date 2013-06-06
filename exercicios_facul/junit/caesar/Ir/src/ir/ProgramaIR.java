package ir;
import ir.Ir;

import java.util.Scanner;


/**
 *
 * @author root
 */
public class ProgramaIR {
    public static void main(String[] args) {
       Ir imp = new Ir();
       Scanner kb = new Scanner(System.in);
       double e = kb.nextDouble();
       imp.faixaImposto(e);
       System.out.println(imp.faixaImposto(e));
       
    }
}
