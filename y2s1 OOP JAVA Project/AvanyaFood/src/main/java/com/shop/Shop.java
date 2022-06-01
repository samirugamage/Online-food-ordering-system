package com.shop;

public class Shop {
    private int id;
    private String name;
    private String address;
    private String usernName;
    private String password;
    private String Contact;
    
    
    
    public Shop(int id,String name,String address,String contact,String userName,String password) {
	this.id = id;
	this.name = name;
	this.usernName = userName;
	this.password = password;
	this.address = address;
	this.Contact = contact;
	
	
    }



	public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}




	public String getAddress() {
		return address;
	}



	public String getUserName() {
		return usernName;
	}



	public String getPassword() {
		return password;
	}



	public String getContact() {
		return Contact;
	}

    

	

      
}
