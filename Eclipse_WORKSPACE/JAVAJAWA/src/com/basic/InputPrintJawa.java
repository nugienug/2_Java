package com.basic;

import java.util.Scanner;

public class InputPrintJawa {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		Scanner input;
		input = new Scanner (System.in);
		System.out.println("Enter first integer");
		firstNumber = input.nextInt();
		System.out.println("Enter second integer");
		secondNumber = input.nextInt();
		input.close();
		System.out.printf("The sum is %d", firstNumber+secondNumber);
	}
}
