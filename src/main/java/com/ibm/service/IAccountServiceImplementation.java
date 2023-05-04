package com.ibm.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.ibm.bean.Account;
import com.ibm.dao.IAccountRepository;

@Component
@Transactional
public class IAccountServiceImplementation implements IAccountService{
	
	@Autowired
	IAccountRepository dao;

	@Override
	public Account addAccount(Account account) {
		System.out.println("Hello From Add Account");
		LocalTime time = LocalTime.now();
		String a = Integer.toString(time.getNano()/100000);
		String b = Integer.toString(time.getSecond());
		int num = Integer.parseInt(b+a);
        account.setAccountNumber(num);
	    Account res = dao.save(account);
		return res;
	}

	@Override
	public void removeAccount(int accNum) {
		System.out.println("Hello from removeAccount");
		dao.deleteById(accNum);
		
	}

	@Override
	public Account updateAccount(int accNum, Account account) {
		System.out.println("Hello from updateAccount with accNum " + accNum + " And " + account);
		account.setAccountNumber(accNum);
		int num = account.getAccNum();
		Account c = dao.findById(num).get();
		
		Account result = null;
		
		if(c.getAccNum() == account.getAccNum()) {
			result = dao.save(account);
		}
		return result;
	}

	@Override
	public Account getAccount(int accNum) {
		System.out.println("Hello from getAccounts By accNum");
		Optional<Account> result = dao.findById(accNum);
		return result.get();
	}

	@Override
	public List<Account> getAllAccounts() {
		System.out.println("Hello from getAllAccountss ");
		List<Account> result = dao.findAll();
		return result;
	}
	
}