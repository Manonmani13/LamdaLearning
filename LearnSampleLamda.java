package com.learnLamda;

public class LearnSampleLamda {
public static void main(String[] args) {
	Test ci=new Citizen();
	ci.rule1();
	Thread t=new Thread(
			()->{
				for(int i=1;i<=5;i++) {
					System.out.println("child "+i);
				}
			});
	t.start();
}
}
