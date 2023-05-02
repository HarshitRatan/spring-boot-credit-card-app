package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.Transaction;

@Component
public interface ITransactionService {
	public Transaction addTransaction(Transaction transaction);
	public Transaction removeTransaction(long id);
	public Transaction updateTransaction(long id, Transaction transaction);
	public Transaction getTransactionDetails(long id);
	public List<Transaction> getAllTransactions(); 

}
