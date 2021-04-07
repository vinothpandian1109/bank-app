package com.bank.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.entity.Account;
import com.bank.app.service.AccountService;

/*** 
 * AccountController is the presentation layer of account
 * 
 * @author Vinothpandian P
 *
 */

@RestController
@RequestMapping(path = "/account")
public class AccountController {


	@Autowired
	private AccountService accountService;

	
	/*** 
	 * getAccountDetails is used to get the account details
	 * 
	 * @return String
	 */
	
	@GetMapping("/details")
	public List<Account> getAccountDetails() {
		return accountService.getAccountDetails();
	}

}
