package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.CurrentAccount;
import com.ilp.entity.LoanAccount;
import com.ilp.entity.Product;
import com.ilp.entity.SavingsMaxAccount;
import com.ilp.entity.Service;

public class CreateProducts {

	@SuppressWarnings({ "resource" })
	public static ArrayList<Product> createProduct(ArrayList<Service> serviceList) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Service> newServiceList = new ArrayList<Service>();
		int no = 1;
		char repeatService = 'y';
		char repeatProduct = 'y';
		char minimumChange = 'y';
		String productCode;
		String productName;
		do {
			System.out.println("*******************Create Product**********************");
			System.out.print("Enter The Product Code : ");
			productCode=scanner.nextLine();
			System.out.print("Enter The Product Name : ");
			productName=scanner.nextLine();
			do {
				System.out.println("These Are The Current Services");
				System.out.println("Service No\tService Code\tService Name\tService Rate");
				for (Service service : serviceList)
					System.out.println((no++) + "\t\t" + service.getServiceCode() + "\t\t" + service.getServiceName()
							+ "\t\t" + service.getRate());
				System.out.print("What Service Would You Like To Use (Enter No) :");
				newServiceList.add(serviceList.get((scanner.nextInt()) - 1));
				System.out.print("Do You Want To Add More Services (y/n) : ");
				repeatService = scanner.next().charAt(0);
			} while (repeatService == 'y');
			if (productName.equalsIgnoreCase("Savings Max Account")) {
				SavingsMaxAccount savingsMaxAccount = new SavingsMaxAccount(productCode,
						productName, newServiceList, 0);
				System.out.print("By Default Minimum For Savings Max is 1000, Do You Want To Change It (y/n) : ");
				minimumChange = scanner.next().charAt(0);
				if (minimumChange == 'y') {
					System.out.print("Enter New Mininmum Balance : ");
					savingsMaxAccount.setMinimumBalance(scanner.nextDouble());
				} else
					savingsMaxAccount.setMinimumBalance(1000);
				productList.add(savingsMaxAccount);
			} else if (productName.equalsIgnoreCase("Loan Account")) {
				LoanAccount loanAccount = new LoanAccount(productCode, productName,
						newServiceList);
				productList.add(loanAccount);
			} else {
				CurrentAccount currentAccount = new CurrentAccount(productCode, productName,
						newServiceList);
				productList.add(currentAccount);
			}
			System.out.print("Do You Want To Add More Products (y/n) : ");
			repeatProduct = scanner.next().charAt(0);
		} while (repeatProduct == 'y');
		return productList;
	}
}
