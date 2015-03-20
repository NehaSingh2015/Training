package com.gcit.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/library", "root", "");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tbl_author");

			
			while (rs.next()) {
				System.out.println("##############");
				System.out.println("Author Id:" + rs.getInt("authorID"));
				System.out.println("Author Name:" + rs.getString("authorName"));
				System.out.println("##############");
				
				
			}
			Scanner scan = new Scanner(System.in);
			/*System.out.println("Enter a new Author Name");
			String author = scan.next();
			stmt.executeUpdate("insert into tbl_author (authorName) values ('"+author+"')");
			
			System.out.println("enter a new Publisher Name");
			String publisher = scan.next();
			System.out.println("Enter a publisher address");
			String pub_address = scan.next();
			System.out.println("Enter a publisher Phone");
			String pub_phone = scan.next();
			stmt.executeUpdate("insert into tbl_publisher (publisherName, publisherAddress, publisherphone) values ('"+publisher+"', '"+pub_address+"', '"+pub_phone+"')");
			
			System.out.println("enter a new borrower Name");
			String borrower = scan.next();
			System.out.println("Enter a borrower address");
			String bor_address = scan.next();
			System.out.println("Enter a card number");
			String cardNo = scan.next();
			System.out.println("Enter a borrower phone");
			String bor_phone = scan.next();
			stmt.executeUpdate("insert into tbl_borrower (cardNo, name, address, phone) values ('"+cardNo+"', '"+borrower+"', '"+bor_address+"', '"+bor_phone+"')");
			*/
			//System.out.println("Enter the Author name for which you want to delete");
		    stmt.executeUpdate("delete from tbl_borrower where name = 'testing'");
		    
		   // stmt.executeUpdate("alter table tbl_author add DateOfBirth year");
		    //stmt.executeUpdate("alter table tbl_author drop column DateOfBirth");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
