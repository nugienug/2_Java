package com.java.inheritance;

public class MainClass {
	
	static public void printSpeak(Creature animal) {
		animal.speak();
		
	}
	public static void main(String[] args) {
		Creature dog = new Dog();
		System.out.println(dog.speak());
		printSpeak(dog);
		
//		Animal cat = new Cat();
//		System.out.println(cat.speak());
//		
//		Pet petDog = new Dog();
//		System.out.println(petDog.speak());
//		
//		Creature creatureDog = new Dog();
//		System.out.println(creatureDog.speak());
	}
}
