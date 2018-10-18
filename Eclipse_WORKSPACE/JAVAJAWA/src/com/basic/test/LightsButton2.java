package com.basic.test;

import java.util.Scanner;

public class LightsButton2 {
	public static void main(String[] args) {
		final String ON = "ON";
		final String OFF = "OFF";
		
		boolean isON = false;
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int yourNum = input.nextInt() ;
		
		input.close();
		for (int i=0; i < yourNum; i++) {
			isON = !isON;
			System.out.println("i = "+ i + " | " + (isON? ON:OFF));
		}

	}

}
