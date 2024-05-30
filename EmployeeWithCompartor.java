package com.practices.java8;

public class EmployeeWithCompartor {
 
	String name;
	
	int eno;
	
	public EmployeeWithCompartor(String name,int eno)
	{
		this.name=name;
		this.eno=eno;
	}
	public String toString()
	{
		return eno+":"+name;
	}
	
}
