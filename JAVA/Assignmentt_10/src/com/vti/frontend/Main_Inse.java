package com.vti.frontend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main_Inse {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		
		
//                             Insert  		
		
		
// Step 1 : regiser the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		
// Step 2 : get a Database Connection 		
		Connection connection = DriverManager.getConnection(url, username , password); 
		
		System.out.println("Connect success!");
		
// Step 3 : Create a statement object		
		String sql = "	INSERT INTO `Group` (`name` 		, 	author_ID)" +
					 "	VALUE				('Java Serior8'	,  		4	 )";	
		Statement statement = connection.createStatement();
		
// Step 4 : execute query		
		int effectedRecorAmount = statement.executeUpdate(sql);
		
// Step 5 : handling result set  		
		System.out.println("Effected Recor Amount : " + effectedRecorAmount);

// Step 6 : Close connection		
		connection.close();
	}
}
