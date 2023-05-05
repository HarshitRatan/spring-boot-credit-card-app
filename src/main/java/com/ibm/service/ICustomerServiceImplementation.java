package com.ibm.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.bean.Customer;
import com.ibm.dao.ICustomerRepository;

@Component
@Transactional
public class ICustomerServiceImplementation implements ICustomerService {
	
	@Autowired
	ICustomerRepository dao;

	@Override
	public Customer addCustomer(Customer customer) {
		System.out.println("Hello From Add Customer");
		LocalTime time = LocalTime.now();
		String a = Integer.toString(time.getNano()/100000);
		String b = Integer.toString(time.getSecond());
		int ID = Integer.parseInt(b+a);
		customer.setUserId(ID);
		Customer res = dao.save(customer);
		return res;
	}

	@Override
	public void removeCustomer(int custId) {
		System.out.println("Hello from removeCustomer");
		dao.deleteById(custId);
	}

	@Override
	public Customer updateCustomer(int custId, Customer customer) {
		System.out.println("Hello from updateCustomer with ID " + custId + " And " + customer);
		int id = customer.getUserId();
		Customer c = dao.findById(id).get();
		
		Customer result = null;
		
		if(c.getUserId() == customer.getUserId()) {
			result = dao.save(customer);
		}
		return result;
	}

	@Override
	public Customer getCustomer(int custId) {
		System.out.println("Hello from getCustomer By ID");
		Optional<Customer> result = dao.findById(custId);
		return result.get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		System.out.println("Hello from getAllCustomers ");
		List<Customer> result = dao.findAll();
		return result;
	}

}
