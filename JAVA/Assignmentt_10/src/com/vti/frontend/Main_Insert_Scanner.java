package com.vti.frontend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main_Insert_Scanner {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";
		
		
//                             Insert ( ? )	
		
		
// Step 1 : regiser the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		
// Step 2 : get a Database Connection 		
		Connection connection = DriverManager.getConnection(url, username , password); 
		
		System.out.println("Connect success!");
		
// Step 3 : Create a statement object		
		String sql = "	INSERT INTO `Group` (`name` 		, 	author_ID)" +
					 "	VALUE				(  ?			,  		?	 )";	
		PreparedStatement peparedStatement = connection.prepareStatement(sql);
		
// Input Scanner :
		String groupName = "Java Test";
		int authorId = 5;
		
		peparedStatement.setString(1, groupName);
		peparedStatement.setInt(2, authorId);
		
		
// Step 4 : execute query		
		int effectedRecorAmount = peparedStatement.executeUpdate();
		
// Step 5 : handling result set  		
		System.out.println("Effected Recor Amount : " + effectedRecorAmount);

// Step 6 : Close connection		
		connection.close();
	}
}
