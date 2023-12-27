package com.ilp.services;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Service;

public class DisplayCustomer {

	public static void displayCustomer(Customer customer) {
		System.out.println("*************Customer Details**************");
		System.out.println("Customer Code : " + customer.getCustomerCode());
		System.out.println("Customer Name : " + customer.getCustomerName());
		for (Account account : customer.getAccountList()) {
			System.out.println("Account Number : " + account.getAccountNo());
			System.out.println("Account Name : " + account.getAccountName());
			System.out.println("Account Balance : " + account.getBalanace());
			System.out.println("Product Code : "+account.getProduct().getProductCode());
			System.out.println("Product Name : "+account.getProduct().getProductName());
			System.out.print("Service : ");
			for(Service service : account.getProduct().getServiceList()) {
				System.out.print(service.getServiceName()+" ");
			}
			System.out.println("");
		}
	}
}
