package standardizationAndReconstruction.no29;

import javax.transaction.InvalidTransactionException;

/**
 * Created by chenjinxin on 2021/3/12 下午2:20
 */

public class Transaction {
    private String id;
    private Long buyerId;
    private Long sellerId;
    private Long productId;
    private String orderId;
    private Long createTimestamp;
    private Double amount = 0.0;
    private STATUS status;
    private String walletTransactionId;
    private TransactionLock lock;

    public void setLock(TransactionLock lock) {
        this.lock = lock;
    }

    public void setWalletRpcService(WalletRpcService walletRpcService) {
        this.walletRpcService = walletRpcService;
    }

    // 添加一个成员变量及其set方法
    private WalletRpcService walletRpcService;

    // ...get() methods...
    public String getId() {
        return id;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public Long getProductId() {
        return productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public Double getAmount() {
        return amount;
    }

    public STATUS getStatus() {
        return status;
    }

    public String getWalletTransactionId() {
        return walletTransactionId;
    }

    public Transaction(String preAssignedId, Long buyerId, Long sellerId, Long productId, String orderId) {
        if (preAssignedId != null && !preAssignedId.isEmpty()) {
            this.id = preAssignedId;
        } else {
            this.id = IdGenerator.generateTransactionId();
        }
        if (!this.id.startsWith("t_")) {
            this.id = "t_" + preAssignedId;
        }
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.orderId = orderId;
        this.status = STATUS.TO_BE_EXECUTD;
        this.createTimestamp = System.currentTimeMillis();
    }

    // 负责执行转账操作
    public boolean execute() throws InvalidTransactionException {
        if ((buyerId == null || sellerId == null || amount < 0.0)) {
            throw new InvalidTransactionException("InvalidTrans");
        }
        if (status == STATUS.EXECUTED) return true;
        boolean isLocked = false;
        try {
            // 分布式锁 DistributedLock 单例类，用来避免 Transaction 并发执行，导致用户的钱被重复转出。
            // isLocked = RedisDistributedLock.getSingletonInstance().lockTransaction(id);
            isLocked = lock.lock(id);
            if (!isLocked) {
                return false; // 锁定未成功，返回false，job兜底执行
            }
            if (status == STATUS.EXECUTED) return true; // double check
            long executionInvokedTimestamp = System.currentTimeMillis();
            if (executionInvokedTimestamp - createTimestamp > 14L * 24 * 3600 * 1000) {
                this.status = STATUS.EXPIRED;
                return false;
            }
            // 真正的转账操作是通过调用 WalletRpcService RPC 服务来完成的。
            // 删除 WalletRpcService walletRpcService = new WalletRpcService();
            String walletTransactionId = walletRpcService.moveMoney(id, buyerId, sellerId, amount);
            if (walletTransactionId != null) {
                this.walletTransactionId = walletTransactionId;
                this.status = STATUS.EXECUTED;
                return true;
            } else {
                this.status = STATUS.FAILED;
                return false;
            }
        } finally {
            if (isLocked) {
                // RedisDistributedLock.getSingletonInstance().unlockTransaction(id);
                lock.unlock(id);
            }
        }
    }
}
