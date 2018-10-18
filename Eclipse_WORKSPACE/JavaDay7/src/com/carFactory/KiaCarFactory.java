package com.carFactory;

public class KiaCarFactory implements CarFactory {
	String car;

	@Override
	public String getCar() {
		// TODO Auto-generated method stub
		this.buySteel();
		this.makeEngine();
		this.makeWheel();
		this.makeGlass();
		this.paintColor();
		this.assemble();
		
		return this.car;
	}
	
	public void buySteel() {}
	public void makeEngine() {}
	public void makeWheel() {}
	public void makeGlass() {}
	public void paintColor() {}
	public void assemble() {}
}
