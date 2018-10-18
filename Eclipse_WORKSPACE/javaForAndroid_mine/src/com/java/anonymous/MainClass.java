package com.java.anonymous;

public class MainClass {
	static void printNum(Anonymous anon, int num) {
		anon.add(num);
	}
	
	public static void main(String[] args) {
		Anonymous anon = new DetailAnonymous() {
			public void add(int num) {
				System.out.println(num +startNum);
			}
		};
		anon.add(5);
	}
}
