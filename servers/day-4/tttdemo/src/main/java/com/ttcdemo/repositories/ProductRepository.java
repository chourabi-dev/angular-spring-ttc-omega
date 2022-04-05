package com.ttcdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ttcdemo.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

	
	// WHERE quntity = ?
	//List<Product> findByQuantityAndPriceAndName(int quantity, float price, String name);

	
	List<Product> findByQuantity(int quantity);

	

}
