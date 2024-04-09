package com.lamda.learning.methodreference;

public class MethodReferenceStatic {
	public static void say()
	{
		System.out.println("Hello" );
	}
public static void main(String[] args) {
	Sayable st=	MethodReferenceStatic::say;
	st.say();
	Sayable m=new MethodReferenceStatic()::message;
	MethodReferenceStatic m1=new MethodReferenceStatic();
	m=m1::message;
	m.say();
	
}	
public void message()
{
	System.out.println("Hey Hi Man");
}
}
