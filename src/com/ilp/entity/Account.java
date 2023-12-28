package com.ilp.entity;

public class Account {

	private String accountNumber;
	private String accountName;
	private double accountBalance;
	private Product product = null;

	public Account(String accountNumber, String accountName, double accountBalance, Product product) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.product = product;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
