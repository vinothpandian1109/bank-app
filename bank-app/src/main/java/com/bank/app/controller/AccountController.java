package com.bank.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.service.AccountService;

@RestController
@RequestMapping(path = "/account")
public class AccountController {


	@Autowired
	private AccountService accountService;

	@GetMapping("/details")
	public String getAccountDetails() {
		return accountService.getAccountDetails();
	}

}
