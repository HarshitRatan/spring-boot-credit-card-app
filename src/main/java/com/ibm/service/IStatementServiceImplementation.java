package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.Statement;

@Component
public class IStatementServiceImplementation implements IStatementService{

	@Override
	public Statement addStatement(Statement statement) {
		System.out.println("Hello From addStatement with value " + statement);
		return null;
	}

	@Override
	public Statement removeStatement(long id) {
		System.out.println("Hello From removeStatement with id " + id);
		return null;
	}

	@Override
	public Statement updateStatement(long id, Statement statement) {
		System.out.println("Hello From updateStatement with id " + id + "And value " + statement);
		return null;
	}

	@Override
	public Statement getStatement(long id) {
		System.out.println("Hello From getStatement with id " + id);
		return null;
	}

	@Override
	public List<Statement> getAllStatements() {
		System.out.println("Hello From getAllStatements");
		return null;
	}

}
