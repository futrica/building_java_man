package br.com.futrica.ed.fila;

import java.util.*;

import br.com.futrica.ed.Aluno;

public class Fila {
	private List<Aluno> alunos = new LinkedList<Aluno>();
	
	public void insere(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Aluno remove() {
		return this.alunos.remove(0);
	}
	
	public boolean vazia() {
		return this.alunos.size() == 0;
	}
	
}
