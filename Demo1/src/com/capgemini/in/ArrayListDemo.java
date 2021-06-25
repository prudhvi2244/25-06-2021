package com.capgemini.in;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Optional;

/*
class MyComparator implements Comparator
{
@Override
public int compare(Object obj1, Object obj2) {
	
	Integer i1=(Integer)obj1;
	Integer i2=(Integer)obj2;
	if(i1<i2)
		return 1;
	else if(i1>i2)
		return -1;
	else
		return 0;
	
}
}
*/

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(24);
		al.add(7);
		al.add(3);
		al.add(100);
		al.add(133);
		al.add(80);
		al.add(10);
		
		System.out.println(al);
		
		System.out.println("Processing Objects From Array List using Iterator:");
		Iterator<Integer> iterator=al.iterator();
		while(iterator.hasNext())
		{
			Integer i1=iterator.next();
			System.out.println(i1);
		}
		
		System.out.println("Processing Objects From Array List using ListIterator:");
		ListIterator<Integer> listIterator=al.listIterator();
		while(listIterator.hasNext())
		{
			Integer i1=listIterator.next();
			System.out.println(i1);
		}
		
		System.out.println("Processing Objcts From Array List With Stream API");
		al.stream().forEach(i1->System.out.println(i1));
		
		long count=al.stream().count();
		System.out.println("No of objects :"+count);
		
		System.out.println("Processing Only Even Numbers");
		al.stream().filter(i1->i1%2==0).forEach(i->System.out.println(i));
		
		System.out.println("Processing Only Odd Numbers");
		al.stream().filter(i1->i1%2!=0).forEach(i->System.out.println(i));
		
		
		System.out.println("Displaying All Integerf objects greater than 50");
		al.stream().filter(i1->i1>50).forEach(i->System.out.println(i));
		
		System.out.println("Displaying Unique integer objects from ArrayList:");
		
		al.stream().distinct().forEach(i->System.out.println(i));
		
		
		System.out.println("Ascending Order of Integer Objects");
		al.stream().sorted().forEach(i->System.out.println(i));
		
		System.out.println("Descending Order of Integer Objects");
		al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).forEach(i->System.out.println(i));
	
		System.out.println("Displaying 5 integer objects:");
		al.stream().limit(5).forEach(i->System.out.println(i));
		
		System.out.println("Skipping first 5 objects:");
		al.stream().skip(5).forEach(i->System.out.println(i));
		
		Optional<Integer> minumum=al.stream().min((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		Optional<Integer> maximum=al.stream().max((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
		System.out.println("Minumim Integer Object According To Descending Order:"+minumum.get());
		System.out.println("Maximum Integer Object According To Descending Order:"+maximum.get());
	}

}
