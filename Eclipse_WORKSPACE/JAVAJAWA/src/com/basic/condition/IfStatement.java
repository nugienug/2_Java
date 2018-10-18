package com.basic.condition;

public class IfStatement {
	public static void main(String[] args) {
		int c = 10;
				if (c < 20) {
					System.out.println("ini STATEMENT \"IF\"");
				}
				String message = (c<20)?"ini STATEMENT \"IF\"" :"";
				System.out.println(message);
	}
}
