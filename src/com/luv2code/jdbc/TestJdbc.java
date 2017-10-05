package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // This is my second commit
		
		// this is shown when i do commit
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/database";
		String user = "root";
		String pass = "mysql";
// This is my third commit
		// this is my fourth commit
		
		try {
			System.out.println("Connecting to database:" + jdbcUrl);
			Connection myconn = DriverManager
					.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection succesfull!!!");
			// This is my fourth commit
			// will be shown  when i perform
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
