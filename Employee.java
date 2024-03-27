package com.learnLamda;

public class Employee implements Contract1,Contract2 {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.calculate_salary(10000, 2000);
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void calculate_salary(int a, int b) {
		// TODO Auto-generated method stub
		Contract1.super.calculate_salary(a, b);
		Contract2.super.calculate_salary(a, b);

	}

}
