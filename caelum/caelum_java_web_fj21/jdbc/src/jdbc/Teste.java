package jdbc;

import java.sql.*;

public class Teste {
	public static void main(String[] args) throws SQLException {
		
	
	Connection connection = new ConnectionFactory().getConnection();
	System.out.println("Conex�o aberta!");
	connection.close();
	
	}
}
