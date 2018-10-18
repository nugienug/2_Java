package com.basic.test;

import java.util.Scanner;

public class MakeANumber {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		Scanner input;
		input = new Scanner(System.in);
		System.out.println("Enter first integer");
		firstNumber = input.nextInt();
		System.out.println("Enter second integer");
		secondNumber = input.nextInt();
		System.out.println("Enter third integer");
		thirdNumber = input.nextInt();
		input.close();
		
		int ratusan = firstNumber*100;
		int puluhan = secondNumber*10;
		int satuan  = thirdNumber*1;
		
		int total = ratusan+puluhan+satuan;
		
		System.out.printf("The quotient  is %d", total);
	}
		
}
