package strategy;

/**
 * 策略模式
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s1 = new ConcreteStrategyA();
        c.setStrategy(s1);
        c.strategyMethod();

        System.out.println("==================");

        Strategy s2 = new ConcreteStrategyB();
        c.setStrategy(s2);
        c.strategyMethod();
    }
}
