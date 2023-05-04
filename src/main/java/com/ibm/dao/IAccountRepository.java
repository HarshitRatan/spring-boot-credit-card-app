package com.ibm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ibm.bean.Account;

@Component
public interface IAccountRepository extends JpaRepository<Account, Integer>{
	
}