package com.vti.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_1 {
// Q1:	
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
			String username = "root";
			String password = "root";
			
			
//	                             Update
			
			
	// Step 1 : regiser the driver class with DriverManager
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	// Step 2 : get a Database Connection 		
			Connection connection = DriverManager.getConnection(url, username , password); 
			
			System.out.println("Connect success!");
			
	// Step 3 : Create a statement object		
			String sql =	"UPDATE `Group` " +
							"SET	`name` = ? " +
							"WHERE 	`id`   = ?";
			PreparedStatement peparedStatement = connection.prepareStatement(sql);
			
	// Input Scanner :
			short groupId = 3;
			String groupName = "C# Fresher";
			
	// Set parameter
			peparedStatement.setString(1, groupName);
			peparedStatement.setInt(2, groupId);
			
			
	// Step 4 : execute query		
			int effectedRecorAmount = peparedStatement.executeUpdate();
			
	// Step 5 : handling result set  		
			System.out.println("Effected Recor Amount : " + effectedRecorAmount);

	// Step 6 : Close connection		
			connection.close();
		}
}
