package com.kmd.service;

import java.util.List;

import com.kmd.model.Customer;
import com.kmd.repository.CustomerRepository;
import com.kmd.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepo = new CustomerRepositoryImpl();

	//@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
}