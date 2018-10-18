package com.array;

/*
[1] Exercise for Declaring and Creating Array
- Create ArrayTester class in com.array package
- Declare a String typed array named instructorArray
- Create array object of size 5 and assign to instructorArray

[2] Exercise for Initializing Array
- Initialize the 5 elements of instructorArray with “Piljoon”,
“Jessy”, “Donghun”, “Manho”, “Jaeyoung”

[4] Exercise - Declare, Create and Initialize Array
- Create 5 length, int typed array named ‘scoreArray’
- Assign data to ‘scoreArray’ array
 data - 99, 85, 100, 69, 95
 
[5] Exercise for Getting Length of Array
- Print length of instructorArray

[6] Exercise for Getting elements of array
- Print first element of instructorArray
- Print last element of instructorArray by using length field

[7] Exercise for Modifying elements of array
- Modify second element of instructorArray by Jihee
- Modify third element of instructorArray by Dustin

[8] Exercise - Practical Use of Array
(1) Creating array with following data named scoresArray
 dat - 78, 85, 100, 69, 100, 80, 100
(2) Print length of scoresArray
(3) Print data in 4th element in scoresArray
(4) Re-assign all the scoresArray elements with 100

[9] Exercise for Modifying elements of array
- Print all the elements of instructorArray by using for statement

*/


public class ArrayTester {
	public static void main(String[] args) {
//		String[] instructorArray = new String[5]; 	//[1]
//		instructorArray[0]= "Piljoon";				//[2]
//		instructorArray[1]= "Jessy";
//		instructorArray[2]= "Donghun";
//		instructorArray[3]= "Manho";
//		instructorArray[4]= "Jaeyoung";
		
		String[] instructorArray = { "Piljoon", "Jessy", "Donghun", "Manho", "Jaeyoung" }; //[3] Another way
		int[] scoreArray = { 99, 85, 100, 69, 95}; //[4]
		
		System.out.println(instructorArray.length-1); //[5]
		
		System.out.println(instructorArray[0]); //[6]
		System.out.println(instructorArray[instructorArray.length-1]);
		
		instructorArray[1]="Jihee";//[7]
		instructorArray[2]="Dustin";
		
		int[] scoreArray8 = {78, 85, 100, 69, 100, 80, 100}; //[8]
		System.out.println("length of scoreArray8 = " + (scoreArray8.length-1));
		System.out.println("4th element of scoreArray8 = " + (scoreArray8[3]));
		scoreArray8[0] = 100;
		scoreArray8[1] = 100;
		scoreArray8[2] = 100;
		scoreArray8[3] = 100;
		scoreArray8[4] = 100;
		scoreArray8[5] = 100;
		scoreArray8[6] = 100;
		
		for (int index = 0; index < instructorArray.length; index++) {
			System.out.println("name of instructor = "+ instructorArray[index]);
		}
	}
}
