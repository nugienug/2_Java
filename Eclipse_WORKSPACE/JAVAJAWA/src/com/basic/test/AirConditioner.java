package com.basic.test;

import java.util.Scanner;

public class AirConditioner {
	public static void main(String[] args) {
		int setTemp=7;
		int inputTemp;
		final int MIN_TEMP = 5;
		final int MAX_TEMP = 18;
		
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("inc/dec temp by = ");
		inputTemp = input.nextInt();
		input.close();
		
		setTemp = inputTemp + setTemp;
		
		if (setTemp > MAX_TEMP) {
			System.out.println("The SetTemp is greater than the limit");
			setTemp = 7;
		} else if (setTemp<MIN_TEMP) {
			System.out.println("The SetTemp is less than the limit");
			setTemp = 7;
		} else {
			System.out.println("thank you :D");
		}
		System.out.println("your current setTemp is = " + setTemp +"°C");
		
	}
	
}
