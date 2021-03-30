package designPatterns.Behavioral.inCommonUse.n03Strategy.case03Upgrade;

import designPatterns.Behavioral.inCommonUse.n03Strategy.case03.OrderType;

/**
 * Created by chenjinxin on 2021/3/30 上午9:46
 */

public class DiscountStrategyFactory2 {
    public static DiscountStrategy getDiscountStrategy(OrderType type) {
        if (type == null) {
            throw new IllegalArgumentException("Type should not be null.");
        }
        if (type.equals(OrderType.NORMAL)) {
            return new NormalDiscountStrategy();
        } else if (type.equals(OrderType.GROUPON)) {
            return new GrouponDiscountStrategy();
        } else if (type.equals(OrderType.PROMOTION)) {
            return new PromotionDiscountStrategy();
        }
        return null;
    }
}
