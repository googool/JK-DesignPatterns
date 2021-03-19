package designPatterns.creational.inCommonUse.n01singleton.singleOnClusterEnvironment;

/**
 * Created by chenjinxin on 2021/3/16 下午5:50
 */
public class Test {
    public static void main(String[] args) {
        // IdGenerator使用举例
        IdGenerator idGenerator = IdGenerator.getInstance();
        long id = idGenerator.getId();
        idGenerator.freeInstance();
    }
}
