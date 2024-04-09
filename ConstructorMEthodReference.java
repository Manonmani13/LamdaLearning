package com.lamda.learning.methodreference;

public class ConstructorMEthodReference {
	
public ConstructorMEthodReference() {
		System.out.println("Hello user");
	}

public static void main(String[] args) {
	Sayable s=ConstructorMEthodReference::new;
	s.say();
}
}
