package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserverEventBus;

/**
 * Created by chenjinxin on 2021/3/26 下午2:14
 */

public class DObserver {
//...省略其他属性和方法...

    @Subscribe
    public void f1(PMsg event) {
    }

    @Subscribe
    public void f2(QMsg event) {
    }
}
