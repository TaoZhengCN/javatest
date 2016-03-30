package com.tz.gof.Strategy;

public class MutrQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("can't quack");
    }
}
