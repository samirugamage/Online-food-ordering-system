package com.itemmanage;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.Statement;

public class ItemDBUtill {
	
	//create db connection
	private static String url = "jdbc:mysql://localhost:3306/oop";
	private static String user = "root";
	private static String pass = "root";
	

	
	//-----------------------------------------------------------Update food Item---------------------------------------------------------------------
	public static boolean updateitem(int itemID,float price, String name,  int shopID) { 
	      
		boolean isSuccess = false;
		
		
	
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con =DriverManager.getConnection(url,user,pass);
			Statement stat = con.createStatement();
			String strSql = "update fooditem set price ='"+price+"', name ='"+name+"', shopID ='"+shopID+"'"
					+ "where ItemID='"+itemID+"'";
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
	
	
	
//-----------------------------------------------------------Add Item----------------------------------------------------------------------
	
    public static boolean additem(float price,String name) { 
    	
    	
    	boolean isSuccess = false;
    	
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
			
			Connection con =DriverManager.getConnection(url,user,pass);
			Statement stat = con.createStatement();
			String strSql = "insert into fooditem values (0,'"+price+"','"+name+"',1)";
			
			int rs =stat.executeUpdate(strSql);
			
			
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }

	

}
