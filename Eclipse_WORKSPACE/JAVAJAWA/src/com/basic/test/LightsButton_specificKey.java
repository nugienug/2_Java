package com.basic.test;

import java.util.Scanner;

public class LightsButton_specificKey {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		
		int getInt=0;
		boolean isON = true;
		
		while (true) {
			getInt = input.nextInt();
			if (getInt == 1) {
				isON = !isON;
				System.out.println(isON? "ON":"OFF");
			}else {
				input.close();
				System.out.println("stop working");
				break;
			}
		}

	}

}
