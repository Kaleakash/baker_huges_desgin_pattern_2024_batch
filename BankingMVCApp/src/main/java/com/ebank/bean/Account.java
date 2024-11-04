package com.ebank.bean;

public class Account {
private int accno;
private String emailid;
private float amount;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int accno, String emailid, float amount) {
	super();
	this.accno = accno;
	this.emailid = emailid;
	this.amount = amount;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Account [accno=" + accno + ", emailid=" + emailid + ", amount=" + amount + "]";
}

}
