package utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import src.constants.JDBCProperties;




public class JDBCUtil {
	private static Connection connection;

	private static JDBCUtil intances;

	private JDBCUtil() {
		try {
			connectDatabase();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// sigerton
	public static JDBCUtil getIntance() {
		if (intances == null) {
			intances = new JDBCUtil();
		}
		return intances;
	}

	public static void removeIntance() {
		intances = null;
		connection = null;
	}

	public void connectDatabase() throws SQLException {
		if (connection == null) {
			connection = DriverManager.getConnection(JDBCProperties.url, JDBCProperties.user,
					JDBCProperties.password);
		}
	}

	public ResultSet executeQuery(String sqlQuery) throws SQLException  {
		ResultSet resultSet = null;
		Statement statement = connection.createStatement();
		resultSet = statement.executeQuery(sqlQuery);
		return resultSet;
	}
	
	
	
	
}
