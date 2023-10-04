//Program to demonstrate Heterogeneous List
package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Executor {
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		@SuppressWarnings("rawtypes")
		List listOne=new ArrayList();
		listOne.add(10);
		listOne.add(true);
		listOne.add(34.78f);
		listOne.add("Hello");
		listOne.add(new String("Hi"));
		
		System.out.println(listOne);
		
		//ClassCastException
		Collections.sort(listOne);
		
	}
}
