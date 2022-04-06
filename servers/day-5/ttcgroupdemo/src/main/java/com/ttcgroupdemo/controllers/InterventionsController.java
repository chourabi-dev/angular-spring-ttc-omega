package com.ttcgroupdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttcgroupdemo.entities.Interventions;
import com.ttcgroupdemo.entities.Vehicule;
import com.ttcgroupdemo.repositories.CategoryRepository;
import com.ttcgroupdemo.repositories.InterventionsRespository;
import com.ttcgroupdemo.repositories.VehiculeRepository;
import com.ttcgroupdemo.request.InterventionModel;
import com.ttcgroupdemo.request.VehiculeModel;

@RequestMapping("/interventions")
@RestController

public class InterventionsController {

	
	
	
	@Autowired
	InterventionsRespository interventionsRespository;
	
	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@Autowired
	VehiculeRepository vehiculeRepository;
	
	
	@PostMapping("/add")
	ResponseEntity<?> add( @RequestBody InterventionModel model  ){
		 
		Interventions i = new Interventions();
		
		i.setDescription(model.getDescription());
		
		i.setCategory(this.categoryRepository.findById( model.getCategory() ).get());
		
		i.setVehicule( this.vehiculeRepository.findById( model.getVehicule() ).get() );
		
		 
		
		return ResponseEntity.ok( this.interventionsRespository.save(i) ); 
	}
}
