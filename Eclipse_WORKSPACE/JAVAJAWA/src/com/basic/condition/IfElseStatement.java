package com.basic.condition;

public class IfElseStatement {
	public static void main(String[] args) {
		int x=30;
		if (x<30) {
			System.out.println("This is IF STATEMENT");
		}else {
			System.out.println("This is ELSE STATEMENT");
		}
		
		
		//conditional operator === sama dengan if... else
		String message = (x<30)? "This is IF STATEMENT" : "This is ELSE STATEMENT";
		System.out.println(message);
		
		System.out.println("THE END");
	}
}
