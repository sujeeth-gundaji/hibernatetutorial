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

		try {
			System.out.println("Connecting to database:" + jdbcUrl);
			Connection myconn = DriverManager
					.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection succesfull!!!");
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
