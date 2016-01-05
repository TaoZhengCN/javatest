package com.tz.gof.Decorator;

public class HouseBlend extends Beverage {

	
	public HouseBlend() {
		this.description = "HouseBlend";
	}
	@Override
	public double cost() {
		return 5.0;
	}

}
