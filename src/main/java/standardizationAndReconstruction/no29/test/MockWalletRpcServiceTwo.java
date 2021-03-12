package standardizationAndReconstruction.no29.test;

import standardizationAndReconstruction.no29.WalletRpcService;

/**
 * Created by chenjinxin on 2021/3/12 下午2:38
 */
// 通过继承 WalletRpcService 类，并且重写其中的 moveMoney() 函数的方式来实现 mock。
// 具体的代码实现如下所示。通过 mock 的方式，我们可以让 moveMoney() 返回任意我们想要的数据，完全在我们的控制范围内，并且不需要真正进行网络通信。
public class MockWalletRpcServiceTwo extends WalletRpcService {

    public String moveMoney(Long id, Long fromUserId, Long toUserId, Double amount) {
        return null;
    }

}
