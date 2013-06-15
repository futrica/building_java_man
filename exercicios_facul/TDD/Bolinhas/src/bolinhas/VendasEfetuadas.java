package bolinhas;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class VendasEfetuadas {
    
    Venda[] vendas = new Venda[10];
    int nElements;
       
    public void insert(String tipo, int qtd, double valorUn){   
        vendas[nElements] = new Venda(tipo, qtd, valorUn);
        nElements++;
    }
    
    public void displayVendas(){
        for(int j = 0; j <nElements; j++){
            vendas[j].displayVenda();
        }
    }
    
    public void lerVendas(){   
              
        int qtd;
        double valorUn;
        String path = "/backup/projects/building_java_man/exercicios_facul/TDD/Bolinhas/VendaBolinhas.txt", tipo;
        int max = 10;        
        try {
            Scanner s = new Scanner(new File(path));
            while(s.hasNextLine()) {
                String linha = s.nextLine();
                String[] informacoes = linha.split(";");
                tipo = informacoes[0];
                qtd = Integer.parseInt(informacoes[1]);
                valorUn = Double.parseDouble(informacoes[2]);
                insert(tipo, qtd, valorUn);
            }
        } catch(Exception e) {
        System.out.println("Erro para ler o arquivo!");
        e.printStackTrace();
        }
    }
    
    public double total(){
        double temp = 0;
        for(int j = 0; j <nElements; j++){
            temp =  (vendas[j].getQtd() * vendas[j].getValorUn() ) + temp;     
            
        }
        return temp;
    }
}
