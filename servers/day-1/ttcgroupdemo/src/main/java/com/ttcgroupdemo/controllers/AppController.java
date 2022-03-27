package com.ttcgroupdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app")
@RestController
public class AppController {
	 
	@GetMapping("/hello")
	String sayHello() {
		return "hello world";
	}
	
	
	

}
