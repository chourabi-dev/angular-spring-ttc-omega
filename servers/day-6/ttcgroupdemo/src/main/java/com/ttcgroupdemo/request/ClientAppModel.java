package com.ttcgroupdemo.request;

import javax.persistence.Column;

public class ClientAppModel {
 
	private String nom; 
	private String prenom; 
	private String email; 
	private String address; 
	private String cin;
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public ClientAppModel() {
		super();
	}
	
	
	
	
}
