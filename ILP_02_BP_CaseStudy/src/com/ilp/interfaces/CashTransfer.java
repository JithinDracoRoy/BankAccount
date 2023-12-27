package com.ilp.interfaces;

import com.ilp.entity.Account;

public interface CashTransfer {

	public Account withdrawMoney(Account account);
	public Account depositMoney(Account account);
}
