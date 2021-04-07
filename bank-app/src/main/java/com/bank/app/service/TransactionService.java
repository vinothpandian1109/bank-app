package com.bank.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.app.dao.TransacationRepository;
import com.bank.app.entity.Account;
import com.bank.app.entity.Transacation;

/*** 
 * TransactionService acts as business layer of transaction
 * 
 * @author Vinothpandian P
 */

@Service
public class TransactionService {
	
	@Autowired
	TransacationRepository transacationRepository;

	/*** 
	 * getTransactionDetails is used to get the transaction details
	 * 
	 * @return transactionList
	 */
	
	public List<Transacation> getTransactionDetails() {
		return transacationRepository.findAll();
	}

}
