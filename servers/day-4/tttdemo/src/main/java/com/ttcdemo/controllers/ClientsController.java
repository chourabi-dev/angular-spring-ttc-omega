package com.ttcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttcdemo.entities.Clients;
import com.ttcdemo.entities.Employee;
import com.ttcdemo.models.ClientModel;
import com.ttcdemo.models.EmployeeModel;
import com.ttcdemo.repositories.ClientsRepository;

@RequestMapping("/clients")
@RestController
@CrossOrigin(origins = "*")
public class ClientsController {

	@Autowired
	private ClientsRepository clientsRepository;
	
	@PostMapping("/add")
	Clients addClient( @RequestBody ClientModel model ) {
		Clients c = new Clients();
		c.setName(model.getName());
		c.setAddress(model.getAddress());
		c.setEmail(model.getEmail());
		c.setPhone(model.getPhone());
		 
		
		return this.clientsRepository.save(c);
		
	}
	
	
	@GetMapping("/list")
	List<Clients> getAll(){
		return this.clientsRepository.findAll();
	}
}
