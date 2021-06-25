package com.capgemini.in;

public class Demo3 {

	public static void main(String[] args) {
	
		I3 i3=(a,b)->a+b;
		int addResult=i3.add(10,90);
		System.out.println("Addition:"+addResult);
	}

}
