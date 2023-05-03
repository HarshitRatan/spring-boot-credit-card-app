package com.ibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.Customer;
import com.ibm.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	ICustomerService service;
	
	@GetMapping("/getallCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		try {
			List<Customer> allCustomer = service.getAllCustomers();
			return ResponseEntity.of(Optional.of(allCustomer));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();
		}
	}
	
	@GetMapping("/getCustomerById/{cid}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("cid") int id) {
		try {
			Customer customer = service.getCustomer(id);
			return ResponseEntity.of(Optional.of(customer));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		try {
			Customer res = service.addCustomer(customer);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PutMapping("/updateCustomer/{cid}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("cid") int id, @RequestBody Customer customer) {
		try {
			customer.setUserId((int) id);
			Customer res = service.updateCustomer(id, customer);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping("/delete/{cid}")
	public ResponseEntity<Object> deleteCustomer(@PathVariable("cid") int id) {
		try {
			service.removeCustomer(id);
			return ResponseEntity.accepted().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
