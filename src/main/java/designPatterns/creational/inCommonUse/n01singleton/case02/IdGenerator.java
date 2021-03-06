package designPatterns.creational.inCommonUse.n01singleton.case02;

/**
 * Created by chenjinxin on 2021/3/16 下午4:18
 */

import java.util.concurrent.atomic.AtomicLong;
public class IdGenerator {
    // AtomicLong是一个Java并发库中提供的一个原子变量类型,
    // 它将一些线程不安全需要加锁的复合操作封装为了线程安全的原子操作，
    // 比如下面会用到的incrementAndGet().
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}

