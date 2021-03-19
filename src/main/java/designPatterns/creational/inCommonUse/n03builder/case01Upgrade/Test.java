package designPatterns.creational.inCommonUse.n03builder.case01Upgrade;

/**
 * Created by chenjinxin on 2021/3/17 下午5:55
 */
public class Test {
    public static void main(String[] args) {
        ResourcePoolConfig name = new ResourcePoolConfig("name");
        name.setMaxIdle(8);
    }
}
