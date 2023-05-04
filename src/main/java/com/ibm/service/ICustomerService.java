package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.Customer;

@Component
public interface ICustomerService {
	public Customer addCustomer(Customer customer);
	public void removeCustomer(int custId);
	public Customer updateCustomer(int custId, Customer customer);
	public Customer getCustomer(int custId);
	public List<Customer> getAllCustomers(); 
}
