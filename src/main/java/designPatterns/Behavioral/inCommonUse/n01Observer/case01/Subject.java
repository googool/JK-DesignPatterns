package designPatterns.Behavioral.inCommonUse.n01Observer.case01;

/**
 * Created by chenjinxin on 2021/3/26 上午11:51
 */

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}