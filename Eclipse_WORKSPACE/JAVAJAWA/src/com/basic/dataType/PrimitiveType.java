package com.basic.dataType;
/**
 *PrimitiveType digunakan untuk membandingkan nilai variablenya
 */
public class PrimitiveType {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		System.out.println("1. num1==num2:" + (num1 == num2));
		
		num1=num2;
		System.out.println("2. num1==num2:" + (num1 == num2));
		
		num2=30;
		System.out.println("3. num1==num2:" + (num1 == num2));
	}
}
