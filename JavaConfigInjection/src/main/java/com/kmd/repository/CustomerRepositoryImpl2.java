package com.kmd.repository;

import java.util.ArrayList;
import java.util.List;

import com.kmd.model.Customer;

public class CustomerRepositoryImpl2 implements CustomerRepository {
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Ben");
		customer.setLastName("Wonger");

		customers.add(customer);
		return customers;
	}
}