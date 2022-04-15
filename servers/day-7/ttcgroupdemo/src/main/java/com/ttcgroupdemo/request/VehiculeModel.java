package com.ttcgroupdemo.request;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ttcgroupdemo.entities.Clients;

public class VehiculeModel {
 
	private String mark; 
	private String model; 
	private String color; 
	
	
	private long client;
	
	
	
	private String matricule;
	 
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public long getClient() {
		return client;
	}
	public void setClient(long client) {
		this.client = client;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public VehiculeModel() {
		super();
	}
	
	
	
}
