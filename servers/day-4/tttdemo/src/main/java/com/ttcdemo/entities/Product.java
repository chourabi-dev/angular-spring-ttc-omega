package com.ttcdemo.entities;

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
@Table( name="products" )
public class Product {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	
	
	@Column( name="product_name", nullable=false )
	private String name;

	@Column( name="product_quantity", nullable=false )
	private int quantity;
	
	@Column( name="product_price", nullable=false )
	private float price;
	
	@ManyToOne
	@JoinColumn( name="depots_id" )
	@JsonIgnore
	private Depots depot;
	
	

	public Depots getDepot() {
		return depot;
	}

	public void setDepot(Depots depot) {
		this.depot = depot;
	}

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

	public Product() {}
	
	
	
	
}
