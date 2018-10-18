package com.basic.test;

public class MultiplicationTable2 {
	public static void main(String[] args) {
		for (int i=1;i<10;i+=1) {
			for (int j=1;j<10;j+=1) {
				if (i == 3 || j == 3) {continue;}
				System.out.println("i*j = " + i + "*" + j + " = " + i*j);
			}
		}
	}
}
