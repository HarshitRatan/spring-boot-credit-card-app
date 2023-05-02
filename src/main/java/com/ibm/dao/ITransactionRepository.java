package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Transaction;

public interface ITransactionRepository {
	public Transaction addTransaction(Transaction transaction);
	public Transaction removeTransaction(long id);
	public Transaction updateTransaction(long id, Transaction transaction);
	public Transaction getTransactionDetails(long id);
	public List<Transaction> getAllTransactions(); 

}
