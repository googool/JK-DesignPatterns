package designPrinciples.No16.case2.upgrade1;

/**
 * Created by chenjinxin on 2021/3/10 下午3:56
 */
// 改动二：添加新的handler
public class TimeoutAlertHandler extends AlertHandler {
//    public TimeoutAlertHandler(AlertRule rule, Notification notification) {
//        super(rule, notification);
//    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {

    }
}
