package com.tnsif.daysixteen;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet - it is a sorted set
		TreeSet<String> names=new TreeSet<String>();
		names.add("Kunal");
		names.add("Sneha");
		names.add(null);
		names.add("Ankush");
		names.add("Sagar");
		System.out.println(names);

	}

}
