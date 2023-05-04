package com.ibm.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ibm.bean.Account;

@Component
public interface IAccountRepository extends JpaRepository<Account, Integer>{

	//void deleteBynum(int accnum);

	//Optional<Account> findBynum(int accnum);
	

	
}
//	public Account addAccount(Account account);
//	public Account removeAccount(long id);
//	public Account updateAccount(long id, Account account);
//	public Account getAccount(long id);
//	public List<Account> getAllAccounts();
//
