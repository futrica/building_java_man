package jdbc;

import java.sql.*;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			
		return DriverManager.getConnection("jdbc:mysql://localhost/web_caelum", "root", "");
		} catch (SQLException e) {
		throw new RuntimeException(e);
		}
		}

}
