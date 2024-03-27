package com.learnLamda;

public interface Contract1 {
default void calculate_salary(int a,int b)
{
	System.out.println(a+b);
}
}
