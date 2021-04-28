package com.lova.springjpadatabaseconnection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lova.springjpadatabaseconnection.model.Customer;
import com.lova.springjpadatabaseconnection.repository.ICustomerRepository;

@RestController
public class CustomerController {

	
	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	ICustomerRepository customerRepository;

	@GetMapping("/")
	public String welcomeMessage() {
		return "Welcome to "+appName +" application";
	}
	
	@GetMapping("/getData")
	public List<Customer> getCustomerData() {
		return customerRepository.findAll();
	}

	@GetMapping("/hello/{name}")
	public String sayGoodMorning(@PathVariable("name")String name) {
		return "Good Morning   " + name;
	}

}
