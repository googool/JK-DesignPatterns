package designPatterns.Behavioral.inCommonUse.n01Observer.case01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/26 上午11:52
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
