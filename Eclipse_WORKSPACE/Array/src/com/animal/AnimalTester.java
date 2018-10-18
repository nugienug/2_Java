package com.animal;

public class AnimalTester {
	public static void main(String[] args) {
		Cat[] catArray = {new Cat(), new Cat(), new Cat()};// langkah - Create Cat typed array named catArray and initialize with 3 cats
		System.out.println("length of catArray = "+ catArray.length);
		
		for(int index=0;index<catArray.length;index++) {
			catArray[index].speak();
		}
	}
}
