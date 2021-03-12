package standardizationAndReconstruction.no29;

/**
 * Created by chenjinxin on 2021/3/12 下午2:45
 */
public class TransactionLock {
    public boolean lock(String id) {
        return RedisDistributedLock.getSingletonInstance().lockTransaction(id);
    }

    public void unlock(String id) {
        RedisDistributedLock.getSingletonInstance().unlockTransaction(id);
    }
}
