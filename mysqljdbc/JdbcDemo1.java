
//package com.JDBC;

import java.sql.*;
import java.sql.DriverManager.*;
public class JdbcDemo1 {
	
	public static void main(String args[])
	{
		String driver ="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/LearnJobs";
		String username="root";
		String password="knr443";
		
		
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stm = con.createStatement();
			stm.executeUpdate("create table Module5");
			System.out.println("Connection Successful");
			con.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
