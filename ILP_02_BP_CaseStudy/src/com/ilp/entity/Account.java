package com.ilp.entity;

public class Account {
	
	private String accountNo;
	private String accountName;
	private double balanace;
	private Product product = null;
	
	public Account(String accountNo, String accountName, double balanace, Product product) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balanace = balanace;
		this.product = product;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalanace() {
		return balanace;
	}

	public void setBalanace(double balanace) {
		this.balanace = balanace;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
