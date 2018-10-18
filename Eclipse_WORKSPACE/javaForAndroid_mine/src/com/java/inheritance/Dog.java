package com.java.inheritance;

public class Dog extends Animal implements Pet,Creature{
	@Override
	public String speak() {
		// TODO Auto-generated method stub
//		return super.speak();
		return "Dog";
	}
}
