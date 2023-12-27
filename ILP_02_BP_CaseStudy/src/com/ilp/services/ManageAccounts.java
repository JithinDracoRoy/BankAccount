package com.ilp.services;

import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;

public class ManageAccounts {

	@SuppressWarnings("resource")
	public static Customer manageAccount(Customer customer) {
		Scanner scanner = new Scanner(System.in);	
		int flag=0;
		int manageChoice;
		char repeatManage='y';
		char repeatAccount='y';
		System.out.print("Enter Customer Code : ");
		String customerCode=scanner.nextLine();
		if(customerCode.equalsIgnoreCase(customer.getCustomerCode())==false) {
			System.out.println("No Such Customer");
			return customer;
		}
		do {
			System.out.print("Enter Account Number : ");
			String accountNumber=scanner.nextLine();
			for(Account account : customer.getAccountList()) {
				if(accountNumber.equalsIgnoreCase(account.getAccountNo())) {
					flag=1;
					do {
						System.out.println("*****************Manage Account*****************");
						System.out.print("1)Deposit\n2)Withdraw\n3)Display Balance\nEnter Choice Number : ");
						manageChoice=scanner.nextInt();
						switch(manageChoice) {
						case 1 : account.getProduct().depositMoney(account);
							break;
						case 2 : account.getProduct().withdrawMoney(account);
							break;
						case 3 : System.out.println("Account Number : "+account.getAccountNo());
								 System.out.println("Account Balance : "+account.getBalanace());
							break;
						default : 
						}
						System.out.print("Do You Want To Change More (y/n) : ");
						repeatManage=scanner.next().charAt(0);
					}while(repeatManage=='y');
				}
			}
			if(flag==0) {
				System.out.println("Account Not Found");
			}
			System.out.print("Do you Want To Manage more account (y/n) : ");
			repeatAccount = scanner.next().charAt(0);
		}while(repeatAccount=='y');
		return customer;
	}
}
