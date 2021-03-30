package designPatterns.Behavioral.inCommonUse.n04ChainOfResponsibility.case01List;

/**
 * Created by chenjinxin on 2021/3/30 下午1:43
 */
// 使用举例
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
