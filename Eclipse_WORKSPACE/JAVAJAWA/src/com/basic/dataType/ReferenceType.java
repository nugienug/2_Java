package com.basic.dataType;

/**
 *ReferenceType digunakan untuk membandingkan data di memori, bukan isinya
 */
public class ReferenceType {
	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("Hello-1");
		StringBuffer buffer2 = new StringBuffer("Hello-2");
		System.out.println("step 1 =========");
		System.out.println("memoryAddress = "+buffer1.hashCode());
		System.out.println("memoryAddress = "+buffer2.hashCode());
		System.out.print("result = ");
		System.out.println(buffer1==buffer2);
		
		buffer1 = buffer2;
		System.out.println("step 2 =========");
		System.out.println("memoryAddress = "+buffer1.hashCode());
		System.out.println("memoryAddress = "+buffer2.hashCode());
		System.out.print("result = ");
		System.out.println(buffer1==buffer2);
		buffer2=buffer2.append("-World");
					
		System.out.println("step 3 =========");
		System.out.println("memoryAddress = "+buffer1.hashCode());
		System.out.println("memoryAddress = "+buffer2.hashCode());
		System.out.print("result = ");
		System.out.println(buffer1==buffer2);
	}
}
