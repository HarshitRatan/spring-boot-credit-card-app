package com.ibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.Statement;
import com.ibm.service.IStatementService;

@RestController
@RequestMapping("/statement")
public class StatementController {
	
	@Autowired
	IStatementService service;
	
	@GetMapping("/getallstatements")
	public ResponseEntity<List<Statement>> getAllStatements() {
		try {
			List<Statement> allStatement = service.getAllStatements();
			return ResponseEntity.of(Optional.of(allStatement));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/getstatementById/{sid}")
	public ResponseEntity<Statement> getCustomerById(@PathVariable("sid") long id) {
		try {
			Statement statement = service.getStatement(id);
			return ResponseEntity.of(Optional.of(statement));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping("/addstatement")
	public ResponseEntity<Statement> addCustomer(@RequestBody Statement statement) {
		try {
			Statement res = service.addStatement(statement);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PutMapping("/updatestatement/{sid}")
	public ResponseEntity<Statement> updateStatement(@PathVariable("sid") long id, @RequestBody Statement statement ) {
		try {
			Statement res = service.updateStatement(id, statement);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping("/deletestatement/{sid}")
	public ResponseEntity<Object> deleteProduct(@PathVariable("sid") long id) {
		try {
			service.removeStatement(id);
			return ResponseEntity.accepted().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	@GetMapping("/getBilledStatement/")
	public ResponseEntity<Statement> getBilledStatement() {
		try {
			Statement statement = service.getBilledStatement();
			return ResponseEntity.of(Optional.of(statement));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@GetMapping("/getUnBilledStatement/")
	public ResponseEntity<Statement> getUnBilledStatement() {
		try {
			Statement statement = service.getUnBilledStatement();
			return ResponseEntity.of(Optional.of(statement));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	
}