package designPatterns.Behavioral.inCommonUse.n01Observer.case02UpgradePbserverEventBus;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * Created by chenjinxin on 2021/3/26 下午2:08
 */

public class EventBus {
    private static final MoreExecutors moreExecutors = new MoreExecutors();
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus() {
        this(moreExecutors.directExecutor());
    }

    protected EventBus(Executor executor) {
        this.executor = executor;
    }

    public void register(Object object) {
        registry.register(object);
    }

    public void post(Object event) {
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observerAction.execute(event);
                }
            });
        }
    }
}
