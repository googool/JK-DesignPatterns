package objectOriented.No12.case1;

import java.math.BigDecimal;

/**
 * Created by chenjinxin on 2021/3/9 上午9:45
 */

public class VirtualWalletController {
    // 通过构造函数或者IOC框架注入
    private VirtualWalletService virtualWalletService;

    public BigDecimal getBalance(Long walletId) {
        return BigDecimal.ONE;
    } //查询余额

    public void debit(Long walletId, BigDecimal amount) {
    } //出账

    public void credit(Long walletId, BigDecimal amount) {
    } //入账

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
    } //转账
    //省略查询transaction的接口
}
