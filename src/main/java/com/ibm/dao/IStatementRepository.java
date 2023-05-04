package com.ibm.dao;

import com.ibm.bean.Statement;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface IStatementRepository extends JpaRepository<Statement, Long>{
//	public Statement addStatement(Statement statement);
//	public Statement removeStatement(long id);
//	public Statement updateStatement(long id, Statement statement);
//	public Statement getStatement(long id);
//	public List<Statement> getAllStatements();
//	public Statement getBilledStatement();
//	public Statement getUnbilledStatement();
}
