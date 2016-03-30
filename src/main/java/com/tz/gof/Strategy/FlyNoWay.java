package com.tz.gof.Strategy;

public class FlyNoWay implements IFlyBehavior{
	
	public void fly() {
		System.out.println("I can't fly");		
	}

}
