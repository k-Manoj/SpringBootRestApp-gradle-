package com.kkjavatutorials.SpringBootRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path = "/welcome")
	public String welcome() {
		return "hi, this project has been done by Manoj";
	}

}
