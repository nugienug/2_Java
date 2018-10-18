package com.basic.string;

public class StringExample {
	public static void main(String[] args) {
		String hello = "Hello";
		
		char char2=hello.charAt(4);
		System.out.println(char2);
		System.out.println(Character.isLetter(char2));
		System.out.println("Hello-length= "+hello.length());
		
		String str1="Bye, Jessy";
		String str2=str1.substring(5,10);
		System.out.println("str2: "+str2);
		
	}
}
