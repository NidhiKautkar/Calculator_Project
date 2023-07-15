package com.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[]) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
       int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
		
		Calculator cal = new Calculator (); 
		
		int result = cal.sum(num1, num2);
		System.out.println("sum is " +result);
		
		result = cal.substraction(num1, num2);
		System.out.println("substraction is " +result);
		
		result = cal.multiplication(num1, num2);
		System.out.println("multiplication is " +result);
		
		result = cal.division(num1, num2);
		System.out.println("division is " +result);
		
        scanner.close();

	} 
	
	public int sum(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		return result;
	}
	
	public int substraction(int num1, int num2) {
		
		int result;
		result = num1 - num2;
		return result;
	}
	
	public int multiplication(int num1, int num2) {
		
		int result;
		result = num1 * num2;
		return result;
	}
	
	public int division(int num1, int num2) {
		
		int result;
		result = num1 / num2;
		return result;
	}
	
}



