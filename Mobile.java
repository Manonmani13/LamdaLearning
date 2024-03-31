package com.lamda.learning.methodreference;

public class Mobile implements Contract {
	int price;
	public Mobile(int price)
	
	{
		System.out.println("price"+price);
	}
public static void main(String[] args) {
//	Contract c=(t)->System.out.println(t);
//	Mobile m=new Mobile();
//	Contract c=m :: show;
//	c.display(120);
	Contract c1=Mobile :: show1;
//	c1.display(10);
	c1=Mobile::new;
		c1.display(100000);
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
