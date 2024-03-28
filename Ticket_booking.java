package com.lamda.learning;

import java.util.function.Predicate;

public class Ticket_booking {
public static void main(String args[])
{
	Predicate<Integer> p=(no)->no>60;
	System.out.println(p.test(55));
}
//public boolean age(int age)
//{
//	if(age>60)
//		return true;
//	else
//		return false;
//}
}
