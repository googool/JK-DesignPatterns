package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserverEventBus;

import java.util.concurrent.Executor;

/**
 * Created by chenjinxin on 2021/3/26 下午2:08
 */

public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
