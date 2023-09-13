package com.tns.daythirteen;

public class ThreadDemo {

	static void printHello()
	{
		System.out.println();
		for(int i=1;i<=2;i++)
			
			System.out.println("within printHello : "+Thread.currentThread()+" Hello");
	}
	
	static void printOdd()
	{
		for(int i=1;i<=10;i+=2)
			System.out.println(i);
		System.out.println("printOdd "+Thread.currentThread());
	}
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
