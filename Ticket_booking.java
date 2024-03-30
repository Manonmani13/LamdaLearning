package com.lamda.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Ticket_booking {
public static void main(String args[])
{
//	Predicate<Integer> p=(no)->no>60;
//	System.out.println(p.test(55));
//	Predicate<String> p=(no)->(no.length()>8);
//	System.out.println(p.test("abc213198"));
	ArrayList al=new ArrayList();
	al.add(10);
	Predicate<Collection> p=aa->aa.size()>0;
	System.out.println(p.test(al));
	int ar[]= {10,2,3,4,6,8};
	Predicate<Integer> p1=no->(no%2!=0);
	Predicate<Integer> p2=no->(no<10);

	for(int i=0;i<ar.length;i++)
	{
		System.out.println(p1.test(ar[i]));
	}
		//orye oru argument vangi return boolean
	//predicate returns only boolean value
	//predicate accept oonly one argument
	//function returns any type of value
	//function accepts two argument
	
	
}
//public boolean age(int age)
//{
//	if(age>60)
//		return true;
//	else
//		return false;
//}
}
