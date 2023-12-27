package com.ilp.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class LoanAccount extends Product {
	
	final double chequeDepositCharge=0.3;

	public LoanAccount(String productCode, String productName, ArrayList<Service> serviceList) {
		super(productCode, productName, serviceList);
	}

	public double getChequeDepositCharge() {
		return chequeDepositCharge;
	}

	@Override
	public Account withdrawMoney(Account account) {
		System.out.println("You Cannot Withdraw Money From Loan Account ");
		return account;
	}

	@SuppressWarnings("resource")
	@Override
	public Account depositMoney(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1)Cash\n2)Cheque\nWhat Kind Of Deposit (Enter Number) : ");
		int choice = scanner.nextInt();
		System.out.print("Enter Amount To Deposit : ");
		double money = scanner.nextDouble();
		if(choice==2)
			money=money*0.97;
		account.setBalanace(money+account.getBalanace());
		return account;
	}
	
}
