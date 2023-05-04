package com.ibm.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.bean.CreditCard;
import com.ibm.dao.ICreditCardRepository;

@Component
@Transactional
public class ICreditCardServiceImplementation implements ICreditCardService {
	
	@Autowired
	ICreditCardRepository dao;

	@Override
	public CreditCard addCreditCard(CreditCard creditCard) {
		System.out.println("Hello From addCreditCard with value " + creditCard);
		LocalTime time = LocalTime.now();
		String a = Integer.toString(time.getNano()/100000);
		String b = Integer.toString(time.getSecond());
		int ID = Integer.parseInt(b+a);
		creditCard.setCardId(ID);
		CreditCard res = dao.save(creditCard);
		return res;
	}

	@Override
	public CreditCard removeCreditCard(long cardId) {
		System.out.println("Hello From removeCreditCard with value " + cardId);
		dao.deleteById(cardId);
		return null;
	}

	@Override
	public CreditCard updateCreditCard(long cardId, CreditCard card) {
		System.out.println("Hello From updateCreditCard with ID " + cardId + " card value " + card);
		long id = card.getCardId();
		CreditCard c = dao.findById(id).get();
		
		CreditCard result = null;
		
		if(c.getCardId() == card.getCardId()) {
			result = dao.save(card);
		}
		return result;
	}

	@Override
	public CreditCard getCreditCard(long cardId) {
		System.out.println("Hello From getCreditCard with ID " + cardId);
		Optional<CreditCard> result = dao.findById(cardId);
		return result.get();
	}

	@Override
	public List<CreditCard> getAllCreditCards() {
		System.out.println("Hello From getAllCreditCards");
		List<CreditCard> result = dao.findAll();
		return result;
	}

}
