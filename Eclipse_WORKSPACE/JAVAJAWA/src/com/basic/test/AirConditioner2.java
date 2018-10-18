package com.basic.test;

import java.util.Scanner;

//////////////////case nested if
public class AirConditioner2 {
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
		} else if (setTemp<MIN_TEMP) {
			System.out.println("The SetTemp is less than the limit");
		} else {
			if (inputTemp>0) {
				System.out.println("Turn it up");
			}
			else {
				System.out.println("Turn it down");
			}
		}
		System.out.println("your current setTemp is = " + setTemp +"°C");
		
	}
	
}
