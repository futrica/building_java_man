package br.com.futrica.novo.teste;

import java.sql.*;

import br.com.futrica.novo.ConnectionFactory;

public class TesteAbreConexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}
}
