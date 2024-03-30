package com.lamda.learning.functioncousumer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo {
public static void main(String[] args) {
	//predicate returns only boolean value
	//predicate accept oonly one argument
	//function returns any type of value
	//function accepts two argument
	Function<String,Integer> f=name->name.length();
	System.out.println(f.apply("manonmani"));
	//for each
	List<Integer> list=Arrays.asList(10,20,40,30);
	list.forEach(ele ->System.out.println(ele));
}
}
