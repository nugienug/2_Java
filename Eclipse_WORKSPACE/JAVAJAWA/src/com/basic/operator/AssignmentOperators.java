package com.basic.operator;

public class AssignmentOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		
		/////TAMBAH
		c = a + b;
		System.out.println("c=a+b = " + c);
		c+=a;
		System.out.println("c+=a  = "  + c);
		c=c+a;
		System.out.println("c=c+a = " + c);
		
		/////KURANG
		c-=a;
		System.out.println("c-=a  = "  + c);
		c=c-a;
		System.out.println("c=c-a = " + c);

		///KALI
		c*=a;
		System.out.println("c*=a  = "  + c);
		c=c*a;
		System.out.println("c=c*a = " + c);
	}

}
