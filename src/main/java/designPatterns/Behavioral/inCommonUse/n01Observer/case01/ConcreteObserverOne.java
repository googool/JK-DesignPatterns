package designPatterns.Behavioral.inCommonUse.n01Observer.case01;

/**
 * Created by chenjinxin on 2021/3/26 上午11:51
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void update(Message message) {
        //TODO: 获取消息通知，执行自己的逻辑...
        System.out.println("ConcreteObserverOne is notified.");
    }
}
