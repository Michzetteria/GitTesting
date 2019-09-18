package com.kmd.repository;

import java.util.ArrayList;
import java.util.List;

import com.kmd.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Thae Myat");
		customer.setLastName("Noe Htut");

		customers.add(customer);
		return customers;
	}
}
