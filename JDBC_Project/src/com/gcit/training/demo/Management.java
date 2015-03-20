package com.gcit.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/library", "root", "");
			Statement stmt = conn.createStatement();
		boolean x =true;
		while(x = true)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the GCIT Library Management System. Which category of a user are you ");
		System.out.println("1) Librarian");
		System.out.println("2) Administrator");
		System.out.println("3) Borrower");
		int option = scan.nextInt();
		
		 if(option == 1)
		 {
			 Library lb = new Library();
			 System.out.println("1) Enter Branch you manage ");
			 System.out.println("2) Quite to previous");
			 int lib1option = scan.nextInt();

			 if (lib1option == 1)
			 {
				 lb.LibManagement(stmt);
			 }
			 else
			 {
				 continue;
			 }
	
		 }
		 else if(option == 2)
		 {
			 
		 }
		 else if(option == 3)
		 {
			 
		 }
		 else 
		 {
			 System.out.println("Sorry");
		 }
		
		}
		}
		 catch(SQLException e) {
	   			// TODO Auto-generated catch block
	   			e.printStackTrace();
				}
	}
}
