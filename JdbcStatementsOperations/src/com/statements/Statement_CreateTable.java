package com.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_CreateTable 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
Class.forName("oracle.jdbc.driver.OracleDriver");	
Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
Statement statement = connection.createStatement();
String sql="create table employee(eno number(20),name varchar2(20),salary number(20))";
statement.executeUpdate(sql);
statement.close();
connection.close();
System.out.println("create  table succesfull");
	
}
}
