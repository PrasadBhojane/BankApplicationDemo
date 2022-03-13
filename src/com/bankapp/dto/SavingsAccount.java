package com.bankapp.dto;

public class SavingsAccount {

	private int balance;
	private int previousTransaction;
	private String customerName;
	private String customerID;

	public SavingsAccount(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPreviousTransaction() {
		return previousTransaction;
	}

	public void setPreviousTransaction(int previousTransaction) {
		this.previousTransaction = previousTransaction;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}	
}
