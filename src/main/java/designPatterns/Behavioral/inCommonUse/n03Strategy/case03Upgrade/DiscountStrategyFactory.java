package designPatterns.Behavioral.inCommonUse.n03Strategy.case03Upgrade;

import designPatterns.Behavioral.inCommonUse.n03Strategy.case03.OrderType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjinxin on 2021/3/30 上午9:42
 */
// 策略的创建
public class DiscountStrategyFactory {
    private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        strategies.put(OrderType.GROUPON, new GrouponDiscountStrategy());
        strategies.put(OrderType.PROMOTION, new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType type) {
        return strategies.get(type);
    }
}
