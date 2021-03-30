package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case02Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjinxin on 2021/3/30 下午2:04
 */
public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
