package com.tnsif.daysixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet - It is unordered, unsorted set
		HashSet<String>  courses=new HashSet<String>();
		System.out.println(courses.add("Engineering"));
		courses.add("MCA Engineering");
		courses.add("Pharmacy");
		courses.add("MBA");
		System.out.println(courses.add("Engineering"));
		System.out.println(courses);
		
		System.out.println(courses.size());
		Iterator<String> it=courses.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println(courses.remove("MBA")?"Course removed":"Course not found");
		System.out.println(courses);
		
		System.out.println("---------------------------------");
		HashSet<Integer> hsOne=new HashSet<Integer>();
		hsOne.add(20);
		hsOne.add(10);
		hsOne.add(70);
		hsOne.add(200);
		hsOne.add(90);
		
		HashSet<Integer> hsTwo=new HashSet<Integer>();
		hsTwo.add(20);
		hsTwo.add(11);
		hsTwo.add(71);
		hsTwo.add(201);
		hsTwo.add(90);
		
		System.out.println("First Set : "+hsOne);
		System.out.println("Second Set : "+hsTwo);
		hsOne.addAll(hsTwo);
		System.out.println("Union of Two Sets");
		System.out.println("Resultant Set : "+hsOne);
		
		hsOne.clear();
		hsOne.add(20);
		hsOne.add(10);
		hsOne.add(70);
		hsOne.add(200);
		hsOne.add(90);
		
		
		System.out.println("First Set : "+hsOne);
		System.out.println("Second Set : "+hsTwo);
		hsOne.removeAll(hsTwo);
		System.out.println("Difference of Two Sets");
		System.out.println("Resultant Set : "+hsOne);

		hsOne.clear();
		hsOne.add(20);
		hsOne.add(10);
		hsOne.add(70);
		hsOne.add(200);
		hsOne.add(90);
		hsOne.add(null);
		
		
		System.out.println("First Set : "+hsOne);
		System.out.println("Second Set : "+hsTwo);
		hsOne.retainAll(hsTwo);
		System.out.println("Intersection of Two Sets");
		System.out.println("Resultant Set : "+hsOne);
		
		//Collections.sort(hsTwo); CTE- HashSet cannot sort directly
		ArrayList<Integer> list=new ArrayList<Integer>(hsTwo);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Second Set "+hsTwo);
	}

}
