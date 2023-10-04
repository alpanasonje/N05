package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;

public class UserDefinedListDemo {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(101,"Nikita",56000,"Java Developer"));
		empList.add(new Employee(102,"Anita",66000,"Sr. Java Developer"));
		empList.add(new Employee(103,"Prajakta",35000,"Jr. Java Developer"));
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println(empList);
	}

}
