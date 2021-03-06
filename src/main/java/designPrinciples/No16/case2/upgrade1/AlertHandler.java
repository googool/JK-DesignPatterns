package designPrinciples.No16.case2.upgrade1;

import designPatterns.structural.inCommonUse.n02Bridging.case01.AlertRule;
import designPatterns.structural.inCommonUse.n02Bridging.case01.Notification;

/**
 * Created by chenjinxin on 2021/3/10 下午3:28
 */
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
