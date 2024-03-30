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
		
}
//public boolean age(int age)
//{
//	if(age>60)
//		return true;
//	else
//		return false;
//}
}
