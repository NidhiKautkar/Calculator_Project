package com.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		int result = cal.sum(10, 5);
		Assert.assertEquals(15, result);
		
	}
	
	@Test
	public void testSubstraction() {
		Calculator cal = new Calculator();
		int result = cal.substraction(10, 5);
		Assert.assertEquals(5, result);		
	}
	
	@Test
	public void testMultiplication() {
		Calculator cal = new Calculator();
		int result = cal.multiplication(10, 5);
		Assert.assertEquals(50, result);		
	}
	
	@Test
	public void testDivision() {
		Calculator cal = new Calculator();
		int result = cal.division(10, 5);
		Assert.assertEquals(2, result);		
	}

}
