package designPatterns.creational.inCommonUse.n01singleton.singletonOnThread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by chenjinxin on 2021/3/16 下午5:42
 */

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private static final ConcurrentHashMap<Long, IdGenerator> instances
            = new ConcurrentHashMap<>();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGenerator());
        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
