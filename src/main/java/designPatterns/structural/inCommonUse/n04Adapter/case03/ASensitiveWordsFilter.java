package designPatterns.structural.inCommonUse.n04Adapter.case03;

/**
 * Created by chenjinxin on 2021/3/24 上午9:56
 */

public class ASensitiveWordsFilter { // A敏感词过滤系统提供的接口
    //text是原始文本，函数输出用***替换敏感词之后的文本
    public String filterSexyWords(String text) {
        return text.replace('a', '8');
    }

    public String filterPoliticalWords(String text) {
        return text.replace('A', '*');
    }
}











