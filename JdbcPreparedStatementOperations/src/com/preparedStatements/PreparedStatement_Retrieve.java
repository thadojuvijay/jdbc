package com.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement_Retrieve
{
	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","spring","abc");
	 PreparedStatement prepareStatement = connection.prepareStatement("select * from employee");
		ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			
		}
}
}