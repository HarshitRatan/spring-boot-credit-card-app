package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;


import com.ibm.bean.Statement;

@Component
public interface IStatementService {
	public Statement addStatement(Statement statement);
	public void  removeStatement(long id);
	public Statement updateStatement(long id, Statement statement);
	public Statement getStatement(long id);
	public List<Statement> getAllStatements();
	public Statement getBilledStatement();
	public Statement getUnBilledStatement();
}
