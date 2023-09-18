package com.tns.daythirteen;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//First way - using implementable class
		ThreadImpl implObj=new ThreadImpl();
		Thread threadOne=new Thread(implObj,"First");
		
		
		//Second way - anonymous class 
		Runnable obj=new Runnable() {
			
			@Override
			public void run() {
				char ch='a';
				for(int i=1;i<=26;i++,ch++)
				{
					System.out.print(Thread.currentThread().getName()+" : "+ch+"\t");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread threadTwo=new Thread(obj,"Second");
		
		
		//Third way - lambda expression
		
		Runnable object=()->
		{
			for(int i=1;i<=100;i+=2)
			{
				System.out.print(Thread.currentThread().getName()+" : "+i+"\t");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread threadThree=new Thread(object,"Third");
		
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		 
		Thread.sleep(1000);
		System.out.println("--------------------------------------");
	}

}
