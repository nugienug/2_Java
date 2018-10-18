package com.basic.loop;

public class DoWhileStatement {
	public static void main(String[] args) {
		int x = 0;
		do {
			x+=1;
			System.out.println("value of x = " + x);
		} while (x < 20);
		
		//add number from 1 to 100
		int y=1;
		int sum_y=0;
		do {
			y+=1;
			sum_y+=y;
		}while (y<=1000);
		System.out.println(sum_y);
		
	}
}
