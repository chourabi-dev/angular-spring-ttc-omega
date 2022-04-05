package com.ttcdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttcdemo.repositories.ClientsRepository;
import com.ttcdemo.repositories.ProductRepository;
import com.ttcdemo.repositories.SellsRepository;

@Service
public class SellsServices {

	@Autowired
	private ClientsRepository clientsRepository;
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Autowired
	private SellsRepository sellsRepository;


	public ClientsRepository getClientsRepository() {
		return clientsRepository;
	}


	public ProductRepository getProductRepository() {
		return productRepository;
	}


	public SellsRepository getSellsRepository() {
		return sellsRepository;
	}
	
	
	
	
	
	
}
