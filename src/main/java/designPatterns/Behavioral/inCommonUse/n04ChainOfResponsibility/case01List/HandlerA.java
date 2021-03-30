package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case01List;

/**
 * Created by chenjinxin on 2021/3/30 下午1:44
 */
public class HandlerA extends Handler {
    @Override
    public void handle() {
        System.out.println("HandlerA.handle");
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
