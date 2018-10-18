package com.basic.loop;

public class ContinueStatement {
	public static void main(String[] args) {
		for (int x=1;x<20;x+=1) {
			if(x==5) {
				continue;
			}
			System.out.println("value of x = " + x);
		}
	}

}
