package com.basic.dataType;

public class BooleanDataType {
	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		boolean result = t;
		
		System.out.println(result); //true
		System.out.println(t && f); //and
		System.out.println(t || f); //or
		System.out.println(!result);//not
		
		System.out.println("*****");//not
		System.out.println("Gate Result = " + (!result && result || !result && t));//not
	}
}
