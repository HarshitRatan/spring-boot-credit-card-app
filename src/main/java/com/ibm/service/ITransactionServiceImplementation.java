package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.Transaction;

@Component
public class ITransactionServiceImplementation implements ITransactionService{

	@Override
	public Transaction addTransaction(Transaction transaction) {
		System.out.println("Hello from addTransaction with value " + transaction);
		return null;
	}

	@Override
	public Transaction removeTransaction(long id) {
		System.out.println("Hello from removeTransaction with id " + id);
		return null;
	}

	@Override
	public Transaction updateTransaction(long id, Transaction transaction) {
		System.out.println("Hello from updateTransaction with id " + id + " and value :: " + transaction);
		return null;
	}

	@Override
	public Transaction getTransactionDetails(long id) {
		System.out.println("Hello from getTransactionDetails with id " + id);
		return null;
	}

	@Override
	public List<Transaction> getAllTransactions() {
		System.out.println("Hello from getTransactionDetails with id");
		return null;
	}

}
