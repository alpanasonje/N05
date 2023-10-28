package com.tnsif.daytwentytwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		 List<Integer> intList;
		  //creation of list from an array of integers List<Integer>
		  intList=Arrays.asList(4,7,2,9); System.out.println(intList);
		  
		  //create another list with squares of intList 
		  List<Integer> sqrList=new ArrayList<Integer>(); 
		  //for..each 
		  for(Integer no:intList) {
		  sqrList.add(no*no); } 
		  System.out.println(sqrList);
		  
		  //Using Stream API 
		  List<Integer> cubeList;
		  Function<Integer, Integer> f=x->x*x*x;
		  cubeList=intList.stream().map(f).collect(Collectors.toList());
		  System.out.println(cubeList);
		  
		  //split-up of line 27 
		  Stream<Integer> intStream=intList.stream();
		  intStream=intStream.sorted(); 
		  intStream=intStream.map(f);
		  cubeList=intStream.collect(Collectors.toList());
		  //System.out.println(intStream.count()); 
		  System.out.println(cubeList);
		  
		  List<String> nameList=Arrays.asList("Aniket","Nikhil","Manoj");
		  System.out.println(nameList);
		  
		  Stream<String> nameStream=nameList.stream();
		  Function<String, Integer> f1 =name->name.length();
		  intStream=nameStream.map(f1);
		  cubeList=intStream.collect(Collectors.toList());
		  System.out.println(cubeList);
		  
		  //filter() //to filter only odd numbers from intList[4,7,2,9]
		  intStream=intList.stream();
		  Predicate<Integer> p=n->n%2!=0;
		  Stream<Integer> result=				  
		  intStream.filter(p); 
		  List rList=result.collect(Collectors.toList());
		  System.out.println(rList);
		  
		  //filter() - returns palindrome strings 
		  List<String> words=Arrays.asList("CAT","CAR","RACECAR","MADAM","SIR");
		  System.out.println(words); 
		  Stream<String> wordsStream=words.stream();
		  
		  Predicate<String> p1= w-> w.equals(new StringBuffer(w).reverse().toString());
		  wordsStream=wordsStream.filter(p1);
		  nameList=wordsStream.collect(Collectors.toList());
		  System.out.println(nameList); 
		  //Count number of values
		  //System.out.println(wordsStream.count());
		  
		  //passing number predicate to filter function 
		  Predicate<Integer> numbers;
		  numbers =(no)->no%2==0;
		  
		  intStream=intList.stream(); 
		  intStream=intStream.sorted();
		  intStream=intStream.filter(numbers);
		  sqrList=intStream.collect(Collectors.toList()); 
		  System.out.println(sqrList);
		  
		  List<Student> sList=new ArrayList(); 
		  Student st=new Student(101,"Pooja",67);
		  sList.add(st); 
		  st=new Student(104,"Nisha",71); 
		  sList.add(st); 
		  st=new Student(107,"Poonam",63); 
		  sList.add(st); 
		  st=new Student(102,"Neeta",87);
		  sList.add(st); 
		  System.out.println(sList);
		  
		  Predicate<Student> perPredicate;
		  perPredicate=(stud)->stud.getPer()>=70;
		  
		  Stream<Student> studStream=sList.stream();
		  studStream=studStream.filter(perPredicate); 
		  List<Student> newList=studStream.collect(Collectors.toList());
		  
		  System.out.println(newList);
		  
		  //reduce() 
		  System.out.println(intList); 
		  intStream=intList.stream();
		  BiFunction<Integer, Integer, Integer> ff=(x,y)->x+y;
		  Optional<Integer> sum=intStream.reduce((BinaryOperator<Integer>) ff); 
		  System.out.println(sum);
	}
}
