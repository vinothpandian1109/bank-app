package com.bank.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.app.dao.AccountRepository;
import com.bank.app.entity.Account;

/*** 
 * Account Service acts as business layer of account
 * 
 * @author Vinothpandian P
 */

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;

	/*** 
	 * getAccountDetails is used to get the account details
	 * 
	 * @return String
	 */
	
	public List<Account> getAccountDetails() {
		return accountRepository.findAll();
	}

}
