package com.ttcdemo.models;

public class ProductListModel {
	private long id;
	private String name;
	private int quantity;
	private float price;
	private DepotModel depot;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public DepotModel getDepot() {
		return depot;
	}
	public void setDepot(DepotModel depot) {
		this.depot = depot;
	}
	
	public ProductListModel() {}
	

}
