package com.ibm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ibm.bean.Transaction;

@Component
public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
	
}
