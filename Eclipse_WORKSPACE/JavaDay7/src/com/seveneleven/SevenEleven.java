package com.seveneleven;

public class SevenEleven {
	private String soju;
	private String beer;
	
	public SevenEleven(){}

	public SevenEleven(String soju, String beer) {
		super();
		this.soju = soju;
		this.beer = beer;
	}
	
	public String buySoju(Person person) {
		int age = person.getAge();
		if (age < 20) {
			return null;
		}else {
			return this.soju;
		}
		
	}
	
	public String buyBeer(Person person) {
		int age = person.getAge();
		if (age < 20) {
			return null;
		}else {
			return this.beer;
		}
		
	}
}
