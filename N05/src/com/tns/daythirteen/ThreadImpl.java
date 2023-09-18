package com.tns.daythirteen;

public class ThreadImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++)
		{
			System.out.print(Thread.currentThread().getName()+" : "+i + "\t");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
