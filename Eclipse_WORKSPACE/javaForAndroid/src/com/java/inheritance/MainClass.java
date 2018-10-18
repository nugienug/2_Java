package com.java.inheritance;

public class MainClass {

	static public void printSpeak(Animal animal) {
		System.out.println("printSpeak" + animal.speak());
	}
	

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();

		System.out.println(dog.speak());
		printSpeak(dog);
		printSpeak(cat);

		
	}
}
