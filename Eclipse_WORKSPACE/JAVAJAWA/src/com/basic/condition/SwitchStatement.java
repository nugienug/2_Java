package com.basic.condition;

public class SwitchStatement {
	public static void main(String[] args) {
		char grade = 'C';
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Well Done :B!");
			break;
		case 'C':
			System.out.println("Well Done :C!");
			break;
		case 'D':
			System.out.println("You passed!");
			break;
		case 'F':
			System.out.println("see you next semester!");
			break;
		default:
			System.out.println("INVALID GRADE");
		}
		
		
	}

}
