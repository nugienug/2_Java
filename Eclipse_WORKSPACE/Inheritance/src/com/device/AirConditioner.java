package com.device;

public class AirConditioner extends Device {
	int temperature;
	
	@Override
	public void increase() {
		this.temperature++;
		System.out.println("Current temperature is " + this.temperature);
	}
	
	public void decrease() {
		this.temperature--;
		System.out.println("Current temperature is " + this.temperature);
	}
}
