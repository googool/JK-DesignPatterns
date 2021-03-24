package designPatterns.structural.inCommonUse.n04Adapter.case03UpgradeAdapter;

import designPatterns.structural.inCommonUse.n04Adapter.case03.BSensitiveWordsFilter;

/**
 * Created by chenjinxin on 2021/3/24 上午10:05
 */
public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private final BSensitiveWordsFilter bFilter;

    public BSensitiveWordsFilterAdaptor(BSensitiveWordsFilter bFilter) {
        this.bFilter = bFilter;
    }

    @Override
    public String filter(String text) {
        return bFilter.filter(text);
    }
}
