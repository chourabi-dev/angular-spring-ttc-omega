package com.ttcgroupdemo.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name="interventions" )
public class Interventions {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name="description", nullable = false)
	private String description;
	
	
	@Column(name="date", nullable = false)
	private  LocalDateTime date  =  LocalDateTime.now();  // default value
	
	
	@ManyToOne
	@JoinColumn( name="vehicules_id" )
	@JsonIgnore
	private Vehicule vehicule;
	
	
	@ManyToOne
	@JoinColumn( name="categories_id" )
	private Category category;


	public Interventions() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public Vehicule getVehicule() {
		return vehicule;
	}


	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
