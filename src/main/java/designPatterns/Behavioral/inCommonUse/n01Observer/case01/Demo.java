package designPatterns.Behavioral.inCommonUse.n01Observer.case01;

/**
 * Created by chenjinxin on 2021/3/26 上午11:51
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message());
    }
}
