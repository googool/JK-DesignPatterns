package designPatterns.Behavioral.inCommonUse.n03Strategy.case02;

import designPatterns.Behavioral.inCommonUse.n03Strategy.case01.ConcreteStrategyA;
import designPatterns.Behavioral.inCommonUse.n03Strategy.case01.ConcreteStrategyB;

/**
 * Created by chenjinxin on 2021/3/30 上午9:28
 */
public class EvictionStrategyFactory {
    public static EvictionStrategy getEvictionStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        switch (type) {
            case "Fifo":
                return new FifoEvictionStrategy();
            case "Lfu":
                return new LfuEvictionStrategy();
            case "Lru":
                return new LruEvictionStrategy();
        }

        return null;
    }
}
