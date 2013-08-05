package br.com.futrica.novo.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.futrica.novo.dao.ContatoDao;
import br.com.futrica.novo.modelo.Contato;

public class TestePesquisaRefinada {
	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		List<Contato> contatos = dao.pesquisaRefinada();
		
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " +
			formato.format(contato.getDataNascimento().getTime()) + "\n");
		}

	}
}
