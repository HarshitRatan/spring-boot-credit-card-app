package com.ibm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.bean.Transaction;
import com.ibm.dao.ITransactionRepository;

@Component
public class ITransactionServiceImplementation implements ITransactionService{
	@Autowired
	ITransactionRepository dao;

	@Override
	public Transaction addTransaction(Transaction transaction) {
		Transaction res = dao.save(transaction);
		return res;
		
	}

	@Override
	public void removeTransaction(long id) {
		
		dao.deleteById(id);
	}

	@Override
	public Transaction updateTransaction(long id, Transaction transaction) {
		    Optional<Transaction> optionalTransaction = dao.findById(id);
		    if (optionalTransaction.isPresent()) {
		        Transaction t = optionalTransaction.get();
		        t.setStatus(transaction.getStatus());
		        t.setRefNo(transaction.getRefNo());
		        t.setDate(transaction.getDate());
		        t.setTime(transaction.getTime());
		        t.setCardNo(transaction.getCardNo());
		        t.setBeneficiaryEmail(transaction.getBeneficiaryEmail());
		        t.setPaymentAmount(transaction.getPaymentAmount());
		        t.setPayFrom(transaction.getPayFrom());
		        dao.save(t);
		        return t;
		    } else {
		        System.out.println("Transaction with id " + id + " not found.");
		        return null;
		    }
		}



	@Override
	public Transaction getTransactionDetails(long id) {
		System.out.println("Hello from getTransactionDetails with id " + id);
		//return null;
		Optional<Transaction> result = dao.findById(id);
		return result.get();
	}

	@Override
	public List<Transaction> getAllTransactions() {
		System.out.println("Hello from getAllCustomers ");
		List<Transaction> result = dao.findAll();
		return result;
	}

}
