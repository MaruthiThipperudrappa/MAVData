package com.javaexpress.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaexpress.model.Account;
import com.javaexpress.repository.AccountsRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountsService {

	@Autowired
	private AccountsRepository accountsRepository;
	
	public Account fetchAccountDetails(int customerId) {
		log.info("AccountService -> Fetch Account Information from Database");
		Optional<Account> optional = accountsRepository.findByCustomerId(customerId);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	

}
