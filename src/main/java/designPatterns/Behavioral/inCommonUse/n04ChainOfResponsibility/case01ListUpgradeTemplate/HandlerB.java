package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case01ListUpgradeTemplate;

/**
 * Created by chenjinxin on 2021/3/30 下午1:49
 */
public class HandlerB extends Handler {
    @Override
    protected boolean doHandle() {
        System.out.println("HandlerB.doHandle");
        boolean handled = false;
        //...
        return handled;
    }
}
