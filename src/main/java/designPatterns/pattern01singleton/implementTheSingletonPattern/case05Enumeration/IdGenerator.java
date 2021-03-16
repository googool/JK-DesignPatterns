package designPatterns.pattern01singleton.implementTheSingletonPattern.case05Enumeration;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by chenjinxin on 2021/3/16 下午4:57
 */

/*
一种最简单的实现方式，基于枚举类型的单例实现。这种实现方式通过 Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性。

原理：
https://junzhou2016.github.io/2018/08/04/%E6%9E%9A%E4%B8%BE%E5%AE%9E%E7%8E%B0%E5%8D%95%E4%BE%8B%E5%8E%9F%E7%90%86%20/
https://www.cnblogs.com/jamaler/p/11421049.html
 */
public enum IdGenerator {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
