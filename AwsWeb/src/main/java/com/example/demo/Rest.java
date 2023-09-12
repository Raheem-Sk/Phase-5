package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Rest {
	
	
	@GetMapping("/home")
	public String home() {
		return "index.html";
	}

}
