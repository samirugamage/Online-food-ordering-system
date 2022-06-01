package com.itemmanage;

public class item {
	private int ItemID;
	private float Price;
	private String Name;
	private int ShopID;
	
	
	public item(int itemID,float price, String name,  int shopID) {
		
		this.ItemID = itemID;
		this.Price = price;
		this.Name = name;
		this.ShopID = shopID;
		
	}


	public int getItemID() {
		return ItemID;
	}

	public float getPrice() {
		return Price;
	}


	public String getName() {
		return Name;
	}

	public int getShopID() {
		return ShopID;
	}


	

	
	
	
	
	
	
}