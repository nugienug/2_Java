package com.iot.device;

public class TV {
	String modelName;
	int currentChannel;
	int currentVolume;
	int size;
	String color;
	String status; // on or off

	public TV() {
	}

	public TV(String modelName, int size, String color) {
		super();
		this.modelName = modelName;
		this.size = size;
		this.color = color;
	}

	public void turnOn() {
		this.status = "on";
	}

	public void turnOff() {
		this.status = "off";
	}

	public void increaseChannel() {
		this.currentChannel++;
	}

	public void decreaseChannel() {
		this.currentChannel--;
	}

	public void increaseVolume() {
		this.currentVolume++;
	}

	public void decreaseVolume() {
		this.currentVolume--;
	}

	public String getAllInformation() {
		return "modelName: " + modelName 
				+ ", currentChannel: " + currentChannel
				+ ", size: " + size
				+ ", color: " + color
				+ ", status: " + status
				+ ", currentVolume: " + currentVolume;
	}

	public String getModelName() {
		return modelName;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public String getStatus() {
		return status;
	}

}
