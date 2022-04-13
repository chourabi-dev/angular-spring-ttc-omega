package com.ttcgroupdemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="produits" )
public class Produits {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@Column(name="titre", nullable = false)
	private String titre;
	
	
	@Column(name="prix", nullable = false)
	private float prix;
	
	
	@Column(name="quantity", nullable = false)
	private int  quantity;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Produits(long id, String titre, float prix, int quantity) {
		super();
		this.id = id;
		this.titre = titre;
		this.prix = prix;
		this.quantity = quantity;
	}


	public Produits() {
		super();
	}
	
	
	
	
	
	
	
}
