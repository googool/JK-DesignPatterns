package designPatterns.creational.inCommonUse.n03builder.case01UpgradeByBuilder;

/**
 * Created by chenjinxin on 2021/3/17 下午5:58
 */
public class Test {
    public static void main(String[] args) {

        // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
    }
}
