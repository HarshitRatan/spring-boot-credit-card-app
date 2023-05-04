package com.ibm.bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "transaction_details")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String status="Transaction success";
	private String refNo=UUID.randomUUID().toString().replaceAll("-", "");
	private LocalDate date=LocalDate.now();
	private LocalTime time=LocalTime.now();
	private String cardNo;
	private String beneficiaryEmail;
	private double paymentAmount;
	private String payFrom;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getBeneficiaryEmail() {
		return beneficiaryEmail;
	}
	public void setBeneficiaryEmail(String beneficiaryEmail) {
		this.beneficiaryEmail = beneficiaryEmail;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPayFrom() {
		return payFrom;
	}
	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}
	public Transaction(Long id, String status, String refNo, LocalDate date, LocalTime time, String cardNo,
			String beneficiaryEmail, double paymentAmount, String payFrom) {
		super();
		this.id = id;
		this.status = status;
		this.refNo = refNo;
		this.date = date;
		this.time = time;
		this.cardNo = cardNo;
		this.beneficiaryEmail = beneficiaryEmail;
		this.paymentAmount = paymentAmount;
		this.payFrom = payFrom;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", status=" + status + ", refNo=" + refNo + ", date=" + date + ", time=" + time
				+ ", cardNo=" + cardNo + ", beneficiaryEmail=" + beneficiaryEmail + ", paymentAmount=" + paymentAmount
				+ ", payFrom=" + payFrom + "]";
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
