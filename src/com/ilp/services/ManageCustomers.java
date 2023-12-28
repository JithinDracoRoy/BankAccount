package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Customer;

public class ManageCustomers {

	@SuppressWarnings("resource")
	public static ArrayList<Customer> manageCustomer(ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		int manageChoiceNumber;
		char repeatManage;
		do {
			System.out.println("*****************Manage Customer*****************");
			System.out.print(
					"1)Delete Existing Service\n2)Delete Existing Account/Product\n3)Add Account/Product\n4)Transfer Cash Between Customers\n5)Transfer Cash Between Accounts\nEnter Choice Number : ");
			manageChoiceNumber = scanner.nextInt();
			switch (manageChoiceNumber) {
			case 1: customerList=DeleteService.deleteExistingService(customerList);
				break;
			case 2: customerList=DeleteProduct.deleteExistingProduct(customerList);
				break;
			case 3: customerList=DeleteCustomer.deleteExistingCustomer(customerList);
				break;
			case 4:
				break;
			default:
				System.out.println("Wrong Choice Choose Again");
			}
			System.out.println("Do You Want To Manage More Customers : ");
			repeatManage = scanner.next().charAt(0);
		} while (repeatManage == 'y');
		return customerList;
	}
}
