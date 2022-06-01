package com.itemmanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDB {
	
	
		
		public static boolean delete(String ShopID) { 
		      
			boolean isSuccess = false;
			
			
			//create db connection
			
			String url = "jdbc:mysql://localhost:3306/oop";
			String user = "root";
			String pass = "root";
			
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con =DriverManager.getConnection(url,user,pass);
				Statement stat = con.createStatement();
				String strSql = " delete from shop where shopID ='"+ShopID+"'";
				int rs =stat.executeUpdate(strSql);
				
				if(rs > 0) {
					
					isSuccess = true;
					
				}else {
					isSuccess = false;
				}
					
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return isSuccess;
		}


}
