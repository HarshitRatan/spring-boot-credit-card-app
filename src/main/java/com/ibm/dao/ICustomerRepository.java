package com.ibm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ibm.bean.Customer;

@Component
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
