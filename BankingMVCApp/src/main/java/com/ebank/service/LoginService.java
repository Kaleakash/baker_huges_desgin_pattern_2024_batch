package com.ebank.service;

import com.ebank.bean.Account;
import com.ebank.bean.Login;
import com.ebank.dao.AccountDao;
import com.ebank.dao.LoginDao;

public class LoginService {

	LoginDao ld = new LoginDao();
	
	public String signIn(Login login) {
		StringBuffer sb = new StringBuffer(login.getPassword());
		String reversePassword  = sb.reverse().toString();
		login.setPassword(reversePassword);
		
		if(ld.singIn(login)) {
			
			if(login.getTypeofuser().equals("Manager")) {
				return "successfully login by manager";
			}else {
				return "successfully login by customer";
			}
			
		}else {
			return "failure try once again";
		}
		
	}
	
	public String signUp(Login login) {
		StringBuffer sb = new StringBuffer(login.getPassword());
		String reversePassword  = sb.reverse().toString();
		login.setPassword(reversePassword);
		if(ld.singUp(login)>0) {
			
			if(login.getTypeofuser().equals("Customer")) {
				
				Account acc = new Account();
				acc.setEmailid(login.getEmailid());
				acc.setAmount(1000);
				
				AccountDao ad = new AccountDao();
				
				if(ad.createAccount(acc)>0) {
					return "Account created successfully";
				}else {
					return "Account didn't create";
				}
			}else {
				return "Account created successfully";
			}
			
		}else {
			return "Account didn't create, Email id already exists";
		}
	}
}
