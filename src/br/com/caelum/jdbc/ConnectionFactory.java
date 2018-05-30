package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnetcion() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
			

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
