package com.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_DropTable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");	
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
	Statement statement = connection.createStatement();
	String sql="drop table employee";
	statement.executeUpdate(sql);
	statement.close();
	connection.close();
	System.out.println("drop table successful");
}
}