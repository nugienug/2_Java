package com.basic.dataType;

import java.util.ArrayList;

public class WrapperClass {
	public static void main(String[] args) {
		/*
		 * Integer, Long, Short, Byte, Boolean, ... are not objects, not types. 
		 * need the same memory (4byte regardless of its datatypes).
		 * They can have null
		 */
		
		Integer wrapperInt=null;
		int intNum=10;
//		System.out.println(wrapperInt+intNum);
		
		Integer wrapperInt2=new Integer (10);
		Integer wrapperInt3=new Integer (10);
		System.out.println((int)wrapperInt2 == (int)wrapperInt3);
		
		//used when they need to be an object
		ArrayList<Integer>array = new ArrayList();
	}
}
