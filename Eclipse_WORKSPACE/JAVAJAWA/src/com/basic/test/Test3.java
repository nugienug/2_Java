package com.basic.test;

public class Test3 {
	public static void main(String[] args) {
		//////////////////SOAL 1
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		int num3=10;
		
		int intNum1=num1;
		int intNum2=num2;
		
		//do they have the same number of 10? which one?
		//System.out.println(??);
		System.out.print("first Answer  = ");
		System.out.println(
				(intNum1 == intNum2) &&
			    (intNum2 == num3) &&
			    (intNum1 == num3)
				);//the answer should be true
		
		////////////////SOAL 2
		String student1 = new String ("Hello");
		String student2 = new String ("Hello");
		
		//do they have the same text? which one?
		//System.out.println(??);
		System.out.print("second Answer = ");
		System.out.println(student1.equals(student2));//the answer should be true
		
		////////////////SOAL 3
		String str1 = new String ("hello");
		String str2 = new String ("Hello");
		//do they have the same text regardless of the case? which one?
		//findout how to use toLowerCase() and toUpperCase()
		//System.out.println(??);
		System.out.print("Third Answer  = ");
		//the answer should be true
		System.out.println(str1.toUpperCase().equals(str2.toUpperCase()));
		
		////bisa juga:
		//System.out.println(str1.toLowerCase().equals(str2.toLowerCase()));
		
		////////////////SOAL 4
		int a = 10;
		Integer b = new Integer(10);
		String c = "10";
		
		int intB = b;
		int intC = Integer.parseInt(c);
		
		//do they have the same number value? 
		//change c to int
		//System.out.println(??);
		System.out.print("Fourth Answer = ");
		System.out.println((a==intB)&&(a==intC)&&(intB==intC));
		
	}
}
