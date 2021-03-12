package standardizationAndReconstruction.no29.test;

import standardizationAndReconstruction.no29.WalletRpcService;

/**
 * Created by chenjinxin on 2021/3/12 下午2:38
 */
public class MockWalletRpcServiceOne extends WalletRpcService {
    public String moveMoney(Long id, Long fromUserId, Long toUserId, Double amount) {
        return "123bac";
    }
}
