package com.ttcgroupdemo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name="vehicules" )
public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name="mark", nullable = false)
	private String mark;
	
	@Column(name="model", nullable = false)
	private String model;
	
	@Column(name="color", nullable = false)
	private String color;
	
	@Column(name="matricule", nullable = false)
	private String matricule;
	
	
	
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@ManyToOne
	@JoinColumn( name="clients_id" )
	@JsonIgnore
	private Clients client;
	
	
	
	@OneToMany(mappedBy="vehicule")
	List<Interventions> interventions;
	
	

	public List<Interventions> getInterventions() {
		return interventions;
	}

	public void setInterventions(List<Interventions> interventions) {
		this.interventions = interventions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Vehicule() {
		super();
	}
	
	
	
	
}
