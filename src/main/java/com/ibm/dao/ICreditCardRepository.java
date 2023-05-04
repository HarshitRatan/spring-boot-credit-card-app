package com.ibm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ibm.bean.CreditCard;

@Component
public interface ICreditCardRepository extends JpaRepository<CreditCard, Long> {
//	public CreditCard addCreditCard(CreditCard creditCard);
//	public CreditCard removeCreditCard(long cardId);
//	public CreditCard updateCreditCard(long cardId, CreditCard card);
//	public CreditCard getCreditCard(long cardId);
//	public List<CreditCard> getAllCreditCards(); 


}
