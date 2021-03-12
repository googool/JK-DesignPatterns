package standardizationAndReconstruction.no29.test;

import org.junit.Test;
import standardizationAndReconstruction.no29.STATUS;
import standardizationAndReconstruction.no29.Transaction;
import standardizationAndReconstruction.no29.TransactionLock;

import javax.transaction.InvalidTransactionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by chenjinxin on 2021/3/12 下午2:29
 */
// 1. 正常情况下，交易执行成功，回填用于对账（交易与钱包的交易流水）用的 walletTransactionId，交易状态设置为 EXECUTED，函数返回 true。
// 2. buyerId、sellerId 为 null、amount 小于 0，返回 InvalidTransactionException。
// 3. 交易已过期（createTimestamp 超过 14 天），交易状态设置为 EXPIRED，返回 false。
// 4. 交易已经执行了（status==EXECUTED），不再重复执行转钱逻辑，返回 true。
// 5. 钱包（WalletRpcService）转钱失败，交易状态设置为 FAILED，函数返回 false。
// 6. 交易正在执行着，不会被重复执行，函数直接返回 false。
public class TestTransaction {
    @Test
    public void testExecute() throws InvalidTransactionException {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456L";

        TransactionLock mockLock = new TransactionLock() {
            public boolean lock(String id) {
                return true;
            }

            public void unlock() {
            }
        };

        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        // 使用mock对象来替代真正的RPC服务
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        transaction.setLock(mockLock);
        boolean executedResult = transaction.execute();
        // 测试用例1
        assertTrue(executedResult);
        assertEquals(STATUS.EXECUTED, transaction.getStatus());
        // 测试用例3

    }
}
