package com.tnsif.dayfourteen.threadsynchronization;

public class Executor {

	public static void main(String[] args) {

		Account acc = new Account(111, "Amit", 12000);
		AccountThread threadOne=new AccountThread(acc,8000);
		AccountThread threadTwo=new AccountThread(acc,5000);
		threadOne.start();
		threadTwo.start();
		System.out.println(acc);
		/*
		 * try { System.out.println(acc); acc.deposit(7000); System.out.println(acc);
		 * acc.withdraw(22000); System.out.println(acc); } catch
		 * (DepositLimitExceedsException e) { System.out.println(e.getMessage()); }
		 * catch (InsufficientBalanceException e) { System.out.println(e.getMessage());
		 * }
		 */

	}

}
