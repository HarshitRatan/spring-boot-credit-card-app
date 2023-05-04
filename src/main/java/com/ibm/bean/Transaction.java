package com.ibm.bean;

import java.time.LocalDate;
import java.time.LocalTime;




public class Transaction {
	private String status;
	private String refNo;
	private LocalDate date;
	private LocalTime time;
	private String cardNo;
	private String beneficiaryEmail;
	private double paymentAmount;
	private String payFrom;
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
	@Override
	public String toString() {
		return "Transaction [status=" + status + ", refNo=" + refNo + ", date=" + date + ", time=" + time + ", cardNo="
				+ cardNo + ", beneficiaryEmail=" + beneficiaryEmail + ", paymentAmount=" + paymentAmount + ", payFrom="
				+ payFrom + "]";
	}
}
