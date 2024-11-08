package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public List<Account> getAllAccount() {
		return accountRepository.findAll();
	}
	
	public String createAccount(Account account) {
		Optional<Account> result = accountRepository.findById(account.getAccno());
		if(result.isPresent()) {
			return "Account number is a unique";
		}else {
			accountRepository.save(account);
			return "Account created successfully";
		}
	}
	
	public String findBalance(int accno) {
		Optional<Account> result = accountRepository.findById(accno);
		System.out.println("Client send the reqeust");
		if(result.isPresent()) {
			Account ac = result.get();
			return "Account Balance amount "+ac.getAmount()+" with account as "+accno;
		}else {
			return "InValid account number";
		}
	}
}
