package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Service;

public class DeleteProduct {

	@SuppressWarnings("resource")
	public static ArrayList<Product> deleteProduct(ArrayList<Product> productList) {
		Scanner scanner = new Scanner(System.in);
		char repeatProduct = 'y';
		do {
			int no = 1;
			System.out.println("These Are The Current Services");
			System.out.println("Product No\tProduct Code\tProduct Name\tServices");
			for (Product product : productList) {
				System.out
						.print((no++) + "\t\t" + product.getProductCode() + "\t\t" + product.getProductName() + "\t\t");
				for (Service service : product.getServiceList())
					System.out.println(service.getServiceName() + " ");
			}
			System.out.print("What Product Would You Like To Delete (Enter No) :");
			productList.remove((scanner.nextInt()) - 1);
			System.out.print("Do You Want To Remove More Products (y/n) : ");
			repeatProduct = scanner.next().charAt(0);
		} while (repeatProduct == 'y');
		return productList;
	}

	@SuppressWarnings("resource")
	public static ArrayList<Customer> deleteExistingProduct(ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		String customerCode;
		char repeatAccount;
		int accountNumber;
		int customerFlag = 0;
		int no;
		System.out.print("Enter Customer Code : ");
		customerCode = scanner.nextLine();
		for (Customer customer : customerList) {
			if (customer.getCustomerCode().equalsIgnoreCase(customerCode)) {
				customerFlag = 1;
				do {
					System.out.println("These Are Available Accounts : ");
					no = 1;
					System.out.println("Account No\tAccount Code\tAccount Name");
					for (Account account : customer.getAccountList()) {
						System.out.println(
								(no++) + "\t\t" + account.getAccountNumber() + "\t\t" + account.getAccountName());
					}
					System.out.println("Enter Account No to Delete : ");
					accountNumber = scanner.nextInt();
					customer.getAccountList().remove(accountNumber - 1);
					System.out.print("Do You Want To Remove More Accounts (y/n) : ");
					repeatAccount = scanner.next().charAt(0);
				} while (repeatAccount == 'y');
			}
		}
		if (customerFlag == 0) {
			System.out.println("Customer Not Found");
		}
		return customerList;
	}
}
