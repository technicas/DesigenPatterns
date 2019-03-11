package strategy;

/**
 * 具体策略类B
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("策略类B的策略方法被访问");
    }
}