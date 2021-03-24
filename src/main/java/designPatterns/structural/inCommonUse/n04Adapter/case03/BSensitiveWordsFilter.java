package designPatterns.structural.inCommonUse.n04Adapter.case03;

/**
 * Created by chenjinxin on 2021/3/24 上午9:56
 */
public class BSensitiveWordsFilter { // B敏感词过滤系统提供的接口
    public String filter(String text) {
        return text.replace('b', '2');
    }
}
