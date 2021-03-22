package designPatterns.structural.inCommonUse.n02Bridging.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/22 下午5:50
 */
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
