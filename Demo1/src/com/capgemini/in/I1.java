package com.capgemini.in;
@FunctionalInterface
public interface I1 {
	void display();
	
	public default void show()
	{
		System.out.println("show() method");
	}
	
	public static void f1()
	{
		System.out.println("f1() method");
	}
	
}
