package designPatterns.structural.inCommonUse.n02Bridging.case01;

import designPrinciples.No16.case2.upgrade1.AlertHandler;
import designPrinciples.No16.case2.upgrade1.ApiStatInfo;

/**
 * Created by chenjinxin on 2021/3/22 下午5:42
 */
//在API监控告警的例子中，我们如下方式来使用Notification类：
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification){
        super(rule, notification);
    }


    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
