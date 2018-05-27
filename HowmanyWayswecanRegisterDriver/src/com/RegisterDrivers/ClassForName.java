package com.RegisterDrivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassForName 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
	
	//ClassforName will load OracleDriver at Run Time.
	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	
	
	
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
	Statement statement = connection.createStatement();
	boolean execute = statement.execute("insert into employee values(2,'uday',56738)");
	System.out.println(execute);
	connection.commit();
	connection.close();
}
}
