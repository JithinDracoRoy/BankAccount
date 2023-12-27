package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Product;

public class CreateCustomer {
	
	@SuppressWarnings({ "resource", "null" })
	public static Customer createCustomer(ArrayList<Product> productList) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList = new ArrayList<Account>();
		Customer customer=new Customer("","",null);
		System.out.println("******************Create Customer*********************");
		System.out.print("Enter Customer Code : ");
		customer.setCustomerCode(scanner.nextLine());
		System.out.print("Enter Customer Name : ");
		customer.setCustomerName(scanner.nextLine());
		accountList=CreateAccounts.createAccounts(productList);
		customer.setAccountList(accountList);
		return customer;
	}
}
