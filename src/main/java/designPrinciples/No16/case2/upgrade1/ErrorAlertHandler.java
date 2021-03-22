package designPrinciples.No16.case2.upgrade1;

import designPatterns.structural.inCommonUse.n02Bridging.case01.AlertRule;
import designPatterns.structural.inCommonUse.n02Bridging.case01.Notification;

/**
 * Created by chenjinxin on 2021/3/10 下午3:29
 */
public class ErrorAlertHandler extends AlertHandler {
    private AlertRule rule;
    private Notification notification;

    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
//        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
    }
}
