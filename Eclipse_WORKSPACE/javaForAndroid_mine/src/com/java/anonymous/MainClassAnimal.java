package com.java.anonymous;

public class MainClassAnimal {
	public static void main(String[] args) {
		Animal dog = new Animal() {
			
			@Override
			public void speak() {
				System.out.println("dog");
			}
		};
	}
//	Animal realDog1 = new Dog();
//	Animal realDog2 = new Dog();
//	Animal realDog3 = new Dog();
//	
//	realDog1.speak();
//	realDog2.speak();
//	realDog3.speak();
}
