package com.batch_execution;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Batch_CallableStatement_insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
		
 CallableStatement callableStatement = connection.prepareCall("{call myprocedure(?,?)}");
         callableStatement.setInt(1,200);
         callableStatement.setDouble(2, 3000);
         callableStatement.addBatch();
         callableStatement.setInt(1,130);
         callableStatement.setDouble(2, 2000);
         callableStatement.addBatch();
         int[] updateCounts = callableStatement.executeBatch();
         for (int i : updateCounts) {
			System.out.println(i);
		}
}
}