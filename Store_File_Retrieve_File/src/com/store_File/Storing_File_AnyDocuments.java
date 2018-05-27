package com.store_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Storing_File_AnyDocuments 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
		PreparedStatement prepareStatement = connection.prepareStatement("insert into employee values(?,?,?)");
				              
		prepareStatement.setInt(1, 1);
		prepareStatement.setString(2, "vijay");
		
		FileInputStream fileInputStream=new FileInputStream("src/com/store_File/Resume.docx");
		prepareStatement.setBlob(3, fileInputStream);
		prepareStatement.executeUpdate();
				              
				connection.close();
				System.out.println("success");
	}
}
