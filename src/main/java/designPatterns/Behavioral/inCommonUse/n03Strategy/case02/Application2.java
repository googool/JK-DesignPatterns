package designPatterns.Behavioral.inCommonUse.n03Strategy.case02;

/**
 * Created by chenjinxin on 2021/3/30 上午9:26
 */
// 非运行时动态确定，在代码中指定使用哪种策略
public class Application2 {
    public static void main(String[] args) {
        //...
        EvictionStrategy evictionStrategy = new LruEvictionStrategy();
        UserCache userCache = new UserCache(evictionStrategy);
        //...
    }
}
