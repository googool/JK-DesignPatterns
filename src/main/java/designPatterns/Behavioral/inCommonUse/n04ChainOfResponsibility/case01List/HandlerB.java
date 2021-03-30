package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case01List;

/**
 * Created by chenjinxin on 2021/3/30 下午1:43
 */
public class HandlerB extends Handler {
    @Override
    public void handle() {
        System.out.println("HandlerB.handle");
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
