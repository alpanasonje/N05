package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserDefinedListDemo {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(111,"Nikita",56000,"Java Developer"));
		empList.add(new Employee(121,"Anita",66000,"Sr. Java Developer"));
		empList.add(new Employee(103,"Prajakta",35000,"Jr. Java Developer"));
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println(empList);
		
		System.out.println("-------------------------------");
		ArrayList<Emp> empListOne=new ArrayList<Emp>();
		empListOne.add(new Emp(111,"Nikita",56000,"Java Developer"));
		empListOne.add(new Emp(121,"Anita",66000,"Sr. Java Developer"));
		empListOne.add(new Emp(103,"Prajakta",35000,"Jr. Java Developer"));
		System.out.println(empListOne);
		Collections.sort(empListOne, new SortByName());
		System.out.println(empListOne);
		System.out.println("-------------------------------");
		
		Collections.sort(empListOne, new SortByDesignation());
		System.out.println(empListOne);
		System.out.println("-------------------------------");
		
		//Using Lambda Expression
		Comparator<Emp> compOne=(e2, e1)->{return (int)(e1.getSalary()-e2.getSalary());};
		Collections.sort(empListOne,compOne );
		System.out.println(empListOne);
		System.out.println("-------------------------------");
		
	}

}
