package com.ttcdemo.models;

public class EmployeeModel {
	
 
	
	private String name;
	private String email;
	private String phone;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public EmployeeModel() {}
	
	
	
	
	

}
