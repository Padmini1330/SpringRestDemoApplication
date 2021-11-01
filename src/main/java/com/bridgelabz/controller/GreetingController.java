package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController 
{
	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello() 
	{
		return "Hello Everyone!";
	}

}