package br.futrica.banco;

import java.io.PrintStream;
import java.util.*;

import br.futrica.banco.conta.Conta;
import br.futrica.banco.conta.ContaCorrente;
import br.futrica.banco.conta.ContaPoupanca;


public class Banco {

    public static void main(String[] args) {
    	
    /*Treinando a classe String    	
    	//imut�vel
    	String s = "teste11";
    	s.replaceAll("1", "2");
    	System.out.println(s);
    	s = s.replaceAll("1", "2");
    	System.out.println(s);
    	//comparando com outra string
    	String st = "teste11 teste22";
    	//remover espa�os em branco
    	st = st.trim();
    	System.out.println(st);
    	//verificar se n�o est� vazia
    	st.isEmpty();
    	//verificar tamanho
    	st.length();
    	if (s.regionMatches(0, st, 0, 1)){
    		System.out.println("verdade");
    	}
   	fim treino strings */
    	
    	
    /* treino classe Integer
    	Integer x = new Integer(10);
    	Integer y = new Integer(10);
    	
    	if (x == y ){
    		System.out.println("igual");
    	} else {
    		System.out.println("dif");
    	}
    	
    	if (x.equals(y)){
    		System.out.println("igual");
    	} else {
    		System.out.println("dif");
    	}
    	System.out.println(x); 	
    	//x.toString();
    	System.out.println(x.toString());
    	String num = "11";
    	int i = Integer.parseInt(num);
    	System.out.println(i);
    	String num2 = "asd11";
    	//int i2 = Integer.parseInt(num2);
    	//System.out.println(i2);
    	
    	PrintStream saida = System.out;
    	saida.println("ola");    	
    fim treino class Integer*/
    	
    	
    	
    	
        //Conta conta = new Conta();
        //Conta cc = new ContaCorrente();
        //System.out.println(cc);
       // cc.setNumero(1);
        
       // Conta cc1 = new ContaCorrente();
        //cc.setNumero(1);
        
        //if(cc.equals(cc1)){
        //	System.out.println("iguais");
        //}
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
    	
    	
    	//ContaCorrente cc = new ContaCorrente();
    	//cc.deposita(-1100);
    	
    	//Conta cp = new ContaPoupanca();
    	
    	//try {
        //	cp.deposita(-100);			
		//} catch (Exception e) {
		//	System.out.println(e.getMessage());
		//	System.out.println("Voc� depositou um valor inv�lido!");
		//}

    	//System.out.println(cc.calculaTributos());
    	
    	//Tributavel t = cc;
    	//System.out.println(t.calculaTributos());
    	//System.out.println(cc.getSaldo());
    	//System.out.println(cp.getSaldo());
        
        
        
        
/* testando collections 
        List<ContaPoupanca> contas = new LinkedList<>();
        
        ContaPoupanca c1 = new ContaPoupanca();
        c1.setNumero(1973);
        c1.setNome("alan");
        contas.add(c1);
        
        ContaPoupanca c2 = new ContaPoupanca();
        c2.setNumero(1462);
        c2.setNome("balan");
        contas.add(c2);
        
        ContaPoupanca c3 = new ContaPoupanca();
        c3.setNumero(1854);
        c3.setNome("calan");
        contas.add(c3);
        
        for (int i = 0; i < contas.size(); i++) {
        	Conta atual = contas.get(i);
        	System.out.println("numero: " + atual.getNome());
        }

    
        Collections.sort(contas);

        for (int i = 0; i < contas.size(); i++) {
        	Conta atual = contas.get(i);
        	System.out.println("numero: " + atual.getNome());
        }
        
        //Collections.reverse(contas);

        //for (int i = 0; i < contas.size(); i++) {
        //	Conta atual = contas.get(i);
        //	System.out.println("numero: " + atual.getNumero());
        //}
        
        
        //for (int i = 0; i < 10; i ++){
        //	ContaPoupanca atual = new ContaPoupanca();
        //	Random rd = new Random();
        //	atual.setNumero(rd.nextInt(9999));
        //	contas.add(atual);
        //}
        
        //for (int i = 0; i < contas.size(); i++) {
        //	Conta atual = contas.get(i);
       // 	System.out.println("numero: " + atual.getNumero());
        //}
    }

*/
    	
    	//teste list
        BancoCollections contas = new BancoCollections();
    	
    	ContaPoupanca c1 = new ContaPoupanca();
        c1.setNumero(1973);
        c1.setNome("alan");
        contas.adiciona(c1);
        
        ContaPoupanca c2 = new ContaPoupanca();
        c2.setNumero(1462);
        c2.setNome("balan");
        contas.adiciona(c2);
        
        ContaCorrente c3 = new ContaCorrente();
        c2.setNumero(1464);
        c2.setNome("calan");
        contas.adiciona(c3);
        
        System.out.println(contas.totalDeContas());
        
        System.out.println(contas.buscaPorNome("alan"));
        //teste list
        
        
        
    }	
}