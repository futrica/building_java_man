package br.com.futrica.ed.testes;

import br.com.futrica.ed.Aluno;
import br.com.futrica.ed.Vetor;

public class TesteTamanhoDaLista {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		lista.adiciona(a3);

		System.out.println(lista.tamanho());
	}
}
