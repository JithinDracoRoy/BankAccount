package com.ilp.services;

import java.util.Scanner;

import com.ilp.entity.Account;

@SuppressWarnings("resource")
public class TransactionServices {

	public static Account withdrawMoneySavings(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amount To Withdraw : ");
		double money = scanner.nextDouble();
		if (money > account.getAccountBalance())
			System.out.println("Not Enough Balance");
		else if (account.getAccountBalance() - money < 1000)
			System.out.println("Balance Cannot Go Below Minimum");
		else
			account.setAccountBalance(account.getAccountBalance() - money);
		return account;
	}

	public static Account depositMoneySavings(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amount To Deposit : ");
		double money = scanner.nextDouble();
		account.setAccountBalance(money + account.getAccountBalance());
		return account;
	}

	public static Account withdrawMoneyLoan(Account account) {
		System.out.println("You Cannot Withdraw Money From Loan Account ");
		return account;
	}

	public static Account depositMoneyLoan(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1)Cash\n2)Cheque\nWhat Kind Of Deposit (Enter Number) : ");
		int choice = scanner.nextInt();
		System.out.print("Enter Amount To Deposit : ");
		double money = scanner.nextDouble();
		if (choice == 2)
			money = money * 0.97;
		account.setAccountBalance(money + account.getAccountBalance());
		return account;
	}

	public static Account withdrawMoneyCurrent(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amount To Withdraw : ");
		double money = scanner.nextDouble();
		if (money > account.getAccountBalance())
			System.out.println("Not Enough Balance");
		else
			account.setAccountBalance(account.getAccountBalance() - money);
		return account;
	}

	public static Account depositMoneyCurrent(Account account) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amount To Deposit : ");
		double money = scanner.nextDouble();
		account.setAccountBalance(money + account.getAccountBalance());
		return account;
	}

}
