package com.vti.frontend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main_SELECT {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		
		
//                                           SELECT		
		
		
// Step 1 : regiser the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		
// Step 2 : get a Database Connection 		
		Connection connection = DriverManager.getConnection(url, username , password); 
		
		System.out.println("Connect success!");
		
// Step 3 : Create a statement object		
		String sql = "SELECT    id, username, email "+ "FROM  `User`";		
		Statement statement = connection.createStatement();
		
// Step 4 : execute query		
		ResultSet resultSet = statement.executeQuery(sql);
		
// Step 5 : handling result set  		
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("username"));
			System.out.println(resultSet.getString("email"));
		}
			
// Step 6 : Close connection		
		connection.close();
	}
}	
