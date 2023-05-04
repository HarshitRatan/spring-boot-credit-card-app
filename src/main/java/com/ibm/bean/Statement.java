package com.ibm.bean;

import java.time.LocalDate;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Statement_tables")

public class Statement {	
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long statementId;
	@Column(name="dueamt")
//	@NotEmpty(message="dueAmount can not be more than 500 ")
	private double dueAmount;
	@Column(name="billingamt")
//	@NotEmpty(message="billingDate can not exceed a month ")
	private LocalDate billingDate;
	@Column(name="duedate")
	private LocalDate dueDate;
	@Column(name="customer")
//	@OneToOne(cascade = CascadeType.ALL)
//	private Customer customer;
	public long getStatementId() {
		return statementId;
	}
	public void setStatementId(long statementId) {
		this.statementId = statementId;
	}
	public double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
	public LocalDate getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public void setUserId(int iD) {
		// TODO Auto-generated method stub
		
	}
	public int getUserId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setUserId1(int iD) {
		// TODO Auto-generated method stub
		
	}
}
