package com.ilp.entity;

import java.util.ArrayList;
import com.ilp.services.TransactionServices;

public class LoanAccount extends Product {

	final double chequeDepositCharge = 0.3;

	public LoanAccount(String productCode, String productName, ArrayList<Service> serviceList) {
		super(productCode, productName, serviceList);
	}

	public double getChequeDepositCharge() {
		return chequeDepositCharge;
	}

	@Override
	public Account withdrawMoney(Account account) {
		return TransactionServices.withdrawMoneyLoan(account);
	}

	@Override
	public Account depositMoney(Account account) {
		return TransactionServices.depositMoneyLoan(account);
	}

}
