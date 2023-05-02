package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.service.IStatementService;

@RestController
@RequestMapping("/statement")
public class StatementController {
	
	@Autowired
	IStatementService service;
}
