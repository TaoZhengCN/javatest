package com.tz.gof.Strategy;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new NormalQuack();
	}
	
	public void display()
	{
		System.out.println("I'm a real Mallard duck");
	}
}
