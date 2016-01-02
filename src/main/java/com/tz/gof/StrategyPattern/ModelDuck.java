package com.tz.gof.StrategyPattern;

public class ModelDuck extends Duck{

	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MutrQuack();
	}
	
	@Override
	void display() {
		System.out.println("I'm a model duck");		
	}
	
}
