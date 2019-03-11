package observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("观察者2被通知");
    }
}
