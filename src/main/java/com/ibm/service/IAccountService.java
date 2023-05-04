package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.Account;

@Component
public interface IAccountService {
	public Account addAccount(Account account);
	public void removeAccount(int accNum);
	public Account updateAccount(int accNum, Account account);
	public Account getAccount(int accNum);
	public List<Account> getAllAccounts();
}
