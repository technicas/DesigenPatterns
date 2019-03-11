package strategy;

/**
 * 具体策略类C
 */
public class ConcreteStrategyC implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("策略类C的策略方法被访问");
    }
}
