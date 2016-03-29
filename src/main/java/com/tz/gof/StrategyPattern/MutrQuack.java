package com.tz.gof.StrategyPattern;

public class MutrQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("can't quack");
    }
}
