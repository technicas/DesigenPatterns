package com.duck;

/**
 * 策略模式(Strategy Pattern)
 */
public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.perFromFly();
        mallard.perFromQuack();

        Duck model = new ModelDuck();
        model.perFromFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.perFromFly();
    }
}
