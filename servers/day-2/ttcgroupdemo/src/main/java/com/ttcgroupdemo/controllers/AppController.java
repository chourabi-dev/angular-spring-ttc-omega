package com.ttcgroupdemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ttcgroupdemo.request.ClientModel;
import com.ttcgroupdemo.response.JsonResponse;

@RequestMapping("/app")
@RestController
public class AppController {
	 
	@GetMapping("/hello")
	String sayHello() {
		return "hello world";
	}
	
	
	@GetMapping("/somme")
	int somme(@RequestParam( required = true ) int x , @RequestParam( required = true ) int y ) {
		return (x+y);
	}
	
							   // variable
	@GetMapping("/user/details/{id}")
	String user( @PathVariable() int id ) {
		System.out.println(id);
		return "searching for user N° ";
	}
	
	
	// params variable url
	
	
	
	// POST
	
	@PostMapping("/client/add")
	ResponseEntity<?> addNewClient( @RequestBody ClientModel client ) {
		System.out.println( client.getName() );
		System.out.println( client.getEmail() );
		System.out.println( client.getAddress());
		
		 
		/*
		 *  JsonResponse res= new JsonResponse();
			res.setMessage("user ".concat(client.getName()).concat(" insertted successfully"));
			res.setSuccess(true); 
			return ResponseEntity.ok(res);
		 * */
		
		
		JsonResponse res= new JsonResponse();
		res.setMessage("missing password");
		res.setSuccess(false);
		
		
		return ResponseEntity.status(200).body(res);
		 
	}
	 
	
	// PUT
	
	
	// DELETE
	
	
	
	
	
	

}
