package com.ibm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.bean.CreditCard;

@Component
public class ICreditCardServiceImplementation implements ICreditCardService {

	@Override
	public CreditCard addCreditCard(CreditCard creditCard) {
		System.out.println("Hello From addCreditCard with value " + creditCard);
		return null;
	}

	@Override
	public CreditCard removeCreditCard(long cardId) {
		System.out.println("Hello From removeCreditCard with value " + cardId);
		return null;
	}

	@Override
	public CreditCard updateCreditCard(long cardId, CreditCard card) {
		System.out.println("Hello From updateCreditCard with ID " + cardId + " card value " + card);
		return null;
	}

	@Override
	public CreditCard getCreditCard(long cardId) {
		System.out.println("Hello From getCreditCard with ID " + cardId);
		return null;
	}

	@Override
	public List<CreditCard> getAllCreditCards() {
		System.out.println("Hello From getAllCreditCards");
		return null;
	}

}
