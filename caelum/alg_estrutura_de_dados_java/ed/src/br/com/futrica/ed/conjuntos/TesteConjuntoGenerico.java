package br.com.futrica.ed.conjuntos;

public class TesteConjuntoGenerico {
	public static void main(String[] args) {
		ConjuntoEspalhamentoParametrizado<String> conjunto =	new ConjuntoEspalhamentoParametrizado<>();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		System.out.println(conjunto.pegaTodos());
	}
}
