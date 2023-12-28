package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Customer;

public class DeleteCustomer {

	@SuppressWarnings("resource")
	public static ArrayList<Customer> deleteCustomer(ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		char repeatCustomer = 'y';
		do {
			int no = 1;
			System.out.println("These Are The Current Customers");
			System.out.println("Customer No\tCustomer Code\tCustomer Name");
			for (Customer customer : customerList)
				System.out.print((no++) + "\t\t" + customer.getCustomerCode() + "\t\t" + customer.getCustomerName());
			System.out.print("What Customer Would You Like To Delete (Enter No) :");
			customerList.remove((scanner.nextInt()) - 1);
			System.out.print("Do You Want To Remove More Customers (y/n) : ");
			repeatCustomer = scanner.next().charAt(0);
		} while (repeatCustomer == 'y');
		return customerList;
	}

	@SuppressWarnings("resource")
	public static ArrayList<Customer> deleteExistingCustomer(ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		int customerNumber;
		char repeatCustomer;
		do {
			int no = 1;
			System.out.println("These Are The Current Customers");
			System.out.println("Customer No\tCustomer Code\tCustomer Name");
			for (Customer customer : customerList) {
				System.out.println((no++) + "\t\t" + customer.getCustomerCode() + "\t\t" + customer.getCustomerName());
			}
			System.out.println("Enter Customer No To Delete : ");
			customerNumber = scanner.nextInt();
			customerList.remove(customerNumber - 1);
			System.out.println("Do You Want To Delete More Customers (y/n) : ");
			repeatCustomer = scanner.next().charAt(0);
		} while (repeatCustomer == 'y');
		return customerList;
	}
}
