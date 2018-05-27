package com.ResultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet_Meta_Data 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("select * from employee");
ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
System.out.println("[columns count]   "+resultSetMetaData.getColumnCount());
int count = resultSetMetaData.getColumnCount();

for(int i=1;i<=count;i++)
{
	System.out.println("[coulmn name] "+resultSetMetaData.getColumnName(i));
	System.out.println(resultSetMetaData.getColumnLabel(i));
	System.out.println("[type name] "+resultSetMetaData.getColumnTypeName(i));
	System.out.println("[range] "+resultSetMetaData.getPrecision(i));
	System.out.println(resultSetMetaData.getScale(i));
}

	}
}