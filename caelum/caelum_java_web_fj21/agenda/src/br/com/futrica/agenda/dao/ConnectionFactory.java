package br.com.futrica.agenda.dao
;

import java.sql.*;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/web_caelum", "root", "12345");
		} catch (SQLException e) {
			
		throw new RuntimeException(e);
		}
	}

}
