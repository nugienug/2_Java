package com.basic.test;

import java.util.Random;

public class GuessWhat {
	public static void main(String[] args) {
		Random rand = new Random();
		boolean randB = rand.nextBoolean();//true or false
		String stringRandB = Boolean.toString(randB);
		
		System.out.println(stringRandB.toUpperCase());
		
	}
}
