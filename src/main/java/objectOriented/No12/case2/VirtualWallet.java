package objectOriented.No12.case2;

import java.math.BigDecimal;

/**
 * Created by chenjinxin on 2021/3/9 上午9:52
 */
public class VirtualWallet {// Domain领域模型(充血模型)
    private Long id;
    private final Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public BigDecimal balance() {
        return this.balance;
    }

    public void debit(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
            //throw new InsufficientBalanceException();
        } this.balance = this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            //throw new InvalidAmountException();
        } this.balance = this.balance.add(amount);
    }
}
