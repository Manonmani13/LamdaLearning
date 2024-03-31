package com.lamda.learning;

import java.util.ArrayList;

public class DoubleColon {
public static void main(String[] args) {
	ArrayList<Integer> ls=new ArrayList<Integer>();
	ls.add(10);
	ls.add(20);
	ls.forEach(System.out::println);
}
}
