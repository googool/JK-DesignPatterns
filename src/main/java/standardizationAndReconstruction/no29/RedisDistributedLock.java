package standardizationAndReconstruction.no29;

/**
 * Created by chenjinxin on 2021/3/12 下午2:32
 */
public class RedisDistributedLock {

    private static class RedisDistributedLockHolder {

        private static final RedisDistributedLock lock = new RedisDistributedLock();
    }

    public static RedisDistributedLock getSingletonInstance() {
        return RedisDistributedLockHolder.lock;
    }


    public boolean lockTransaction(String id) {
        System.out.println("RedisDistributedLock.lockTransaction: Transaction is locked. id: " + id);
        return true;
    }

    public boolean unlockTransaction(String id) {
        System.out.println("RedisDistributedLock.unlockTransaction: Transaction is unlocked. id: " + id);
        return true;
    }
}