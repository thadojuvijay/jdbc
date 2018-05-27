package com.Retrieve_Image;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read_Image 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
		PreparedStatement prepareStatement = connection.prepareStatement("select * from employee");
		ResultSet resultSet = prepareStatement.executeQuery();
		FileOutputStream fileOutputStream=new FileOutputStream("pic.jpg");
		while(resultSet.next())
		{
			resultSet.getString(1);
			resultSet.getString(2);
			fileOutputStream.write(resultSet.getBytes(3));
			
			
		}
		System.out.println("success");
				              
}
}