package com.cjc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parent-service")
public class Parent_controller {
	@PostMapping("/addParent")
public String register() {
	return "parent added";
}
	@GetMapping("/getTutor")
public String viewTutor() {
	return "list of tutor";
}
	
	
}
