package com.ibm.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "creditcard_tables")
public class CreditCard {
	
	@Id
	private long cardId;
	
	@NotEmpty(message = "Name can not be Null or Empty")
	@Column(name = "bankname")
	private String bankName;
	
	private String cardType;
	
	@NotEmpty(message = "Name can not be Null or Empty")
	@Column(name = "cardname")
	private String cardName;
	
	@NotEmpty(message = "Number can not be Null or Empty")
	@Column(name = "cardNumber")
	private String cardNumber;
    private String cardExpiry;
	private int cvv;
	public long getCardId() {
		return cardId;
	}
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "CreditCard [cardId=" + cardId + ", bankName=" + bankName + ", cardType=" + cardType + ", cardName="
				+ cardName + ", cardNumber=" + cardNumber + ", cardExpiry=" + cardExpiry + ", cvv=" + cvv + "]";
	}
	   
}
