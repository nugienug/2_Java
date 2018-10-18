package com.javacourse;

public class JavaCourseTester {
	public static void main(String[] args) { // "main" METHOD
		Instructor donghunlee = new Instructor("Donghun Lee", "Master", 8,"Java-Database-Spring");
		Student ElectroMedical101 = new Student (101010010, "Nugroho Budi Wicaksono", "081326316181"); //membuat Object
		donghunlee.findOutName(ElectroMedical101);
		
		String subjects = donghunlee.getSubject();
		System.out.println(subjects);
		
		
		ElectroMedical101.setName("nug");
		String changedName = ElectroMedical101.getName();
		System.out.println(changedName);
	}
}
