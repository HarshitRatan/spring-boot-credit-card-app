package com.ibm.dao;

import com.ibm.bean.Statement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface IStatementRepository extends JpaRepository<Statement, Long>{
	
}
