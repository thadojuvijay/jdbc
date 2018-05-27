package com.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Statement_Retrieve 
{
public static void main(String[] args) throws SQLException {
	
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","spring","abc");
	System.out.println(connection);
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from employee");
	while(resultSet.next())
	{
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getDouble(3));
		
	}
}
}
