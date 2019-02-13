package com.duck;

public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display();

    public void swim() {
        System.out.println("我会游泳");
    }

    public void perFromFly() {
        flyBehavior.fly();
    }

    public void perFromQuack() {
        quackBehavior.quack();
    }
}
