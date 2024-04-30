package com.myfirstweb.project.service;

import java.util.List;

import com.myfirstweb.project.controller.Customer;

public interface CustomerService {
	String createCustomer(Customer customer);
	List <Customer> readCustomer();
	
	

}
