package com.iot.device;

public class AirConditioner {
	String modelName;
	String mode;
	int HP;
	int currentTemp = 20;
	String status; // on or off

	public AirConditioner() {
	}

	public AirConditioner(String modelName, int HP) {
		super();
		this.modelName = modelName;
		this.HP= HP;
		
	}

	public void turnOn() {
		this.status = "on";
	}

	public void turnOff() {
		this.status = "off";
	}


	public void increaseTemp() {
		this.currentTemp++;
	}

	public void decreaseTemp() {
		this.currentTemp--;
	}

	public String getAllInformation() {
		return "modelName: " + modelName 
				+ ", HP: " + HP +"PK"
				+ ", currentTemp: " + currentTemp + "°C"
				+ ", status: " + status;
	}

	public String getModelName() {
		return modelName;
	}

	public int getCurrentTemp() {
		return currentTemp;
	}


	public String getStatus() {
		return status;
	}
}
