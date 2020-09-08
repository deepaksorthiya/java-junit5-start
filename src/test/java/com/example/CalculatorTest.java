package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	public static Calculator calc = new Calculator();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("I am in setUpBeforeClass() method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("I am in tearDownAfterClass() method");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("I am in setUp() method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("I am in tearDown() method");
	}

	@Test
	void testAddTwoNumbersOne() {
		assertEquals(5, calc.addTwoNumbers(3, 2));
	}

	@Test
	void testAddTwoNumbersTwo() {
		assertEquals(8, calc.addTwoNumbers(6, 2));
	}

}
