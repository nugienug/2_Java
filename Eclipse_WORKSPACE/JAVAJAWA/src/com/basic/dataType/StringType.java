package com.basic.dataType;

public class StringType {
	public static void main(String[] args) {
		String first = "BbB";
		String second= "BbBbBbB";
		System.out.println(first == second); //FALSE 
		
		first=second;
		System.out.println(first == second); //TRUE
		
		second = "World";
		System.out.println(first == second);//FALSE 
	}
}
