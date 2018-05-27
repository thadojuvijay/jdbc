package com.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement_DropTable
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");	
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
	String sql="drop table employee";
	PreparedStatement prepareStatement = connection.prepareStatement(sql);
	prepareStatement.executeUpdate();
	prepareStatement.close();
	connection.close();
	System.out.println("drop table successful");
}
}
