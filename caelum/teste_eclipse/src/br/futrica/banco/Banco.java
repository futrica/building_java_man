package br.futrica.banco;

import br.futrica.banco.conta.Conta;
import br.futrica.banco.conta.ContaCorrente;
import br.futrica.banco.conta.ContaPoupanca;


public class Banco {

    public static void main(String[] args) {
        //Conta conta = new Conta();
        //Conta cc = new ContaCorrente();
        //Conta cp = new ContaPoupanca();
        
        //ArrayContas ar;
        //ar = new ArrayContas();
        
        //ar.contas[0] = conta;
        //ar.contas[0] = cc;
       // ar.contas[1] = cp;
        
        //ar.contas[0].deposita(1000);
        //ar.contas[0].deposita(1000);
       // ar.contas[1].deposita(1000);
        
        //AtualizadorContas at = new AtualizadorContas();
        
       //at.AtualizarContas(0.2);
        
        
        
      // for (int i = 0; i < ar.contas.length; i++ ){
      //      at.roda(ar.contas[i]);
      //      System.out.println(ar.contas[i].getSaldo());
            
      // }
        
       
      // System.out.println(at.getSaldoTotal());
    	
    	
    	ContaCorrente cc = new ContaCorrente();
    	cc.deposita(-1100);
    	
    	Conta cp = new ContaPoupanca();
    	
    	try {
        	cp.deposita(-100);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Voc� depositou um valor inv�lido!");
		}

    	//System.out.println(cc.calculaTributos());
    	
    	//Tributavel t = cc;
    	//System.out.println(t.calculaTributos());
    	System.out.println(cc.getSaldo());
    	System.out.println(cp.getSaldo());
    	
    }
}
