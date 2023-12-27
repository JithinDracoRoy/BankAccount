package com.ilp.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class SavingsMaxAccount extends Product {

	private double minimumBalance;
	public SavingsMaxAccount(String productCode, String productName, ArrayList<Service> serviceList, double minimumBalance) {
		super(productCode, productName, serviceList);
		this.minimumBalance=minimumBalance;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	@SuppressWarnings("resource")
	@Override
	public Account withdrawMoney(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amount To Withdraw : ");
		double money = scanner.nextDouble();
		if(money>account.getBalanace())
			System.out.println("Not Enough Balance");
		else if(account.getBalanace()-money<1000)
			System.out.println("Balance Cannot Go Below Minimum");
		else 
			account.setBalanace(account.getBalanace()-money);
		return account;
	}
	@SuppressWarnings("resource")
	@Override
	public Account depositMoney(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amount To Deposit : ");
		double money = scanner.nextDouble();
		account.setBalanace(money+account.getBalanace());
		return account;
	}

}
