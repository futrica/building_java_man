/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovr;

/**
 *
 * @author root
 */
public class CalculoVr {
    
    public int valorPago(int dias){
        int valor = dias * 23;
        return valor;
    }
    
    public double descontoSalario(int valor){
        double desconto = valor * 0.1;        
        return desconto;
    }
    
    public double calculoSalario(double salario, int desconto){        
        double novoSalario = (salario - desconto);
        return novoSalario;
    }
    
}
