package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@GetMapping("/")
	public String index() {
		return "home page"; 
	}
	
	
	@GetMapping("/profile")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
	public String profile() {
		return "profile page"; 
	}
	
	@GetMapping("/student")
	@PreAuthorize("hasRole('ROLE_STUDENT')")
	public String student() {
		return "student page"; 
	}
	
	
	
	
}
