package com.ttcgroupdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttcgroupdemo.entities.Category;
import com.ttcgroupdemo.entities.Clients;
import com.ttcgroupdemo.repositories.CategoryRepository;
import com.ttcgroupdemo.request.CategoryModel;
import com.ttcgroupdemo.request.ClientAppModel;


@RequestMapping("/categories")
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	
	 
	
	@PostMapping("/add")
	ResponseEntity<?> add( @RequestBody CategoryModel model ){
		 Category c = new Category(); 
		 c.setLibelle(model.getLibelle());  
		return ResponseEntity.ok( this.categoryRepository.save(c) ); 
	}
	
	
	@GetMapping("/list")
	ResponseEntity<?> getList( ){
		return ResponseEntity.ok( this.categoryRepository.findAll());
		
	}
	
}
