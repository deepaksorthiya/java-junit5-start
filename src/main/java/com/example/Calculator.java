package com.example;

import java.io.IOException;
import java.util.Properties;

public class Calculator implements Calc {

	@Override
	public int addTwoNumbers(int a, int b) {
		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config/env.properties"));
			//ffsdfsdfsd
			//sfdsfdsfdsf
			//sfsdfsdfdsfsd
		} catch (IOException e) {
			e.printStackTrace();
		}
		a++;
		b++;
		System.out.println("gdhgdhgfdh");
		return a + b;
	}

	public static void main(String[] args) {
		new Calculator().addTwoNumbers(1, 2);
	}

}
