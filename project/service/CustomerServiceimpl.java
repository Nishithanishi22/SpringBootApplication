package com.myfirstweb.project.service;

import java.util.ArrayList;
import java.util.List;

import com.myfirstweb.project.controller.Customer;

public class CustomerServiceimpl implements CustomerService {
	List<Customer> customers= new ArrayList();

	@Override
	public String createCustomer(Customer customer) {
		customers.add(customer);
		return "saved successfully";
	}

	@Override
	public List<Customer> readCustomer() {
          return customers;
	}

}
