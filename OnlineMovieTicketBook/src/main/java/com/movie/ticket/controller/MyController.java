package com.movie.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/welcomeAdmin")
	public String adminHome() {
		return "adminHome";
	}

	@GetMapping("/adminRegister")
	public String adminRegister() {
		return "adminRegister";
	}
}
