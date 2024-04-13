package com.lamda.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IterationExample {
public static void main(String[] args) {
	Stream.iterate(1, e->e+1).filter(e->e%5==0).limit(20).forEach(System.out::println);
	
}
}
