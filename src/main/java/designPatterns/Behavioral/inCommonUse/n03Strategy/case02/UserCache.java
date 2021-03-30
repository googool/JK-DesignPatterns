package designPatterns.Behavioral.inCommonUse.n03Strategy.case02;

import designPatterns.Behavioral.inCommonUse.n02Template.case03.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjinxin on 2021/3/30 上午9:26
 */

// 策略接口：EvictionStrategy
// 策略类：LruEvictionStrategy、FifoEvictionStrategy、LfuEvictionStrategy...
// 策略工厂：EvictionStrategyFactory

public class UserCache {
    private Map<String, User> cacheData = new HashMap<>();
    private EvictionStrategy eviction;

    public UserCache(EvictionStrategy eviction) {
        this.eviction = eviction;
    }

    public void algorithmInterface(){
        eviction.algorithmInterface();
    }
    //...
}




