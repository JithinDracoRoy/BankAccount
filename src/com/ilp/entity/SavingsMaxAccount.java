package com.ilp.entity;

import java.util.ArrayList;
import com.ilp.services.TransactionServices;

public class SavingsMaxAccount extends Product {

	private double minimumBalance;

	public SavingsMaxAccount(String productCode, String productName, ArrayList<Service> serviceList,
			double minimumBalance) {
		super(productCode, productName, serviceList);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	@Override
	public Account withdrawMoney(Account account) {
		return TransactionServices.withdrawMoneySavings(account);
	}

	@Override
	public Account depositMoney(Account account) {
		return TransactionServices.depositMoneySavings(account);
	}

}
