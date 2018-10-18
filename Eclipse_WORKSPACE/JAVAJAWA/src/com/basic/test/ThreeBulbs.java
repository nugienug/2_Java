package com.basic.test;

import java.util.Scanner;

public class ThreeBulbs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean bulb0 = false;
		boolean bulb1 = false;
		boolean bulb2 = false;
		// boolean is0 = true;
		// boolean is1 = true;
		// boolean is3 = true;

		int getIN = 0;
		while (true) {
			getIN = in.nextInt();
			if (getIN == 0) {
				bulb0 = !bulb0;
				System.out.println("0: "+ (bulb0 ? "ON" : "OFF"));
			}
			else if (getIN == 1) {
				bulb1 = !bulb1;
				System.out.println("1: "+ (bulb1 ? "ON" : "OFF"));
			}
			else if (getIN == 2) {
				bulb2 = !bulb2;
				System.out.println("2: "+ (bulb2 ? "ON" : "OFF"));
			}
			
			if ((bulb0 == true) && (bulb1 == true) && (bulb2 == true)) {
				in.close();
				System.out.println("stoooppp");
				break;
			}
			
			if (getIN<0||getIN>3)continue;
		}
	}
}
