package com.basic.dataType;
/**
 * konversi dari short ke integer (vice-versa), and string to integer - parseInt
 */
public class IntegerDataType {
	public static void main(String[] args) {
		short shortNum1=1;
		short shortNum2=2;
		int shortResult= (shortNum1+shortNum2);
		short shortResult2= (short)((short)shortNum1+(short)shortNum2);
		short shortResult3= (short) (shortNum1+shortNum2);
		
		int intNum1 = 1;
		int intNum2 = 2;
		int result=intNum1+intNum2;
		
		long longNum1=1L;
		long longNum2=2L;
		long longResult=longNum1+longNum2;
		
		int num1=10;
		String string1="Hello";
		num1=Integer.parseInt(string1);
		System.out.println(num1);
				
	}
}
