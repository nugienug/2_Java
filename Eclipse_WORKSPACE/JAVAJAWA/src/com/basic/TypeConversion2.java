package com.basic;

public class TypeConversion2 {
	public static void main(String[] args) {
		short shortNum = 128;
		int intNum = 32788;

		shortNum = (short)intNum; // explicitConversion
		System.out.println(shortNum);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		long longNum = 10L;

	}
}
