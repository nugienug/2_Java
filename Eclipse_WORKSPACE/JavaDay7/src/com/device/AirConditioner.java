package com.device;

/**
 *  Create new class ‘AirConditioner’ in com.device package
	 - ‘AirConditioner’ has one field ‘int currentTemperature’
	 - ‘AirConditioner’ has one method ‘public void setTemperature(int temperature)’
	 - for checking value add ‘public int getTemperature(int temperature)’

Requirements are
	 - currentTemperature should not be accessed directly from outside
	 - minimum temperature should be 10 -> if parameter of setTemperature is lower than 10, just
	 set 10
	 - maximum temperature should be 30 -> if parameter of setTemperature is higher than 30, just
	 set 30
 *
 */
public class AirConditioner {
	private int currentTemp;
	
	public AirConditioner() {}
	public AirConditioner(int temp) {
		this.currentTemp = temp;
	}
	
	public void setTemperature (int temp) {
		if (temp < 10) { 
			this.currentTemp = 10;}
		else if (temp > 30) this.currentTemp = 30;
		else {
			currentTemp = this.currentTemp;
		}
	}
	
	public int getTemperature() {
		return this.currentTemp;
	}
}
