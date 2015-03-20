package com.gcit.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Library {
	
	private int id = 0;
	public void LibManagement(Statement stmt) throws SQLException
	{
		
	
			ResultSet rs = stmt.executeQuery("select * from tbl_library_branch");
			
			int i = 1;
			while (rs.next()) {
				//System.out.println("Branch Id:" + rs.getInt("branchId"));
				System.out.print(i+ ") " + rs.getString("branchName"));
				System.out.print(" , " + rs.getString("branchAddress"));
				System.out.println(" ");
				System.out.println("");
			    i++;	
			    
			    
			    
			}
			/*Scanner scan = new Scanner(System.in);
			System.out.println("Enter branch you manage");
			String branch = scan.next();
			System.out.print(" " +branch);
			ResultSet rt = stmt.executeQuery("select branchName from tbl_library_branch");
			while(rt.next())
			{
				//System.out.println("Branch Id:" + rt.getInt("branchId"));
				//System.out.println("Branch Name:" + rt.getInt("branchName"));
				System.out.print("," + rt.getString("branchAddress"));
				
			}*/
			
			
			}
	
      
				
			
	}


