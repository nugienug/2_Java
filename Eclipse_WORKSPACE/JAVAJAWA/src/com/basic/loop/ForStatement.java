package com.basic.loop;

public class ForStatement {
	public static void main(String[] args) {
		int sum=0;
		for (int x=0; x<=20; x+=2) { //x++ bisa juga jadi x+=1
			System.out.println("value of x   = " + x);
			sum +=x;
		}
		System.out.println("value of sum = " + sum);
	}
}
