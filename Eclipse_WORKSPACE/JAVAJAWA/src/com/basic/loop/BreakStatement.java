package com.basic.loop;

public class BreakStatement {
	public static void main(String[] args) {
		for (int x=1;x<20;x+=1) {
			if(x==5) {
				break;
			}
			System.out.println("value of x = " + x);
		}
	}

}
