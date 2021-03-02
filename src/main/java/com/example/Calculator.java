package com.example;

import java.io.IOException;
import java.util.Properties;

public class Calculator implements Calc {

	@Override
	public int addTwoNumbers(int a, int b) {
		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config/env.properties"));
			System.out.println(properties);
		} catch (IOException e) {
			e.printStackTrace();
		}
		a++;
		System.out.println("hhhhh");
		b++;
		return a + b;
	}

	public static void main(String[] args) {
		new Calculator().addTwoNumbers(1, 2);
	}

}
