package designPatterns.structural.inCommonUse.n04Adapter.case03UpgradeAdapter;

import designPatterns.structural.inCommonUse.n04Adapter.case03.ASensitiveWordsFilter;
import designPatterns.structural.inCommonUse.n04Adapter.case03.BSensitiveWordsFilter;
import designPatterns.structural.inCommonUse.n04Adapter.case03.CSensitiveWordsFilter;

/**
 * Created by chenjinxin on 2021/3/24 上午10:14
 */
// 2. 统一多个类的接口设计
public class Demo {
    public static void main(String[] args) {
        RiskManagement riskManagement = new RiskManagement();
        riskManagement.addSensitiveWordsFilter(new ASensitiveWordsFilterAdaptor(new ASensitiveWordsFilter()));
        riskManagement.addSensitiveWordsFilter(new BSensitiveWordsFilterAdaptor(new BSensitiveWordsFilter()));
        riskManagement.addSensitiveWordsFilter(new CSensitiveWordsFilterAdaptor(new CSensitiveWordsFilter()));
        String ret = riskManagement.filterSensitiveWords("abcABC");
        System.out.println(ret);
    }
}
