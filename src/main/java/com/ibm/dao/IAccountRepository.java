package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Account;

public interface IAccountRepository {
	public Account addAccount(Account account);
	public Account removeAccount(long id);
	public Account updateAccount(long id, Account account);
	public Account getAccount(long id);
	public List<Account> getAllAccounts();
}
