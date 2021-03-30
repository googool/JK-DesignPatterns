package designPatterns.Behavioral.inCommonUse.n03Strategy.case01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjinxin on 2021/3/30 上午9:18
 */

/**
 * 如果策略类是无状态的，不包含成员变量，只是纯粹的算法实现，这样的策略对象是可以被共享使用的，不需要在每次调用 getStrategy() 的时候，都创建一个新的策略对象。
 * 针对这种情况，我们可以使用 工厂类 的实现方式，事先创建好每个策略对象，缓存到工厂类中，用的时候直接返回。
 */
public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
