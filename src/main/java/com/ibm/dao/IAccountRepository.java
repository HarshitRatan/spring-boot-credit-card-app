package com.ibm.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ibm.bean.Account;

@Component
@Repository
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
