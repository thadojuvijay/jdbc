package com.DatabaseMetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase_Meta_Data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
	DatabaseMetaData databaseMetaData = connection.getMetaData();
	System.out.println(databaseMetaData.getDatabaseProductName());
	System.out.println(databaseMetaData.getDatabaseProductVersion());
	System.out.println(databaseMetaData.getURL());
	System.out.println(databaseMetaData.getUserName());
	System.out.println(databaseMetaData.getDriverName());
	System.out.println(databaseMetaData.getSchemas());
	System.out.println(databaseMetaData.getDatabaseMajorVersion());
	System.out.println(databaseMetaData.getDatabaseMinorVersion());
	}

}
