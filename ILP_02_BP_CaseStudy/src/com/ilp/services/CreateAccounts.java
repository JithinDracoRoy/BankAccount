package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Account;
import com.ilp.entity.Product;
import com.ilp.entity.Service;

public class CreateAccounts {
	
	@SuppressWarnings({ "null", "resource" })
	public static ArrayList<Account> createAccounts(ArrayList<Product> productList){
		Scanner scanner = new Scanner(System.in);
		ArrayList<Account> accountList=new ArrayList<Account>();
		Account account = new Account("","",0,null);
		char repeatAccount='y';
		do {
			int no =1;
			System.out.println("******************Create Account*************************");
			System.out.print("Enter Account Number : ");
			account.setAccountNo(scanner.nextLine());
			System.out.print("Enter Account Name : ");
			account.setAccountName(scanner.nextLine());
			System.out.print("Enter Account Balance : ");
			account.setBalanace(scanner.nextDouble());
			System.out.println("These Are The Available Products : ");
			System.out.println("No\tProduct Code\tProduct Name\tServices");
			for(Product product : productList) {
				System.out.print((no++)+"\t"+product.getProductCode()+"\t\t"+product.getProductName());
				for(Service service : product.getServiceList())
					System.out.print(service.getServiceName()+" ");
				System.out.println(" ");
			}
			System.out.println("Enter Product No : ");
			account.setProduct(productList.get((scanner.nextInt())-1));
			accountList.add(account);
			System.out.print("Do you Want To Add More Accounts (y/n) : ");
			repeatAccount=scanner.next().charAt(0);
		}while(repeatAccount=='y');
		return accountList;
	}
}
