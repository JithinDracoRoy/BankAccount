package com.ilp.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Customer;
import com.ilp.entity.Product;
import com.ilp.entity.Service;
import com.ilp.services.CreateCustomer;
import com.ilp.services.CreateProducts;
import com.ilp.services.CreateServices;
import com.ilp.services.DisplayCustomer;
import com.ilp.services.ManageAccounts;

public class Bank {

	@SuppressWarnings({ "resource" })
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int mainMenuChoice;
		char repeat='y';
		ArrayList<Service> serviceList =new ArrayList<Service>();
		ArrayList<Product> productList=new ArrayList<Product>();
		Customer customer= null;
		do {
			System.out.println("**********WELCOME TO BANK************");
			System.out.print("1)Create Service\n2)Create Product\n3)Create Customer\n4)Manage Accounts\n5)Display Customer\n6)Exit\nEnter Your Choice Number : ");
			mainMenuChoice=scanner.nextInt();
			switch(mainMenuChoice) {
			case 1 : serviceList=CreateServices.createServices();
				break;
			case 2 : productList=CreateProducts.createProduct(serviceList);
				break;
			case 3 : customer=CreateCustomer.createCustomer(productList);
				break;
			case 4 : customer=ManageAccounts.manageAccount(customer);
				break;
			case 5 : DisplayCustomer.displayCustomer(customer);
				break;
			case 6 : System.exit(0);
				break;
			default:
					System.out.println("Wrong Choice Choose Again");
			}
			System.out.print("Do You Want To Go To Main Menu (y/n) ? : ");
			repeat=scanner.next().charAt(0);
		}while(repeat=='y');
	}
}
