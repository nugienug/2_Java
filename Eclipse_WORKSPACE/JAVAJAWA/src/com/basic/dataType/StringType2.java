package com.basic.dataType;

public class StringType2 {
	public static void main(String[] args) {
		String first = "bbb";
		String second = "bbb";
		String third = new String ("bbb");
		System.out.println(first==second);
		System.out.println(second==third);
		System.out.println(second.equals(third));
	}
}
