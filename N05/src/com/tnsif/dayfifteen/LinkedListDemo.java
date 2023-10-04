package com.tnsif.dayfifteen;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String args[])
	{
		LinkedList<String> strList=new LinkedList<String>();
		strList.add("Pooja");
		strList.add("Zashi");
		strList.add("Sharad");
		strList.add("Ankit");
		strList.add("Dhruv");
		
		System.out.println(strList);
		strList.addFirst("Neha");
		strList.addLast("Sanskruti");
		System.out.println(strList);
		System.out.println("First Element : "+strList.getFirst());
		System.out.println("Last Element : "+strList.getLast());
		
		System.out.println(strList.remove(2)+" removed ");
		System.out.println("Is Pooja removed from list? "+strList.remove("Pooja"));
		strList.removeFirst();
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		System.out.println("--------------------------");
		/*ListIterator<String> listIt=strList.listIterator();
		
		 * while(listIt.hasNext()) { System.out.println(listIt.next().toUpperCase()); }
		 */
		System.out.println("--------------------------");
		
		System.out.println(strList);
		ListIterator<String> listIt=strList.listIterator(strList.size());
		while(listIt.hasPrevious())
		{
			System.out.println(listIt.previous().toLowerCase());
		}
	}
}
