package com.basic.dataType;
/**
 * merata-rata nilai 3 mahasiswa dan menampilkan apakah nilainya lebih dari 60 atau tidak
 */
public class Test {
	public static void main(String[] args) {
		float aStud = 100;
		float bStud = 95;
		float cStud = 50;
		
		float mean = (aStud + bStud + cStud) / 3;
		System.out.println(mean);
		
		byte standard = 60;
		boolean a60Stud = standard < aStud;
		boolean b60Stud = standard < bStud;
		boolean c60Stud = standard < cStud;
		
		boolean resultStud = a60Stud && b60Stud && c60Stud;
		System.out.println("student scores above 60? " + resultStud);
		
	}
}
