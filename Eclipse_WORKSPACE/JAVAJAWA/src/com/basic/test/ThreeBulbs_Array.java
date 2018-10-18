package com.basic.test;

import java.util.Scanner;

public class ThreeBulbs_Array {
	public static void main(String[] args) {
		int currentLight = 0;
		Scanner getIN = new Scanner(System.in);
		boolean[] onLights = { false, false, false };

		while (true) {
			currentLight = getIN.nextInt();
			if ((currentLight < 0) || (currentLight > 2))
				continue;
			onLights[currentLight] = !onLights[currentLight];

			if (onLights[0] && onLights[1] && onLights[2]) {
				System.out.println("sudah dihudupkan semua, mas brooo");
				getIN.close();
				break;
			}
		}
	}
}
