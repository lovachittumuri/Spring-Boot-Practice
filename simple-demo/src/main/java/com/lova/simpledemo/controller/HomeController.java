package com.lova.simpledemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${spring.application.name:Hello Lova Chittumuri}")
	private String applicationName;

	@GetMapping("/")
	public String home() {
		return "Good Morning  "+applicationName;
	}

}
