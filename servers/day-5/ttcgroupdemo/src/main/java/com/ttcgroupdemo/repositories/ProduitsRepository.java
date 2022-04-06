package com.ttcgroupdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttcgroupdemo.entities.Produits;

public interface ProduitsRepository extends JpaRepository<Produits,Long> {

	public List<Produits> findByQuantity(int quantity);
	public List<Produits> findByQuantityAndTitre(int quantity, String titre);
	public List<Produits> findByPrixLessThan(float prix);  // ==
	
	public List<Produits> findByTitreContaining( String titre );
	
	
}
