package designPatterns.Behavioral.inCommonUse.n03Strategy.case03Upgrade;

import designPatterns.Behavioral.inCommonUse.n03Strategy.case03.Order;

/**
 * Created by chenjinxin on 2021/3/30 上午9:43
 */
public class NormalDiscountStrategy implements DiscountStrategy {
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
