package bolinhas;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Venda {
    private String tipo;
    private int qtd;
    private double valorUn;
    
    Venda(String tipo, int qtd, double valorUn){ //construtor
        this.tipo = tipo;
        this.qtd = qtd;
        this.valorUn = valorUn;        
    }
    
    public void displayVenda(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Quantidade: " + this.qtd);
        System.out.println("Valor Unitario: " + this.valorUn);
    }
    
    public int getQtd(){
        return this.qtd;
    }
    
    public double getValorUn(){
        return this.valorUn;
    }

}
