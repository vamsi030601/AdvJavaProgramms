package com.sathya.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx1 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
	//step 1:Load the driver
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");
		
	

	//step 2:create the connection
		
		
		
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","vamsi","vamsi");
			System.out.println("connection created successfully");
			
	//step 3:process the query
			Statement statement=connection.createStatement();
			String q="create the table emp successfully";
			
			
	     
	//step 4:Release the connection
			connection.close();
			System.out.println("connection closed successfully");
			
		

	}

}
