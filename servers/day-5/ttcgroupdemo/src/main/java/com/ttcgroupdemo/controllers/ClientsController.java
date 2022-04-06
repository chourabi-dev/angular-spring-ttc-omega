package com.ttcgroupdemo.controllers;

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

import com.ttcgroupdemo.entities.Clients;
import com.ttcgroupdemo.repositories.ClientRepository;
import com.ttcgroupdemo.request.ClientAppModel;
import com.ttcgroupdemo.response.JsonResponse;

@RequestMapping("/clients")
@RestController
public class ClientsController  {

	
	
	@Autowired
	ClientRepository clientRepository;
	
	
	
	// add
	@PostMapping("/add")
	ResponseEntity<?> addClient( @RequestBody ClientAppModel model ){
		Clients c = new Clients();
		
		c.setNom(model.getNom());
		c.setPrenom(model.getPrenom());
		c.setEmail(model.getEmail());
		c.setAddress(model.getAddress());
		c.setCin(model.getCin());
		
		return ResponseEntity.ok( this.clientRepository.save(c) );
		
	}
	
	
	// list
	@GetMapping("/list")
	ResponseEntity<?> getList( ){
		return ResponseEntity.ok( this.clientRepository.findAll());
		
	}
	
	
	// modifier
	@PutMapping("/update/{id}")
	ResponseEntity<?> updateClient( @RequestBody ClientAppModel model, @PathVariable long id ){
		Clients c = this.clientRepository.findById(id).get();
		
		c.setNom(model.getNom());
		c.setPrenom(model.getPrenom());
		c.setEmail(model.getEmail());
		c.setAddress(model.getAddress());
		c.setCin(model.getCin());
		
		return ResponseEntity.ok( this.clientRepository.save(c) );
		
	}
	
	
	// supprimer
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<?> delete( @PathVariable long id ){
		Clients c = this.clientRepository.findById(id).get();
		this.clientRepository.delete(c);
		
		JsonResponse res = new JsonResponse();
		res.setSuccess(true);
		res.setMessage("cleint deleted successfully");
		
		return ResponseEntity.ok( res);
		
	}
}
