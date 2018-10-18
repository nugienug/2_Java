package com.basic.dataType;

public class FloatDataType {
	public static void main(String[] args) {
		float floatNum1 = 5.5f;
		float floatNum2 = 1.1f;
		System.out.println(floatNum1/floatNum2); 			// 5.5 : 1.1
		System.out.println((int)floatNum1/floatNum2);		// 5   : 1
		System.out.println(floatNum1/(int)floatNum2);		// 5.5 : 1
		System.out.println((int)(floatNum1/floatNum2));		// (int) (5.5/1.1)
	}
}
