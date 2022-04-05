package com.ttcdemo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table( name="clients" )
public class Clients {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	
	
	@Column( name="name", nullable=false )
	private String name;
	
	@Column( name="email", nullable=false )
	private String email;
	
	@Column( name="phone", nullable=false )
	private String phone;
	
	@Column( name="address", nullable=false )
	private String address;
	
	@OneToMany( mappedBy="client" )
	private List<Sells> sells;
 
	

	public List<Sells> getSells() {
		return sells;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


 
	
	public Clients() {}
}
