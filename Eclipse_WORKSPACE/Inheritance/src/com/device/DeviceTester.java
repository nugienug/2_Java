package com.device;

public class DeviceTester {
	public static void main(String[] args) {
		Audio audio = new Audio();
		audio.turnOn();
		audio.increase();
		audio.decrease();
		audio.turnOff();
		
		AirConditioner ac = new AirConditioner();
		ac.turnOn();
		ac.increase();
		ac.decrease();
		ac.turnOff();
	}

}
