package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Service;

public class DisplayCustomer {

	@SuppressWarnings("resource")
	public static void displayCustomer(ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		int flagCustomer = 0;
		System.out.print("Enter Customer Code : ");
		String customerCode = scanner.nextLine();
		for (Customer customer : customerList) {
			if (customerCode.equalsIgnoreCase(customer.getCustomerCode())) {
				flagCustomer = 1;
				System.out.println("*************Customer Details**************");
				System.out.println("Customer Code : " + customer.getCustomerCode());
				System.out.println("Customer Name : " + customer.getCustomerName());
				for (Account account : customer.getAccountList()) {
					System.out.println("Account Number : " + account.getAccountNumber());
					System.out.println("Account Name : " + account.getAccountName());
					System.out.println("Account Balance : " + account.getAccountBalance());
					System.out.println("Product Code : " + account.getProduct().getProductCode());
					System.out.println("Product Name : " + account.getProduct().getProductName());
					System.out.print("Service : ");
					for (Service service : account.getProduct().getServiceList()) {
						System.out.print(service.getServiceName() + " ");
					}
					System.out.println("");
				}
			}
		}
		if (flagCustomer == 0) {
			System.out.println("No Such Customer Exist");
		}
	}
}
