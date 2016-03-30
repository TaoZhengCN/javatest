package com.tz.gof.Strategy;

public abstract class Duck {
    IFlyBehavior flyBehavior;

    IQuackBehavior quackBehavior;

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void swim() {
        System.out.println("All ducks float,enen decoys");
    }

    abstract void display();
}
