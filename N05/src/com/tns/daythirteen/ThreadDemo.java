package com.tns.daythirteen;

public class ThreadDemo {

	
	public static void main(String[] args) {
			
		System.out.println("In main "+Thread.currentThread());
		/* printOdd(); */
		ChildThread t1=new ChildThread();
		t1.start();
		ChildThread t2=new ChildThread();
		t2.start();
		ChildThread t3=new ChildThread();
		t3.start();
	}

}
