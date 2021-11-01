package com.bridgelabz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController 
{
	@RequestMapping(value = { "", "/", "/home" })
	public ResponseEntity<String> sayHello() 
	{
		return new ResponseEntity<String>("Hello everyone!", HttpStatus.OK);
	}

	
	@RequestMapping(value = { "/query" })
	public String sayHello(@RequestParam(value = "fname", defaultValue = "Padmini") String fname,
			@RequestParam(value = "lname", defaultValue = "Sharma") String lname) 
	{
		return "Welcome " + fname + " " + lname + "!";
	}
}