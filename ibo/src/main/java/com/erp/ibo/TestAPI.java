package com.erp.ibo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello IBO Project!";
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "Test API !!";
	}
}
