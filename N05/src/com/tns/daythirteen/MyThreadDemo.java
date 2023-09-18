package com.tns.daythirteen;

public class MyThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyChildThread threadOne, threadTwo;
		threadOne= new MyChildThread();
		threadTwo= new MyChildThread();
		threadOne.join();
		threadTwo.join();
		
		System.out.println("-----------End of main()-----------");
		System.out.println("is "+Thread.currentThread().getName()+" alive? "+Thread.currentThread().isAlive());
		System.out.println("is "+threadOne.getName()+" alive? "+threadOne.isAlive());
	}

}
