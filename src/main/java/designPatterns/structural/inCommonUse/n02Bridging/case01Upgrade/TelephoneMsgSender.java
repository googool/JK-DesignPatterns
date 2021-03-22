package designPatterns.structural.inCommonUse.n02Bridging.case01Upgrade;

import java.util.List;

/**
 * Created by chenjinxin on 2021/3/22 下午5:49
 */
public class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //...
    }

}
