package br.com.futrica.ed.pilha;

import java.util.*;

public class PilhaParametrizada<T> {
	
	private List<T> objetos = new LinkedList<T>();
	
	public void insere(T t) {
		this.objetos.add(t);
	}
	
	public T remove() {
		return this.objetos.remove(this.objetos.size() - 1);
	}
	
	public boolean vazia() {
		return this.objetos.size() == 0;
	}

}
