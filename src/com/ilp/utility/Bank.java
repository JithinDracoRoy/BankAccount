package com.ilp.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Service;
import com.ilp.services.CreateCustomer;
import com.ilp.services.CreateProducts;
import com.ilp.services.CreateServices;
import com.ilp.services.DeleteCustomer;
import com.ilp.services.DeleteProduct;
import com.ilp.services.DeleteService;
import com.ilp.services.DisplayCustomer;
import com.ilp.services.ManageAccounts;
import com.ilp.services.ManageCustomers;

public class Bank {

	@SuppressWarnings({ "resource" })
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int mainMenuChoice;
		char repeat = 'y';
		ArrayList<Service> serviceList = new ArrayList<Service>();
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		do {
			System.out.println("**********WELCOME TO BANK************");
			System.out.print(
					"1)Create Service\n2)Create Product\n3)Create Customer\n4)Manage Accounts\n5)Display Customer\n6)Manage Customers\n7)Delete Service\n8)Delete Product\n9)Delete Custormer\n10)Exit\nEnter Your Choice Number : ");
			mainMenuChoice = scanner.nextInt();
			switch (mainMenuChoice) {
			case 1:
				serviceList = CreateServices.createServices(serviceList);
				break;
			case 2:
				productList = CreateProducts.createProduct(serviceList,productList);
				break;
			case 3:
				customerList.add(CreateCustomer.createCustomer(productList));
				break;
			case 4:
				customerList = ManageAccounts.manageAccount(customerList);
				break;
			case 5:
				DisplayCustomer.displayCustomer(customerList);
				break;
			case 6:
				customerList=ManageCustomers.manageCustomer(customerList);
			case 7:
				serviceList = DeleteService.deleteService(serviceList);
				break;
			case 8:
				productList = DeleteProduct.deleteProduct(productList);
				break;
			case 9:
				customerList = DeleteCustomer.deleteCustomer(customerList);
				break;
			case 10:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice Choose Again");
			}
			System.out.print("Do You Want To Go To Main Menu (y/n) ? : ");
			repeat = scanner.next().charAt(0);
		} while (repeat == 'y');
	}
}
