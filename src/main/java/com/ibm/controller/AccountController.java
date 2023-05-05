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

import com.ibm.bean.Account;
import com.ibm.service.IAccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	IAccountService service;
	
	@GetMapping("/getallAccount")
	public ResponseEntity<List<Account>> getAllAccount() {
		try {
			List<Account> allAccount = service.getAllAccounts();
			return ResponseEntity.of(Optional.of(allAccount));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/getAccountById/{aid}")
	public ResponseEntity<Account> getAccountById(@PathVariable("aid") long id) {
		try {
			Account account = service.getAccount((int) id);
			return ResponseEntity.of(Optional.of(account));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping("/addAccount")
	public ResponseEntity<Account> addAccount(@RequestBody Account account) {
		try {
			Account res = service.addAccount(account);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PutMapping("/updateAccount/{aid}")
	public ResponseEntity<Account> updateAccount(@PathVariable("aid") int id, @RequestBody Account account) {
		try {
			Account res = service.updateAccount((int) id, account);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping("/delete/{aid}")
	public ResponseEntity<Object> deleteAccount(@PathVariable("aid") long id) {
		try {
			service.removeAccount((int) id);
			return ResponseEntity.accepted().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}

