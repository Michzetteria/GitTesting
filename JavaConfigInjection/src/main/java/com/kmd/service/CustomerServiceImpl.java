package com.kmd.service;

import java.util.List;

import com.kmd.model.Customer;
import com.kmd.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepo = customerRepository;
	}

	public void setCustomerRepo(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

}