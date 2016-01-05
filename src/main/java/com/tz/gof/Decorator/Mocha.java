package com.tz.gof.Decorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage b) {
		this.beverage = b;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}

}
