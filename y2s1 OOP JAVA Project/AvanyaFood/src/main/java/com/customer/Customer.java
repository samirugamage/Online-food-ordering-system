package com.customer;

public class Customer {
    private int id;
    private String name;
    private String password;
    private String address;
    private String Contact;
    private String email;
    
    
    public Customer(int id,String name,String password,String address,String contact,String email) {
	this.id = id;
	this.name = name;
	this.password = password;
	this.address = address;
	this.Contact = contact;
	this.email = email;
	
    }


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return Contact;
	}

	public String getEmail() {
		return email;
	}


      
}
