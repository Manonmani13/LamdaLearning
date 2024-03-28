package com.lamda.learning;

import java.util.function.Predicate;

public class Ticket_booking {
public static void main(String args[])
{
//	Predicate<Integer> p=(no)->no>60;
//	System.out.println(p.test(55));
	Predicate<String> p=(no)->(no.length()>8);
	System.out.println(p.test("abc213198"));
}
//public boolean age(int age)
//{
//	if(age>60)
//		return true;
//	else
//		return false;
//}
}
