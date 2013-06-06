package ir;

/**
 *
 * @author root
 */
public class Ir {
    
    public double faixaImposto(double salario){
        double imposto = 0;
        if (salario <= 1637.11){
            //System.out.println("Isento de IR");
           // return 0.0;
            imposto = 0.0;
        } else if (salario > 1637.11 && salario <= 2453.50){
            imposto = (salario * 12) * 0.075;
            //System.out.println("Valor a pagar " + imposto);
           // return imposto;
        } else if (salario > 2453.51 && salario <= 3271.38){
            imposto = (salario * 12) * 0.15;
            //System.out.println("Valor a pagar " + imposto);
          //  return imposto;
        } else if (salario > 3271.39 && salario <= 4087.65){
            imposto = (salario * 12) * 0.225;
            //System.out.println("Valor a pagar " + imposto);
           // return imposto;
        } else if (salario > 4087.65){
            imposto = (salario * 12) * 0.275;
           // System.out.println("Valor a pagar " + imposto);
            //return imposto;
        } 
        return imposto;
    }

}
