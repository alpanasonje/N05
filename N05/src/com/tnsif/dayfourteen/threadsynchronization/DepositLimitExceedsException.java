package com.tnsif.dayfourteen.threadsynchronization;

public class DepositLimitExceedsException extends Exception {
	public DepositLimitExceedsException() {
		super("Deposit limit exceeded.....");
	}

	public DepositLimitExceedsException(String message) {
		super(message);
	}
}
