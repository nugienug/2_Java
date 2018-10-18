package com.basic.dataType;

public class CharDataType {
	public static void main(String[] args) {
		char a1='a';		
		char a2=98;			//ASCI
		char a3='\u0026'; 	//UNICODE
		System.out.println(a1);	//a
		System.out.println(a2); //b
		System.out.println(a3); //&
		
		System.out.println("------");
		
		int changeFromChar = a1;
		System.out.printf("changeFromChar = %d",changeFromChar);
	}
}
