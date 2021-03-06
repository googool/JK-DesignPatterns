package designPrinciples.No16.case2.upgrade1;

import designPatterns.structural.inCommonUse.n02Bridging.case01.AlertRule;
import designPatterns.structural.inCommonUse.n02Bridging.case01.Notification;

/**
 * Created by chenjinxin on 2021/3/10 下午3:29
 */
public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
//        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
    }
}
