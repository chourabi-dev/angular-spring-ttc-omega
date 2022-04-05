package com.ttcdemo.models;

public class ProductModel {

	private String name;
	private int quantity;
	private float price;
	private long depot;
	
	
	public long getDepot() {
		return depot;
	}
	public void setDepot(long depot) {
		this.depot = depot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public ProductModel() {}
	
}
