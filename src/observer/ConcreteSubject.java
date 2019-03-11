package observer;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        for (Object obs : observers) {
            ((Observer)obs).response();
        }
    }
}
