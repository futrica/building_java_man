package br.com.futrica.novo.teste;

import java.sql.SQLException;

import br.com.futrica.novo.dao.ContatoDao;

public class TestePesquisar {
	public static void main(String[] args)  {
		
		ContatoDao dao = new ContatoDao();
		
		System.out.println(dao.pesquisar(99).toString());
		
		
		
		
	}
}
