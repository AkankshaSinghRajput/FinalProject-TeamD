package com.ibm.ibmBank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ibmBank.entity.Account;
import com.ibm.ibmBank.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@PostMapping("/account")
	String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	

}
