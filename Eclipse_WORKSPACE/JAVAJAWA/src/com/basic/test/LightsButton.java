package com.basic.test;

import java.util.Scanner;

public class LightsButton {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int yourNum = input.nextInt() ;
		input.close();
		
		for (int i = 1; i < yourNum+1; i++) {
			if (i%2 != 0) {
				System.out.print(i + " ");
				System.out.println("ON");
			}
			else {
				System.out.print(i + " ");
				System.out.println("OFF");
			}
		}

	}

}
