package com.tns.daythirteen;

public class Executor {

	public static void main(String[] args) {
		System.out.println("In main...."+Thread.currentThread());
		ChildThread t1=new ChildThread();
		t1.run(); //Application become single threaded 
		t1.run();
		t1.run();

	}

}
