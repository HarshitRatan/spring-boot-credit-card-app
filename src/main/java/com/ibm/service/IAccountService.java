package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.Account;

@Component
public interface IAccountService {
	public Account addAccount(Account account);
	public Account removeAccount(long id);
	public Account updateAccount(long id, Account account);
	public Account getAccount(long id);
	public List<Account> getAllAccounts();
}
