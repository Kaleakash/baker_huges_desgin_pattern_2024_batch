package com.ebank.service;

import java.util.List;

import com.ebank.bean.Account;
import com.ebank.dao.AccountDao;

public class AccountService {
	AccountDao ad = new AccountDao();
	
	public String withdrawn(Account account) {
		if(ad.withdrawn(account) > 0) {
			return "Withdrawn done successfully";
		}else {
			return "Withdrawn not done";
		}
	}
	
	public String deposite(Account account) {
		if(ad.deposite(account) > 0) {
			return "Deposite done successfully";
		}else {
			return "Deposite not done";
		}
	}
	
	public float checkBalance(String emailid) {
		return ad.checkBalance(emailid);
	}
	
	public List<Account> viewAllAccounts() {
		return ad.viewAllAccounts();
	}
}
