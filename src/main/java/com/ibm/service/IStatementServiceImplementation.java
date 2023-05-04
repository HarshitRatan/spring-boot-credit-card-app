package com.ibm.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.ibm.bean.Statement;
import com.ibm.dao.IStatementRepository;

@Component
public class IStatementServiceImplementation implements IStatementService{

	
	private IStatementRepository dao;

	@Override
	public Statement addStatement(Statement statement) {
		System.out.println("Hello From addStatement with value " + statement);
		LocalTime time = LocalTime.now();
		String a = Integer.toString(time.getNano()/100000);
		String b = Integer.toString(time.getSecond());
		int ID = Integer.parseInt(b+a);
		statement.setUserId(ID);
		Statement res =  dao.save(statement);
		return res;
	}
    
	@Override
	public void removeStatement(long id) {
		System.out.println("Hello From removeStatement with id " + id);
		dao.deleteById(id);
	
	}
    
	@Override
	public Statement updateStatement(long id, Statement statement) {
		System.out.println("Hello From updateStatement with id " + id + "And value " + statement);
		Statement s = dao.findById(id).get();
		
		Statement result = null;
		
		if(s.getUserId() == statement.getUserId()) {
			result = dao.save(statement);
		}
		return result;
	}
    
	@Override
	public Statement getStatement(long id) {
		System.out.println("Hello From getStatement with id " + id);
		Optional<Statement> result = dao.findById(id);
		return result.get();
	}

	@Override
	public List<Statement> getAllStatements() {
		System.out.println("Hello From getAllStatements");
		List<Statement> result = dao.findAll();
		return result;
	}

	@Override
	public Statement getBilledStatement() {
		System.out.println("Hello From getBilledStatement");
		return null; 
	}

	@Override
	public Statement getUnBilledStatement() {
		System.out.println("Hello From getUnBilledStatement");
		return null;
	}

}
