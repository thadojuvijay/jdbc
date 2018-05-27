package com.Connection.Sample;
import com.Connection.Sample.Connection;


public class Driver_Manager_Sample 
{
	 public static Connection getConnection(String url,
		        String user, String password) 
	 {
		 
		 class Sample implements Connection
		 {
			 
		 }
		 Sample sample=new Sample();
		 return sample;
	 }
}
