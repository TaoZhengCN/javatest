package com.tz.gof.Strategy;

public class Program {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();

		System.out.println("**********************");

		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
