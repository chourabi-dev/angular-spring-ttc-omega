package com.ttcgroupdemo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name="clients" )
public class Clients {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name="nom", nullable = false)
	private String nom;
	
	@Column(name="prenom", nullable = false)
	private String prenom;
	
	
	@Column(name="email", nullable = false)
	private String email;
	
	
	@Column(name="address", nullable = false)
	private String address;
	
	@Column(name="cin", nullable = false)
	private String cin;
	
	
	
	@OneToMany( mappedBy="client" )
	private List<Vehicule> vehicules;
	
	
	

	public List<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Clients() {
		super();
	}
	
	
}
