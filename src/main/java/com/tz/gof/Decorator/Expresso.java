package com.tz.gof.Decorator;

public class Expresso extends Beverage{
	public Expresso() {
		this.description = "Espresso coffee";
	}

	@Override
	public double cost() {
		return 9.5;
	}
}
