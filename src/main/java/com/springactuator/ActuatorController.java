package com.springactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Buddies...";
	}
	
	@GetMapping("/copy")
	public String copy() {
		return "You can Copy this page...!";
	}

}
