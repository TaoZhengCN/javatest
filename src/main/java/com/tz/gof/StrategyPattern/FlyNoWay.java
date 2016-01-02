package com.tz.gof.StrategyPattern;

public class FlyNoWay implements IFlyBehavior{
	
	public void fly() {
		System.out.println("I can't fly");		
	}

}
