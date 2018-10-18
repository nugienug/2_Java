package com.test;

public class Question1 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				if (j == 4 || i == 4) {
					continue;
				}
				System.out.println(i + "*" + j + " = " + i * j);
			}
		}
	}
}
