package com.tnsif.dayfifteen;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> aqueue = new ArrayDeque<Integer>();
		aqueue.add(40);
		aqueue.add(70);
		aqueue.add(20);
		aqueue.add(80);
		System.out.println(aqueue);
		aqueue.addFirst(10);
		aqueue.addLast(100);
		System.out.println(aqueue);
		System.out.println("Size : "+aqueue.size());
		System.out.println("is Queue Empty : "+aqueue.isEmpty());
		System.out.println("Element to be remove : "+aqueue.peek());
		System.out.println("Element to be remove first is : "+aqueue.peekFirst());
		System.out.println("Element to be remove last is : "+aqueue.peekLast());
		System.out.println("First element is removed : "+aqueue.removeFirst());
		System.out.println("Last element is removed : "+aqueue.removeLast());
		System.out.println(aqueue);
		
		while(!aqueue.isEmpty())
		{
			System.out.println(aqueue.remove()+" removed");
		}
		System.out.println(aqueue);
	}

}
