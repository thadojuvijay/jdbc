package com.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_Insert
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	 //Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
	 Statement statement = connection.createStatement();
	String sql="insert into employee values(1,'vijay',173637)";
	
	
	
	int i = statement.executeUpdate(sql);
	System.out.println(i);
	
	
	boolean execute = statement.execute(sql);
	System.out.println(execute);
	
	  System.out.println("record inserted");
	  
}
}