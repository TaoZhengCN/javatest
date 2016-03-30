package com.tz.gof.Strategy;

public class NormalQuack implements IQuackBehavior {
	
	public void quack()
	{
		System.out.println("ga ga ga!");
	}
}
