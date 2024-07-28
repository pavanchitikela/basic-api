package com.example.basic_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControlelr {
	
	@GetMapping("/greet")
	public String greet() {
		return "hello world";
	}
}
