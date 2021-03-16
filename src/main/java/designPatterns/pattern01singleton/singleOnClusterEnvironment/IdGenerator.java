package designPatterns.pattern01singleton.singleOnClusterEnvironment;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by chenjinxin on 2021/3/16 下午5:47
 */

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private static SharedObjectStorage storage = FileSharedObjectStorage(/*入参省略，比如文件地址*/);

    private static SharedObjectStorage FileSharedObjectStorage() {
        return new SharedObjectStorage();
    }

    private static DistributedLock lock = new DistributedLock();

    private IdGenerator() {
    }

    public synchronized static IdGenerator getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                instance = storage.load(IdGenerator.class);
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public void freeInstance() {
        storage.save(this, IdGenerator.class);
        instance = null; //释放对象
        lock.unlock();
    }

    public long getId() {
        return id.incrementAndGet();
    }
}


