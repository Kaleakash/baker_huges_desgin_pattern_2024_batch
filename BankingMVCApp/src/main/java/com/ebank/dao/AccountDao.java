package com.ebank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ebank.bean.Account;
import com.ebank.resource.DbResource;

public class AccountDao {

	public int createAccount(Account account) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into account(emailid,amount) values(?,?)");
			pstmt.setString(1, account.getEmailid());
			pstmt.setFloat(2, account.getAmount());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public float checkBalance(String emailid) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select amount from account where emailid=?");
			pstmt.setString(1, emailid.trim());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				float amount = rs.getFloat(1);
				System.out.println(amount);
				return amount;	
			}
		
		} catch (Exception e) {
			System.err.println(e);
		}
		return 0;
	}
	
	public int deposite(Account account) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("update account set amount = amount + ? where emailid=?");
			pstmt.setFloat(1, account.getAmount());
			pstmt.setString(2, account.getEmailid());
			return pstmt.executeUpdate();
		
		} catch (Exception e) {
			System.err.println(e);
		}
		return 0;
	}
	
	public int withdrawn(Account account) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("update account set amount = amount - ? where emailid=?");
			pstmt.setFloat(1, account.getAmount());
			pstmt.setString(2, account.getEmailid());
			return pstmt.executeUpdate();
		
		} catch (Exception e) {
			System.err.println(e);
		}
		return 0;
	}
	
	public List<Account> viewAllAccounts() {
	List<Account> listOfAccount = new ArrayList<Account>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from account");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Account acc = new Account();
				acc.setAccno(rs.getInt(1));
				acc.setEmailid(rs.getString(2));
				acc.setAmount(rs.getFloat(3));
				listOfAccount.add(acc);
			}
		
		} catch (Exception e) {
			System.err.println(e);
		}
		return listOfAccount;
	}
}
