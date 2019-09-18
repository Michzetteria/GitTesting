package com.kmd.application;

import java.util.List;
import com.kmd.model.Customer;
import com.kmd.service.CustomerService;
import com.kmd.service.CustomerServiceImpl;

public class Main {
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		List<Customer> customers = service.findAll();
		
		for (Customer customer : customers) {
			System.out.println(customer.getFirstName());
			System.out.println(customer.getLastName());
		}
	}
}