package com.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement_delete 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	 //Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
     String sql="delete from employee where eno=1";
	 Statement statement = connection.prepareStatement(sql);
	  statement.execute(sql);
	  statement.close();
	  connection.close();
	  System.out.println("record Deleted");
}
}