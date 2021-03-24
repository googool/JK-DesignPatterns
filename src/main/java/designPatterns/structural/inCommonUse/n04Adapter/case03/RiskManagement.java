package designPatterns.structural.inCommonUse.n04Adapter.case03;

/**
 * Created by chenjinxin on 2021/3/24 上午9:57
 */
// 未使用适配器模式之前的代码：代码的可测试性、扩展性不好
public class RiskManagement {
    private final ASensitiveWordsFilter aFilter = new ASensitiveWordsFilter();
    private final BSensitiveWordsFilter bFilter = new BSensitiveWordsFilter();
    private final CSensitiveWordsFilter cFilter = new CSensitiveWordsFilter();

    public String filterSensitiveWords(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        maskedText = bFilter.filter(maskedText);
        maskedText = cFilter.filter(maskedText, "3");
        return maskedText;
    }
}
