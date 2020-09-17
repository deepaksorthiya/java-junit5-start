package com.example;

public class Calculator implements Calc {

	@Override
	public int addTwoNumbers(int a, int b) {
		a++;
		b++;
		System.out.println("gdhgdhgfdh");
		return a + b;
	}

}