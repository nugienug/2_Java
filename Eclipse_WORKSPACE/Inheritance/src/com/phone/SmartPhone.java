package com.phone;

public class SmartPhone extends Phone {
	String osVersion;

	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String modelName, String osVersion) {
		super();
		this.modelName = modelName;
		this.osVersion = osVersion;
	}
	
	public void touchScreen() {
		System.out.println("touching screen");
	}

	public String getAllInformation() {
		return "model: " + this.modelName + 
				", osVersion: " + this.osVersion;
	}

}
