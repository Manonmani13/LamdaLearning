package com.lamda.learning.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamExample {
public static void main(String[] args) {
	int ar[]= {2,4,5,6,0,20};
	IntStream s=Arrays.stream(ar);
//	System.out.println(s.count());
//	s.forEach(no->System.out.println(no));
	s.forEach(System.out::print);
	Arrays.stream(ar).sorted().forEach(System.out::println);
}
}
