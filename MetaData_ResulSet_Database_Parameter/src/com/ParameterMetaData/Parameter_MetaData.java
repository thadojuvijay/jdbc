package com.ParameterMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Parameter_MetaData 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spring", "abc");
		PreparedStatement prepareStatement = 
				connection.prepareStatement("insert into employee values(?,?,?)");
		prepareStatement.setInt(1, 1);
		prepareStatement.setString(2, "vijay");
		prepareStatement.setDouble(3, 6547);
		prepareStatement.executeUpdate();
		ParameterMetaData parameterMetaData = prepareStatement.getParameterMetaData();
		int count = parameterMetaData.getParameterCount();
		System.out.println(count);
		for(int i=0;i<=count;i++)
		{
			/*System.out.println(parameterMetaData.getParameterTypeName(i));
			System.out.println(parameterMetaData.getParameterClassName(i));
			System.out.println(parameterMetaData.getParameterType(i));
			System.out.println(parameterMetaData.getParameterMode(i));
			System.out.println(parameterMetaData.getScale(i));
			System.out.println(parameterMetaData.getPrecision(i));
			System.out.println(parameterMetaData.isNullable(i));
			System.out.println(parameterMetaData.parameterModeIn);
			System.out.println(parameterMetaData.parameterModeInOut);
			System.out.println(parameterMetaData.parameterModeOut);
			System.out.println(parameterMetaData.parameterModeUnknown);
			System.out.println(parameterMetaData.parameterNoNulls);
			System.out.println(parameterMetaData.parameterNullable);
			System.out.println(parameterMetaData.parameterNullableUnknown);*/
			
			
			
			
			
		}
		
		
		
		
		

}
}
