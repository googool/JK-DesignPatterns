package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case02Array;

/**
 * Created by chenjinxin on 2021/3/30 下午2:05
 */
public class HandlerA implements IHandler {
    @Override
    public boolean handle() {
        System.out.println("HandlerA.handle");
        boolean handled = false;
        //...
        return handled;
    }
}
