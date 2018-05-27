package com.batch_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_Satement_insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
		
	Statement statement = connection.createStatement();
	statement.addBatch("insert into employee values(1,'vijay',1232)");
	statement.addBatch("insert into employee values(2,'ajay',637372)");
	statement.addBatch("insert into employee values(3,'uday',67338)");
		
int[] executeBatch = statement.executeBatch();
for (int i : executeBatch) {
	System.out.println(i);
}




	}

}
