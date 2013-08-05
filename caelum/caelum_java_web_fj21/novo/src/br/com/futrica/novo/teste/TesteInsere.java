package br.com.futrica.novo.teste;

import java.util.Calendar;

import br.com.futrica.novo.dao.ContatoDao;
import br.com.futrica.novo.modelo.Contato;

public class TesteInsere {
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("luca");
		contato.setEmail("luca@gmail.com");
		contato.setEndereco("rua luca 16");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("gravado");
	}
}
