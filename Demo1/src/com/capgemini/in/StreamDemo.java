package com.capgemini.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Stream s1=Stream.empty();
		Stream s2=Stream.of("Prudhvi");
		Stream s3=Stream.of(1,2,3,4);
		Stream s4=Stream.of(1,2,3,4,"Prudhvi",10.44,null);
	
		List<Integer> eids=new ArrayList<Integer>();
		eids.add(1);
		eids.add(3);
		eids.add(300);
		
		List<String> enames=Stream.of("Prudhvi","Raj","Rajeev","Kiran").collect(Collectors.toList());
		
		List<Integer> ports=Arrays.asList(20,9090,9898,1234,2552,252525,2525,2522);
		
		System.out.println(enames);
		System.out.println(ports);
		System.out.println(eids);
		
	}

}
