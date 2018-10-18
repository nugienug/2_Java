package com.basic;

public class TypeConversion {
	public static void main(String[] args) {
		short shortNum = 128;
		int intNum = 32788;
		
		intNum=shortNum; //automatic Conversion
		System.out.println(intNum);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}

}
