package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Service;

public class DeleteService {
	@SuppressWarnings("resource")
	public static ArrayList<Service> deleteService(ArrayList<Service> serviceList) {
		Scanner scanner = new Scanner(System.in);
		char repeatService = 'y';
		do {
			int no = 1;
			System.out.println("These Are The Current Services");
			System.out.println("Service No\tService Code\tService Name\tService Rate");
			for (Service service : serviceList)
				System.out.println((no++) + "\t\t" + service.getServiceCode() + "\t\t" + service.getServiceName()
						+ "\t\t" + service.getServiceRate());
			System.out.print("What Service Would You Like To Delete (Enter No) :");
			serviceList.remove((scanner.nextInt()) - 1);
			System.out.print("Do You Want To Remove More Services (y/n) : ");
			repeatService = scanner.next().charAt(0);
		} while (repeatService == 'y');
		return serviceList;
	}

	@SuppressWarnings("resource")
	public static ArrayList<Customer> deleteExistingService(ArrayList<Customer> customerList) {
		Scanner scanner = new Scanner(System.in);
		String customerCode;
		String accountNumber;
		char repeatService;
		int serviceNumber;
		int customerFlag = 0;
		int accountFlag = 0;
		int no;
		System.out.print("Enter Customer Code : ");
		customerCode = scanner.nextLine();
		for (Customer customer : customerList) {
			if (customer.getCustomerCode().equalsIgnoreCase(customerCode)) {
				customerFlag = 1;
				System.out.print("Enter Account Number : ");
				accountNumber = scanner.nextLine();
				for (Account account : customer.getAccountList()) {
					if (account.getAccountNumber().equalsIgnoreCase(accountNumber)) {
						accountFlag = 1;
						do {
							no = 1;
							System.out.println("These Are The Services Available To This Account");
							System.out.println("Service No\tService Code\tService name\tService Rate");
							for (Service service : account.getProduct().getServiceList()) {
								System.out.println((no++) + "\t\t" + service.getServiceCode() + "\t\t"
										+ service.getServiceName() + "\t\t" + service.getServiceRate());
							}
							System.out.print("Enter Service No to Delete : ");
							serviceNumber = scanner.nextInt();
							account.getProduct().getServiceList().remove(serviceNumber - 1);
							System.out.println("Do You Want To Delete More Services : ");
							repeatService = scanner.next().charAt(0);
						} while (repeatService == 'y');
					}
				}
				if (accountFlag == 0) {
					System.out.println("Account Not Found");
				}
			}
		}
		if (customerFlag == 0) {
			System.out.println("Customer Not Found");
		}
		return customerList;
	}
}
