package com.lamda.learning.methodreference;

public class Mobile implements Contract {
//	public Mobile(int price)
//	
//	{
//		price=price;
//	}
public static void main(String[] args) {
//	Contract c=(t)->System.out.println(t);
	Mobile m=new Mobile();
	Contract c=m :: show;
	c.display(120);
	Contract c1=Mobile :: show1;
	

	//double clone operator is used to reduce effector of lamda
}
public void show(int value)
{
	System.out.println(value);
}
@Override
public void display(int no) {
	// TODO Auto-generated method stub
	
}
public static void show1(int value)
{
	System.out.println(value);
}

//arguments should be match in interface method and our class method
//we can use static and non static method also
}
