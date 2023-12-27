package com.ilp.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class CurrentAccount extends Product {

	public CurrentAccount(String productCode, String productName, ArrayList<Service> serviceList) {
		super(productCode, productName, serviceList);
	}


	@SuppressWarnings("resource")
	@Override
	public Account withdrawMoney(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amount To Withdraw : ");
		double money = scanner.nextDouble();
		if(money>account.getBalanace())
			System.out.println("Not Enough Balance");
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
