package com.tns.daythirteen;

public class MyChildThread extends Thread {
	//Constructor
	public MyChildThread() {
		start();
	}

	@Override
	public void run() {
		System.out.println("This is task of child thread...." + Thread.currentThread());
		System.out.println("Is "+Thread.currentThread().getName()+" alive? "+Thread.currentThread().isAlive());
		Operations.printOdd();
	}

}
