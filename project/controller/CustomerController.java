package com.myfirstweb.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myfirstweb.project.service.CustomerService;
import com.myfirstweb.project.service.CustomerServiceimpl;

@RestController
@RequestMapping("/api/v1")

public class CustomerController {
	

	CustomerService custservice = new CustomerServiceimpl();
	
	@GetMapping("customers")
	public List<Customer> getallCustomers(){
		return custservice.readCustomer();
	}
	
	@PostMapping ("customers")
	public String createCustomer(@RequestBody Customer customer) {
		return custservice.createCustomer(customer);
		
	    
	}
	
}
