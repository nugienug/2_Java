package com.seveneleven;

public class SevenElevenTester {
	public static void main(String[] args) {
		SevenEleven seven11 = new SevenEleven("Charmsisle", "Kloud");
		Person kids = new Person(10);
		Person adults = new Person(30);
		
		String soju = seven11.buySoju(kids);
		System.out.println(soju);
		
		String beer = seven11.buyBeer(adults);
		System.out.println(beer);
		
	}

}
