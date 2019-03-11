package strategy;

/**
 * 具体策略类A
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("策略类A的策略方法被访问");
    }
}
