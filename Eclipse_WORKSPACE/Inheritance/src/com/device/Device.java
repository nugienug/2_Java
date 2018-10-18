package com.device;

public class Device {
	String model;
	String color;
	String currentStatus;
	int currentVolume;
	
	public void turnOn() {
		this.currentStatus="on";
		System.out.println("Current status is " + this.currentStatus);
	}

	public void turnOff() {
		this.currentStatus="off";
		System.out.println("Current status is " + this.currentStatus);
	}
	
	public void increase() {
		this.currentVolume++;
		System.out.println("Current volume is " + this.currentVolume);
	}
	
	public void decrease() {
		this.currentVolume--;
		System.out.println("Current volume is " + this.currentVolume);
	}
	
}
