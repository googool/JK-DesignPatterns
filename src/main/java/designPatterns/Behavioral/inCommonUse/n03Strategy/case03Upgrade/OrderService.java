package designPatterns.Behavioral.inCommonUse.n03Strategy.case03Upgrade;

import designPatterns.Behavioral.inCommonUse.n03Strategy.case03.Order;
import designPatterns.Behavioral.inCommonUse.n03Strategy.case03.OrderType;

/**
 * Created by chenjinxin on 2021/3/30 上午9:42
 */
// 策略的使用
public class OrderService {
    public double discount(Order order) {
        OrderType type = order.getType();
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(type);
        return discountStrategy.calDiscount(order);
    }
}

