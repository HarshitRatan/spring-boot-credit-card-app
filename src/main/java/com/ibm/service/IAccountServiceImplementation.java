package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.Account;

@Component
public class IAccountServiceImplementation implements IAccountService{

	@Override
	public Account addAccount(Account account) {
		System.out.println("Hello From addAccount with value " + account);
		return null;
	}

	@Override
	public Account removeAccount(long id) {
		System.out.println("Hello From removeAccount with value " + id);
		return null;
	}

	@Override
	public Account updateAccount(long id, Account account) {
		System.out.println("Hello From updateAccount with id " + id + " Account " + account);
		return null;
	}

	@Override
	public Account getAccount(long id) {
		System.out.println("Hello From getAccount with id " + id);
		return null;
	}

	@Override
	public List<Account> getAllAccounts() {
		System.out.println("Hello From getAllAccounts");
		return null;
	}

}
