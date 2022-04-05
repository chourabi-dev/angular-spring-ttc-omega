package com.ttcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttcdemo.entities.Depots;
import com.ttcdemo.models.DepotModel;
import com.ttcdemo.repositories.DepotRepository;

@RequestMapping("/depots")
@RestController
@CrossOrigin(origins = "*")
public class DepotsController {

	@Autowired
	private DepotRepository depotRepository;
	
	@PostMapping("/add")
	Depots addDepot( @RequestBody DepotModel model ) {
		Depots depot = new Depots();
		depot.setName(model.getName());
		
		return this.depotRepository.save(depot);
		
	}
	
	
	@GetMapping("/list")
	List<Depots> getAll(){
		return this.depotRepository.findAll();
	}
}
