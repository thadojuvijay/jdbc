package com.RegisterDrivers;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class RegisterDriver_2 
{
public static void main(String[] args) throws SQLException {
	
	
	
	Driver driver=new OracleDriver();
	DriverManager.registerDriver(driver);
	
	
	
	
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
	Statement statement = connection.createStatement();
	boolean execute = statement.execute("insert into employee values(4,'uday',56738)");
	System.out.println(execute);
	connection.commit();
	connection.close();
}
}
