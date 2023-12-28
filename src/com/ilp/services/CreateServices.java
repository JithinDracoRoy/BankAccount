package com.ilp.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.ilp.entity.Service;

public class CreateServices {

	@SuppressWarnings({ "resource" })
	public static ArrayList<Service> createServices(ArrayList<Service> serviceList) {
		Service service = new Service("", "", 0);
		char repeat = 'y';
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("******************Create Service********************");
			System.out.print("Enter The Service Code : ");
			service.setServiceCode(scanner.nextLine());
			System.out.print("Enter The Service Name : ");
			service.setServiceName(scanner.nextLine());
			System.out.print("Enter The Service Rate : ");
			service.setServiceRate(scanner.nextDouble());
			serviceList.add(service);
			System.out.print("Do You Want To Add More Services (y/n)  : ");
			repeat = scanner.next().charAt(0);
		} while (repeat == 'y');
		return serviceList;
	}

}
