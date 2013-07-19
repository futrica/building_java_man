package br.futrica.banco;

import java.util.*;

import br.futrica.banco.conta.*;

public class BancoCollections {

	private List<Conta> contas = new ArrayList<>();
	
	public void adiciona(Conta c){
		this.contas.add(c);
	}
	
	public int totalDeContas(){
		return contas.size();
	}
	
	public boolean buscaPorNome(String n){
		for (Conta c : contas) {
			if (c.getNome().equals(n) ){
				return true;
			}	
		}
		return false;
	}

	
	
}
