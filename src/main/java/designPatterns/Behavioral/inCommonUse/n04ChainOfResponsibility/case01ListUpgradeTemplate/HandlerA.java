package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case01ListUpgradeTemplate;

/**
 * Created by chenjinxin on 2021/3/30 下午1:50
 */
public class HandlerA extends Handler {
    @Override
    protected boolean doHandle() {
        System.out.println("HandlerA.doHandle");
        boolean handled = false;
        //...
        return handled;
    }
}
