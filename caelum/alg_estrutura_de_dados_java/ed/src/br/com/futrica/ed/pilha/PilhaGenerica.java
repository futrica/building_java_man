package br.com.futrica.ed.pilha;

import java.util.*;

public class PilhaGenerica {
	
	private List<Object> objetos = new LinkedList<Object>();
	
	public void insere(Object objeto) {
		this.objetos.add(objeto);
	}
	
	public Object remove() {
		return this.objetos.remove(this.objetos.size() - 1);
	}
	
	public boolean vazia() {
		return this.objetos.size() == 0;
	}

}
