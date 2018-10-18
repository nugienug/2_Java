package com.basic.dataType;

import java.util.ArrayList;
import java.util.List;

/**
 * konversi tipe data string ke boolean
 *
 */
public class Test2 {
public static void main(String[] args) {
	String green = "true";
	boolean isGreen = Boolean.parseBoolean(green); // cara 1
	isGreen=Boolean.valueOf(green); //cara 2
	
	System.out.println(isGreen);
	
}
}
