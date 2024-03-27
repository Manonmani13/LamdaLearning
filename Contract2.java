package com.learnLamda;
@FunctionalInterface
public interface Contract2 {
	//only one abstract method allowed
	
//	public void rule2();
	public int add(int a,int b);
	public static void method()
	{
		System.out.println("Hello");
	}
	default void calculate_salary(int a,int b)
	{
		System.out.println(a+b);
	}
}
