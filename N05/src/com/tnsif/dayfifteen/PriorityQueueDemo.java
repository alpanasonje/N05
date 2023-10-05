package com.tnsif.dayfifteen;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> aqueue = new PriorityQueue<Integer>();
		aqueue.add(40);
		aqueue.add(70);
		aqueue.add(20);
		aqueue.add(50);
		aqueue.add(80);
		aqueue.add(10);
		System.out.println(aqueue);
			
		System.out.println("Size : "+aqueue.size());
		System.out.println("is Queue Empty : "+aqueue.isEmpty());
		System.out.println("Element to be remove : "+aqueue.peek());
		
		while(!aqueue.isEmpty())
		{
			System.out.println(aqueue.remove()+" removed");
		}
		System.out.println(aqueue);
	}

}
