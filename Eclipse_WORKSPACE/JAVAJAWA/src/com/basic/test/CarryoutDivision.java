package com.basic.test;

import java.util.Scanner;

public class CarryoutDivision {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Enter first integer");
		firstNumber = input.nextInt();
		System.out.println("Enter second integer");
		secondNumber = input.nextInt();
		input.close();
		
		int quotient = firstNumber/secondNumber; //hasil bagi
		int remainder = firstNumber%secondNumber;//sisa bagi
		
		System.out.printf("The quotient  is %d", quotient);
		System.out.println();
		System.out.printf("The remainder is %d", remainder);
	}
}
