package com.bridgelabz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.User;

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
	
	@GetMapping("/param/{name}")
	public String parameterName(@PathVariable String name) 
	{
		return "Hello " + name;
	}
	
	@PostMapping("/post")
	public String setUser(@RequestBody User name) 
	{
		return "Hello " + name.getFirstName() + " " + name.getLastName();
	}
	
	@PostMapping("/put/{firstName}")
	public String sayHelloPostMethod(@PathVariable String firstName,
			@RequestParam(value="lastName",defaultValue="Sharma") String lastName) 
	{
		return "Hello "+firstName+" "+lastName +"!";
	}
}