package com.RegisterDrivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDriver_1 
{
public static void main(String[] args) throws SQLException 
{
	
	
	//DriverManger.registerDriver method checking is OracleDriver 
		//available or not at compilation time only
	
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
DriverManager.registerDriver(new com.mysql.jdbc.Driver());




Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
Statement statement = connection.createStatement();
boolean execute = statement.execute("insert into employee values(3,'deepthi',256337)");
System.out.println(execute);
connection.commit();
connection.close();

}
}
