package designPatterns.Behavioral.inCommonUse.n03Strategy.case03Upgrade;

import designPatterns.Behavioral.inCommonUse.n03Strategy.case03.Order;

/**
 * Created by chenjinxin on 2021/3/30 上午9:41
 */

// 策略的定义
public interface DiscountStrategy {
    double calDiscount(Order order);
}
// 省略 NormalDiscountStrategy、GrouponDiscountStrategy、PromotionDiscountStrategy 类代码...



