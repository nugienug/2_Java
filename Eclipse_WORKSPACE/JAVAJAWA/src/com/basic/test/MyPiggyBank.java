package com.basic.test;

import java.util.Scanner;

public class MyPiggyBank {
	/**
	 * The is a smart saving bank with a minimum number of saving 0, and max 100
	 * 
	 */
	public static void main(String[] args) {
		final int MAX_SAVING = 100;
		final int MIN_SAVING = 0;

		int nowMoney = 0;
		int addMoney = 0;
		int returnMoney = 0;

		Scanner getIN = new Scanner(System.in);

		while (true) {
			addMoney = getIN.nextInt();
			int tempTotal = nowMoney + addMoney;
			if (addMoney > 0) {
				if (tempTotal > MAX_SAVING) {
					returnMoney = tempTotal - MAX_SAVING;
					nowMoney = MAX_SAVING;
				} else {
					returnMoney = MIN_SAVING;
					nowMoney = tempTotal;
				}
			} else {
				if (tempTotal > MIN_SAVING) {
					returnMoney = Math.abs(addMoney);
					nowMoney = tempTotal;
				} else {
					returnMoney = (nowMoney > 0) ? nowMoney : MIN_SAVING;
					nowMoney = MIN_SAVING;
				}
			}
			System.out.println("You Have: " + nowMoney + " | return: " + returnMoney);
		}

	}
}
