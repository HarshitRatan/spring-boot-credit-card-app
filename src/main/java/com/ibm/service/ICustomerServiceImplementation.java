package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.Customer;

@Component
public class ICustomerServiceImplementation implements ICustomerService {

	@Override
	public Customer addCustomer(Customer customer) {
		System.out.println("Hello from addCustomer with " + customer);
		return null;
	}

	@Override
	public Customer removeCustomer(long custId) {
		System.out.println("Hello from removeCustomer with ID " + custId);
		return null;
	}

	@Override
	public Customer updateCustomer(long custId, Customer customer) {
		System.out.println("Hello from updateCustomer with ID " + custId + " And " + customer);
		return null;
	}

	@Override
	public Customer getCustomer(long custId) {
		System.out.println("Hello from getCustomer with ID " + custId);
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		System.out.println("Hello from getAllCustomers ");
		return null;
	}

}
