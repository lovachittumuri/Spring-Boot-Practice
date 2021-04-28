package com.lova.SampleProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	// http://localhost:8080/myWish/Lova Chittumuri
	@GetMapping("myWish/{name}")
	public String saywishes(@PathVariable("name") String fname) {
		// TODO Auto-generated method stub
		return "Hello This is  " + fname;
	}

}
