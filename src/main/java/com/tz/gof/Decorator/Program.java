package com.tz.gof.Decorator;

public class Program {

	public static void main(String[] args) {
		Beverage houseblend = new HouseBlend();		
		houseblend = new Whip(houseblend);
		houseblend = new Mocha(houseblend);
		System.out.println(houseblend.getDescription() + " $" + houseblend.cost());
	}
}
