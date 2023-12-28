package com.ilp.entity;

import java.util.ArrayList;
import com.ilp.services.TransactionServices;

public class CurrentAccount extends Product {

	public CurrentAccount(String productCode, String productName, ArrayList<Service> serviceList) {
		super(productCode, productName, serviceList);
	}

	@Override
	public Account withdrawMoney(Account account) {
		return TransactionServices.withdrawMoneyCurrent(account);
	}

	@Override
	public Account depositMoney(Account account) {
		return TransactionServices.depositMoneyCurrent(account);
	}

}
