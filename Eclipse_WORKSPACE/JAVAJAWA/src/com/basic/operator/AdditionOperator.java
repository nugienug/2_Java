package com.basic.operator;

public class AdditionOperator {
	public static void main(String[] args) {
		int a = 10;
		int x = 0;
		x = ++a;// pre-increment
		System.out.println("x: " + x);
		System.out.println("a: " + a);

		int b = 10;
		int y = 0;
		y = b++;// post-increment
		// return b first
		// return b=b+1
		System.out.println("y: " + y); // 10
		System.out.println("b: " + b); // 11
	}
}
