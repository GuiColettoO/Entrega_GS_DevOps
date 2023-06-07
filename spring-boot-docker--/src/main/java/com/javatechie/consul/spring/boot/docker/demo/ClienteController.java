package com.javatechie.consul.spring.boot.docker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ClienteController {
	
	@GetMapping
	public String getStatus() {
		return "Application is up and running";
	}


}
