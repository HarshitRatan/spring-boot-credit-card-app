package com.ibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bean.CreditCard;
import com.ibm.service.ICreditCardService;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {
	
	@Autowired
	ICreditCardService service;
	
	@GetMapping("/getallCreditCard")
	public ResponseEntity<List<CreditCard>> getAllCreditCard() {
		try {
			List<CreditCard> allCreditCard = service.getAllCreditCards();
			return ResponseEntity.of(Optional.of(allCreditCard));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();
		}
	}
	
	@GetMapping("/getCreditCardById/{cid}")
	public ResponseEntity<CreditCard> getCreditCardById(@PathVariable("cid") long id) {
		try {
			CreditCard creditCard = service.getCreditCard(id);
			return ResponseEntity.of(Optional.of(creditCard));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@PostMapping("/addCreditCard")
	public ResponseEntity<CreditCard> addCreditCard(@RequestBody CreditCard creditCard) {
		try {
			CreditCard res = service.addCreditCard(creditCard);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PutMapping("/updateCreditCard/{cid}")
	public ResponseEntity<CreditCard> updateCustomer(@PathVariable("cid") long id, @RequestBody CreditCard creditCard) {
		try {
			creditCard.setCardId((long) id);
			CreditCard res = service.updateCreditCard(id, creditCard);
			return ResponseEntity.of(Optional.of(res));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping("/delete/{cid}")
	public ResponseEntity<Object> deleteCreditCard(@PathVariable("cid") long id) {
		try {
			service.removeCreditCard(id);
			return ResponseEntity.accepted().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
