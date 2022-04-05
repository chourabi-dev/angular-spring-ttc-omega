package com.ttcdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ttcdemo.models.EmployeeModel;
import com.ttcdemo.response.JsonResponse;

@RequestMapping("/app")
@RestController()
@CrossOrigin(origins = "*")
public class AppController {

	
	// Get
	/* @GetMapping("/hello")
	public String sayHello() {
		return "hello world";
	}
	
	@GetMapping("/somme")
	 
	public int somme(@RequestParam( ) int x , @RequestParam( name="second" ) int y) {
		return (x+y);
	}
	
	
	@GetMapping("/employee/details/{id}")
	public String findEmployee( @PathVariable(name="id") String  id ) {
		return "searching for employee n° "+id;
	}
	 */
	
	// POST
	
	/*
	@PostMapping("/employee/add")
	public ResponseEntity<JsonResponse> addEmployee( @RequestBody() EmployeeModel model ) {
		
		JsonResponse res = new JsonResponse();
		
		// insret database
		
		res.setSuccess(true);
		res.setMessage(model.getFullname()+" inserted successfully !!");
		
		
		return  ResponseEntity.ok(res);
		
	}
	
	
	
	
	@PostMapping("/employee/add-many")
	public ResponseEntity<JsonResponse> addManyEmployee( @RequestBody() List<EmployeeModel> list ) {
		
		JsonResponse res = new JsonResponse();
		
		int i = 0;
		
		for(EmployeeModel tmp:list) {
			System.out.println( tmp.getFullname() );
			i++;
			
		}
		
		res.setSuccess(true);
		res.setMessage(i+" employees inserted successfully !!");
		
		
		return  ResponseEntity.ok(res);
		
	}
	
	
	
	@PostMapping("/employee/add-many-res")
	public ResponseEntity<?> addManyEmployeeResposne( @RequestBody() List<EmployeeModel> list ) {
		
		List<EmployeeModel> resList = new ArrayList<EmployeeModel>();
		
		
		JsonResponse res = new JsonResponse();
		
		int i = 0;
		
		for(EmployeeModel tmp:list) {
			resList.add(tmp);
			i++;
			
		}
		
		res.setSuccess(true);
		res.setMessage(i+" employees inserted successfully !!");
		
		
		return  ResponseEntity.ok(resList);
		
	}
	*/
	
	
	
	
	
}
