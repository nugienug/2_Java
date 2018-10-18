package com.iot;

import com.iot.device.AirConditioner;
import com.iot.device.TV;

public class IoTTester {
	public static void main(String[] args) {

		////////////////////UNTUK TV
//		TV colorTv=new TV("color1", 50, "red");
//		System.out.println(colorTv.getAllInformation());
//		
//		colorTv.turnOn();
//		System.out.println(colorTv.getAllInformation());
//		
//		colorTv.increaseChannel();
//		colorTv.increaseVolume();
//		System.out.println(colorTv.getAllInformation());
//		
//		colorTv.decreaseChannel();
//		colorTv.turnOff();
//		System.out.println(colorTv.getAllInformation());

		AirConditioner AC = new AirConditioner("Split", 2);
		System.out.println(AC.getAllInformation());
		
		AC.turnOn();
		System.out.println(AC.getAllInformation());
		
		AC.increaseTemp();
		AC.increaseTemp();
		AC.increaseTemp();
		System.out.println(AC.getAllInformation());

	}
}
