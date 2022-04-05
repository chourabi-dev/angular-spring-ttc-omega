package com.ttcdemo.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name="sells" )
public class Sells {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	
	private int quantity;
	
	private LocalDateTime date = LocalDateTime.now();

	@ManyToOne
	@JoinColumn( name="clients_id" )
	@JsonIgnore
	private Clients client;
	

	@ManyToOne
	@JoinColumn( name="products_id" )
	private Product product;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public Clients getClient() {
		return client;
	}


	public void setClient(Clients client) {
		this.client = client;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Sells() {
		super();
	}
	
	
	
	
	

}
