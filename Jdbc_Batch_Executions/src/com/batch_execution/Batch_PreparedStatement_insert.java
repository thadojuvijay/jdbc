package com.batch_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_PreparedStatement_insert 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
	PreparedStatement prepareStatement = connection.prepareStatement("insert into employee values(?,?,?)");
	prepareStatement.setInt(1, 1);
	prepareStatement.setString(2, "vijay");
	prepareStatement.setDouble(3, 252627);
	prepareStatement.addBatch();
	
	prepareStatement.setInt(1,2 );
	prepareStatement.setString(2, "ajay");
	prepareStatement.setDouble(3, 78968);
	prepareStatement.addBatch();
	
	prepareStatement.setInt(1,3 );
	prepareStatement.setString(2, "uday");
	prepareStatement.setDouble(3, 96778);
	prepareStatement.addBatch();
	
	prepareStatement.executeBatch();
	
	System.out.println("success");
}
}
