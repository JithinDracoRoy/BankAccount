package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;

public class ManageAccounts {

	@SuppressWarnings("resource")
	public static ArrayList<Customer> manageAccount(ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		int flagAccount = 0;
		int flagCustomer = 0;
		int manageChoice;
		char repeatManage = 'y';
		char repeatAccount = 'y';
		System.out.print("Enter Customer Code : ");
		String customerCode = scanner.nextLine();
		for (Customer customer : customerList) {
			if (customer.getCustomerCode().equalsIgnoreCase(customerCode)) {
				flagCustomer = 1;
				do {
					System.out.print("Enter Account Number : ");
					String accountNumber = scanner.nextLine();
					for (Account account : customer.getAccountList()) {
						if (accountNumber.equalsIgnoreCase(account.getAccountNumber())) {
							flagAccount = 1;
							do {
								System.out.println("*****************Manage Account*****************");
								System.out.print("1)Deposit\n2)Withdraw\n3)Display Balance\nEnter Choice Number : ");
								manageChoice = scanner.nextInt();
								switch (manageChoice) {
								case 1:
									account.getProduct().depositMoney(account);
									break;
								case 2:
									account.getProduct().withdrawMoney(account);
									break;
								case 3:
									System.out.println("Account Number : " + account.getAccountNumber());
									System.out.println("Account Balance : " + account.getAccountBalance());
									break;
								default:
								}
								System.out.print("Do You Want To Manage More (y/n) : ");
								repeatManage = scanner.next().charAt(0);
							} while (repeatManage == 'y');
						}
					}
					if (flagAccount == 0) {
						System.out.println("Account Not Found");
					}
					System.out.print("Do You Want To Manage Any More Accounts (y/n) : ");
					repeatAccount = scanner.next().charAt(0);
				} while (repeatAccount == 'y');
			}
		}
		if (flagCustomer == 0) {
			System.out.println("Customer Not Found");
		}
		return customerList;
	}
}
