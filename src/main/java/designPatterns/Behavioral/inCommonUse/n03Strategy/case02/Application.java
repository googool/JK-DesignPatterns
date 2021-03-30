package designPatterns.Behavioral.inCommonUse.n03Strategy.case02;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by chenjinxin on 2021/3/30 上午9:26
 */
// 运行时动态确定，根据配置文件的配置决定使用哪种策略
public class Application {
    public static void main(String[] args) throws Exception {
        EvictionStrategy evictionStrategy = null;
        Properties props = new Properties();
        props.load(new FileInputStream("./config.properties"));
        String type = props.getProperty("eviction_type");
        evictionStrategy = EvictionStrategyFactory.getEvictionStrategy(type);
        UserCache userCache = new UserCache(evictionStrategy);
        userCache.algorithmInterface();
        //...
    }
}
