package com.java.innerClass;

public class Activity {

	Button button = new Button();
	Switch switctButton = new Switch();

	public Activity() {
		
		button.setOnClickListner(new ClickEvent.Listner() {
			@Override
			public void click() {
				System.out.println("Activity button clicked");
			}
		});
		
		switctButton.setOnClickListner(new ClickEvent.Listner() {
			@Override
			public void click() {
				System.out.println("Activity switctButton clicked");
			}
		});
	}
}
