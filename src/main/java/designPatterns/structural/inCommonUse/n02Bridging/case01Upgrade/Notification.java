package designPatterns.structural.inCommonUse.n02Bridging.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/22 下午5:50
 */
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
