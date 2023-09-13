package com.tns.daythirteen;

public class ChildThread extends Thread {

	public void run() {
		System.out.println("This is task of child thread...."+Thread.currentThread());
		ThreadDemo.printHello();
	}

}
