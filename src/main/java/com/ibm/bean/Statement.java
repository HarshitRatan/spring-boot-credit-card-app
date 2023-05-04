package com.ibm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Statement_tables")
public class Statement {	
	@Id
	@Column(name="sid")
	private long statementId;
	
	@Column(name="dueamt")
//	@NotEmpty(message="dueAmount can not be more than 500 ")
	private double dueAmount;
	
	@Column(name="billingamt")
//	@NotEmpty(message="billingDate can not exceed a month ")
	private String billingDate;
	
	@Column(name="duedate")
	private String dueDate;
	
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
	public String getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
}
