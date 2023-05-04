package com.ibm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="account_info")

public class Account {
	@Id
	@Column(name="anum")
	private int accNum;
	
	@NotEmpty(message="accountname can't be empty or null")
	private String accountName;
	
	@Min(value=500,message="Accountbalance can't be less than 500")
	private int balance;
	
	private String type;
	
	public int getAccNum() {
		return accNum;
	}
	public void setAccountNumber(int accNum) {
		this.accNum = accNum;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accNum + ", accountName=" + accountName + ", balance=" + balance
				+ ", type=" + type + "]";
	}
	public Account(int acctNum, @NotEmpty(message = "accountname can't be empty or null") String accountName,
			@Min(value = 500, message = "Accountbalance can't be less than 500") int balance, String type) {
		super();
		this.accNum = acctNum;
		this.accountName = accountName;
		this.balance = balance;
		this.type = type;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
}
