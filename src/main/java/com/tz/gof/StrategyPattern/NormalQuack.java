package com.tz.gof.StrategyPattern;

public class NormalQuack implements IQuackBehavior {
	
	public void quack()
	{
		System.out.println("ga ga ga!");
	}
}
