package br.com.futrica.ed.fila;
import java.util.*;

public class FilaGenerica {
	private List<Object> objetos = new LinkedList<Object>();
	
	public void insere(Object objeto) {
		this.objetos.add(objeto);
	}
	
	public Object remove() {
		return this.objetos.remove(0);
	}
	
	public boolean vazia() {
		return this.objetos.size() == 0;
	}

}
