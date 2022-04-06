package com.ttcgroupdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttcgroupdemo.entities.Clients;
import com.ttcgroupdemo.entities.Vehicule;
import com.ttcgroupdemo.repositories.ClientRepository;
import com.ttcgroupdemo.repositories.VehiculeRepository;
import com.ttcgroupdemo.request.ClientAppModel;
import com.ttcgroupdemo.request.VehiculeModel;

@RequestMapping("/vehicules")
@RestController
public class VehiculeController {

	
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	VehiculeRepository vehiculeRepository;
	
	
	// add
	@PostMapping("/add")
	ResponseEntity<?> add( @RequestBody VehiculeModel model  ){
		 
		
		Vehicule v = new Vehicule();
		
		v.setMark(model.getMark());
		v.setModel(model.getModel());
		v.setColor(model.getColor());
		v.setMatricule(model.getMatricule());
		
		
		v.setClient( this.clientRepository.findById(model.getClient() ).get() );
		
		return ResponseEntity.ok( this.vehiculeRepository.save(v) ); 
	}
	
	@GetMapping("/find/{id}")
	ResponseEntity<?> find(  @PathVariable long id  ){
		 
		
		Vehicule v = this.vehiculeRepository.findById(id) .get();
		 
		
		return ResponseEntity.ok( v ); 
	}
	
	
	
	
}
