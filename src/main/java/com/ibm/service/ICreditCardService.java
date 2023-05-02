package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.CreditCard;

@Component
public interface ICreditCardService {
	public CreditCard addCreditCard(CreditCard creditCard);
	public CreditCard removeCreditCard(long cardId);
	public CreditCard updateCreditCard(long cardId, CreditCard card);
	public CreditCard getCreditCard(long cardId);
	public List<CreditCard> getAllCreditCards(); 


}
