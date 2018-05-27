package com.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement_Update
{
public static void main(String[] args) throws SQLException {
	
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
	PreparedStatement prepareStatement = connection.prepareStatement("update employee set salary=? where eno=?");
	prepareStatement.setDouble(1, 688338);
	prepareStatement.setInt(2, 5);
	
	
	
	//execute method will return boolean value.if record is inserted,it will return false or else false. 
	boolean execute = prepareStatement.execute();
	System.out.println(execute);
	//execute will return int values,how many records records that much count it will return
	int i = prepareStatement.executeUpdate();
	System.out.println(i);
	
	
	
	System.out.println("Records Updated");
	
}
}
