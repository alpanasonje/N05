package com.tns.daythirteen;

public class Operations {
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
}
