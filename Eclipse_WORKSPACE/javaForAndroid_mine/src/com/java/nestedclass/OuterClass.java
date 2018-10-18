package com.java.nestedclass;

public class OuterClass {
	
	private int initial = 5;
	
	class InnerClass{
		public void add(int num) {
			System.out.println(num+initial);
		}
	}
	
}
