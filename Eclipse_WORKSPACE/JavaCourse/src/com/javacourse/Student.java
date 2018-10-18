package com.javacourse;

public class Student {//Class
	int studentID;
	String name;
	String phoneNumber;
	DeskTop deskTop;
	
	public void listen() {
		
	}
	
	public void askQuestions() {
		
	}
	
	public void doingTheHomework() {
		
	}
	
	public void answer() {
		
	}
	
	public Student() {//Method
		
	}
	
	public Student(int studentID, String name, String phoneNumber) { //Constructor 
		this.studentID = studentID;
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName (String name) {
		this.name = name;
	}
	
}
