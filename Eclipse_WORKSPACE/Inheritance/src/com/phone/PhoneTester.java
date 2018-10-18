package com.phone;

public class PhoneTester {
	public static void main(String[] args) {
		SmartPhone iphone = new SmartPhone("iPhone", "iOSX");
		System.out.println(iphone.getAllInformation());
		
		IPhoneX iPhoneX = new IPhoneX();
		iPhoneX.call();
		iPhoneX.touchScreen();
		iPhoneX.recognizeFingerprint();
		
	}
}
