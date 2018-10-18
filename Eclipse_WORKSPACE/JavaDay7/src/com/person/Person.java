package com.person;

public class Person {
	private int age;
	public String name;

	public String getName() {
		return this.name;
	}

	private int getAge() {
		return this.age;
	}

	public boolean isAdult() {
		if (getAge() > 20) {
			return true;
		} else {
			return false;
		}
	}
}