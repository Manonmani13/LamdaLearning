package com.lamda.learning;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Optional {
public static void main(String[] args) {
	int[] ar= {10,2,3,4,2};
	OptionalDouble od=Arrays.stream(ar).average();
	System.out.println(od);
	System.out.println(od.getAsDouble());
	OptionalInt od1=Arrays.stream(ar).max();
	System.out.println(od);
	System.out.println(od1.getAsInt());
	OptionalInt min=Arrays.stream(ar).min();
	System.out.println(min.getAsInt());
	OptionalInt first=Arrays.stream(ar).findFirst();
	System.out.println(first);

}
}
