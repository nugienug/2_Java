package com.overloading;

public class TV {
	int currentVolume = 5;

	public void increaseVolume() {
		currentVolume++;
	}

	public void increaseVolume(int num) {
		currentVolume += num;
	}

}
