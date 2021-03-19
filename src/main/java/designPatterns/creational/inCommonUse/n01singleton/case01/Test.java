package designPatterns.creational.inCommonUse.n01singleton.case01;

/**
 * Created by chenjinxin on 2021/3/16 下午3:26
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new UserController().login("cjx", "123");
        }
/*
        for (int i = 0; i < 10; i++) {
            new OrderController().create("order: " + i);
        }*/
    }
}
