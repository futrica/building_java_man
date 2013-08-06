package br.com.futrica.novo.teste;

import br.com.futrica.novo.dao.ContatoDao;
import br.com.futrica.novo.modelo.Contato;

public class TesteRemove {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		Contato contato = new Contato();
		
		dao.adiciona(contato);
		
		
		dao.remove(contato);
		
	}
}
