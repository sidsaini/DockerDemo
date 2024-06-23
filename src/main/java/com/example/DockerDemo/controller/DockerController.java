package com.example.DockerDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/get")
	public ResponseEntity<String> getMessage(){
		String str = "Welcome to Docker";
		return new ResponseEntity<>(str,HttpStatus.OK);
	}

	
	
}
