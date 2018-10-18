package com.javacourse;

public class Instructor { // Class <<=== BLUEPRINT
	String name; // FIELD/VARIABEL
	String levelOfEducation; // FIELD/VARIABEL
	int workExperience; // FIELD/VARIABEL
	String subjects; // FIELD/VARIABEL

	public void teach() { // method -- behaviour

	}

	public void assignHomework() { // method -- behaviour

	}

	public int assessStudent() { // method -- behaviour butuh returnStatement
		return 100;
	}

	public void findOutName() { // method -- behaviour

	}
	
	public void findOutName(Student student) {
		System.out.println("What is your name?");
		System.out.println("My name is " + student.getName());
	}
	
	public String getSubject() {
		return this.subjects;
	}
	
	public Instructor() { // musti bikin empty Constructor biar Class JavaCourseTester tidak error.
		
	}
	
	public Instructor (String name) { //Constructor dengan 1 parameter
		this.name=name;
	} 

	public Instructor(String name, String LevelOfEducation, int workExperience, String subtjects) {//Constructor dengan 4 parameter
		this.name = name;
		this.levelOfEducation = LevelOfEducation;
		this.workExperience = workExperience;
		this.subjects = subtjects;
	}
	
		//auto generated constructor start
//	public Instructor() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Instructor(String name, String levelOfEducation, int workExperience, String subjects) {
//		super();
//		this.name = name;
//		this.levelOfEducation = levelOfEducation;
//		this.workExperience = workExperience;
//		this.subjects = subjects;
//	}//auto generated constructor end

}
