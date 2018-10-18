package com.basic.test;

import java.util.Scanner;

public class JackPot2 {
	public static void main(String[] args) {
		int firstNumber;
		String result;
		String secondNumber;
		
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Enter first integer  = ");
		firstNumber = input.nextInt();
		System.out.print("Enter second integer = ");
		secondNumber = input.next();
		input.close();
		
		int int2ndNum = Integer.parseInt(secondNumber);
		
		System.out.println("JackPot? "+(firstNumber == int2ndNum));
				
		result = (firstNumber == int2ndNum)? "You are a Millionaire :) :) :)" : "FAIL :( :( :(";
		
		System.out.println("JackPot? "+(firstNumber == int2ndNum)+" == "+ result);
		
		boolean boolResult = firstNumber == int2ndNum;
		String resultText = "FAIL";
		if (boolResult==true) { // sama dengan if (boolResult)
			resultText="SUCCESS";
		}
		System.out.println("YOU ARE "+resultText);
	}
}
