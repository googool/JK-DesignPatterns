package designPatterns.structural.inCommonUse.n04Adapter.case03;

/**
 * Created by chenjinxin on 2021/3/24 上午10:07
 */

// 2. 统一多个类的接口设计
public class Demo {
    public static void main(String[] args) {
        RiskManagement riskManagement = new RiskManagement();
        String ret = riskManagement.filterSensitiveWords("abcABC");
        System.out.println(ret);
    }
}
