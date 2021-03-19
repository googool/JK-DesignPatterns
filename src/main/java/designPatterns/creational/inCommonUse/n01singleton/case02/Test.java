package designPatterns.creational.inCommonUse.n01singleton.case02;

/**
 * Created by chenjinxin on 2021/3/16 下午4:19
 */
public class Test {
    public static void main(String[] args) {
        // IdGenerator使用举例
        long id = IdGenerator.getInstance().getId();
        System.out.println(id);
        id = IdGenerator.getInstance().getId();
        System.out.println(id);
    }
}
