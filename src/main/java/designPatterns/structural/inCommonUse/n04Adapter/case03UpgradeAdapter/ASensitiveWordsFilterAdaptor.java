package designPatterns.structural.inCommonUse.n04Adapter.case03UpgradeAdapter;

import designPatterns.structural.inCommonUse.n04Adapter.case03.ASensitiveWordsFilter;

/**
 * Created by chenjinxin on 2021/3/24 上午9:58
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private final ASensitiveWordsFilter aFilter;

    public ASensitiveWordsFilterAdaptor(ASensitiveWordsFilter aFilter) {
        this.aFilter = aFilter;
    }

    @Override
    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}
