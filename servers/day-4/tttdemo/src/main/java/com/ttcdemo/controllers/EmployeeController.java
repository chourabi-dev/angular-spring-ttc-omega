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
import com.ttcdemo.entities.Employee;
import com.ttcdemo.models.DepotModel;
import com.ttcdemo.models.EmployeeModel;
import com.ttcdemo.repositories.DepotRepository;
import com.ttcdemo.repositories.EmployeeRepository;

@RequestMapping("/employees")
@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	private DepotRepository depotRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	
	@PostMapping("/add")
	Employee addEmployee( @RequestBody EmployeeModel model ) {
		Employee employee = new Employee();
		employee.setName(model.getName());
		employee.setAddress(model.getAddress());
		employee.setEmail(model.getEmail());
		employee.setPhone(model.getPhone());
		
		employee.setDepot(  this.depotRepository.findById(model.getDepot()).get()  );
		
		return this.employeeRepository.save(employee);
		
	}
	
	
	@GetMapping("/list")
	List<Employee> getAll(){
		return this.employeeRepository.findAll();
	}
}
