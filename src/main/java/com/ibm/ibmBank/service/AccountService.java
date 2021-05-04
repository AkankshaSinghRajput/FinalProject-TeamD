package com.ibm.ibmBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ibmBank.entity.Account;
import com.ibm.ibmBank.repo.AccountRepository;
@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository;

	public String createAccount(Account account) {
		Account savedAccount = accountRepository.save(account);
		return savedAccount.getId();
	}

}
