package com.ttcgroupdemo.controllers;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttcgroupdemo.entities.Produits;
import com.ttcgroupdemo.repositories.ProduitsRepository;
import com.ttcgroupdemo.request.ProduitModel;
import com.ttcgroupdemo.response.JsonResponse;

@RestController
@RequestMapping("/produit")
public class ProductController {

	
	@Autowired
	private ProduitsRepository produitsRepository;
	
	
	
	// list des produits dans la DB
	@GetMapping("/list")
	ResponseEntity<?> getProductsList(){ 
		 return ResponseEntity.ok(this.produitsRepository.findAll());
	}
	
	
	@PostMapping("/add")
	ResponseEntity<?> addProduit( @RequestBody ProduitModel model ){ 
		
		// CREATE THE ENTITY
		Produits p = new Produits();
		
		p.setTitre(model.getTitle());
		p.setQuantity(model.getQuantity());
		p.setPrix(model.getPrix());
		
		
		// SAVE THE ENEITY 
		
		return ResponseEntity.ok(this.produitsRepository.save(p));
	}
	
	
	@PutMapping("/update/{id}")
	ResponseEntity<?> updateProduit( @RequestBody ProduitModel model, @PathVariable long id ){  
		
		try {
				// SELECT * FROM PRODUIT WHERE ID = ...
		Produits p = this.produitsRepository.findById(id).get();
		
		
		p.setTitre(model.getTitle());
		p.setQuantity(model.getQuantity());
		p.setPrix(model.getPrix());
		
		
		// UPDATE THE ENEITY  => WHENE THE ENTITY POSSED AN ID SAVE => UPDATE
		return ResponseEntity.ok(this.produitsRepository.save(p));
		
		}catch(NoSuchElementException e) {
			JsonResponse res = new JsonResponse();
			
			res.setSuccess(false);
			res.setMessage("produit not found");
			return ResponseEntity.status(404).body(res);
		}
	}
	
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<?> deleteProduit(  @PathVariable long id ){  
		
		try {
				// SELECT * FROM PRODUIT WHERE ID = ...
		Produits p = this.produitsRepository.findById(id).get();
		
		// delete
		this.produitsRepository.delete(p);
		
		
		JsonResponse res = new JsonResponse();
		
		res.setSuccess(true);
		res.setMessage("produit supprimé avec succés");
		
		return ResponseEntity.ok(res);
		
		}catch(NoSuchElementException e) {
			JsonResponse res = new JsonResponse();
			
			res.setSuccess(false);
			res.setMessage("produit not found");
			return ResponseEntity.status(404).body(res);
		}catch(Exception e) {
			JsonResponse res = new JsonResponse(); 
			res.setSuccess(false);
			res.setMessage("something wen wrong please try again");
			return ResponseEntity.status(403).body(res);
		}
	}
	
	
	
}
