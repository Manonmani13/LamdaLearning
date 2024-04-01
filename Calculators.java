package com.lamda.learning;

public class Calculators  {
	public static void main(String[] args) {
		Calculator cal=new Calculator() {
			
			@Override
			public int calculates(int a, int b) {
				
				return a+b;
			}
		};
		System.out.println(cal.calculates(10, 4));
	}

}
