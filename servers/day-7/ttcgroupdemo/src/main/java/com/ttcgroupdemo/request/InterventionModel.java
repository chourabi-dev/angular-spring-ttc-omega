package com.ttcgroupdemo.request;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ttcgroupdemo.entities.Category;
import com.ttcgroupdemo.entities.Vehicule;

public class InterventionModel {

	 
	private String description;  
	private long vehicule; 
	private long category;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getVehicule() {
		return vehicule;
	}
	public void setVehicule(long vehicule) {
		this.vehicule = vehicule;
	}
	public long getCategory() {
		return category;
	}
	public void setCategory(long category) {
		this.category = category;
	}
	public InterventionModel() {
		super();
	}
	
	
	
}
