package com.tnsif.dayfourteen.threadsynchronization;

public interface Bank {	
	int DEPOSIT_LIMIT=25000;
	static final int MINIMUM_BALANCE=1000;
	public abstract void deposit(int amount) throws DepositLimitExceedsException ;
	void withdraw(int amount) throws InsufficientBalanceException ;	
}
