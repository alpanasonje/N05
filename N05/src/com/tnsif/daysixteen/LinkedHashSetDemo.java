package com.tnsif.daysixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//LinkedHashSet- it is ordered set
		LinkedHashSet<String> cities=new LinkedHashSet<String>();
		cities.add("Nashik");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add(null);
		System.out.println(cities);

		//Collections.sort(cities); //CTE- LinkedHashSet cannot sort directly
		ArrayList<String> list=new ArrayList<String>(cities);
		Collections.sort(list);
		System.out.println(list);
		cities=new LinkedHashSet<String>(list);
		System.out.println(cities);
	}

}
