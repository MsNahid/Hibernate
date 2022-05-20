package com.nahidsohel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:postgresql://localhost:5432/hibernate_db";
		String user = "postgres";
		String password = "postgres";
		
		try{
			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Database connected successfully!!!!!!!");
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Database not connected.");
		
		}
	}
}
