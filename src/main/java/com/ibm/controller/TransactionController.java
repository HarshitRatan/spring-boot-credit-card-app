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


import com.ibm.bean.Transaction;
import com.ibm.service.ITransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	ITransactionService service;

	@PostMapping("/addTransaction")
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction) {
		try {
			Transaction res = service.addTransaction(transaction);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
}
	@DeleteMapping("/removeTransaction/{id}")
	public ResponseEntity<Object>removeTransaction(@PathVariable("id") long id) {
		try {
			service.removeTransaction((long) id);
			return ResponseEntity.accepted().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
}
	@PutMapping("/updateTransaction/{id}")
	public ResponseEntity<Transaction> updateTransaction(@PathVariable("id") long id, @RequestBody Transaction transaction) {
		try {
			Transaction res = service.updateTransaction((long) id, transaction);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	@GetMapping("/getTransactionDetails/{id}")
	public ResponseEntity<Transaction> getTransactionDetails(@PathVariable("id") long id) {
		try {
			Transaction transaction = service.getTransactionDetails((long) id);
			return ResponseEntity.of(Optional.of(transaction));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@GetMapping("/getallTransaction")
	public ResponseEntity<List<Transaction>> getAllTransaction() {
		try {
			List<Transaction> allTransaction = service.getAllTransactions();
			return ResponseEntity.of(Optional.of(allTransaction));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
}