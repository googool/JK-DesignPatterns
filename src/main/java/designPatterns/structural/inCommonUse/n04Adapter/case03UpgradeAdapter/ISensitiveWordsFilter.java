package designPatterns.structural.inCommonUse.n04Adapter.case03UpgradeAdapter;

/**
 * Created by chenjinxin on 2021/3/24 上午9:58
 */
// 使用适配器模式进行改造
public interface ISensitiveWordsFilter { // 统一接口定义
    String filter(String text);
}
