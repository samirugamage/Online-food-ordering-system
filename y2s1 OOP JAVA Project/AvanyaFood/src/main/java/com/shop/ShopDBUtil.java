package com.shop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class ShopDBUtil {
	
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	public static boolean validate(String username, String password) {
		
		try {
			con = ShopDBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from shop where shopUserName='"+username+"' and shopPassword='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Shop> getShop(String userName) {
		
		ArrayList<Shop> shop = new ArrayList<>();
		
		try {
			
			con = ShopDBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from shop where shopUserName='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String contact = rs.getString(4);
				String userName1 = rs.getString(5);
				String password = rs.getString(6);
				
				Shop sh = new Shop(id,name,address,contact,userName1,password);
				shop.add(sh);
			}
			
		} catch (Exception e) {
			
		}
		
		return shop;	
	}
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
