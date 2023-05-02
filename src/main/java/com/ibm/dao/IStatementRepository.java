package com.ibm.dao;

import java.util.List;

import com.ibm.bean.Statement;

public interface IStatementRepository {
	public Statement addStatement(Statement statement);
	public Statement removeStatement(long id);
	public Statement updateStatement(long id, Statement statement);
	public Statement getStatement(long id);
	public List<Statement> getAllStatements();
	public Statement getBilledStatement();
	public Statement getUnbilledStatement();
}
