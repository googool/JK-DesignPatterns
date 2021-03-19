package designPatterns.creational.inCommonUse.n01singleton.case01;

/**
 * Created by chenjinxin on 2021/3/16 下午3:23
 */
public class OrderController {
    private Logger logger = new Logger();

    public void create(String order) {
        // ...省略业务逻辑代码...f
        logger.log("Created an order: " + order);
    }
}
