package designPatterns.structural.inCommonUse.n02Bridging.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/22 下午5:51
 */
public class TrivialNotification extends Notification {
    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
    // 与SevereNotification代码结构类似，所以省略...
}
